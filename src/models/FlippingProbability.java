package models;

import java.util.Arrays;

public class FlippingProbability {

    private final String[] sampleSpace;

    public FlippingProbability(String[] sampleSpace) {
        this.sampleSpace = sampleSpace;
    }

    public double probabilityOf(String event) {
        double totalOutcomes = this.sampleSpace.length;
        long favourableOutcomes = Arrays.stream(this.sampleSpace).filter(x -> x.equals(event)).count();
        return (double) favourableOutcomes / totalOutcomes;
    }

    public double probabilityOfNot(String event) {
        double totalOutcomes = this.sampleSpace.length;
        long favourableOutcomes = Arrays.stream(this.sampleSpace).filter(x -> !x.equals(event)).count();
        return (double) favourableOutcomes / totalOutcomes;
    }
}
