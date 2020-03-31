package com.xjkwak.tenpinbowling;

public class BowlingFrame {
  private int num;
  private int roll1;
  private int roll2;
  private int score;
  private static final int MAX_PINES = 10;

  public BowlingFrame(int num, int roll1, int roll2) {
    this.num = num;
    this.roll1 = roll1;
    this.roll2 = roll2;
  }

  public boolean isStrike() {
    return this.roll1 == MAX_PINES;
  }

  public boolean isSpare() {
    int total = this.roll1 + this.roll2;
    return total == MAX_PINES;
  }

  public int getScore() {
    return score;
  }

  public int getTotalPines() {
    return this.roll1 + this.roll2;
  }

  public int getRoll1() {
    return this.roll1;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public int getRoll2() {
    return this.roll2;
  }

  public int getNum() {
    return this.num;
  }
}
