package observateur.v0;

public class AffichagePrevision implements AffichageInterface {

    @Override
    public void actualiser(float temp, float humidite, float pressure) {
        System.out.println("Pr�visions meteo :\n\t il fera " + temp + "�C, une humidit� de " + humidite
                + "% et une pression atmospherique de " + pressure + "bar");

    }

}
