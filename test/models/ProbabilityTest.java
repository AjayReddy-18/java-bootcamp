package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProbabilityTest {
    @Test
    void gettingTails() {
        Probability gettingTails = Probability.create(0.5);
        assert(Probability.create(0.5).equals(gettingTails));
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

    @Test
    void shouldThrowErrorWhenArguementsAreInvalid() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Probability.create(3));
        assertEquals("Illegal Probability", exception.getMessage());
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> Probability.create(-0.1));
        assertEquals("Illegal Probability", exception2.getMessage());
    }

    @Test
    void atleastOneTail() {
        Probability gettingTails = Probability.create(0.5);
        assert(Probability.create(0.75).equals(gettingTails.or(gettingTails)));
    }
}
