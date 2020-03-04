public class Vjezba_01_2 {
	public static void main(String args[]) {
		
		//PROVJERA OBAVEZNA!
		if (args.length != 2)
		{
			System.out.println("Unesi dva broja");
			return;
		}
		
		int odBroja = Integer.parseInt(args[0]);
		int doBroja = Integer.parseInt(args[1]);
		
		Interval interval = new Interval(odBroja, doBroja);
		long zbroj = interval.dajZbroj();
		System.out.println("Suma od " + odBroja + " do " + doBroja + " = "+ zbroj);
	}	
}
