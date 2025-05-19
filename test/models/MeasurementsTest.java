package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MeasurementsTest {
    @Test
    void ShouldRepresentOneFeet() {
        Measurements oneFeet = Measurements.createInFeet(1);
        assert(Measurements.createInFeet(1).equals(oneFeet));
    }

    @Test
    void oneFeetShouldEqualToTwelveInches() {
        Measurements oneFeet = Measurements.createInFeet(1);
        Measurements twelveInches = Measurements.createInInches(12);
        assertEquals(oneFeet, twelveInches);
    }

    @Test
    void twoFeetShouldEqualToTwentyFourInches() {
        Measurements twoFeet = Measurements.createInFeet(2);
        Measurements twentyFourInches = Measurements.createInInches(24);
        assertEquals(twoFeet, twentyFourInches);
    }

    @Test
    void twoInchesEqualsFiveCentimeters() {
        Measurements twoInches = Measurements.createInInches(2);
        Measurements fiveCentimeters = Measurements.createInCentimeters(5);
        assertEquals(twoInches, fiveCentimeters);
    }

    @Test
    void oneCentimeterShouldEqualToTenMilliMeters() {
        Measurements oneCentimeter = Measurements.createInCentimeters(1);
        Measurements tenMilliMeters = Measurements.createInMillimeters(10);
        assertEquals(oneCentimeter, tenMilliMeters);
    }

    @Test
    void throwErrorsForInvalidArgs() {
        assertThrows(IllegalArgumentException.class, () -> Measurements.createInFeet(-1));
        assertThrows(IllegalArgumentException.class, () -> Measurements.createInInches(-1));
        assertThrows(IllegalArgumentException.class, () -> Measurements.createInCentimeters(-1));
        assertThrows(IllegalArgumentException.class, () -> Measurements.createInMillimeters(-1));
    }
}
