package pragmaticTestJunit.secondExample.src.models;

import pragmaticTestJunit.secondExample.src.Answer;

/**
 * Created by rob on 5/11/17.
 */
public interface IAnswer {

    String getQuestionText();

    boolean match(Answer answer);
}
