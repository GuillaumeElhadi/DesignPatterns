package decorateur.v0.supplement;

import decorateur.v0.boisson.Boisson;

public class Caramel extends DecorateurIngredient {

    Boisson boisson;

    public Caramel(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Caramel";
    }

    @Override
    public double count() {
        return boisson.count() + 0.15;
    }
}
