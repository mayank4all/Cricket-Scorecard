package InputParser;

import exceptions.UnformattedException;
import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DefaultParser implements Parser{

    @Override
    public Match getModel(String input1, String input2) {
        if (input1 == null || input1.length() == 0 || input2 == null || input2.length() == 0) {
            throw new UnformattedException(" Input can not be parse ");
        }
        String[] inputsParam = input1.split(",");
        if (inputsParam.length == 1) {
            throw new UnformattedException(" Input can not be parse ");
        }

        try {
            Match match = new Match();
            List<Team> teamList = new ArrayList<>();
            List<Player> playerList = new ArrayList<>();
            String[] input1Arr = input1.split(",");
            int noOfPlayers = Integer.parseInt(input1Arr[0]);
            for(int i=0;i<noOfPlayers;i++) {
                if(i==0) {
                    playerList.add(new Player(input1Arr[i+2], 0, true, 0, 0, 0));
                } else {
                    playerList.add(new Player(input1Arr[i+2], 0, false, 0, 0, 0));
                }
            }
            Team team = new Team("Team 1", playerList, 0);

            List<Player> player2List = new ArrayList<>();
            String[] input2Arr = input2.split(",");
            int noOfPlayersInOther = Integer.parseInt(input2Arr[0]);
            for(int i=0;i<noOfPlayersInOther;i++) {
                if(i==0) {
                    player2List.add(new Player(input2Arr[i+2], 0, true, 0, 0, 0));
                } else {
                    player2List.add(new Player(input2Arr[i + 2], 0, false, 0, 0, 0));
                }
            }
            Team team2 = new Team("Team 2", player2List, 0);
            teamList.add(team);
            teamList.add(team2);

            match.setTeamList(teamList);

            Scanner sc = new Scanner(System.in);

            List<Overs> overs1List = new ArrayList<>();
            for(int i=0;i<Integer.parseInt(input1Arr[1]);i++) {
                List<Balls> ballsList = new ArrayList<>();
                System.out.println("Enter the number of balls");
                int noOfBalls = sc.nextInt();
                for(int k=0;k<noOfBalls;k++) {
                    ballsList.add(new Balls(sc.next()));
                }
                overs1List.add(new Overs(i+1, ballsList));
            }

            List<Overs> overs2List = new ArrayList<>();
            for(int i=0;i<Integer.parseInt(input1Arr[1]);i++) {
                List<Balls> balls2List = new ArrayList<>();
                System.out.println("Enter the number of balls");
                int noOfBalls = sc.nextInt();
                for(int k=0;k<noOfBalls;k++) {
                    balls2List.add(new Balls(sc.next()));
                }
                overs2List.add(new Overs(i+1, balls2List));
            }
            match.setOvers1List(overs1List);
            match.setOvers2List(overs2List);
            return match;
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new UnformattedException(" Input can not be parse input1: " + input1 + ", input2: {} " + input2);
        } catch (Exception arrayIndexOutOfBoundsException) {
            throw new UnformattedException(" Input can not be parse input1: " + input1 + ", input2: {} " + input2);
        }

    }
}
