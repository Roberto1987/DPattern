package pragmaticTestJunit.secondExample.src;


import java.util.HashMap;
import java.util.Map;


public class Profile {
    private Map<String, Answer> answers = new HashMap<>();

    private int score;

    private String name;

    public Profile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Inserting answers in the profile, using the related question text
     * as the reference key for the answer. It use an HashMap.
     * @param answer
     */


    public void add(Answer answer) {
           answers.put(answer.getQuestionText(), answer);
    }

    public boolean matches(Criteria criteria) {
        score = 0;
        boolean kill = false;
        boolean anyMatches = false;
        for (Criterion criterion : criteria) {
            //Getting an answer object by the its Question questionText.
            Answer answer = answers.get(criterion.getAnswer().getQuestionText());
            boolean match = ((criterion.getWeight().getValue() == Weight.DontCare) || (answer.match(criterion.getAnswer())));
            if (!match && criterion.getWeight().getValue() == Weight.MustMatch) {
                kill = true;
            }
            if (match) {
                score += criterion.getWeight().getValue();
            }
            anyMatches |= match;
//            assert(score == Weight.MustMatch);
            System.out.println("Score: "+this.score);
        }
        if (kill)
            return false;
        return anyMatches;
    }
}