package decorateur.v1.supplement;

import decorateur.v1.boisson.Boisson;

public abstract class DecorateurIngredient extends Boisson {

    protected Boisson boisson;

    public DecorateurIngredient(Boisson boisson) {
        this.boisson = boisson;
    }
    @Override
    public abstract String getDescription();

}
