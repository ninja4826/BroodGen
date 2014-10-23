package bgen.info.Protoss.Structs;
import bgen.info.*;

public class Observatory extends Struct {
	public Observatory() {
		Observatory.reqs = new Struct[]{new RoboticsFacility()};
		Observatory.minerals = 50;
		Observatory.gas = 100;
		Observatory.time = 30;
		
	}
}