package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Shield extends Upgrade {
	public Shield() {
		Shield.produce = new Forge();
		Shield.reqs = new Struct[]{new Forge()};
		Shield.minerals = new int[]{200, 100};
		Shield.gas = new int[]{200, 200};
		Shield.time = new int[]{266, 32};
		Shield.levelReqs = new Struct[]{new Forge(), new CyberneticsCore(), new CyberneticsCore()};
		Shield.levels = 3;
		
	}
}