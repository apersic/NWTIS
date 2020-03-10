package org.foi.nwtis.apersic.kvadrati;

public class NeparniKvadrati_2 extends Kvadrati {
	
	public NeparniKvadrati_2(int odBroja, int doBroja) {
		super(odBroja, doBroja);
	}
	
	public void ispis() {
		if (this.odBroja % 2 == 0)
		{
			this.odBroja++; 
		}
		for(int i=this.odBroja;i <= this.doBroja;i=i+4) {
//			System.out.println(i + " * " + i + " = " + i*i);
			System.out.printf("%3d * %3d = %3d\n", i, i, i*i);
		}
	}
}
