package bgen.info.Protoss.Structs;
import bgen.info.*;

public class Stargate extends Struct {
	public Stargate() {
		Stargate.reqs = new Struct[]{new CyberneticsCore()};
		Stargate.minerals = 150;
		Stargate.gas = 150;
		Stargate.time = 70;
		
	}
}