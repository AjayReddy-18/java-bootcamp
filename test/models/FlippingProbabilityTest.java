package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlippingProbabilityTest {
    @Test
    void probabilityOfTails() {
        FlippingProbability flippingProbability = new FlippingProbability(new String[]{"HEAD", "TAIL"});
        double probablityOfTails = flippingProbability.probablityOf("TAIL");
        assertEquals(0.5, probablityOfTails);
    }
}
