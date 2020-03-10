package org.foi.nwtis.apersic;

import org.foi.nwtis.apersic.kvadrati.*;

public class Vjezba_02_1 {

	public static void main(String args[]) {
		if(args.length != 3) {
			System.out.println("Broj argumenta ne odgovara");		
			return;
		}
		
		int odBroja = Integer.parseInt(args[0]);
		int doBroja = Integer.parseInt(args[1]);

		int vrsta = Integer.parseInt(args[2]);
		Kvadrati kvad = null;
		Ispisivac_1 isp1 = null;
		
		switch(vrsta) {
		case 0:
			kvad = new Kvadrati(odBroja, doBroja);
			kvad.ispis();
			break;
		case 1:
			NeparniKvadrati_1 nkvad = new NeparniKvadrati_1(odBroja, doBroja);
			nkvad.ispis();
			break;
		case 2:
			kvad = new NeparniKvadrati_1(odBroja, doBroja);
			kvad.ispis();
			break;
		case 3:
			kvad = new NeparniKvadrati_2(odBroja, doBroja);
			kvad.ispis();
			break;
		case 4:
			NeparniKvadrati_3 nkvad3 = new NeparniKvadrati_3(odBroja, doBroja);
			nkvad3.ispis();
			break;
		case 5:
			kvad = new NeparniKvadrati_3(odBroja, doBroja);
			kvad.ispis();
			System.out.println(kvad.getClass());
			break;
		case 6:
			isp1 = new NeparniKvadrati_3(odBroja, doBroja);
			isp1.ispisiPodatke();
			System.out.println(isp1.getClass());
			break;
		case 7:
			kvad = new NeparniKvadrati_4(odBroja, doBroja);
			kvad.ispis();
			break;
		case 8:
			Ispisivac_2 isp2 = new NeparniKvadrati_4(odBroja, doBroja);
			isp2.ispisiPodatke();
			isp2.ispisiPodatkeLinijski();
			break;
		case 9:
			isp1 = new NeparniKvadrati_4(odBroja, doBroja);
			isp1.ispisiPodatke();
			break;
		case 10:
			for (int i = 0; i < 15; i++)
			{
				isp1 = NeparniKvadrati_5.kreirajIspisivaca1(odBroja, doBroja);
				isp1.ispisiPodatke();
			}
			break;
		case 11:
			isp1 = new KolikoDretvi();
			isp1.ispisiPodatke();
			try{
				Thread.sleep(60000);
			}catch(Exception e){}
			break;	
		default:
			System.out.println("Argumenti ne odgovaraju");
		}
			
	}
}
		
		
