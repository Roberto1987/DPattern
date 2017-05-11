package pragmaticTestJunit.firstExample.src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roberto on 11/05/17.
 */
public class ScoreCollection {

    public List<Scoreable> getScore() {
        return score;
    }

    private List<Scoreable> score = new ArrayList<>();

    public void add(Scoreable scoreable){
        this.score.add(scoreable);
    }

    public int arithmeticMean(){
        int sum = 0;
        for(Scoreable item:this.score){
            sum+=item.getScore();
        }

        return sum/this.score.size();
    }

}


