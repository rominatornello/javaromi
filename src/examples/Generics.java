package examples;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by romina.tornello on 4/28/2015.
 */
public class Generics {

    public static <E> E sumArray(E[] inputArray) {
        Double result = 0.0;
        // Sum array elements
        for (E element : inputArray) {
            result = ((Number) result).doubleValue()
                    + ((Number) element).doubleValue();
        }
        return ((E) result);
    }

    static long sum(Number [] numbers){
        long sumation =0;
        for (Number number:numbers){
            sumation =+ number.longValue();
        }
        return  sumation;
    }

    public static void main(String args[]) {
        // Create arrays of Integer, Double
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        String [] stringArray ={"pepe", "juan"};

        System.out.println("Sum of doubles : " + sumArray(intArray));
        System.out.println("Sum of doubles : " + sumArray(doubleArray));
        //System.out.println("Sum of doubles : " + sumArray(stringArray));

        List<Integer> miLista = new ArrayList<>();
        List<? super Number> miLista2 = new ArrayList<Number>();
        List<? extends Number> miLista3 = new ArrayList<Double>();
        Integer integer = new Integer(2);
        Double doubleExample = new Double(2.4);
        miLista.add(integer);
        miLista2.add(integer);
       // miLista2.add(double);
       // miLista3.add(doubleExample);




        // List<? super Number> miListaSuper = new ArrayList<Integer>();

        Integer[] myInts = {1,2,3,4,5};
        Long[] myLongs = {1L, 2L, 3L, 4L, 5L};
        Double[] myDoubles = {1.0, 2.0, 3.0, 4.0, 5.0};

        System.out.println(sum(myInts));
        System.out.println(sum(myLongs));
        System.out.println(sum(myDoubles));

    }




}
