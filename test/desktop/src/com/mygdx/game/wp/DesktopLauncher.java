package com.mygdx.game.wp;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
//import com.badlogic.drop.Drop;
import com.mygdx.game.wp.MyGdxGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("walking pixel");
		config.setWindowedMode(800, 480);
		config.useVsync(true);
		new Lwjgl3Application(new MyGdxGame(), config);
	}
}
