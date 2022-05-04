import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        for (int i=debut; i<=fin; ++i) {
        	int nombre = i;
        	int count = 0;
        	
        	while (nombre !=0) {
            	if (nombre % 3 ==0) {
            		nombre += 4;
            	}
            	else if (nombre % 4 == 0) {
            		nombre /= 2;
            	}
            	else {
            		nombre -= 1;
            	}        		
            	count++;
        	}
       		System.out.println(i + " -> " + count);        	
        }
        
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
