package examples.Thread;

import examples.Dupla;
import examples.Wagon;
import org.omg.SendingContext.RunTime;

import java.util.ArrayList;

/**
 * Created by romina.tornello on 3/4/2015.
 */
public class Car extends Thread {

    private int id;
    private int x;
    private int y;
    private static Position map[][];
    private static int lastId=0;

    static {
        map = new Position[3][15];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                Position position = new Position();
                map[i][j] = position;
            }
        }
    }

    Car(int row) {
        id = ++lastId;
        x=row;
        y=-1;
    }

    public void run() {
        while ( y < (map[0].length)) {
            //Save coordenatas
            int row = x;
            int col = y;
            //Update Coordenates
            y++;
            if(y>10)
                x=0;
            try {
                //ocupar siguiente posicion
                if(y < map[0].length)
                    map[x][y].occupy(id);
                //liberar posicion original
                if(col>=0)
                    map[row][col].liberate();
                showMatrix();
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static synchronized void showMatrix() {
        System.out.print("------------------------------" + "\n");

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j].getVal() + " ");
            }
            System.out.println();
        }

    }




}
