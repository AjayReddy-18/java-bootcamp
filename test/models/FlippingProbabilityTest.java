package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlippingProbabilityTest {
    @Test
    void probabilityOfTails() {
        FlippingProbability flippingProbability = new FlippingProbability(new String[]{"HEAD", "TAIL"});
        double probabilityOfTails = flippingProbability.probabilityOf("TAIL");
        assertEquals(0.5, probabilityOfTails);
    }

    @Test
    void probabilityOfHeads() {
        FlippingProbability flippingProbability = new FlippingProbability(new String[]{"HEAD", "TAIL"});
        double probabilityOfHeads = flippingProbability.probabilityOf("HEAD");
        assertEquals(0.5, probabilityOfHeads);
    }

    @Test
    void probabilityOfNotTails() {
        FlippingProbability flippingProbability = new FlippingProbability(new String[]{"HEAD", "TAIL"});
        double probabilityOfNotTails = flippingProbability.probabilityOfNot("TAIL");
        assertEquals(0.5, probabilityOfNotTails);
    }
}
