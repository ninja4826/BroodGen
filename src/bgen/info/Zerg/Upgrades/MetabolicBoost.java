package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class MetabolicBoost extends Upgrade {

	public MetabolicBoost() {
		MetabolicBoost.produce = new SpawningPool();
		MetabolicBoost.reqs = new Object[]{new SpawningPool()};
		MetabolicBoost.minerals = new int[]{100};
		MetabolicBoost.gas = new int[]{100};
		MetabolicBoost.time = new int[]{100};
	}
}
