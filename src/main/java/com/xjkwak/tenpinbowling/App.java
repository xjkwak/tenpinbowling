package com.xjkwak.tenpinbowling;

import java.util.List;

public class App {

  public static void main(String[] args) {
    String fileName = "./src/resources/sample_input_1.txt";
    if (args.length <= 0) {
      System.out.println("Please provide a file path. Eg: ./src/resources/sample_input_1.txt");
      System.exit(1);
    }
    else {
      fileName = args[0];
    }
    PlayersReader playerInfoReader = new PlayersReader();
    List<Player> players = playerInfoReader.getPlayers(fileName);

    ScoreCalculator scoreCalculator = new ScoreCalculator();
    scoreCalculator.calculate(players);

    ScorePrinter scorePrinter = new ScorePrinter();
    String result = scorePrinter.getOutput(players);


    System.out.println(result);
  }
}
