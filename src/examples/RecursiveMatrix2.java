package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;

/**
 * Created by romina.tornello on 2/23/2015.
 */
public class RecursiveMatrix2 {

    public static void main(String[] args) {

        RecursiveMatrix2 rema = new RecursiveMatrix2();
        ArrayList<Dupla> root = new ArrayList<Dupla>();
        rema.sumGreaterWeight(2, 2, 0);
    }

    int[][] createMatrix2() {
        int matrix[][] = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 4;
        matrix[0][2] = 3;


       matrix[1][0] = 0;
       matrix[1][1] = 7;
       matrix[1][2] = 5;

        matrix[2][0]=9;
        matrix[2][1]=9;
        matrix[2][2]=2;

        return matrix;
    }

//  matrix[0][0] = 1;
//  matrix[1][0] = 0;
    void sumGreaterWeight(int positionX, int positionY, int sum) {

        RecursiveMatrix2 recursiveMatrix = new RecursiveMatrix2();
        int[][] matrix;
        matrix = recursiveMatrix.createMatrix2();

        if (positionX == (matrix.length - 1) && (positionY == matrix.length - 1)) {
            sum=matrix[positionX][positionY];
        }

        if(positionX == 0 && positionY == 0) {
            sum = sum;
            System.out.println(sum);
        }else if(positionX ==0){//no tengo mas filas por recorrer
            sum = sum + matrix[positionX][positionY-1];
            sumGreaterWeight(positionX, positionY-1, sum);

        }else if(positionY == 0)//no tengo mas columnas
            {
                sum = sum + matrix[positionX-1][positionY];
                sumGreaterWeight(positionX-1, positionY, sum);
            }else {

                int sumXfil;
                int sumXcol;
                sumXfil = sum+matrix[positionX-1][positionY];
                sumXcol =  sum+matrix[positionX][positionY-1];
            if(sumXfil>sumXcol)
                sumGreaterWeight(positionX-1,positionY,sumXfil);
            else
                sumGreaterWeight(positionX,positionY-1,sumXcol);
        }





    }


}






















