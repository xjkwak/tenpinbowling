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
}
