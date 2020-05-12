package observateur.v0;

public class AffichageStatistique implements AffichageInterface{

    @Override
    public void actualiser(float temp, float humidite, float pressure) {
        System.out.println("Statistique meteo : \n\t- Temperature : " + temp + "°C \n\t- Humidité : " + humidite
                + "% \n\t- Pression atmospherique : " + pressure + "bar");

    }

}
