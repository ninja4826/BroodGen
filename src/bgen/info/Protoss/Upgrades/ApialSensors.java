package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class ApialSensors extends Upgrade {
	public ApialSensors() {
		ApialSensors.produce = new FleetBeacon();
		ApialSensors.reqs = new Struct[]{new FleetBeacon()};
		ApialSensors.minerals = new int[]{100};
		ApialSensors.gas = new int[]{100};
		ApialSensors.time = new int[]{166};
		ApialSensors.levelReqs = new Struct[]{new CyberneticsCore(), new FleetBeacon(), new FleetBeacon()};
		ApialSensors.levels = 3;
		
	}
}