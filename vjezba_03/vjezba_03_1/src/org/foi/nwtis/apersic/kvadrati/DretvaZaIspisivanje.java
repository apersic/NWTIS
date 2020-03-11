package org.foi.nwtis.apersic.kvadrati;

public class DretvaZaIspisivanje extends Thread{
	private String nazivDretve;
	private int brojPonavljanja;
	
	public DretvaZaIspisivanje(String nazivDretve){
		this.nazivDretve = "apersic" + nazivDretve;
	}
	
	public void start(){
		this.brojPonavljanja = (int) (System.currentTimeMillis() % 20) + 1;
		super.start();
	}
	
	public void run(){
		for (int i = 0; i < this.brojPonavljanja; i++)
		{
			java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
			java.util.Date datum = new java.util.Date();
			System.out.println(this.nazivDretve + " " + format.format(datum));
			
			int spavaj = (int) (System.currentTimeMillis() % 11);
			
			try{
				Thread.sleep(spavaj * 1000);
			}catch(Exception e){}
		}
		
		System.out.println(this.nazivDretve + " KRAJ.");
		
	}
}
