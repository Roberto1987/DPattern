package prodCons;

import org.junit.*;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * Created by roberto on 10/05/17.
 *
 * Testing the implementation of producer-consumer schemes with directly initialized Thread or with a ThreadPool.
 * Using newCachedThreadPool() the program ends after sixty seconds of inactivity of the Threads in the ThreadPool,
 * unless a shutdown call.
 *
 */
public class Test {


    public static void main(String[] args) {
        
        boolean useExec = true;
        Buffer buffer = new Buffer();
        Consumer consumer = new Consumer(buffer);
        Producer producer = new Producer(buffer);

        ExecutorService e = Executors.newCachedThreadPool();

        if(!useExec){
            System.out.println("MAIN: using direct thread initialization");
            Thread t1,t2;
            t1 = new Thread(consumer);
            t2 = new Thread(producer);

            t1.start();
            t2.start();
            return;
        }
        else{
            System.out.println("MAIN: using executors");
            e.execute(consumer);
            e.execute(producer);
        }

        e.shutdown();


    }
}
