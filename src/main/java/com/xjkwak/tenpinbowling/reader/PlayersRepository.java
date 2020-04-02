package com.xjkwak.tenpinbowling.reader;

import java.io.FileNotFoundException;

public class PlayersRepository {
  private static PlayersRepository instance;

  private PlayersRepository() {
  }

  public static PlayersRepository getInstance() {
    if (instance == null) {
      instance = new PlayersRepository();
    }

    return instance;
  }

  public IPlayersReader getReader(String fileName) throws FileNotFoundException {
    IPlayersReader playersReader = new PlayersReader(fileName);
    return playersReader;
  }
}
