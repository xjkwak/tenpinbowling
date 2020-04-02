package com.xjkwak.tenpinbowling.reader;

import com.xjkwak.tenpinbowling.Player;

import java.util.List;

public interface IPlayersReader {
	public List<Player> getPlayers(String filePath);
}
