package bgen.info.Zerg.Structs;

import bgen.info.*;

public class UltraliskCavern extends Struct {

	public UltraliskCavern() {
		UltraliskCavern.reqs = new Object[]{new Hatchery(), new Hive()};
		UltraliskCavern.minerals = 150;
		UltraliskCavern.gas = 200;
		UltraliskCavern.time = 60;
	}
}
