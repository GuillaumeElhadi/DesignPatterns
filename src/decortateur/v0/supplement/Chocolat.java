package decortateur.v0.supplement;

import decortateur.v0.boisson.Boisson;

public class Chocolat extends DecorateurIngredient {

    Boisson boisson;

    public Chocolat(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Chocolat";
    }

    @Override
    public double count() {
        return boisson.count() + 0.20;
    }

}
