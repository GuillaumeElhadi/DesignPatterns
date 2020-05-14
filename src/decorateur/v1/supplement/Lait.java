package decorateur.v1.supplement;

import decorateur.v1.boisson.Boisson;

public class Lait extends DecorateurIngredient {

    public Lait(Boisson boisson) {
        super(boisson);
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
