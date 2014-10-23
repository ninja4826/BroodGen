package bgen.info.Protoss.Structs;
import bgen.info.*;

public class RoboticsFacility extends Struct {
	public RoboticsFacility() {
		RoboticsFacility.reqs = new Struct[]{new CyberneticsCore()};
		RoboticsFacility.minerals = 200;
		RoboticsFacility.gas = 200;
		RoboticsFacility.time = 80;
		
	}
}