package pragmaticTestJunit.secondExample.src.models;

/**
 * Created by rob on 5/11/17.
 */
public abstract class Question{

    public static int index = 0;

    private final int questionId = 0;

    private final String questionText;


    /**
     * For each question, assign an unique and immutable ID
     * @param questionText
     */
    public Question(String questionText){
        this.questionText = questionText;
        index++;
    }

    public String getQuestionText() {
        return questionText;
    }

    public int getQuestionId() {
        return questionId;
    }
}
