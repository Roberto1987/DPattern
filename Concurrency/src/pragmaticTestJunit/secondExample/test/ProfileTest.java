package pragmaticTestJunit.secondExample.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pragmaticTestJunit.secondExample.src.*;
import pragmaticTestJunit.secondExample.src.models.Question;

/**
 * Created by rob on 5/11/17.
 */
public class ProfileTest {

    private Profile profile;
    private Question question;
    private Criteria criteria;
    private double startTime;

    @Before
    public void preTest(){
        profile = new Profile("Bull Hockey, Inc.");
        question = new BooleanQuestion(true, "Got bonuses?");
        criteria = new Criteria();
        startTime = System.currentTimeMillis();
    }


    @Test
    public void answerMissmatchTest() {

        Answer criteriaAnswer = new Answer(question, true);
        Answer badCriteriaAnswer = new Answer(question, true);

        profile.add(criteriaAnswer);
        profile.add(badCriteriaAnswer);

        Criterion criterion = new Criterion(criteriaAnswer,Weight.MustMatch);
        Criterion criterion1 = new Criterion(badCriteriaAnswer,Weight.MustMatch);
        criteria.add(criterion);
        assert(profile.matches(criteria));
    }
    @Test
    public void questionMissmatchTest(){
        Question question2 = new BooleanQuestion(true, "corrupted question");
        Answer criteriaAnswer = new Answer(question, true);
        Answer badCriteriaAnswer = new Answer(question2, true);

        profile.add(criteriaAnswer);
        profile.add(badCriteriaAnswer);

        Criterion criterion = new Criterion(criteriaAnswer,Weight.MustMatch);
        Criterion criterion2 = new Criterion(badCriteriaAnswer,Weight.MustMatch);
        criteria.add(criterion);
        criteria.add(criterion2);
        assert(profile.matches(criteria));
    }

    @After
    public void epilogue(){
        System.out.println("Test ended in "+(System.currentTimeMillis()-startTime)+" ms");
    }

}