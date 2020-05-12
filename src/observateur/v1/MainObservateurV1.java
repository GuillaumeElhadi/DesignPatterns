package observateur.v1;

public class MainObservateurV1 {

    public static void main(String[] args) {

        Observateur affichageActuel = new AffichageConditionActuelle();
        Observateur affichagePrevision = new AffichagePrevision();
        Observateur affichageStatistique = new AffichageStatistique();

        DonneesMeteo donneesMeteo = new DonneesMeteo();

        donneesMeteo.enregisterObservateur(affichagePrevision);
        donneesMeteo.enregisterObservateur(affichageActuel);
        donneesMeteo.enregisterObservateur(affichageStatistique);

        donneesMeteo.setValues(28.f, 64.f, 48.f);
        donneesMeteo.setValues(10.f, 12.f, 14.f);

        donneesMeteo.supprimerObservateur(affichageStatistique);
        donneesMeteo.setValues(2.f,  3.f,  4.f);

    }

}
