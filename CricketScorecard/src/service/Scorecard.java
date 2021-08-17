package service;

import Printer.DefaultPrinter;
import models.*;

import java.util.List;

public class Scorecard {

    int i=0;
    Player player1;
    Player player2;
    public void calculateScores(Match match) {


        DefaultPrinter printer = new DefaultPrinter();

        List<Team> teamList = match.getTeamList();

        player1 = teamList.get(0).getPlayers().get(i++);
        player2 = teamList.get(0).getPlayers().get(i++);

        for(Overs over : match.getOvers1List()) {
            calculate(teamList.get(0).getPlayers(), over.getBallsList(), teamList.get(0));
            printer.print(teamList.get(0));
        }

        i=0;
        player1 = teamList.get(1).getPlayers().get(i++);
        player2 = teamList.get(1).getPlayers().get(i++);
        for(Overs over : match.getOvers2List()) {
            calculate(teamList.get(1).getPlayers(), over.getBallsList(), teamList.get(1));
            printer.print(teamList.get(1));
        }
    }


    public void calculate(List<Player> players, List<Balls> balls, Team team) {

        for(Balls ball : balls) {
            if(player1.isOnStrike()) {
                player1.setBallsFaced(player1.getBallsFaced()+1);
                if(ball.getRuns().equals("4")) {
                    player1.setFours(player1.getFours()+1);
                }
                if(ball.getRuns().equals("6")) {
                    player1.setSixes(player1.getSixes()+1);
                }
                if(ball.getRuns().equals("W") && i+1<players.size()) {
                    player1 = players.get(i++);
                    player1.setOnStrike(true);
                }
                if(!ball.getRuns().equals("Wd") && !ball.getRuns().equals("W")) {
                    player1.setRunsScored(player1.getRunsScored() + Integer.parseInt(ball.getRuns()));
                    team.setTotal(team.getTotal() + Integer.parseInt(ball.getRuns()));
                }
                else if (ball.getRuns().equals("Wd")) {
                    team.setTotal(team.getTotal() + 1);
                    player1.setBallsFaced(player1.getBallsFaced()-1);
                }
            }

            if(player2.isOnStrike()) {
                player2.setBallsFaced(player2.getBallsFaced()+1);
                if(ball.getRuns().equals("W") && i+1<players.size()) {
                    player2 = players.get(i++);
                    player2.setOnStrike(true);
                }
                if(ball.getRuns().equals("4")) {
                    player2.setFours(player2.getFours()+1);
                }
                if(ball.getRuns().equals("6")) {
                    player2.setSixes(player2.getSixes()+1);
                }
                if(!ball.getRuns().equals("Wd") && !ball.getRuns().equals("W")) {
                    player2.setRunsScored(player2.getRunsScored() + Integer.parseInt(ball.getRuns()));
                    team.setTotal(team.getTotal() + Integer.parseInt(ball.getRuns()));
                }
                else if (ball.getRuns().equals("Wd")) {
                    team.setTotal(team.getTotal() + 1);
                    player2.setBallsFaced(player2.getBallsFaced()-1);
                }
            }
            if(ball.getRuns().equals("1") || ball.getRuns().equals("3")) {
                player1.setOnStrike(!player1.isOnStrike());
                player2.setOnStrike(!player2.isOnStrike());
            }
        }
        System.out.println(team.getTotal());
        player1.setOnStrike(!player1.isOnStrike());
        player2.setOnStrike(!player2.isOnStrike());
    }

}
