package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class VentralSacs extends Upgrade {

	public VentralSacs() {
		VentralSacs.produce = new Hatchery();
		VentralSacs.reqs = new Object[]{new Lair()};
		VentralSacs.minerals = new int[]{200};
		VentralSacs.gas = new int[]{200};
		VentralSacs.time = new int[]{160};
	}
}
