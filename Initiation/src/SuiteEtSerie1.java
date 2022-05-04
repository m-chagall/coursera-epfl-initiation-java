public class SuiteEtSerie1 {

	public static void main(String[] args) {
		double u0 = 1.0;
		double u = u0;
		
		for (int i=0; i<=10; ++i) {
			if (i==0) {
				System.out.println("U(" + i + ") = " + u0);			
			}
			else {
				u /= i;
				System.out.println("U(" + i + ") = " + u);
			}
		}
	}

}
