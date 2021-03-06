package decorateur.v1.supplement;

import decorateur.v1.boisson.Boisson;

public class Chocolat extends DecorateurIngredient {

    public Chocolat(Boisson boisson) {
        super(boisson);
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
