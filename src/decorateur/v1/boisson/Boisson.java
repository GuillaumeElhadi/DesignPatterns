package decorateur.v1.boisson;

public abstract class Boisson {

    protected String description = "Boisson inconnue";

    public String getDescription() {
        return description;
    }

    public abstract double count();
}
