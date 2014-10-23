package bgen.info.Zerg.Structs;

import bgen.info.*;

public class DefilerMound extends Struct {

	public DefilerMound() {
		DefilerMound.reqs = new Object[]{new Hatchery(), new Hive()};
		DefilerMound.minerals = 100;
		DefilerMound.gas = 100;
		DefilerMound.time = 60;
	}
}
