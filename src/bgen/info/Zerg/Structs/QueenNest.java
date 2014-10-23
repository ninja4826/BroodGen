package bgen.info.Zerg.Structs;

import bgen.info.*;

public class QueenNest extends Struct {

	public QueenNest() {
		QueenNest.reqs = new Object[]{new Hatchery(), new Lair()};
		QueenNest.minerals = 150;
		QueenNest.gas = 100;
		QueenNest.time = 60;
	}
}
