package singleton;

public class SingletonMultiThreadSimple {

    private boolean vide;
    private boolean bouilli;

    private static SingletonMultiThreadSimple monInstance;

    private SingletonMultiThreadSimple() {
        vide = true;
        bouilli = false;
    }

    public synchronized static SingletonMultiThreadSimple getInstance() {
        if (monInstance == null) {
            monInstance = new SingletonMultiThreadSimple();
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
