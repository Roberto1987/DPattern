package pragmaticTestJunit.secondExample.src;

/**
 * Created by rob on 5/11/17.
 */
public class Weight {


    public static int DontCare = 2;
    public static int MustMatch= 10;

    private int value;

    public Weight(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
