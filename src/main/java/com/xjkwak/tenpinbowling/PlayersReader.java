package com.xjkwak.tenpinbowling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class PlayersReader {

  public List<Player> getPlayers(String filePath) {

    List<Player> players;

    Map<String, Player> playerMap = new HashMap<>();

    Player previous = null;

    try (Scanner scanner = new Scanner(new FileReader(filePath))) {
      while (scanner.hasNext()) {
        previous = processLine(playerMap, previous, scanner);
      }


    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    players = new ArrayList<>(playerMap.values());

    return players;

  }

  private Player processLine(Map<String, Player> playerMap, Player previous, Scanner scanner) {
    String line;
    line = scanner.nextLine();
    String[] values = line.split("\t");

    String name = values[0].trim();
    String pines = values[1].trim();
    if (pines.equals("F")) {
      pines = "0";
    }

    if (playerMap.containsKey(name)) {
      Player player = playerMap.get(name);
      if (player.equals(previous)) {
        player.addRolltoLastFrame(Integer.parseInt(pines));
      }
      else {
        player.addFrame(Integer.parseInt(pines), 0);
        previous = player;
      }
    }
    else {
      previous = new Player(name, Integer.parseInt(pines));
      playerMap.put(name, previous);
    }
    return previous;
  }
}
