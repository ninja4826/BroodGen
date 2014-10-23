package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class ArgusJewel extends Upgrade {
	public ArgusJewel() {
		ArgusJewel.produce = new FleetBeacon();
		ArgusJewel.reqs = new Struct[]{new FleetBeacon()};
		ArgusJewel.minerals = new int[]{100};
		ArgusJewel.gas = new int[]{100};
		ArgusJewel.time = new int[]{166};
		ArgusJewel.levelReqs = new Struct[]{new CyberneticsCore(), new FleetBeacon(), new FleetBeacon()};
		ArgusJewel.levels = 3;
		
	}
}