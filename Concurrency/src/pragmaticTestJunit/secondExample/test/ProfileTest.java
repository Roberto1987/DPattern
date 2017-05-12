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

    private String trueValue = "true";
    private String falseValue = "false";

    @Before
    public void preTest(){
        profile = new Profile("Bull Hockey, Inc.");
        question = new BooleanQuestion("Got bonuses?",trueValue);
        criteria = new Criteria();
        startTime = System.currentTimeMillis();
    }


    @Test
    public void answerMissmatchTest() {

        Answer criteriaAnswer = new Answer(question, trueValue);
        Answer badCriteriaAnswer = new Answer(question, trueValue);

        profile.add(criteriaAnswer);
        profile.add(badCriteriaAnswer);

        Criterion criterion = new Criterion(criteriaAnswer,Weight.MustMatch);
        Criterion criterion1 = new Criterion(badCriteriaAnswer,Weight.MustMatch);
        criteria.add(criterion);
        assert(profile.matches(criteria));
    }
    @Test
    public void questionMissmatchTest(){
        Question question2 = new BooleanQuestion("corrupted question",trueValue);
        Answer criteriaAnswer = new Answer(question, trueValue);
        Answer badCriteriaAnswer = new Answer(question2, trueValue);

        profile.add(criteriaAnswer);
        profile.add(badCriteriaAnswer);

        Criterion criterion = new Criterion(criteriaAnswer,Weight.MustMatch);
        Criterion criterion2 = new Criterion(badCriteriaAnswer,Weight.MustMatch);
        criteria.add(criterion);
        criteria.add(criterion2);
        assert(profile.matches(criteria));
    }

    @Test
    public void addMethodTest(){
        Profile profile = new Profile("Bull Hockey, Inc.");
        Question question = new BooleanQuestion("Got bonuses?",trueValue);
        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(question, trueValue);
        profile.add(criteriaAnswer);
    }

    @After
    public void epilogue(){
        System.out.println("Test ended in "+(System.currentTimeMillis()-startTime)+" ms");
    }


}