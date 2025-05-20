package models;

import java.util.Objects;

public class Measurements {
    private final double millimeters;

    private Measurements(double millimeters) {
        this.millimeters = millimeters;
    }

    private static void throwErrorIfInvalid(double units) {
        if (units > 0) return;
        throw new IllegalArgumentException("Illegal args");
    }

    private static Measurements create(double units, double conversionFactor) {
        throwErrorIfInvalid(units);
        return new Measurements(units * conversionFactor);
    }

    public static Measurements createInFeet(double feet) {
        return Measurements.create(feet, 12 * 2.5 * 10);
    }

    public static Measurements createInInches(double inches) {
        return Measurements.create(inches, 2.5 * 10);
    }

    public static Measurements createInCentimeters(double centimeters) {
        return Measurements.create(centimeters, 10);
    }

    public static Measurements createInMillimeters(double millimeters) {
        return Measurements.create(millimeters, 1);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Measurements that = (Measurements) o;
        return Double.compare(millimeters, that.millimeters) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(millimeters);
    }
}
