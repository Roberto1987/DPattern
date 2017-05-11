package pragmaticTestJunit.secondExample.src;

import pragmaticTestJunit.secondExample.src.models.ICriterion;

/**
 * Created by rob on 5/11/17.
 */
public class Criterion implements ICriterion{

    private Weight weight;
    private Answer answer;

    public Criterion(Answer answer, int fWeight){
        this.weight = new Weight(fWeight);
        this.answer = answer;
    }


    @Override
    public Weight getWeight() {
        return this.weight;
    }

    @Override
    public Answer getAnswer() {
        return this.answer;
    }


    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
