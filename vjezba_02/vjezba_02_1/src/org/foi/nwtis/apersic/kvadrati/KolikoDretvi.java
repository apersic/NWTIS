package org.foi.nwtis.apersic.kvadrati;

public class KolikoDretvi implements Ispisivac_1{
	
	public void ispisiPodatke(){
		int brojDretvi = (int) (System.currentTimeMillis() % 10) + 1;
		for (int i = 0; i < brojDretvi; i++)
		{
			DretvaZaIspisivanje d = new DretvaZaIspisivanje("dretva_" + i);
			d.start();
		}
		
	}
	
}
