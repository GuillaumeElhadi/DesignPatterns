package commande;

import commande.model.Lampe;

public class CommandeAllumerLampe implements ICommande {

    private Lampe lampe;

    public CommandeAllumerLampe(Lampe lampe) {
        this.lampe = lampe;
    }
    @Override
    public void execute() {
        lampe.marche();

    }

}
