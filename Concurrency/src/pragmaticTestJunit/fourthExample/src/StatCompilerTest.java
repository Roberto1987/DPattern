package pragmaticTestJunit.fourthExample.src;

import org.junit.Before;
import org.junit.Test;
import pragmaticTestJunit.secondExample.src.BooleanQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

/**
 * Created by rob on 5/15/17.
 */
public class StatCompilerTest {

    private StatCompiler statCompiler;
    private int numberOfBoolAnswers = 10;

    @Before
    public void pre(){
        statCompiler = new StatCompiler();
        createListOfBoolAnswers();
    }

    @Test
    public void  createNewHistogramTest(){
        assertNotNull("Histogram not empty.",statCompiler.createNewHistogram().get(Boolean.TRUE));
    }



    /**
     * Generation of a List of BooleanAnswers, with question as numbers
     * @return
     */
    private List<BooleanAnswer> createListOfBoolAnswers(){

        List<BooleanAnswer> answerList = new ArrayList<BooleanAnswer>();

        for(int i = 0; i<numberOfBoolAnswers;i++){
            BooleanQuestion q = new BooleanQuestion("True", "Question_"+i);
            answerList.add(new BooleanAnswer(q,"true"));
        }
        System.out.print(answerList.get(6).getQuestionText());
        return answerList;
    }
}
