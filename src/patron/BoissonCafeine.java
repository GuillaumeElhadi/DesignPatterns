package patron;

public abstract class BoissonCafeine {

    public void suivreRecette() {
        faireBouillirEau();
        preparer();
        verserDansTasse();
        ajouterSupplements();
    }

    abstract void preparer();

    abstract void ajouterSupplements();

    public void faireBouillirEau() {
        System.out.println("Portage de l'eau à ébullition");
    }

    public void verserDansTasse() {
        System.out.println("Remplissage de la tasse");

    }

}
