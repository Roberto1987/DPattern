package pragmaticTestJunit.secondExample.test;

import org.junit.Test;
import pragmaticTestJunit.secondExample.src.Answer;
import pragmaticTestJunit.secondExample.src.BooleanQuestion;
import pragmaticTestJunit.secondExample.src.Criteria;
import pragmaticTestJunit.secondExample.src.Profile;
import pragmaticTestJunit.secondExample.src.models.Question;

import static org.junit.Assert.*;

/**
 * Created by rob on 5/11/17.
 */
public class AddMethodTest {
    @Test
    public void test(){
        Profile profile = new Profile("Bull Hockey, Inc.");
        Question question = new BooleanQuestion(true, "Got bonuses?");
        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(question, true);
        profile.add(criteriaAnswer);

    }

}