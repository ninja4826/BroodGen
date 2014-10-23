package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Probe extends Unit {
	public Probe() {
		Probe.produce = new Nexus();
		Probe.reqs = new Struct[]{new Nexus()};
		Probe.supply = 1;
		Probe.minerals = 50;
		Probe.gas = 0;
		Probe.time = 20;
		
	}
}