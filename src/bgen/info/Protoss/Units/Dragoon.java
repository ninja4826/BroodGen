package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Dragoon extends Unit {
	public Dragoon() {
		Dragoon.produce = new Gateway();
		Dragoon.reqs = new Struct[]{new Gateway(), new CyberneticsCore()};
		Dragoon.supply = 2;
		Dragoon.minerals = 125;
		Dragoon.gas = 50;
		Dragoon.time = 40;
		
	}
}