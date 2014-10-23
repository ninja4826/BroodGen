package bgen.info.Zerg.Structs;

import bgen.info.*;

public class SpawningPool extends Struct {

	public SpawningPool() {
		SpawningPool.reqs = new Struct[]{new Hatchery()};
		SpawningPool.minerals = 200;
		SpawningPool.gas = 0;
		SpawningPool.time = 80;
	}
}
