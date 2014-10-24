package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class GroovedSpines extends Upgrade {

	public GroovedSpines() {
		GroovedSpines.produce = new HydraliskDen();
		GroovedSpines.reqs = new Object[]{};
		GroovedSpines.minerals = new int[]{150};
		GroovedSpines.gas = new int[]{150};
		GroovedSpines.time = new int[]{100};
	}
}
