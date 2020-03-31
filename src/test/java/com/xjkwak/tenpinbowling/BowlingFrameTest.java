package com.xjkwak.tenpinbowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingFrameTest {
  @Test
  public void shouldBeStrikeWith10PinfallsAtFirstRoll() {
    BowlingFrame sut = new BowlingFrame(1,10,0);
    assertTrue(sut.isStrike());
  }

  @Test
  public void shouldNotBeStrikeWith9PinfallsAtFirstRoll() {
    BowlingFrame sut = new BowlingFrame(1,9,0);
    assertFalse(sut.isStrike());
  }

  @Test
  public void shouldBeSpareWith10PinfallsAtFirstAndSecondRolls() {
    BowlingFrame sut = new BowlingFrame(1,9,1);
    assertTrue(sut.isSpare());
  }
}
