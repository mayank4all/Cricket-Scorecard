package models;

import java.util.List;

public class Match {

    List<Team> teamList;
    List<Overs> overs1List;
    List<Overs> overs2List;

    public Match(List<Team> teamList, List<Overs> oversList, List<Overs> overs2List) {
        this.teamList = teamList;
        this.overs1List = oversList;
        this.overs2List = overs2List;
    }

    public Match() {
    }

    @Override
    public String toString() {
        return "Match{" +
                "teamList=" + teamList +
                ", overs1List=" + overs1List +
                ", overs2List=" + overs2List +
                '}';
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    public List<Overs> getOvers1List() {
        return overs1List;
    }

    public void setOvers1List(List<Overs> oversList) {
        this.overs1List = oversList;
    }

    public List<Overs> getOvers2List() {
        return overs2List;
    }

    public void setOvers2List(List<Overs> oversList) {
        this.overs2List = oversList;
    }
}
