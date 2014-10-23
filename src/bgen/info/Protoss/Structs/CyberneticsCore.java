package bgen.info.Protoss.Structs;
import bgen.info.*;

public class CyberneticsCore extends Struct {
	public CyberneticsCore() {
		CyberneticsCore.reqs = new Struct[]{new Gateway()};
		CyberneticsCore.minerals = 200;
		CyberneticsCore.gas = 0;
		CyberneticsCore.time = 60;
		
	}
}