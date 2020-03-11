package org.foi.nwtis.apersic.kvadrati;

public class NeparniKvadrati_5{
	
	public static Ispisivac_1 kreirajIspisivaca1(int odBroja, int doBroja){
		switch((int) (System.currentTimeMillis() % 3)){
			case 0:
				return new NeparniKvadrati_3(odBroja, doBroja);
			case 1:
				return new NeparniKvadrati_4(odBroja, doBroja);
			default:
				return new KolikoJeSati();
		}
	}
}
