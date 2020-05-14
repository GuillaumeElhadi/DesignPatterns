package decorateur.v0.supplement;

import decorateur.v0.boisson.Boisson;

public class Lait extends DecorateurIngredient {

    Boisson boisson;

    public Lait(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Lait";
    }

    @Override
    public double count() {
        return boisson.count() + 0.10;
    }

}
