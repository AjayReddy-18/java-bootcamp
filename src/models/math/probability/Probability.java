package models.math.probability;

import java.util.Objects;

public class Probability {
    private final double probability;

    private Probability(double probability) {
        this.probability = probability;
    }

    public static Probability create(double probability) throws IllegalArgumentException {
        if (probability < 0 || probability > 1) {
            throw new IllegalArgumentException("Illegal Probability");
        }

        return new Probability(probability);
    }

    public Probability complement() {
        return new Probability(1 - probability);
    }

    public Probability and(Probability that) {
        return new Probability(this.probability * that.probability);
    }

    public Probability or(Probability that) {
        double atleastOne = complement().and(that.complement()).complement().probability;
        return new Probability(atleastOne);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(probability, that.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }

}
