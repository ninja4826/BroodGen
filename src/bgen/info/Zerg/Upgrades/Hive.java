package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Hive extends Upgrade {

	public Hive() {
		Hive.produce = new Hatchery();
		Hive.reqs = new Object[]{new Lair()};
		Hive.minerals = new int[]{200};
		Hive.gas = new int[]{150};
		Hive.time = new int[]{120};
		
	}
}
