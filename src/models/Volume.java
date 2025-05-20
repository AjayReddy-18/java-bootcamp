package models;

import java.util.Objects;

public class Volume {
    private final double litres;

    public Volume(double litres) {
        this.litres = litres;
    }

    private static void throwErrorIfInvalid(double units) {
        if (units > 0) return;
        throw new IllegalArgumentException("Illegal args");
    }

    private static Volume create(double units, double conversionFactor) {
        throwErrorIfInvalid(units);
        return new Volume(units * conversionFactor);
    }

    public static Volume createInGallons(double gallons) {
        return Volume.create(gallons, 3.78);
    }

    public static Volume createInLitres(double litres) {
        return Volume.create(litres, 1);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(litres, volume.litres) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(litres);
    }
}
