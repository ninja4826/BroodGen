package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Antennae extends Upgrade {

	public Antennae() {
		Antennae.produce = new Hatchery();
		Antennae.reqs = new Object[]{new Lair()};
		Antennae.minerals = new int[]{150};
		Antennae.gas = new int[]{150};
		Antennae.time = new int[]{133};
	}
}
