import InputParser.DefaultParser;
import InputParser.Parser;
import models.Balls;
import models.Match;
import models.Player;
import models.Team;
import service.Scorecard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String input1 = "5,2,P1,P2,P3,P4,P5";
        String input2 = "5,2,P11,P12,P13,P14,P15";
        DefaultParser defaultParser = new DefaultParser();
        Match match = defaultParser.getModel(input1, input2);
        Scorecard scorecard = new Scorecard();
        scorecard.calculateScores(match);




    }

}
