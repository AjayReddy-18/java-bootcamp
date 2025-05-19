package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProbabilityTest {
    @Test
    void gettingTails() {
        Probability gettingTails = Probability.create(0.5);
        assert(Probability.create(0.5).equals(gettingTails.complement()));
    }

    @Test
    void notGettingTails() {
        Probability gettingTails = Probability.create(0.5);
        assert(Probability.create(0.5).equals(gettingTails.complement()));
    }

    @Test
    void gettingTailsForTwoCoins() {
        Probability gettingTails = Probability.create(0.5);
        Probability probabilityOfTwoCoins = gettingTails.and(gettingTails);

        assert(Probability.create(0.25).equals(probabilityOfTwoCoins));
    }
}
