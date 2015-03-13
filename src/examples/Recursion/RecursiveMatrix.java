package examples.Recursion;

import examples.Dupla;

import java.util.ArrayList;

/**
 * Created by romina.tornello on 2/19/2015.
 * Encotrar en una matriz el camino de mayor peso para llegar del primer elemento al ultimo
 * Dicese de mayor peso al que la sumatoria de los elementos del camino es el mayor
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
               // System.out.println("indice:" + object.int1+","+object.int2);
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


    int sumGreaterWeight(int positionX, int positionY, int sum ) {

        RecursiveMatrix2 recursiveMatrix = new RecursiveMatrix2();
        int[][] matrix;
        matrix = recursiveMatrix.createMatrix2();
        int value = matrix[positionX][positionY];
        int tempSum=0;
        //boolean flagBreak=false;
        //matrix.length - 1 cantidad de filas
        //matrix.length[] - 1 cantidad de columnas        //condicion de salida
        while(true){
            if (positionX == matrix.length - 1 && positionY == matrix[0].length - 1) {
                sum = sum + value;
                System.out.println("La suma mayor es: "+sum);
                break;
            }else {
                if (positionY + 1 > matrix[0].length - 1) {//no hay mas columnas por recorrer recorro filas
                    sum = sum + value;
                    tempSum = sumGreaterWeight(positionX + 1, positionY, sum);
                    break;
                } else if (positionX + 1 > matrix.length - 1) {//no hay mas filas por recorrer recorro columnas
                    sum = sum + value;
                    tempSum = sumGreaterWeight(positionX, positionY + 1, sum);
                    break;
                } else if (positionX < matrix.length - 1) { //hay mas filas y columnas tengo que recorrer dos caminos posibles
                    sum = sum + value;
                    tempSum = sumGreaterWeight(positionX + 1, positionY, sum);
                    break;
                } if ( positionY < matrix[0].length - 1) {
                    sum = sum + value;
                    tempSum = sumGreaterWeight(positionX, positionY + 1, sum);
                    break;
                }
                if (tempSum > sum)
                    sum = tempSum;
                break;
            }
        }

        return sum;

    }



}
