package me.montecode.games.runningmonster;

import com.badlogic.gdx.Game;

import me.montecode.games.runningmonster.screens.StartGameScreen;

public class RunningMonsterGame extends Game {

	@Override
	public void create () {

        setScreen(new StartGameScreen(this));

	}

}
