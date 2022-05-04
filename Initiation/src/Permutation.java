import java.util.Scanner;
public class Permutation {

	public static void main(String[] args) {
		
		int x, y, tmp;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entrez x: ");
		x = input.nextInt();
		System.out.print("Entrez y: ");
		y = input.nextInt();
		
		System.out.println("Avant permutation: ");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("Après permutation: ");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		input.close();
	}

}
