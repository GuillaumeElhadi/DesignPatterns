package patron;

public class PatronMain {

    public static void main(String[] args) {
        BoissonCafeine cafe = new Cafe();
        BoissonCafeine the = new The();

        System.out.println("Commande d'un café...");
        cafe.suivreRecette();

        System.out.println("\nCommande d'un thé...");
        the.suivreRecette();

    }

}
