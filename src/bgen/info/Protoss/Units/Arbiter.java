package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Arbiter extends Unit {
	public Arbiter() {
		Arbiter.produce = new Stargate();
		Arbiter.reqs = new Struct[]{new Stargate(), new ArbiterTribunal()};
		Arbiter.supply = 4;
		Arbiter.minerals = 100;
		Arbiter.gas = 350;
		Arbiter.time = 160;
		
	}
}