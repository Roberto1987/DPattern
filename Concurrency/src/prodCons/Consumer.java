package prodCons;

import javax.swing.plaf.synth.SynthEditorPaneUI;

/**
 * Created by roberto on 10/05/17.
 */
public class Consumer implements Runnable{

    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String tmp="";
        while(!tmp.equals("End")){
            tmp = this.buffer.retrieve();
           // System.out.println("CONSUMER: consuming  "+tmp);
        }
        System.out.println("CONSUMER: terminated");

    }
}
