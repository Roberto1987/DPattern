package pragmaticTestJunit.secondExample.src;

import pragmaticTestJunit.secondExample.src.models.IAnswer;
import pragmaticTestJunit.secondExample.src.models.Question;

/**
 * Created by rob on 5/11/17.
 */
public class Answer implements IAnswer {

    private Question question;
    private String answer;

    public Answer(Question question, String answer){
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
        return answer.getAnswer() == this.getAnswer();
    }

    /**
     * Setting the answer text.
     * @return
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Return the question ID
     * @return
     */
    public int getQuestionId(){
        return this.question.getQuestionId()
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
