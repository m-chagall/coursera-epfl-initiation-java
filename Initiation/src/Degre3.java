import java.util.Scanner;

public class Degre3 {

	public static void main(String[] args) {
		int a, b, c;
		double x;
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Entrez a (int) : ");
		a = input.nextInt();
		System.out.print("Entrez b (int) : ");
		b = input.nextInt();
		System.out.print("Entrez c (int) : ");
		c = input.nextInt();
		System.out.print("Entrez x (double) : ");
		x = input.nextDouble();
		
		double var1, var2, var3, val;
		var1 = ((a+b)/2.0)*x*x*x;
		var2 = (a+b)*(a+b)*x*x;
		var3 = (a+b+c);
		val = (var1 + var2 + var3);
		
//		System.out.println(var1 + " " + var2 + " " + var3);
		System.out.println("La valeur du polynôme est : " + val);
		
//		option 2
		System.out.println("La valeur du polynôme est : " + 
				(((a+b)/2.0)*x*x*x + (a+b)*(a+b)*x*x + a + b + c));
		
//		error
//		System.out.println("La valeur du polynôme est : " + 
//				(((a+b)/2)*x*x*x + (a+b)*(a+b)*x*x + a + b + c));

//		Attention! Pour que le calcul de (a+b)/2 se fasse correctement 
//		(sans troncature due à la division entière), 
//		il est indispensable que la variable intermédiaire aux 
//		soit déclarée comme double.		
		
//		dans les corrigés
//		double xx = x * x;
//		double aux = a + b;
//		double valeur = aux/2 * x + xx + aux * aux * xx + aux + c;
//		System.out.println("La valeur du polynôme est : " + valeur);
		
		
		input.close();
	}
	

}
