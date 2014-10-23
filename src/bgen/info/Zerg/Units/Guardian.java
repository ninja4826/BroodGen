package bgen.info.Zerg.Units;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Guardian extends Unit {

	public Guardian() {
		Guardian.produce = new Mutalisk();
		Guardian.reqs = new Object[]{new Mutalisk(), new GreaterSpire()};
		Guardian.supply = 0;
		Guardian.minerals = 50;
		Guardian.gas = 100;
		Guardian.time = 40;
	}
}
