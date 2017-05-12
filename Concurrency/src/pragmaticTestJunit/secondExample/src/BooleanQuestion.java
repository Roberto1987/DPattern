package pragmaticTestJunit.secondExample.src;

import pragmaticTestJunit.secondExample.src.models.Question;

/**
 * Created by rob on 5/11/17.
 */
public class BooleanQuestion extends Question {

    private final String answer;

    public BooleanQuestion(String answer, String questionText) {
        super(questionText);
        this.answer = answer;
    }
}
