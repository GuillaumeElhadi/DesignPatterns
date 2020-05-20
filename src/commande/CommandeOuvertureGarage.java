package commande;

import commande.model.PorteGarage;

public class CommandeOuvertureGarage implements ICommande {

    private PorteGarage porteGarage;

    public CommandeOuvertureGarage(PorteGarage porteGarage) {
        this.porteGarage = porteGarage;
    }
    @Override
    public void execute() {
        porteGarage.marche();

    }

}
