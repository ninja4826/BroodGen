package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Recall extends Upgrade {
	public Recall() {
		Recall.produce = new ArbiterTribunal();
		Recall.reqs = new Struct[]{new ArbiterTribunal()};
		Recall.minerals = new int[]{150};
		Recall.gas = new int[]{150};
		Recall.time = new int[]{120};
		Recall.levelReqs = new Struct[]{new Forge(), new TemplarArchives(), new TemplarArchives()};
		Recall.levels = 3;
		
	}
}