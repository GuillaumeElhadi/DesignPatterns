package singleton;

public class SingletonDoubleVerif {

    private boolean vide;
    private boolean bouilli;

    private volatile static SingletonDoubleVerif monInstance;

    private SingletonDoubleVerif() {
        vide = true;
        bouilli = false;
    }

    public static SingletonDoubleVerif getInstance() {
        if(monInstance == null) {
            synchronized(SingletonDoubleVerif.class) {
                if(monInstance == null) {
                    monInstance = new SingletonDoubleVerif();
                }

            }
        }

        return monInstance;
    }

    public void remplir() {
        if (isVide()) {
            vide = false;
            bouilli = false;
        }
    }

    public void vider() {
        if (!isVide() && isBouilli()) {
            vide = true;
        }
    }

    public void bouillir() {
        if (!isVide() && !isBouilli()) {
            bouilli = true;
        }
    }

    /**
     * @return the vide
     */
    public boolean isVide() {
        return vide;
    }

    /**
     * @param vide the vide to set
     */
    public void setVide(boolean vide) {
        this.vide = vide;
    }

    /**
     * @return the bouilli
     */
    public boolean isBouilli() {
        return bouilli;
    }

    /**
     * @param bouilli the bouilli to set
     */
    public void setBouilli(boolean bouilli) {
        this.bouilli = bouilli;
    }

}
