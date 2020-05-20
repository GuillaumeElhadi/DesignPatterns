package patron;

public class PatronMain {

    public static void main(String[] args) {
        BoissonCafeine cafe = new Cafe();
        BoissonCafeine the = new The();

        System.out.println("Commande d'un caf�...");
        cafe.suivreRecette();

        System.out.println("\nCommande d'un th�...");
        the.suivreRecette();

    }

}
