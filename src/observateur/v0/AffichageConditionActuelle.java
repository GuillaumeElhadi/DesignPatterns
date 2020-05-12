package observateur.v0;

public class AffichageConditionActuelle implements AffichageInterface{

    @Override
    public void actualiser(float temp, float humidite, float pressure) {
        System.out.println("Conditions meteo actuelles : \n\til fait " + temp + "°C, une humidité de " + humidite
                + "% et une pression atmospherique de " + pressure + "bar");

    }

}
