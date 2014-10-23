package bgen.info.Zerg.Structs;

import bgen.info.*;

public class NydusCanal extends Struct {

	public NydusCanal() {
		NydusCanal.reqs = new Object[]{new Hatchery(), new Hive()};
		NydusCanal.minerals = 300;
		NydusCanal.gas = 0;
		NydusCanal.time = 80;
	}
}
