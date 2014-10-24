package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class LurkerAspect extends Upgrade {

	public LurkerAspect() {
		LurkerAspect.produce = new HydraliskDen();
		LurkerAspect.reqs = new Object[]{};
		LurkerAspect.minerals = new int[]{150};
		LurkerAspect.gas = new int[]{150};
		LurkerAspect.time = new int[]{100};
	}
}
