package com.xjkwak.tenpinbowling;

import java.util.List;

public class ScorePrinter {

  public static final String PINFALLS = "Pinfalls";
  public static final String FRAME = "FRAME";

  public String getOutput(Player player) {

    String result = "";
    result += player.getName() + "\n";
    result += PINFALLS + "\t";

    for (int i = 0; i < player.getTotalFrames(); i++) {
      BowlingFrame frame = player.getFrame(i);
      if (frame.isStrike()) {
        result += "X\t";
      } else if (frame.isSpare()) {
        result += frame.getRoll1() + "\t/\t";
      } else {
        result += frame.getRoll1() + "\t" + frame.getRoll2() + "\t";
      }
    }

    result = result.trim();
    result += "\n";

    return result.toString();
  }

  public String getOutput(List<Player> players) {
    String result = "";

    result += this.getHeader();

    for (Player player: players) {
      result += getOutput(player);
    }

    return result;
  }

  private String getHeader() {
    String result = FRAME + "\t\t";

    for (int i = 1; i <= 10; i++) {
      result += i + "\t\t";
    }

    result = result.trim();
    result += "\n";
    return result;
  }
}
