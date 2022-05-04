import java.util.Scanner;

class Swap3 {
    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Entrez la premiere  valeur : ");
        int a = clavier.nextInt();

        System.out.print("Entrez la deuxieme  valeur : ");
        int b = clavier.nextInt();

        System.out.print("Entrez la troisieme valeur : ");
        int c = clavier.nextInt();

        System.out.println("Les valeurs entrees sont : a = " + a
                           + ", b = " + b + " et c = " + c);

        System.out.println("Permutation: a ==> b, b ==> c, c ==> a");

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        int s1, s2;
        s1 = a; // s1 = 51
        s2 = b; // s2 = 876
        b = a; // a = 51, b = 51, c = 235
        s1 = c; // s1 = 876
        c = s2; // a = 51, b = 51, c = 876
        a = s1; // a = 235, b = 51, c = 876

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        System.out.println("Les valeurs permutees sont : a = " + a
                           + ", b = " + b + " et c = " + c);
    }
}
