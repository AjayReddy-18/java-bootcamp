package models.comparision.units;

import java.util.Objects;

public class Length {
    public static final int MILLIMETER_FACTOR = 1;
    public static final int CENTIMETER_FACTOR = 10;
    public static final double INCHES_FACTOR = 2.5 * CENTIMETER_FACTOR;
    public static final double FEET_FACTOR = 12 * INCHES_FACTOR;
    private final double millimeters;

    private Length(double millimeters) {
        this.millimeters = millimeters;
    }

    private static void throwErrorIfInvalid(double units) {
        if (units > 0) return;
        throw new IllegalArgumentException("Illegal args");
    }

    private static Length create(double units, double conversionFactor) {
        throwErrorIfInvalid(units);
        return new Length(units * conversionFactor);
    }

    public static Length createFromFeet(double feet) {
        return Length.create(feet, FEET_FACTOR);
    }

    public static Length createFromInches(double inches) {
        return Length.create(inches, INCHES_FACTOR);
    }

    public static Length createFromCentimeters(double centimeters) {
        return Length.create(centimeters, CENTIMETER_FACTOR);
    }

    public static Length createFromMillimeters(double millimeters) {
        return Length.create(millimeters, MILLIMETER_FACTOR);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        return Double.compare(millimeters, that.millimeters) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(millimeters);
    }
}
