package com.xjkwak.tenpinbowling;

import com.xjkwak.tenpinbowling.reader.IPlayersReader;
import com.xjkwak.tenpinbowling.reader.PlayersRepository;

import java.io.FileNotFoundException;
import java.util.List;

public class App {

  public static void main(String[] args) throws FileNotFoundException {
    String fileName = "./src/resources/sample_input_1.txt";

    if (args.length <= 0) {
      System.out.println("Please provide a file path. Eg: ./src/resources/sample_input_1.txt");
      System.exit(1);
    }
    else {
      fileName = args[0];
    }

    IPlayersReader playerInfoReader = PlayersRepository.getInstance().getReader(fileName);
    List<Player> players = playerInfoReader.getPlayers(fileName);

    ScoreCalculator scoreCalculator = new ScoreCalculator();
    scoreCalculator.calculate(players);

    ScorePrinter scorePrinter = new ScorePrinter();
    String result = scorePrinter.getOutput(players);

    System.out.println(result);
  }
}
