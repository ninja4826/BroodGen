package bgen.game;

import bgen.info.*;

public class CurrentGame {
	// int[] resources = new int[]{supply, minerals, gas, time};
	public static int[] resources = new int[4];
	public static Unit[] currentUnits;
	public static Struct[] currentStructs;
	public static Upgrade[] currentUpgrades = new Upgrade[]{};
	public static GameEngine game;

	public static void newGame(String race) {
		CurrentGame.game = new GameEngine(race);

		CurrentGame.resources[0] = CurrentGame.game.startRecs[1] - CurrentGame.game.startRecs[0];
		CurrentGame.currentUnits = CurrentGame.game.startUnits;
		CurrentGame.currentStructs = new Struct[]{CurrentGame.game.startBase};
	}


}
