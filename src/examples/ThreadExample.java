package examples;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by romina.tornello on 2/18/2015.
 * Create an productor and consumer that insert and remove element from a list provided that the list does not exceed the 15 elements.
 */
public class ThreadExample extends Thread {

    public static ArrayList listElement = new ArrayList();

    public final void run(){
        ThreadExample hilo = new ThreadExample();
        cargarElementos(listElement);
        sacarElementos(listElement);

    }


    public static void main(final String[] args){
            new ThreadExample().start();
    }

    public void cargarElementos(ArrayList listElement){
        while(true) {
            Random rnd = new Random();
            int element = rnd.nextInt();
            if (listElement.size()== 15) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (listElement.size()<15);
                listElement.add(element);
            System.out.println(listElement);

        }
    }


    public void sacarElementos(ArrayList listElement) {
        while (true) {
            if (listElement.size() == 1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                listElement.remove(0);
                System.out.println(listElement);

            }

        }

}
