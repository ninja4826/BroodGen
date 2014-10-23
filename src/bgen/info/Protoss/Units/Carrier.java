package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Carrier extends Unit {
	public Carrier() {
		Carrier.produce = new Stargate();
		Carrier.reqs = new Struct[]{new Stargate(), new FleetBeacon()};
		Carrier.supply = 8;
		Carrier.minerals = 350;
		Carrier.gas = 250;
		Carrier.time = 140;
		
	}
}