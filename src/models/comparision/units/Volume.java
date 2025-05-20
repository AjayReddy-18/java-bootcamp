package models.comparision.units;

import java.util.Objects;

public class Volume {
    public static final int LITER_FACTOR = 1;
    private final double liters;
    private static final double GALLON_FACTOR = 3.78;

    public Volume(double liters) {
        this.liters = liters;
    }

    private static void throwErrorIfInvalid(double units) {
        if (units > 0) return;
        throw new IllegalArgumentException("Illegal args");
    }

    private static Volume create(double units, double conversionFactor) {
        throwErrorIfInvalid(units);
        return new Volume(units * conversionFactor);
    }

    public static Volume createFromGallons(double gallons) {
        return create(gallons, GALLON_FACTOR);
    }

    public static Volume createFromLiters(double liters) {
        return create(liters, LITER_FACTOR);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(liters, volume.liters) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(liters);
    }
}
