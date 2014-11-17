
public class Geometrija {
	public static void main(String[] args) {
		int broj = 10 ;
		int kockica = broj * broj ;
		int kvadrat = broj * broj ;
		double krug = (double) ( Math.PI * kvadrat ) ;
		int kockicakrug = (int) (krug / kockica) ;
		int duzina = (int) (0.5+Math.random()*37.7 ) ;
		int baza = duzina * (broj + broj) ;
		double zapremina = (int) baza + 2 * krug ;
		System.out.println(kockica);
		System.out.println(krug);
		System.out.println(kockicakrug);
		System.out.println(duzina);
		System.out.println(zapremina);
		
				
	}
}
