package examples;

/**
 * Created by romina.tornello on 2/26/2015.
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Rect extends Frame {

    public void paint(Graphics g) {
        Graphics2D ga = (Graphics2D) g;
        ga.setPaint(Color.cyan);
        ga.fillRect(0, 50, 30, 30);
        ga.setPaint(Color.cyan);
        ga.fillRect(40, 50, 30, 30);
        ga.setPaint(Color.cyan);
        ga.fillRect(80, 50, 30, 30);
        ga.setPaint(Color.cyan);
        ga.fillRect(120, 50, 30, 30);
        ga.setPaint(Color.cyan);
        ga.fillRect(160, 50, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(200, 50, 30, 30);
        ga.setPaint(Color.DARK_GRAY);
        ga.fillRect(240, 50, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(280, 50, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(320, 50, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(360, 50, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(400, 50, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(440, 50, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(480, 50, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(520, 50, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(560, 50, 30, 30);

        ga.setPaint(Color.cyan);
        ga.fillRect(0, 90, 30, 30);
        ga.setPaint(Color.cyan);
        ga.fillRect(40, 90, 30, 30);
        ga.setPaint(Color.cyan);
        ga.fillRect(80, 90, 30, 30);
        ga.setPaint(Color.cyan);
        ga.fillRect(120, 90, 30, 30);
        ga.setPaint(Color.cyan);
        ga.fillRect(160, 90, 30, 30);
        ga.setPaint(Color.green);
        ga.fillRect(200, 90, 30, 30);
        ga.setPaint(Color.green);
        ga.fillRect(240, 90, 30, 30);
        ga.setPaint(Color.green);
        ga.fillRect(280, 90, 30, 30);
        ga.setPaint(Color.green);
        ga.fillRect(320, 90, 30, 30);
        ga.setPaint(Color.green);
        ga.fillRect(360, 90, 30, 30);
        ga.setPaint(Color.green);
        ga.fillRect(400, 90, 30, 30);
        ga.setPaint(Color.green);
        ga.fillRect(440, 90, 30, 30);
        ga.setPaint(Color.green);
        ga.fillRect(480, 90, 30, 30);
        ga.setPaint(Color.green);
        ga.fillRect(520, 90, 30, 30);
        ga.setPaint(Color.green);
        ga.fillRect(560, 90, 30, 30);

        ga.setPaint(Color.cyan);
        ga.fillRect(0, 130, 30, 30);
        ga.setPaint(Color.cyan);
        ga.fillRect(40, 130, 30, 30);
        ga.setPaint(Color.cyan);
        ga.fillRect(80, 130, 30, 30);
        ga.setPaint(Color.cyan);
        ga.fillRect(120, 130, 30, 30);
        ga.setPaint(Color.cyan);
        ga.fillRect(160, 130, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(200, 130, 30, 30);
        ga.setPaint(Color.DARK_GRAY);
        ga.fillRect(240, 130, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(280, 130, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(320, 130, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(360, 130, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(400, 130, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(440, 130, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(480, 130, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(520, 130, 30, 30);
        ga.setPaint(Color.darkGray);
        ga.fillRect(560, 130, 30, 30);
    }



    public static void main(String[] args) {
        Rect frame = new Rect();
        frame.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent we) {
                        System.exit( 0 );
                    }
                }
        );

        frame.setSize(650, 500);
        frame.setVisible(true);

        ThreadTrain treadBlue = new ThreadTrain();
        treadBlue.start();
        Graphics2D ga = (Graphics2D) frame.getGraphics();
        ga.setPaint(Color.blue);
        ga.fillRect(0, 50, 30, 30);

    }

}