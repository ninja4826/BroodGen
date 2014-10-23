package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Hallucination extends Upgrade {
	public Hallucination() {
		Hallucination.produce = new TemplarArchives();
		Hallucination.reqs = new Struct[]{new TemplarArchives()};
		Hallucination.minerals = new int[]{150};
		Hallucination.gas = new int[]{150};
		Hallucination.time = new int[]{80};
		Hallucination.levelReqs = new Struct[]{new Forge(), new TemplarArchives(), new TemplarArchives()};
		Hallucination.levels = 3;
		
	}
}