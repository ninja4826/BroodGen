package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Scout extends Unit {
	public Scout() {
		Scout.produce = new Stargate();
		Scout.reqs = new Struct[]{new Stargate()};
		Scout.supply = 3;
		Scout.minerals = 300;
		Scout.gas = 150;
		Scout.time = 80;
		
	}
}