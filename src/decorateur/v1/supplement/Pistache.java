package decorateur.v1.supplement;

import decorateur.v1.boisson.Boisson;

public class Pistache extends DecorateurIngredient {

    public Pistache(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Pistache";
    }

    @Override
    public double count() {
        return boisson.count() + .5;
    }

}
