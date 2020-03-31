package com.xjkwak.tenpinbowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScorePrinterTest {

  @Test
  public void shouldPrintWithTheFormat() {
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

    ScorePrinter sut = new ScorePrinter();
    String actual = sut.getOutput(player);
    String expected = "Jeff\n" +
      "Pinfalls\tX\t7\t/\t9\t0\tX\t0\t8\t8\t/\t0\t6\tX\tX\tX\t8\t1\n";

    assertEquals(expected, actual);
  }
}
