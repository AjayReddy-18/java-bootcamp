package models.comparision.units;

public enum Unit {
    MILLIMETER(1),
    CENTIMETER(10),
    INCH(2.5 * CENTIMETER.conversionFactor),
    FEET(12 * INCH.conversionFactor),
    LITER(1),
    GALLON(3.78);

    public final double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
