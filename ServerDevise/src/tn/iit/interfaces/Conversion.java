package tn.iit.interfaces;

import tn.iit.models.Banque;

public interface Conversion {

	float convert(String deviseOut, float money);

	String[] listDevise();

	Banque createBanque(String name, String address);

	void updateBanque(Banque banque);

	Banque[] listBanque();

	void testBanque(Banque[] tabBanque);

}
