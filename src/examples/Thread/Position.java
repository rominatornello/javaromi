package examples.Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by romina.tornello on 3/4/2015.
 */
public class Position {

    private int val;
    private final Lock lock = new ReentrantLock();
    private final Condition empty  = lock.newCondition();

    public Position() {
        val = 0;
    }

   public void occupy(int id) throws InterruptedException {
       lock.lock();
       try{
       if(val!=0)
           empty.await();
        val=id;
       }finally {
           lock.unlock();
       }
   }

   public void liberate(){
       lock.lock();
       try {
           val = 0;
           empty.signal();
       }finally {
           lock.unlock();
       }
   }

    public int getVal() {
        return val;
    }

}
