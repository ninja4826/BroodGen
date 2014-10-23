package bgen.info.Protoss.Structs;
import bgen.info.*;

public class CitadelOfAdun extends Struct {
	public CitadelOfAdun() {
		CitadelOfAdun.reqs = new Struct[]{new CyberneticsCore()};
		CitadelOfAdun.minerals = 150;
		CitadelOfAdun.gas = 100;
		CitadelOfAdun.time = 60;
		
	}
}