package pragmaticTestJunit.secondExample.src.models;

/**
 * Created by rob on 5/11/17.
 */
public abstract class Question{

    private final String questionText;

    public Question(String questionText){
        this.questionText = questionText;
    }

    public String getQuestionText() {
        return questionText;
    }

}
