package models;

public class Balls {
    private String runs;

    public Balls(String runs) {
        this.runs = runs;
    }

    @Override
    public String toString() {
        return "Balls{" +
                "runs='" + runs + '\'' +
                '}';
    }

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }
}