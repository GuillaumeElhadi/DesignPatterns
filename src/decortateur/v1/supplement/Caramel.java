package decortateur.v1.supplement;

import decortateur.v1.boisson.Boisson;

public class Caramel extends DecorateurIngredient {

    public Caramel(Boisson boisson) {
        super(boisson);
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
