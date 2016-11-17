package tn.iit.implmentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.iit.implmentation.ConversionImplStub.Convert;
import tn.iit.implmentation.ConversionImplStub.ConvertResponse;
import tn.iit.implmentation.ConversionImplStub.ListDevise;
import tn.iit.implmentation.ConversionImplStub.ListDeviseResponse;

/**
 * Servlet implementation class ClientServlet
 */
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClientServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ConversionImplStub conversionImplStub = new ConversionImplStub();
		ListDevise listDevise = new ListDevise();

		ListDeviseResponse tab = conversionImplStub.listDevise(listDevise);
		String[] t = tab.get_return();
		request.setAttribute("listeDevise", t);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		float moneyIn = Float.parseFloat(request.getParameter("moneyIn"));
		String deviseIn = request.getParameter("deviseIn");
		ConversionImplStub conversionImplStub = new ConversionImplStub();
		Convert convert = new Convert();
		convert.setDeviseOut(deviseIn);
		convert.setMoney((float) moneyIn);
		ConvertResponse convertResponse = conversionImplStub.convert(convert);
		float moneyOut = convertResponse.get_return();
		request.setAttribute("moneyOut", moneyOut);

		doGet(request, response);
	}

}
