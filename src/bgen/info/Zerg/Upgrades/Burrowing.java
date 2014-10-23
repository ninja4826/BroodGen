package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Burrowing extends Upgrade {

	public Burrowing() {
		Burrowing.produce = new Hatchery();
		Burrowing.reqs = new Object[]{};
		Burrowing.minerals = new int[]{100};
		Burrowing.gas = new int[]{100};
		Burrowing.time = new int[]{80};
	}
}
