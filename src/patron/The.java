package patron;

public class The extends BoissonCafeine {

    @Override
    public void preparer() {
        System.out.println("Infusion du th�");
    }

    @Override
    public void ajouterSupplements() {
        System.out.println("Ajout du citron");
    }
}
