package models;

import java.util.Objects;

public class Measurements {
    private final double units;

    private Measurements(double units) {
        this.units = units;
    }

    private static void throwErrorIfInvalid(double units) {
        if (units > 0) return;
        throw new IllegalArgumentException("Illegal args");
    }

    public static Measurements createInFeet(double feet) {
        throwErrorIfInvalid(feet);

        return Measurements.createInInches(feet * 12);
    }

    public static Measurements createInInches(double inches) {
        throwErrorIfInvalid(inches);

        return Measurements.createInCentimeters(inches * 2.5);
    }

    public static Measurements createInCentimeters(double centimeters) {
        throwErrorIfInvalid(centimeters);

        return Measurements.createInMillimeters(centimeters * 10);
    }

    public static Measurements createInMillimeters(double millimeters) {
        throwErrorIfInvalid(millimeters);

        return new Measurements(millimeters);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Measurements that = (Measurements) o;
        return Double.compare(units, that.units) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(units);
    }
}
