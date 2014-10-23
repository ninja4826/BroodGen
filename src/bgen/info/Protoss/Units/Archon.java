package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Archon extends Unit {
	public Archon() {
		Archon.produce = new HighTemplar();
		Archon.reqs = new Unit[]{new HighTemplar(), new HighTemplar()};
		Archon.supply = 0;
		Archon.minerals = 0;
		Archon.gas = 0;
		Archon.time = 20;
		
	}
}