package models.comparision.units;

import java.util.Objects;

public class Dimension {
    private static final int MILLIMETER_FACTOR = 1;
    private static final int CENTIMETER_FACTOR = 10;
    private static final double INCHES_FACTOR = 2.5 * CENTIMETER_FACTOR;
    private static final double FEET_FACTOR = 12 * INCHES_FACTOR;
    private final double units;
    private final int dimension;

    public Dimension(double units, int dimension) {
        this.units = units;
        this.dimension = dimension;
    }

    private static void throwErrorIfInvalid(double units) {
        if (units > 0) return;
        throw new IllegalArgumentException("Illegal args");
    }

    private static Dimension create(double units, double conversionFactor, int dimension) {
        throwErrorIfInvalid(units);
        return new Dimension(units * conversionFactor, dimension);
    }

    public static Dimension createLengthFromFeet(double feet) {
        return Dimension.create(feet, FEET_FACTOR, 1);
    }

    public static Dimension createLengthFromInches(double inches) {
        return create(inches, INCHES_FACTOR, 1);
    }

    public static Dimension createLengthFromCentimeters(double centimeters) {
        return create(centimeters, CENTIMETER_FACTOR, 1);
    }

    public static Dimension createLengthFromMillimeters(double millimeters) {
        return create(millimeters, MILLIMETER_FACTOR, 1);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dimension dimension1 = (Dimension) o;
        return Double.compare(units, dimension1.units) == 0 && dimension == dimension1.dimension;
    }

    @Override
    public int hashCode() {
        return Objects.hash(units, dimension);
    }

    public Dimension add(Dimension that) {
        double totalUnits = units + that.units;
        return Dimension.create(totalUnits, 1, dimension);
    }
}
