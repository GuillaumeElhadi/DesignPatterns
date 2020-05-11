package strategy.v2.model;

import strategy.v2.comportement.ComportementCancan;
import strategy.v2.comportement.ComportementVol;
import strategy.v2.comportement.cancane.CoinCoin;
import strategy.v2.comportement.vol.VolerAvecDesAiles;

public class Canard {

    private ComportementVol comportementVol;

    private ComportementCancan comportementCancan;

    public Canard() {
        comportementVol = new VolerAvecDesAiles();
        comportementCancan = new CoinCoin();
    }

    public Canard(ComportementVol comportementVol, ComportementCancan comportementCancan) {
        this.comportementVol = comportementVol;
        this.comportementCancan = comportementCancan;
    }
    public void nager() {
        System.out.println("Je nage.");
    }

    public void effectuerCancan() {
        comportementCancan.cancaner();
    }

    public void effectuerVol() {
        comportementVol.voler();
    }

    public void afficher() {
        System.out.println("Je suis un " + this.getClass().getSimpleName() + ".");
        comportementVol.voler();
        comportementCancan.cancaner();
    }

    /**
     * @return the comportementVol
     */
    public ComportementVol getComportementVol() {
        return comportementVol;
    }

    /**
     * @param comportementVol the comportementVol to set
     */
    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }

    /**
     * @return the comportementCancan
     */
    public ComportementCancan getComportementCancan() {
        return comportementCancan;
    }

    /**
     * @param comportementCancan the comportementCancan to set
     */
    public void setComportementCancan(ComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }
}
