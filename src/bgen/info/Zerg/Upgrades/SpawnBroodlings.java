package bgen.info.Zerg.Upgrades;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class SpawnBroodlings extends Upgrade {

	public SpawnBroodlings() {
		SpawnBroodlings.produce = new QueenNest();
		SpawnBroodlings.reqs = new Object[]{};
		SpawnBroodlings.minerals = new int[]{100};
		SpawnBroodlings.gas = new int[]{100};
		SpawnBroodlings.time = new int[]{80};
	}
}
