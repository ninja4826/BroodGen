package bgen.info.Zerg.Units;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Scourge extends Unit {

	public Scourge() {
		Scourge.produce = new Larva();
		Scourge.reqs = new Struct[]{new Spire()};
		Scourge.supply = 1;
		Scourge.minerals = 25;
		Scourge.gas = 75;
		Scourge.time = 30;
		Scourge.two = true;
	}
}
