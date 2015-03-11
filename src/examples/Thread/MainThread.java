package examples.Thread;

/**
 * Created by romina.tornello on 3/5/2015.
 */
public class MainThread {

    public static void main(String[] args) {

        Car treadBlue = new Car(1);
        treadBlue.start();
        Car treadRed = new Car(0);
        treadRed.start();
        Car treadGreen = new Car(0);
        treadGreen.start();
    }


}
