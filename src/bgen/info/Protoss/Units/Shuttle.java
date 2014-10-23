package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Shuttle extends Unit {
	public Shuttle() {
		Shuttle.produce = new RoboticsFacility();
		Shuttle.reqs = new Struct[]{new RoboticsFacility()};
		Shuttle.supply = 2;
		Shuttle.minerals = 200;
		Shuttle.gas = 0;
		Shuttle.time = 60;
		
	}
}