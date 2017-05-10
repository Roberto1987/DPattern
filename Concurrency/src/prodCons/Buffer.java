package prodCons;

import prodCons.IBuffer;

/**
 * Created by roberto on 10/05/17.
 *
 * Buffer implementation, Locking the objects with synchronize which uses reentrant locks.
 */
public class Buffer implements IBuffer {

    private String buffer;
    private boolean isEmpty;

    /**
     * Initializing buffer with an empty buffer and the empty flag set true.
     */
    public Buffer(){
        this.buffer = null;
        isEmpty = true;
    }

    /**
     * Method for producing an item to deposit into the buffer
     * @param item
     */
    @Override
    synchronized public void put(String item) {
        while(!isEmpty){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.buffer = item;
        System.out.println("BUFFER: ITEM "+this.buffer+"stored");
        isEmpty = false;
        notifyAll();

    }

    /**
     * Method for consuming, retrieving the buffer data.
     * @return
     */
    @Override
    synchronized public String retrieve() {
        while(isEmpty){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isEmpty = true;
        System.out.println("BUFFER: ITEM "+this.buffer+" consumed");
        notifyAll();
        return buffer;
    }
}
