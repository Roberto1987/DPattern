package pragmaticTestJunit.secondExample.src.models;

import pragmaticTestJunit.secondExample.src.Answer;
import pragmaticTestJunit.secondExample.src.Weight;

/**
 * Created by rob on 5/11/17.
 */
public interface ICriterion {
    Weight getWeight();
    Answer getAnswer();
}
