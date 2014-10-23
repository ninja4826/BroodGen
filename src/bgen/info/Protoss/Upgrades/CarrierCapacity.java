package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class CarrierCapacity extends Upgrade {
	public CarrierCapacity() {
		CarrierCapacity.produce = new FleetBeacon();
		CarrierCapacity.reqs = new Struct[]{new FleetBeacon()};
		CarrierCapacity.minerals = new int[]{100};
		CarrierCapacity.gas = new int[]{100};
		CarrierCapacity.time = new int[]{100};
		CarrierCapacity.levelReqs = new Struct[]{new CyberneticsCore(), new FleetBeacon(), new FleetBeacon()};
		CarrierCapacity.levels = 3;
		
	}
}