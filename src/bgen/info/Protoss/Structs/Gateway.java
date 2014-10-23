package bgen.info.Protoss.Structs;
import bgen.info.*;

public class Gateway extends Struct {
	public Gateway() {
		Gateway.reqs = new Struct[]{new Nexus()};
		Gateway.minerals = 150;
		Gateway.gas = 0;
		Gateway.time = 60;
		
	}
}