package pragmaticTestJunit.secondExample.src;


import org.junit.Test;

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
        assert(answers.isEmpty()); //Check if the original collection was empy
        answers.put(answer.getQuestionText(), answer);
        assert(!answers.isEmpty()); //Check if an object was inserted
    }

    public boolean matches(Criteria criteria) {
        score = 0;
        boolean kill = false;
        boolean anyMatches = false;
        for (Criterion criterion : criteria) {
            //Getting an answer object by the its Question questionText.
            Answer answer = answers.get(criterion.getAnswer().getQuestionText());
            boolean match = ((criterion.getWeight().getWeight() == Weight.DontCare) || (answer.match(criterion.getAnswer())));
            if (!match && criterion.getWeight().getWeight() == Weight.MustMatch) {
                kill = true;
            }
            if (match) {
                score += criterion.getWeight().getWeight();
            }
            anyMatches |= match;
        }
        if (kill)
            return false;
        return anyMatches;
    }
}