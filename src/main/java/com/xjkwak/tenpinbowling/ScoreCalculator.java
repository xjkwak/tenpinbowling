package com.xjkwak.tenpinbowling;

import java.util.List;

public class ScoreCalculator {

  public void calculate(Player player) {
    BowlingFrame current, next, nextNext;
    int score = 0;

    for (int i = 0; i < player.getTotalFrames()-1; i++) {
      current = player.getFrame(i);
      score += current.getTotalPines();
      if (current.isStrike()) {
        next = player.getFrame(i+1);
        score += next.getTotalPines();

        if (next.isStrike()) {
          if (i+2 < player.getTotalFrames()) {
            nextNext = player.getFrame(i + 2);
            score += nextNext.getRoll1();
          }
        }
      }
      else if (current.isSpare()) {
        next = player.getFrame(i+1);
        score += next.getRoll1();
      }
      current.setScore(score);
    }
  }

  public void calculate(List<Player> players) {
    for (Player player: players) {
      this.calculate(player);
    }
  }
}
