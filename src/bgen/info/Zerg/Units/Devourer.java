package bgen.info.Zerg.Units;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Devourer extends Unit {

	public Devourer() {
		Devourer.produce = new Mutalisk();
		Devourer.reqs = new Object[]{new Mutalisk(), new GreaterSpire()};
		Devourer.supply = 0;
		Devourer.minerals = 150;
		Devourer.gas = 50;
		Devourer.time = 40;
	}
}
