package pragmaticTestJunit.secondExample.src;

/**
 * Created by rob on 5/11/17.
 */
public class Weight {


    public static int DontCare = 2;
    public static int MustMatch= 10;

    private int weight;

    public Weight(int weight){
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
