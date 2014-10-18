package me.montecode.games.runningmonster.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import me.montecode.games.runningmonster.RunningMonsterGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
      //  config.height = 260;
      //  config.width= 325;
		new LwjglApplication(new RunningMonsterGame(), config);
	}
}
