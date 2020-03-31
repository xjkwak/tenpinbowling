package com.xjkwak.tenpinbowling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

	@Test
	public void shouldHasScore20WithAStrikeAndASpare() {
		Player sut = new Player("Jeff");
		sut.addFrame(10,0);
		sut.addFrame(7,3);
		sut.addFrame(9,0);
		sut.addFrame(10,0);
		sut.addFrame(0,8);
		sut.addFrame(8,2);
		sut.addFrame(0,6);
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(8,1);
		sut.calculateScores();
		BowlingFrame bowlingFrame = sut.getFrame(0);
		assertEquals(20, bowlingFrame.getScore());
	}

	@Test
	public void shouldHasCorrectScores() {
		Player sut = new Player("Jeff");
		sut.addFrame(10,0);
		sut.addFrame(7,3);
		sut.addFrame(9,0);
		sut.addFrame(10,0);
		sut.addFrame(0,8);
		sut.addFrame(8,2);
		sut.addFrame(0,6);
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(8,1);
		sut.calculateScores();
		BowlingFrame bowlingFrame = sut.getFrame(0);
		assertEquals(20, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(1);
		assertEquals(39, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(2);
		assertEquals(48, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(3);
		assertEquals(66, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(4);
		assertEquals(74, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(5);
		assertEquals(84, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(6);
		assertEquals(90, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(7);
		assertEquals(120, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(8);
		assertEquals(148, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(9);
		assertEquals(167, bowlingFrame.getScore());
	}

	@Test
	public void shouldHasCorrectScoresForAPerfectGame() {
		Player sut = new Player("Carl");
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(10,0);
		sut.addFrame(10,0);

		sut.calculateScores();
		BowlingFrame bowlingFrame = sut.getFrame(0);
		assertEquals(30, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(1);
		assertEquals(60, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(2);
		assertEquals(90, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(3);
		assertEquals(120, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(4);
		assertEquals(150, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(5);
		assertEquals(180, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(6);
		assertEquals(210, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(7);
		assertEquals(240, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(8);
		assertEquals(270, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(9);
		assertEquals(300, bowlingFrame.getScore());
	}

	@Test
	public void shouldHasCorrectScoresForAFailedGame() {
		Player sut = new Player("Carl");
		sut.addFrame(0,0);
		sut.addFrame(0,0);
		sut.addFrame(0,0);
		sut.addFrame(0,0);
		sut.addFrame(0,0);
		sut.addFrame(0,0);
		sut.addFrame(0,0);
		sut.addFrame(0,0);
		sut.addFrame(0,0);
		sut.addFrame(0,0);
		sut.addFrame(0,0);

		sut.calculateScores();
		BowlingFrame bowlingFrame = sut.getFrame(0);
		assertEquals(0, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(1);
		assertEquals(0, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(2);
		assertEquals(0, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(3);
		assertEquals(0, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(4);
		assertEquals(0, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(5);
		assertEquals(0, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(6);
		assertEquals(0, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(7);
		assertEquals(0, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(8);
		assertEquals(0, bowlingFrame.getScore());

		bowlingFrame = sut.getFrame(9);
		assertEquals(0, bowlingFrame.getScore());
	}
}
