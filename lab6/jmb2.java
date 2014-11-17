
public class jmb2 {
	public static void main(String[] args) {
		String jmb = "1211989175034" ;
		
		char jedan = jmb.charAt(0) ;
		System.out.print(jedan) ;
		char dva = jmb.charAt(1) ;
		char tri = jmb.charAt(2) ;
		char cetiri = jmb.charAt(3) ;
		char pet = jmb.charAt(4) ;
		char sest = jmb.charAt(5) ;
		char sedam = jmb.charAt(6) ;
		char osam = jmb.charAt(7) ;
		char devet = jmb.charAt(8) ;
		char deset = jmb.charAt(9) ;
		char jedanaest = jmb.charAt(10) ;
		char dvanaest = jmb.charAt(11) ;
		char trinaest = jmb.charAt(12) ;
	int broj = (jedan-48)*7+(dva-48)*6+(tri-48)*5+(cetiri-48)*4+(pet-48)*3+(sest-48)*2+(sedam-48)*7+
			(osam-48)*6+(devet-48)*5+(deset-48)*4+(jedanaest-48)*3+(dvanaest-48)*2 ;
			
	int dijeljenje = broj%11 ;
	System.out.println(broj);
	System.out.println(dijeljenje);
	 
	
	}
}
