public class SuiteEtSerie2 {

	public static void main(String[] args) {
		double u0 = 1.0;
		double u = u0;
		double v = u0;
		
		for (int i=0; i<=10; ++i) {
			if (i==0) {
				System.out.println("U(" + i + ") = " + u);
				System.out.println("V(" + i + ") = " + v);
			}
			else {
				u /= i;
				System.out.println("U(" + i + ") = " + u);
				v += u;
				System.out.println("V(" + i + ") = " + v);
			}
		}
	}

}
