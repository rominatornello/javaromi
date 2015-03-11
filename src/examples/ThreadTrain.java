package examples;

import sun.java2d.SunGraphics2D;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 * Created by romina.tornello on 2/26/2015.
 */
public class ThreadTrain extends Thread {

    private static String matrix[][]=new String[3][15];

    public void run(){
        //int threadNumber = Integer.parseInt((this.getName().replace("Thread-", "")));
        //String charThread =(this.getName().replace("Thread-", ""));


    }




    public void recursiveVia(String [][]matrix, int file,int col){
        String charThread =(this.getName().replace("Thread-", ""));
        while(true){
            if(col+3>matrix[0].length){
                System.out.println("la columna es:" + col);
                matrix[file][col-3] = null;
                matrix[file][col-2] = null;
                matrix[file][col-1] = null;
                showMatrix(matrix);
                break;
            }
            else if(matrix[1][col]== null) {
                matrix[1][col] = charThread;
                matrix[1][col+1] = charThread;
                matrix[1][col+2] = charThread;
                matrix[file][col-3] = null;
                matrix[file][col-2] = null;
                matrix[file][col-1] = null;
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                showMatrix(matrix);
                col = col+3;
                recursiveVia(matrix,1,col);
            }
        }


    }


    public static void main(String[] args) {

        ThreadTrain threadBlue = new ThreadTrain();
        ThreadTrain threadRed = new ThreadTrain();
        ThreadTrain threadGreen = new ThreadTrain();

        threadBlue.fillMatrix(matrix,threadBlue);
        threadRed.fillMatrix(matrix,threadRed);
        threadGreen.fillMatrix(matrix,threadGreen);
        threadBlue.showMatrix(matrix);
        threadBlue.start();
        try {
            threadBlue.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadRed.start();
        try {
            threadRed.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadGreen.start();
    }


    //coloca los trenes en los caminos de la matriz
    public void fillMatrix(String [][] matrix, Thread thread){
        String charThread =(thread.getName().replace("Thread-", ""));
        int threadNumber = Integer.parseInt((thread.getName().replace("Thread-", "")));
        matrix[threadNumber][0]=charThread;
        matrix[threadNumber][1]=charThread;
        matrix[threadNumber][2]=charThread;
    }

    public void showMatrix(String [][] matrix){
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
