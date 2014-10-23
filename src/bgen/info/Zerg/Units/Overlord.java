package bgen.info.Zerg.Units;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Overlord extends Unit {

	public Overlord() {
		Overlord.produce = new Larva();
		Overlord.reqs = new Struct[]{new Hatchery()};
		Overlord.supply = 0;
		Overlord.minerals = 100;
		Overlord.gas = 0;
		Overlord.time = 40;
	}
}
