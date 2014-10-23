package bgen.info.Zerg.Structs;

import bgen.info.*;

public class Spire extends Struct {

	public Spire() {
		Spire.reqs = new Object[]{new Hatchery(), new Lair()};
		Spire.minerals = 200;
		Spire.gas = 150;
		Spire.time = 120;
	}
}
