package decorateur.v1.boisson;

public class Sumatra extends Boisson {

    public Sumatra() {
        description = "Sumatra";
    }

    @Override
    public double count() {
        return .99;
    }

}
