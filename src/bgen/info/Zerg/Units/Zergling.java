package bgen.info.Zerg.Units;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Zergling extends Unit {

	public Zergling() {
		Zergling.produce = new Larva();
		Zergling.reqs = new Struct[]{new SpawningPool()};
		Zergling.supply = 2;
		Zergling.minerals = 50;
		Zergling.gas = 0;
		Zergling.time = 28;
	}
}
