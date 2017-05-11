package pragmaticTestJunit.secondExample.src;

import pragmaticTestJunit.secondExample.src.models.IAnswer;
import pragmaticTestJunit.secondExample.src.models.Question;

/**
 * Created by rob on 5/11/17.
 */
public class Answer implements IAnswer {

    private Question question;
    private boolean answer;

    public Answer(Question question, boolean answer){
        this.question = question;
        this.answer = answer;
    }

    @Override
    public String getQuestionText() {
        return this.question.getQuestionText();

    }

    /**
     * Checking if two answers matching: we define matching if
     * both question and answer String are the same.
     * @param answer
     * @return
     */
    @Override
    public boolean match(Answer answer) {
        return ((answer.getQuestionText().equals(this.getQuestionText())) &&
                (answer.getAnswer() == this.getAnswer()));
    }

    /**
     * Setting the answer text.
     * @return
     */
    public boolean getAnswer() {
        return answer;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
