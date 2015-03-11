package examples;

import java.util.ArrayList;

/**
 * Created by romina.tornello on 3/2/2015.
 */
public class Train extends Thread {

    private ArrayList<Wagon> wagons;
    private int id;
    private static int map[][];


    Train(int row, int cantWagons){
        wagons = new ArrayList<Wagon>();
        id = ((int) (Math.random() * 100) + 0);

        for(int i=0;i<cantWagons;i++){
            Dupla dupla = new Dupla(row,i);
            Wagon wagon = new Wagon();
            wagon.dupla =dupla;
            wagons.add(wagon);
            map[row][i]= id;
        }
        showMatrix(map);

    }
//la via esta sobre la fila 1
    protected  void advance() {
            Wagon wagon = wagons.remove(0);
            map[ wagon.dupla.int1][ wagon.dupla.int2]= 0;
            if((wagon.dupla.int2+2 )<(map[0].length-1))
            {
                wagon.dupla.int1=1;
                wagon.dupla.int2 += wagons.size()+1;
                wagons.add(wagon);
                map[1][ wagon.dupla.int2]= id;
            }
            showMatrix(map);

    }

//que el mapa sea un mapa de posiciones y asi puedo sincronizar el objeto posiciones
    public void run() {
        int nextElement = ((wagons.get(wagons.size()-1)).dupla.getInt2())+1;
        int rowWagon=wagons.get(0).dupla.int1;
        int cantAdvances=0;
        while (cantAdvances<(map[0].length)) {
           cantAdvances+=1;
           advance();
           try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[]args){
        map = new int[3][10];
        Train treadBlue = new Train(1,3);
        treadBlue.start();
        Train treadRed = new Train(0,3);
       //treadRed.start();
    }

    public void showMatrix(int [][] matrix){
        System.out.print("------------------------------"+"\n");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[ i ].length; j++)
            {
                System.out.print(matrix[ i ][ j ] + " ");
            }
            System.out.println( );
        }
    }
}
