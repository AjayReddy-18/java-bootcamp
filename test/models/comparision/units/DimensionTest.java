package models.comparision.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DimensionTest {
    @Test
    void ShouldRepresentOneFeet() {
        Dimension oneFeet = Dimension.createLengthFromFeet(1);
        assert(Dimension.createLengthFromFeet(1).equals(oneFeet));
    }

    @Test
    void oneFeetShouldEqualToTwelveInches() {
        Dimension oneFeet = Dimension.createLengthFromFeet(1);
        Dimension twelveInches = Dimension.createLengthFromInches(12);
        assertEquals(oneFeet, twelveInches);
    }

    @Test
    void twoFeetShouldEqualToTwentyFourInches() {
        Dimension twoFeet = Dimension.createLengthFromFeet(2);
        Dimension twentyFourInches = Dimension.createLengthFromInches(24);
        assertEquals(twoFeet, twentyFourInches);
    }

    @Test
    void twoInchesEqualsFiveCentimeters() {
        Dimension twoInches = Dimension.createLengthFromInches(2);
        Dimension fiveCentimeters = Dimension.createLengthFromCentimeters(5);
        assertEquals(twoInches, fiveCentimeters);
    }

    @Test
    void oneCentimeterShouldEqualToTenMilliMeters() {
        Dimension oneCentimeter = Dimension.createLengthFromCentimeters(1);
        Dimension tenMilliMeters = Dimension.createLengthFromMillimeters(10);
        assertEquals(oneCentimeter, tenMilliMeters);
    }

    @Test
    void throwErrorsForInvalidArgs() {
        assertThrows(IllegalArgumentException.class, () -> Dimension.createLengthFromFeet(-1));
        assertThrows(IllegalArgumentException.class, () -> Dimension.createLengthFromInches(-1));
        assertThrows(IllegalArgumentException.class, () -> Dimension.createLengthFromCentimeters(-1));
        assertThrows(IllegalArgumentException.class, () -> Dimension.createLengthFromMillimeters(-1));
    }

    @Test
    void TwoInchesPlusTwoInchesIsFourInches() {
        Dimension twoInches = Dimension.createLengthFromInches(2);
        assertEquals(twoInches.add(twoInches), Dimension.createLengthFromInches(4));
    }
}
