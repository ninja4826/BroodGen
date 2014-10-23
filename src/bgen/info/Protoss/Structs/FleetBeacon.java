package bgen.info.Protoss.Structs;
import bgen.info.*;

public class FleetBeacon extends Struct {
	public FleetBeacon() {
		FleetBeacon.reqs = new Struct[]{new Stargate()};
		FleetBeacon.minerals = 300;
		FleetBeacon.gas = 200;
		FleetBeacon.time = 60;
		
	}
}