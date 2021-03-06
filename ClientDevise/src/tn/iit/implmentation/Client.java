package tn.iit.implmentation;

import java.rmi.RemoteException;

import tn.iit.implmentation.ConversionImplStub.Banque;
import tn.iit.implmentation.ConversionImplStub.Convert;
import tn.iit.implmentation.ConversionImplStub.ConvertResponse;
import tn.iit.implmentation.ConversionImplStub.CreateBanque;
import tn.iit.implmentation.ConversionImplStub.CreateBanqueResponse;
import tn.iit.implmentation.ConversionImplStub.ListDevise;
import tn.iit.implmentation.ConversionImplStub.ListDeviseResponse;
import tn.iit.implmentation.ConversionImplStub.UpdateBanque;

public class Client {

	public static void main(String[] args) throws RemoteException {
		ConversionImplStub conversionImplStub = new ConversionImplStub();
		Convert convert = new Convert();
		CreateBanque createBanque = new CreateBanque();
		UpdateBanque updateBanque = new UpdateBanque();

		convert.setDeviseOut("USD");
		convert.setMoney((float) 4.5);

		createBanque.setAddress("Tri9 el 3in");
		createBanque.setName("BIAT");
		Banque b = new Banque();
		ConvertResponse convertResponse = conversionImplStub.convert(convert);
		CreateBanqueResponse createBanqueResponse = new ConversionImplStub().createBanque(createBanque);
		System.out.println(createBanqueResponse.get_return().getAddress());
		updateBanque.setBanque(createBanqueResponse.get_return());
		b = createBanqueResponse.get_return();
		ListDevise listDevise2 = new ListDevise();
		ListDeviseResponse tab = conversionImplStub.listDevise(listDevise2);
		String[] t = tab.get_return();
		/*
		 * for (String string : t) { System.out.println(string); }
		 */
		// System.out.println(convertResponse.get_return());

	}

}
