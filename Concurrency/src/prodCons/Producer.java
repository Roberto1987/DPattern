package prodCons;

import org.junit.*;
import org.junit.Test;

/**
 * Created by roberto on 10/05/17.
 */
public class Producer implements Runnable {

    private Buffer buffer;
    private String[] msgs = {"msg1","msg2","msg3", "End"};
    private short index;
    /**
     * Binding the buffer to the producer
     * @param buffer
     */

     public Producer(Buffer buffer){

             this.buffer = buffer;
             this.index = 0;

    }


    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(index<msgs.length){
           // System.out.println("PRODUCER: producing the "+(index+1)+" message");
            buffer.put(msgs[index]);
            index++;
        }
        System.out.println("PRODUCER: terminated");

    }
}
