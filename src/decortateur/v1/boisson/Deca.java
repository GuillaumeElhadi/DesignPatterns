package decortateur.v1.boisson;

public class Deca extends Boisson {

    public Deca() {
        description = "Deca";
    }

    @Override
    public double count() {
        return 1.05;
    }

}
