package patron;

public class Cafe extends BoissonCafeine {

    @Override
    public void preparer() {
        System.out.println("Passage du café");
    }

    @Override
    public void ajouterSupplements() {
        System.out.println("Ajout du lait et du sucre");
    }
}
