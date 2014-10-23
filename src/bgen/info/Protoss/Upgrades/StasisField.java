package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class StasisField extends Upgrade {
	public StasisField() {
		StasisField.produce = new ArbiterTribunal();
		StasisField.reqs = new Struct[]{new ArbiterTribunal()};
		StasisField.minerals = new int[]{150};
		StasisField.gas = new int[]{150};
		StasisField.time = new int[]{100};
		StasisField.levelReqs = new Struct[]{new Forge(), new CyberneticsCore(), new CyberneticsCore()};
		StasisField.levels = 3;
		
	}
}