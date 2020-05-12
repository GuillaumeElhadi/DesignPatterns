package observateur.v1;

import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo implements Sujet{

    private List<Observateur> affichages = new ArrayList<>();

    private float temp;
    private float humidite;
    private float pressure;

    public float getTemperature() {
        return temp;
    }

    public float getHumidite() {
        return humidite;
    }

    public float getPression() {
        return pressure;
    }

    @Override
    public void enregisterObservateur(Observateur o) {
        affichages.add(o);
    }

    @Override
    public void supprimerObservateur(Observateur o) {
        affichages.removeIf(affichage -> affichage.equals(o));

    }

    @Override
    public void notifierObservateurs() {
        affichages.stream().forEach(affichage -> affichage.actualiser(getTemperature(), getHumidite(), getPression()));
    }

    public void setValues(float temp, float humidite, float pressure) {
        this.temp = temp;
        this.humidite = humidite;
        this.pressure = pressure;

        notifierObservateurs();
    }
}
