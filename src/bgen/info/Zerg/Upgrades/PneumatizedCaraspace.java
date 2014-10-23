package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class PneumatizedCaraspace extends Upgrade {

	public PneumatizedCaraspace() {
		PneumatizedCaraspace.produce = new Hatchery();
		PneumatizedCaraspace.reqs = new Object[]{new Lair()};
		PneumatizedCaraspace.minerals = new int[]{150};
		PneumatizedCaraspace.gas = new int[]{150};
		PneumatizedCaraspace.time = new int[]{133};
	}
}
