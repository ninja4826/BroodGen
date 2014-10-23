package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Reaver extends Unit {
	public Reaver() {
		Reaver.produce = new RoboticsFacility();
		Reaver.reqs = new Struct[]{new RoboticsFacility(), new RoboticsSupportBay()};
		Reaver.supply = 4;
		Reaver.minerals = 200;
		Reaver.gas = 100;
		Reaver.time = 70;
		
	}
}