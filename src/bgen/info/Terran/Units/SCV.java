package bgen.info.Terran.Units;

import bgen.info.*;
import bgen.info.Terran.Structs.*;

public class SCV extends Unit {

	public SCV() {
		SCV.produce = new CommandCenter();
		SCV.reqs = new Struct[]{new CommandCenter()};
		SCV.supply = 4;
		SCV.minerals = 50;
		SCV.gas = 0;
		SCV.time = 20;
	}
}
