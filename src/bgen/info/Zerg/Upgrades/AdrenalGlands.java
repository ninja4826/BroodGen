package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class AdrenalGlands extends Upgrade {

	public AdrenalGlands() {
		AdrenalGlands.produce = new SpawningPool();
		AdrenalGlands.reqs = new Object[]{new Hive()};
		AdrenalGlands.minerals = new int[]{200};
		AdrenalGlands.gas = new int[]{200};
		AdrenalGlands.time = new int[]{80};
	}
}
