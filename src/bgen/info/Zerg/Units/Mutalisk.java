package bgen.info.Zerg.Units;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Mutalisk extends Unit {

	public Mutalisk() {
		Mutalisk.produce = new Larva();
		Mutalisk.reqs = new Struct[]{new Spire()};
		Mutalisk.supply = 2;
		Mutalisk.minerals = 100;
		Mutalisk.gas = 100;
		Mutalisk.time = 40;
	}
}
