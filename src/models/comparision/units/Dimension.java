package models.comparision.units;

import java.util.Objects;

public class Dimension {
    private final double totalUnits;
    private final Unit unit;
    private final int dimension;

    public Dimension(double totalUnits, Unit unit, int dimension) {
        this.totalUnits = totalUnits;
        this.unit = unit;
        this.dimension = dimension;
    }

    private static void throwErrorIfInvalid(double units) {
        if (units > 0) return;
        throw new IllegalArgumentException("Illegal args");
    }

    private static Dimension create(double unitValue, Unit unit, int dimension) {
        throwErrorIfInvalid(unitValue);
        return new Dimension(unitValue, unit, dimension);
    }

    public static Dimension createLengthFromFeet(double feet) {
        return create(feet, Unit.FEET, 1);
    }

    public static Dimension createLengthFromInches(double inches) {
        return create(inches, Unit.INCH, 1);
    }

    public static Dimension createLengthFromCentimeters(double centimeters) {
        return create(centimeters, Unit.CENTIMETER, 1);
    }

    public static Dimension createLengthFromMillimeters(double millimeters) {
        return create(millimeters, Unit.MILLIMETER, 1);
    }

    public static Dimension createVolumeFromGallons(double gallons) {
        return create(gallons, Unit.GALLON, 3);
    }

    public static Dimension createVolumeFromLiters(double liters) {
        return create(liters, Unit.LITER, 3);
    }

    public Dimension add(Dimension that) {
        if (dimension != that.dimension) throw new IllegalArgumentException("Can't add different Dimensions");
        Unit standardOutput = dimension == 1 ? Unit.INCH : Unit.LITER;

        double totalUnits = (toBase() + that.toBase()) / standardOutput.conversionFactor;
        return create(totalUnits, standardOutput, dimension);
    }

    private double toBase() {
        return totalUnits * unit.conversionFactor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dimension dimension1 = (Dimension) o;
        return Double.compare(toBase(), dimension1.toBase()) == 0 && dimension == dimension1.dimension;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalUnits, unit, dimension);
    }
}
