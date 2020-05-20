package commande.model;

public class Lampe {

    private boolean allume;

    private String name;

    public Lampe(String name) {
        this.name = name;
    }

    public void setAllume(boolean allume) {
        this.allume = allume;
    }

    public boolean isAllume() {
        return this.allume;
    }

    public void marche() {
        if(!allume) {
            allume = true;
            System.out.println("Lampe " + name + " allum�e.");
        } else {
            arret();
        }
    }

    public void arret() {
        if(allume) {
            allume = false;
            System.out.println("Lampe " + name + " �teinte.");
        } else {
            marche();
        }
    }
}
