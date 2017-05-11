package pragmaticTestJunit.secondExample.src;

import pragmaticTestJunit.secondExample.src.models.Question;

/**
 * Created by rob on 5/11/17.
 */
public class BooleanQuestion extends Question {

    private final Boolean answer;

    public BooleanQuestion(Boolean answer, String questionText) {
        super(questionText);
        this.answer = answer;
    }
}
