package com.xjkwak.tenpinbowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreCalculatorTest {
  @Test
  public void shouldHasScore20WithAStrikeAndASpare() {
    Player player = new Player("Jeff");
    player.addFrame(10,0);
    player.addFrame(7,3);
    player.addFrame(9,0);
    player.addFrame(10,0);
    player.addFrame(0,8);
    player.addFrame(8,2);
    player.addFrame(0,6);
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(8,1);

    ScoreCalculator sut = new ScoreCalculator();
    sut.calculate(player);

    BowlingFrame bowlingFrame = player.getFrame(0);
    assertEquals(20, bowlingFrame.getScore());
  }

  @Test
  public void shouldHasCorrectScores() {
    Player player = new Player("Jeff");
    player.addFrame(10,0);
    player.addFrame(7,3);
    player.addFrame(9,0);
    player.addFrame(10,0);
    player.addFrame(0,8);
    player.addFrame(8,2);
    player.addFrame(0,6);
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(8,1);

    ScoreCalculator sut = new ScoreCalculator();
    sut.calculate(player);

    BowlingFrame bowlingFrame = player.getFrame(0);
    assertEquals(20, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(1);
    assertEquals(39, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(2);
    assertEquals(48, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(3);
    assertEquals(66, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(4);
    assertEquals(74, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(5);
    assertEquals(84, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(6);
    assertEquals(90, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(7);
    assertEquals(120, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(8);
    assertEquals(148, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(9);
    assertEquals(167, bowlingFrame.getScore());
  }

  @Test
  public void shouldHasCorrectScoresForAPerfectGame() {
    Player player = new Player("Carl");
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(10,0);
    player.addFrame(10,0);

    ScoreCalculator sut = new ScoreCalculator();
    sut.calculate(player);

    BowlingFrame bowlingFrame = player.getFrame(0);
    assertEquals(30, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(1);
    assertEquals(60, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(2);
    assertEquals(90, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(3);
    assertEquals(120, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(4);
    assertEquals(150, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(5);
    assertEquals(180, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(6);
    assertEquals(210, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(7);
    assertEquals(240, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(8);
    assertEquals(270, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(9);
    assertEquals(300, bowlingFrame.getScore());
  }

  @Test
  public void shouldHasCorrectScoresForAFailedGame() {
    Player player = new Player("Carl");
    player.addFrame(0,0);
    player.addFrame(0,0);
    player.addFrame(0,0);
    player.addFrame(0,0);
    player.addFrame(0,0);
    player.addFrame(0,0);
    player.addFrame(0,0);
    player.addFrame(0,0);
    player.addFrame(0,0);
    player.addFrame(0,0);
    player.addFrame(0,0);

    ScoreCalculator sut = new ScoreCalculator();
    sut.calculate(player);

    BowlingFrame bowlingFrame = player.getFrame(0);
    assertEquals(0, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(1);
    assertEquals(0, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(2);
    assertEquals(0, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(3);
    assertEquals(0, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(4);
    assertEquals(0, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(5);
    assertEquals(0, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(6);
    assertEquals(0, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(7);
    assertEquals(0, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(8);
    assertEquals(0, bowlingFrame.getScore());

    bowlingFrame = player.getFrame(9);
    assertEquals(0, bowlingFrame.getScore());
  }
}
