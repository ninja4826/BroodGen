package bgen.info.Zerg.Units;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Hydralisk extends Unit {

	public Hydralisk() {
		Hydralisk.produce = new Larva();
		Hydralisk.reqs = new Struct[]{new HydraliskDen()};
		Hydralisk.supply = 1;
		Hydralisk.minerals = 75;
		Hydralisk.gas = 25;
		Hydralisk.time = 28;
	}
}
