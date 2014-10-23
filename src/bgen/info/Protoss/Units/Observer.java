package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Observer extends Unit {
	public Observer() {
		Observer.produce = new RoboticsFacility();
		Observer.reqs = new Struct[]{new RoboticsFacility(), new Observatory()};
		Observer.supply = 1;
		Observer.minerals = 25;
		Observer.gas = 75;
		Observer.time = 40;
		
	}
}