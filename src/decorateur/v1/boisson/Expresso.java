package decorateur.v1.boisson;

public class Expresso extends Boisson {

    public Expresso() {
        description = "Expresso";
    }

    @Override
    public double count() {
        return 1.99;
    }

}
