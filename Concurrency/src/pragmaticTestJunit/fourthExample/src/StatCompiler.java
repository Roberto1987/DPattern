package pragmaticTestJunit.fourthExample.src;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by rob on 5/12/17.
 */
public class StatCompiler {
    private QuestionController controller = new QuestionController();

   public Map<String, Map<Boolean, AtomicInteger>> responsesByQuestion(List<BooleanAnswer> answers)
    {
        Map<Integer, Map<Boolean, AtomicInteger>> responses = new HashMap<>();
        answers.stream().forEach(answer -> incrementHistogram(responses, answer));
        return convertHistogramIdsToText(responses);
    }

    /**
     * Return a new Histogram, a Map of boolean with AtomicIntegers as keys.
     * @return
     */
    public Map<Boolean, AtomicInteger> createNewHistogram() {
        Map<Boolean, AtomicInteger> histogram;
        histogram = new HashMap<>();
        histogram.put(Boolean.FALSE, new AtomicInteger(0));
        histogram.put(Boolean.TRUE, new AtomicInteger(0));
        return histogram;
    }

    /**
     * Converts the Histogram ids from Integer to String type.
     * @param responses
     * @return
     */
  private Map<String, Map<Boolean, AtomicInteger>> convertHistogramIdsToText(  Map<Integer, Map<Boolean,AtomicInteger> > responses)
    {
        Map<String, Map<Boolean, AtomicInteger>> textResponses = new HashMap<>();
        responses.keySet().stream().forEach(id ->textResponses.put(controller.find(id).getQuestionText(), responses.get(id)));
        return textResponses;
    }

    /**
     * Add a new element to the Histogram
     * @param responses
     * @param answer
     */
   private void incrementHistogram( Map<Integer, Map<Boolean, AtomicInteger>> responses,BooleanAnswer answer) {
        Map<Boolean, AtomicInteger> histogram = getHistogram(responses, answer.getQuestionId());
        histogram.get(Boolean.valueOf(answer.getAnswer())).getAndIncrement();
    }

    /**
     *
     * @param responses
     * @param id
     * @return
     */
    private Map<Boolean, AtomicInteger> getHistogram( Map<Integer, Map<Boolean, AtomicInteger>> responses, int id) {
        Map<Boolean, AtomicInteger> histogram = null;
        if (responses.containsKey(id))
            histogram = responses.get(id);
        else {
            histogram = createNewHistogram();
            responses.put(id, histogram);
        }
        return histogram;
    }





}