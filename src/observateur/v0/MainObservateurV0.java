package observateur.v0;

import java.util.Arrays;
import java.util.List;

public class MainObservateurV0 {

    public static void main(String[] args) {

        AffichageInterface affichageActuel = new AffichageConditionActuelle();
        AffichageInterface affichagePrevision = new AffichagePrevision();
        AffichageInterface affichageStatistique = new AffichageStatistique();

        List<AffichageInterface> affichages = Arrays.asList(affichageActuel, affichagePrevision, affichageStatistique);

        DonneesMeteo donneesMeteo = new DonneesMeteo(affichages);

        donneesMeteo.actualiserMesures();

    }

}
