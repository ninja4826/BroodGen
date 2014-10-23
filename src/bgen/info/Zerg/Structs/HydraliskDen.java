package bgen.info.Zerg.Structs;

import bgen.info.*;

public class HydraliskDen extends Struct {

	public HydraliskDen() {
		HydraliskDen.reqs = new Struct[]{new Hatchery(), new SpawningPool()};
		HydraliskDen.minerals = 100;
		HydraliskDen.gas = 50;
		HydraliskDen.time = 40;
		
	}
}
