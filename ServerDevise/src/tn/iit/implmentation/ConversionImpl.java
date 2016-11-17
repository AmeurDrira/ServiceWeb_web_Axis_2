package tn.iit.implmentation;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import tn.iit.interfaces.Conversion;
import tn.iit.models.Banque;

public  class ConversionImpl implements Conversion, Serializable {

	private static final long serialVersionUID = 1L;
	private HashMap<String, String> hmap = new HashMap<String, String>();
	private List<String> list = new ArrayList<String>();

	public float convert(String deviseOut, float money) {
		try {

			File fXmlFile = new File("/Users/ameurdrira/WorkSpace_ServiceWeb/ServerDevise/file.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();

			// System.out.println("Root element :" +
			// doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("Cube");

			// System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				// System.out.println("\nCurrent Element :" +
				// nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					hmap.put(eElement.getAttribute("currency"), eElement.getAttribute("rate"));
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		String exist = null;

		exist = hmap.get(deviseOut);

		if (exist != null)
			return Float.parseFloat(exist) * money;
		else
			return (float) 0.0;
	}

	public String[] listDevise() {
		try {

			File fXmlFile = new File("/Users/ameurdrira/WorkSpace_ServiceWeb/ServerDevise/file.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("Cube");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					hmap.put(eElement.getAttribute("currency"), eElement.getAttribute("rate"));
					list.add(eElement.getAttribute("currency"));
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listToArray(list);

	}

	private String[] listToArray(List<String> list2) {
		String[] tab = new String[list.size()];
		int i = 0;
		for (String string : list2) {
			tab[i++] = string;
		}
		return tab;
	}

	@Override
	public Banque createBanque(String name, String address) {
		Banque banque = new Banque();
		banque.setName(name);
		banque.setAddress(address);
		return banque;
	}

	@Override
	public Banque[] listBanque() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBanque(Banque banque) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testBanque(Banque[] tabBanque) {
		// TODO Auto-generated method stub
		
	}

}
