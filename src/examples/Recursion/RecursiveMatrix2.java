package examples.Recursion;

import examples.Dupla;

import java.util.ArrayList;

/**
 * Created by romina.tornello on 2/23/2015.
 */
public class RecursiveMatrix2 {

    public static void main(String[] args) {

        RecursiveMatrix2 rema = new RecursiveMatrix2();
        ArrayList<Dupla> root = new ArrayList<Dupla>();
        int [][]matrix = rema.createMatrix2();
        System.out.println(rema.sumGreaterWeight(matrix, 0, 0));
    }

    int[][] createMatrix2() {
        int matrix[][] = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 4;
        matrix[0][2] = 3;


       matrix[1][0] = 0;
       matrix[1][1] = 7;
       matrix[1][2] = 5;

        matrix[2][0]=3;
        matrix[2][1]=1;
        matrix[2][2]=2;

        return matrix;
    }

    int sumGreaterWeight(int[][] matrix,int positionX, int positionY) {
        int sum;
        if (positionX > (matrix.length - 1) || (positionY > matrix.length - 1)) {
            sum=0;
        }else {
            int sumX = sumGreaterWeight(matrix,positionX+1,positionY);
            int sumY = sumGreaterWeight(matrix,positionX,positionY+1);
            sum =matrix[positionX][positionY];
            if (sumX>sumY)
                sum += sumX;
            else
                sum += sumY;
        }
        return sum;

    }


}






















