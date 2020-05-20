package commande;

import commande.model.Lampe;
import commande.model.PorteGarage;
import commande.telecommande.Telecommande;

public class CommandeMain {

    public static void main(String[] args) {
        Telecommande telecommande = new Telecommande();

        Lampe lampe = new Lampe("Salon");
        PorteGarage porteGarage = new PorteGarage();

        CommandeAllumerLampe commandeAllumerLampe = new CommandeAllumerLampe(lampe);
        CommandeOuvertureGarage commandeOuvertureGarage = new CommandeOuvertureGarage(porteGarage);

        telecommande.addCommande("lampe",commandeAllumerLampe);
        telecommande.addCommande("garage",commandeOuvertureGarage);
        telecommande.presserBouton("lampe");
        telecommande.presserBouton("lampe");
        telecommande.presserBouton("lampe");

    }

}
