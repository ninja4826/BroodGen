package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Corsair extends Unit {
	public Corsair() {
		Corsair.produce = new Stargate();
		Corsair.reqs = new Struct[]{new Stargate()};
		Corsair.supply = 2;
		Corsair.minerals = 150;
		Corsair.gas = 100;
		Corsair.time = 40;
		
	}
}