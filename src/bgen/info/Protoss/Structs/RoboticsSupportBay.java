package bgen.info.Protoss.Structs;
import bgen.info.*;

public class RoboticsSupportBay extends Struct {
	public RoboticsSupportBay() {
		RoboticsSupportBay.reqs = new Struct[]{new RoboticsFacility()};
		RoboticsSupportBay.minerals = 150;
		RoboticsSupportBay.gas = 100;
		RoboticsSupportBay.time = 30;
		
	}
}