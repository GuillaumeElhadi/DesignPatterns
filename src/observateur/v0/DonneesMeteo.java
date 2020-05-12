package observateur.v0;

import java.util.List;

public class DonneesMeteo {

    private List<AffichageInterface> affichages;

    public DonneesMeteo(List<AffichageInterface> affichages) {
        this.affichages = affichages;
    }

    public float getTemperature() {
        return 0.0f;
    }

    public float getHumidite() {
        return 0.0f;
    }

    public float getPression() {
        return 0.0f;
    }

    public void actualiserMesures() {

        float temp = getTemperature();
        float humidite = getHumidite();
        float pressure = getPression();

        affichages.stream().forEach(affichage -> affichage.actualiser(temp, humidite, pressure));
    }
}
