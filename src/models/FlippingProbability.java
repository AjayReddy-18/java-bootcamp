package models;

public class FlippingProbability {

    private final String[] events;

    public FlippingProbability(String[] events) {
        this.events = events;
    }

    public double probablityOf(String tail) {
        return 0.5;
    }
}
