package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Caraspace extends Upgrade {

	public Caraspace() {
		Caraspace.produce = new EvolutionChamber();
		Caraspace.reqs = new Object[]{new EvolutionChamber()};
		Caraspace.minerals = new int[]{100, 75};
		Caraspace.gas = new int[]{100, 75};
		Caraspace.time = new int[]{266, 32};
		Caraspace.levelReqs = new Object[]{new EvolutionChamber(), new Lair(), new Hive()};
		Caraspace.levels = 3;
	}
}
