package bgen.info.Zerg.Units;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;

public class Defiler extends Unit {

	public Defiler() {
		Defiler.produce = new Larva();
		Defiler.reqs = new Struct[]{new Larva(), new DefilerMound()};
		Defiler.supply = 2;
		Defiler.minerals = 50;
		Defiler.gas = 150;
		Defiler.time = 50;
	}
}
