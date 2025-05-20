package models.comparision.units;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LengthTest {
    @Test
    void ShouldRepresentOneFeet() {
        Length oneFeet = Length.createFromFeet(1);
        assert(Length.createFromFeet(1).equals(oneFeet));
    }

    @Test
    void oneFeetShouldEqualToTwelveInches() {
        Length oneFeet = Length.createFromFeet(1);
        Length twelveInches = Length.createFromInches(12);
        assertEquals(oneFeet, twelveInches);
    }

    @Test
    void twoFeetShouldEqualToTwentyFourInches() {
        Length twoFeet = Length.createFromFeet(2);
        Length twentyFourInches = Length.createFromInches(24);
        assertEquals(twoFeet, twentyFourInches);
    }

    @Test
    void twoInchesEqualsFiveCentimeters() {
        Length twoInches = Length.createFromInches(2);
        Length fiveCentimeters = Length.createFromCentimeters(5);
        assertEquals(twoInches, fiveCentimeters);
    }

    @Test
    void oneCentimeterShouldEqualToTenMilliMeters() {
        Length oneCentimeter = Length.createFromCentimeters(1);
        Length tenMilliMeters = Length.createFromMillimeters(10);
        assertEquals(oneCentimeter, tenMilliMeters);
    }

    @Test
    void throwErrorsForInvalidArgs() {
        assertThrows(IllegalArgumentException.class, () -> Length.createFromFeet(-1));
        assertThrows(IllegalArgumentException.class, () -> Length.createFromInches(-1));
        assertThrows(IllegalArgumentException.class, () -> Length.createFromCentimeters(-1));
        assertThrows(IllegalArgumentException.class, () -> Length.createFromMillimeters(-1));
    }
}
