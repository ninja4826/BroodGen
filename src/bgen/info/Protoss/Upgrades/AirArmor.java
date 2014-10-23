package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class AirArmor extends Upgrade {
	public AirArmor() {
		AirArmor.produce = new CyberneticsCore();
		AirArmor.reqs = new Struct[]{new CyberneticsCore()};
		AirArmor.minerals = new int[]{150, 75};
		AirArmor.gas = new int[]{150, 75};
		AirArmor.time = new int[]{266, 32};
		AirArmor.levelReqs = new Struct[]{new CyberneticsCore(), new FleetBeacon(), new FleetBeacon()};
		AirArmor.levels = 3;
		
	}
}