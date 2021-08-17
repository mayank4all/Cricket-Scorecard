package models;


public class Player {
    String name;
    int runsScored;
    boolean onStrike;
    int fours;
    int sixes;
    int ballsFaced;


    public Player() {
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", runsScored=" + runsScored +
                ", fours=" + fours +
                ", sixes=" + sixes +
                ", ballsFaced=" + ballsFaced +
                '}';
    }

    public Player(String name, int runsScored, boolean onStrike, int fours, int sixes, int ballsFaced) {
        this.name = name;
        this.runsScored = runsScored;
        this.onStrike = onStrike;
        this.fours = fours;
        this.sixes = sixes;
        this.ballsFaced = ballsFaced;
    }

    public int getFours() {
        return fours;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public int getBallsFaced() {
        return ballsFaced;
    }

    public void setBallsFaced(int ballsFaced) {
        this.ballsFaced = ballsFaced;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public boolean isOnStrike() {
        return onStrike;
    }

    public void setOnStrike(boolean onStrike) {
        this.onStrike = onStrike;
    }
}
