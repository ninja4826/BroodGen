package bgen.info.Zerg.Units;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;

public class Drone extends Unit {

	public Drone() {
		Drone.produce = new Hatchery();
		Drone.reqs = new Struct[]{new Hatchery()};
		Drone.supply = 1;
		Drone.minerals = 50;
		Drone.gas = 0;
		Drone.time = 20;
	}
}
