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

	public void calculateScores() {
		BowlingFrame current, next, nextNext;
		int score = 0;

		for (int i = 0; i < this.frames.size()-1; i++) {
			current = this.frames.get(i);
			score += current.getTotalPines();
			if (current.isStrike()) {
				next = this.getFrame(i+1);
				score += next.getTotalPines();

				if (next.isStrike()) {
					if (i+2 < this.frames.size()) {
						nextNext = this.getFrame(i + 2);
						score += nextNext.getRoll1();
					}
				}
			}
			else if (current.isSpare()) {
				next = this.getFrame(i+1);
				score += next.getRoll1();
			}
			current.setScore(score);
		}
	}

	public BowlingFrame getFrame(int i) {
		return this.frames.get(i);
	}
}
