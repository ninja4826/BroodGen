package bgen.info.Terran.Units;

import bgen.info.*;
import bgen.info.Zerg.Structs.*;


public class BattleCruiser extends Unit {

	public BattleCruiser() {
		BattleCruiser.produce = new Starport();
		BattleCruiser.reqs = new Upgrade[]{new ControlTower(), new PhysicsLab()};
		BattleCruiser.supply = 8;
		BattleCruiser.minerals = 400;
		BattleCruiser.gas = 300;
		BattleCruiser.time = 160;
	}
}
