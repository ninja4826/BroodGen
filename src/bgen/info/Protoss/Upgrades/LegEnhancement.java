package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class LegEnhancement extends Upgrade {
	public LegEnhancement() {
		LegEnhancement.produce = new CitadelOfAdun();
		LegEnhancement.reqs = new Struct[]{new CitadelOfAdun()};
		LegEnhancement.minerals = new int[]{150};
		LegEnhancement.gas = new int[]{150};
		LegEnhancement.time = new int[]{133};
		LegEnhancement.levelReqs = new Struct[]{new Forge(), new TemplarArchives(), new TemplarArchives()};
		LegEnhancement.levels = 3;
		
	}
}