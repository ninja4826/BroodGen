package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class DarkArchon extends Unit {
	public DarkArchon() {
		DarkArchon.produce = new DarkTemplar();
		DarkArchon.reqs = new Unit[]{new DarkTemplar(), new DarkTemplar()};
		DarkArchon.supply = 0;
		DarkArchon.minerals = 0;
		DarkArchon.gas = 0;
		DarkArchon.time = 20;
		
	}
}