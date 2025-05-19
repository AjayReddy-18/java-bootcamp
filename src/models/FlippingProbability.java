package models;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class FlippingProbability {

    private final String[] sampleSpace;
    private final int totalOutcomes;

    public FlippingProbability(String[] sampleSpace) {
        this.sampleSpace = sampleSpace;
        this.totalOutcomes = this.sampleSpace.length;
    }

    private long getFavourableOutcomes(Predicate f) {
        return Arrays.stream(this.sampleSpace).filter(f).count();
    }

    public double probabilityOf(String event) {
        long favourableOutcomes = getFavourableOutcomes(x -> x.equals(event));
        return (double) favourableOutcomes / totalOutcomes;
    }

    public double probabilityOfNot(String event) {
        long favourableOutcomes = getFavourableOutcomes(x -> !x.equals(event));
        return (double) favourableOutcomes / totalOutcomes;
    }
}
