package pragmaticTestJunit.secondExample.test;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;
import pragmaticTestJunit.secondExample.src.*;
import pragmaticTestJunit.secondExample.src.models.Question;

/**
 * Created by rob on 5/11/17.
 */
public class ProfileTest {

    @Test
    public void test() {
        Profile profile = new Profile("Bull Hockey, Inc.");
        Question question = new BooleanQuestion(true, "Got bonuses?");
        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(question, true);
        profile.add(criteriaAnswer);
        Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
        criteria.add(criterion);
        profile.matches(criteria);
    }

}