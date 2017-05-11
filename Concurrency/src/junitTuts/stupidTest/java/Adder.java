package junitTuts.stupidTest.java;

/**
 * Created by roberto on 11/05/17.
 */
public class Adder {

    private int firstAddend;
    private int secondAddend;

    public int getFirstAddend() {
        return firstAddend;
    }

    public void setFirstAddend(int firstAddend) {
        this.firstAddend = firstAddend;
    }

    public int getSecondAddend() {
        return secondAddend;
    }

    public void setSecondAddend(int secondAddend) {
        this.secondAddend = secondAddend;
    }

    public int add(){
        return firstAddend + secondAddend;
    }

}


