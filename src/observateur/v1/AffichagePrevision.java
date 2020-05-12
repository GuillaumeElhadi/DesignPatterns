package observateur.v1;

public class AffichagePrevision implements Observateur, Affichage{

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
        System.out.println("Prévisions meteo :\n\t il fera " + temp + "°C, une humidité de " + humidite
                + "% et une pression atmospherique de " + pressure + "bar");
    }

}
