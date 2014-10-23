package bgen.info.Zerg.Units;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class Queen extends Unit {

	public Queen() {
		Queen.produce = new Larva();
		Queen.reqs = new Struct[]{new QueenNest()};
		Queen.supply = 2;
		Queen.minerals = 100;
		Queen.gas = 150;
		Queen.time = 50;
	}
}
