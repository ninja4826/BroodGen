package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class MuscularAugments extends Upgrade {

	public MuscularAugments() {
		MuscularAugments.produce = new HydraliskDen();
		MuscularAugments.reqs = new Object[]{};
		MuscularAugments.minerals = new int[]{150};
		MuscularAugments.gas = new int[]{150};
		MuscularAugments.time = new int[]{100};
	}
}
