package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class MissileAttacks extends Upgrade {

	public MissileAttacks() {
		MissileAttacks.produce = new EvolutionChamber();
		MissileAttacks.reqs = new Object[]{new EvolutionChamber()};
		MissileAttacks.minerals = new int[]{100, 50};
		MissileAttacks.gas = new int[]{100, 50};
		MissileAttacks.time = new int[]{266, 32};
		MissileAttacks.levelReqs = new Object[]{new EvolutionChamber(), new Lair(), new Hive()};
		MissileAttacks.levels = 3;
	}
}
