package com.dmr.bb.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dmr.bb.BBGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="Bunny-BirdZ Billiards";
		config.width=1280;
		config.height=720;
		new LwjglApplication(new BBGame(), config);
	}
}
