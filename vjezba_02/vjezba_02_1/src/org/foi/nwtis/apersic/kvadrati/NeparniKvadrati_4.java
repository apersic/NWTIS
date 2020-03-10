package org.foi.nwtis.apersic.kvadrati;

public class NeparniKvadrati_4 extends NeparniKvadrati_2 implements Ispisivac_2 {
	
	public NeparniKvadrati_4(int odBroja, int doBroja) {
		super(odBroja, doBroja);
	}
	
	public void ispisiPodatke(){
		ispis();
	}
	
	public void ispisiPodatkeLinijski(){
		if (this.odBroja % 2 == 0)
		{
			this.odBroja++; 
		}
		for(int i=this.odBroja;i <= this.doBroja;i=i+4) {
//			System.out.println(i + " * " + i + " = " + i*i);
			System.out.printf("%3d * %3d = %3d;", i, i, i*i);
		}
	}
}
