package models;

import java.util.List;

public class Overs {
    int overId;
    List<Balls> ballsList;

    public Overs(int overId, List<Balls> ballsList) {
        this.overId = overId;
        this.ballsList = ballsList;
    }

    @Override
    public String toString() {
        return "Overs{" +
                "overId=" + overId +
                ", ballsList=" + ballsList +
                '}';
    }

    public Overs() {
    }

    public int getOverId() {
        return overId;
    }

    public void setOverId(int overId) {
        this.overId = overId;
    }

    public List<Balls> getBallsList() {
        return ballsList;
    }

    public void setBallsList(List<Balls> ballsList) {
        this.ballsList = ballsList;
    }
}
