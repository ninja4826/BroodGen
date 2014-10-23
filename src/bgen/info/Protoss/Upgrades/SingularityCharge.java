package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class SingularityCharge extends Upgrade {
	public SingularityCharge() {
		SingularityCharge.produce = new CyberneticsCore();
		SingularityCharge.reqs = new Struct[]{new CyberneticsCore()};
		SingularityCharge.minerals = new int[]{150};
		SingularityCharge.gas = new int[]{150};
		SingularityCharge.time = new int[]{166};
		SingularityCharge.levelReqs = new Struct[]{new Forge(), new CyberneticsCore(), new CyberneticsCore()};
		SingularityCharge.levels = 3;
		
	}
}