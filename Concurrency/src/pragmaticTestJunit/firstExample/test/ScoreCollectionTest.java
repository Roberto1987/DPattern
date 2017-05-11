package pragmaticTestJunit.firstExample.test;

import org.junit.Test;
import pragmaticTestJunit.firstExample.src.ScoreCollection;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by roberto on 11/05/17.
 */
public class ScoreCollectionTest {
    @Test
    public void answersArithmeticMeanOfTwoNumbers() {
// Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add( () -> 5 );
        collection.add( () -> 7 );
        collection.add( () -> 6 );

        int actualResult = collection.arithmeticMean();

        assertThat(actualResult, equalTo(6));


    }
}