package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Lair extends Upgrade {

	public Lair() {
		Lair.produce = new Hatchery();
		Lair.reqs = new Object[]{new Hatchery()};
		Lair.minerals = new int[]{150};
		Lair.gas = new int[]{100};
		Lair.time = new int[]{100};
	}
}
