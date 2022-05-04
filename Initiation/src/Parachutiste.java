import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        final double g = 9.81;
        double v0 = 0;
        double t0 = 0;
        
        double t = t0;
        double vitesse = v0;
        double hauteur = h0;
        double accel = g;
        double surface = 2.0;
        
        boolean vitesseSon = false;
        boolean vitesseMaximale = false;
        boolean parachute = false;
   
        while (hauteur > 0) {
    			System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);
    			t++;
    			double s = surface/masse;
    	        double q = Math.exp(-s*(t-t0));
    			hauteur = h0 - g/s * (t-t0) - (v0-g/s)/s * (1-q);
    			vitesse = g/s * (1-q) + v0 * q;
    			accel = g - s * vitesse;
    			if (!vitesseSon && vitesse > 343) {
    				vitesseSon = true;
    				System.out.println("## Felix depasse la vitesse du son");
    			}
    			if (!vitesseMaximale && accel < 0.5) {
    				vitesseMaximale = true;
    				System.out.println("## Felix a atteint sa vitesse maximale");
    			}
    			if (!parachute && hauteur < 2500) {
    				parachute = true;
    				System.out.println("## Felix ouvre son parachute");
    				surface = 25;
    				t0 = t;
    				v0 = vitesse;
    				h0 = hauteur;
    			}
    			
        	}

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
