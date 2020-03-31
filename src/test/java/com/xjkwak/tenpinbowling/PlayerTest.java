package com.xjkwak.tenpinbowling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

  @Test
  public void shouldAddANewFrameToPlayer() {
    Player sut = new Player("Jeff");
    sut.addFrame(10,0);
    assertEquals(1, sut.getTotalFrames());
  }

  @Test
  public void shouldAddANewFrameToPlayerWithCorrectNum() {
    Player sut = new Player("Jeff");
    sut.addFrame(10,0);
    assertEquals(1, sut.getTotalFrames());
    assertEquals(1, sut.getFrame(0).getNum());
  }
}
