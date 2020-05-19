package singleton;

public class SingletonMain {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            SingletonDoubleVerif bouilleur1 = SingletonDoubleVerif.getInstance();
            System.out.println(bouilleur1);
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            SingletonDoubleVerif bouilleur2 = SingletonDoubleVerif.getInstance();
            System.out.println(bouilleur2);
        });
        thread2.start();


    }

}
