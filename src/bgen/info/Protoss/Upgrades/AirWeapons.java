package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class AirWeapons extends Upgrade {
	public AirWeapons() {
		AirWeapons.produce = new CyberneticsCore();
		AirWeapons.reqs = new Struct[]{new CyberneticsCore()};
		AirWeapons.minerals = new int[]{100, 75};
		AirWeapons.gas = new int[]{100, 75};
		AirWeapons.time = new int[]{266, 32};
		AirWeapons.levelReqs = new Struct[]{new CyberneticsCore(), new FleetBeacon(), new FleetBeacon()};
		AirWeapons.levels = 3;
		
	}
}