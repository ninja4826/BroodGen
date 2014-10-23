package bgen.info.Zerg.Units;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Larva extends Unit {

	public Larva() {
		Larva.produce = new Hatchery();
		Larva.reqs = new Struct[]{};
		Larva.supply = 0;
		Larva.minerals = 0;
		Larva.gas = 0;
		Larva.time = 0;
	}
}
