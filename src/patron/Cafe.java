package patron;

public class Cafe extends BoissonCafeine {

    @Override
    public void preparer() {
        System.out.println("Passage du caf�");
    }

    @Override
    public void ajouterSupplements() {
        System.out.println("Ajout du lait et du sucre");
    }
}
