package observateur.v1;

public class AffichageStatistique implements Observateur, Affichage {

    private float temp;
    private float humidite;
    private float pressure;

    @Override
    public void actualiser(float temp, float humidite, float pressure) {
        this.temp = temp;
        this.humidite = humidite;
        this.pressure = pressure;
        afficher();
    }

    @Override
    public void afficher() {
        System.out.println("Statistique meteo : \n\t- Temperature : " + temp + "°C \n\t- Humidité : " + humidite
                + "% \n\t- Pression atmospherique : " + pressure + "bar");
    }

}
