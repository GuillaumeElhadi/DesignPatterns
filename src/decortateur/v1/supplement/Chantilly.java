package decortateur.v1.supplement;

import decortateur.v1.boisson.Boisson;

public class Chantilly extends DecorateurIngredient {

    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Chantilly";
    }

    @Override
    public double count() {
        return boisson.count() + 0.10;
    }

}
