package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class MeleeAttacks extends Upgrade {

	public MeleeAttacks() {
		MeleeAttacks.produce = new EvolutionChamber();
		MeleeAttacks.reqs = new Object[]{};
		MeleeAttacks.minerals = new int[]{100, 50};
		MeleeAttacks.gas = new int[]{100, 50};
		MeleeAttacks.time = new int[]{266, 32};
		MeleeAttacks.levelReqs = new Object[]{new EvolutionChamber(), new Lair(), new Hive()};
		MeleeAttacks.levels = 3;
	}
}
