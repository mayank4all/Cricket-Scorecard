package models;

import java.util.List;

public class Team {
    String teamName;
    List<Player> players;
    int total;

    public Team(String teamName, List<Player> players, int total) {
        this.teamName = teamName;
        this.players = players;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", players=" + players +
                ", total=" + total +
                '}';
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
