package pragmaticTestJunit.fourthExample.src;

import pragmaticTestJunit.secondExample.src.models.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by rob on 5/12/17.
 */
public class QuestionController {

    private HashMap<AtomicInteger,Question> questions;

    public QuestionController(){
        this.questions = new HashMap<>();
    }

    /**
     * Search in the HashMap the right question relative to the inserted id.
     * @param id
     * @return
     */
    public Question find(int id){
        return questions.get(id);

    }


}
