package Printer;

import models.Player;
import models.Team;

public class DefaultPrinter implements Printer{


    @Override
    public void print(Team team) {
        for(Player player : team.getPlayers()) {
            System.out.println(player.toString());
        }
    }
}
