package examples.Thread;

/**
 * Created by romina.tornello on 2/26/2015.
 */
import examples.ThreadTrain;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintCar extends Frame {

    public void paint(Graphics g) {
        Graphics2D ga = (Graphics2D) g;
        ga.setPaint(Color.cyan);
        ga.fillRect(10, 50, 30, 30);

    }



    public static void main(String[] args) {
        PaintCar frame = new PaintCar();
        frame.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent we) {
                        System.exit( 0 );
                    }
                }
        );

        frame.setSize(650, 500);
        frame.setVisible(true);

    }



}