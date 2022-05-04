import java.util.Calendar;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		int age;
		int annee;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println(System.in);
		System.out.println("Donnez votre age : ");
		age = clavier.nextInt();
		annee = Calendar.getInstance().get(Calendar.YEAR) - age;
		System.out.println("Votre annee de naissance est : " + annee);
		clavier.close();
	
	}

}
