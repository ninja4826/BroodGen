package bgen.info.Zerg.Units;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;

public class Broodling extends Unit {

	public Broodling() {
		Broodling.produce = new Queen();
		Broodling.reqs = new Object[]{new Queen(), new SpawnBroodling()};
		Broodling.supply = 0;
		Broodling.minerals = 0;
		Broodling.gas = 0;
		Broodling.time = 0;
		
	}
}
