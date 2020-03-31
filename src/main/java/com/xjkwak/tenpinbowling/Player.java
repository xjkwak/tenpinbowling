package com.xjkwak.tenpinbowling;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;

	private List<BowlingFrame> frames;

	public Player(String name) {
		this.name = name;
		this.frames = new ArrayList<>();
	}

	public Player(String name, int roll) {
	  this(name);
	  this.addFrame(roll, 0);
  }

	public void addFrame(int roll1, int roll2) {
		int numero = this.frames.size() + 1;
		BowlingFrame frame = new BowlingFrame(numero, roll1, roll2);
		this.frames.add(frame);
	}

	public BowlingFrame getFrame(int i) {
		return this.frames.get(i);
	}

  public int getTotalFrames() {
	  return this.frames.size();
  }

  public String getName() {
	  return this.name;
  }

  public void addRolltoLastFrame(int pines) {
	  if (this.getLastFrame().getRoll2() == 0) {
	    this.getLastFrame().setRoll2(pines);
    }
  }

  private BowlingFrame getLastFrame() {
	  int index = this.getTotalFrames() - 1;
	  BowlingFrame result = this.getFrame(index);
	  return result;
  }

  @Override
  public boolean equals(Object o) {
	  Player other = (Player)o;
    return this.getName().equals(((Player) o).getName());
  }
}
