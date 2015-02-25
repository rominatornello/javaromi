package examples;

import java.util.ArrayList;

/**
 * Created by romina.tornello on 2/19/2015.
 */
public class RecursiveMatrix {

    public static  void main(String[] args){

       RecursiveMatrix rema= new RecursiveMatrix();
       ArrayList<Dupla> root =new ArrayList<Dupla>();
       rema.findRootGreaterWeight(0,0,0,root);
    }

    int[][] createMatrix(){
        int matrix [][] = new int[3][3];
        matrix[0][0]=0;
        matrix[0][1]=0;
        matrix[0][2]=0;
        //matrix[0][3]=8;

        matrix[1][0]=1;
        matrix[1][1]=1;
        matrix[1][2]=1;
       // matrix[1][3]=8;

        matrix[2][0]=2;
        matrix[2][1]=2;
        matrix[2][2]=2;
        //matrix[2][3]=8;

        //matrix[3][0]=3;
      //  matrix[3][1]=3;
      //  matrix[3][2]=3;
      //  matrix[3][3]=8;

        return matrix;
    }



    void findRootGreaterWeight(int positionX,int positionY,int sum,ArrayList<Dupla> root ) {
        Dupla dupla;
        RecursiveMatrix recursiveMatrix = new RecursiveMatrix();
        int[][] matrix;
        matrix = recursiveMatrix.createMatrix();

        sum = sum + matrix[positionX][positionY];
        dupla = new Dupla(positionX, positionY);
        root.add(dupla);

        if (positionX == (matrix.length - 1) && (positionY == matrix.length - 1)) {
            System.out.println("La suma del camino con mas peso es: " + sum);

            for(Dupla object: root){
                System.out.println("indice:" + object.int1+","+object.int2);
            }

        } else {
            if (positionX + 1 > matrix.length - 1) {
                findRootGreaterWeight(positionX, positionY + 1, sum, root);
            } else {
                if ((positionY + 1 <= (matrix.length - 1) && (matrix[positionX][positionY + 1] <= matrix[positionX + 1][positionY]))) {
                    findRootGreaterWeight(positionX+1, positionY, sum, root);
                }
            }
            if (positionY + 1 > matrix.length - 1) {
                findRootGreaterWeight(positionX + 1, positionY, sum, root);
            } else {
                if (positionX + 1 <= (matrix.length - 1) && (matrix[positionX][positionY + 1] >= matrix[positionX + 1][positionY])) {
                    findRootGreaterWeight(positionX, positionY +1, sum, root);
                }
            }

        }

    }





}
