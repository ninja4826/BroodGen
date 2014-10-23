package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Maelstrom extends Upgrade {
	public Maelstrom() {
		Maelstrom.produce = new TemplarArchives();
		Maelstrom.reqs = new Struct[]{new TemplarArchives()};
		Maelstrom.minerals = new int[]{150};
		Maelstrom.gas = new int[]{150};
		Maelstrom.time = new int[]{166};
		Maelstrom.levelReqs = new Struct[]{new Forge(), new TemplarArchives(), new TemplarArchives()};
		Maelstrom.levels = 3;
		
	}
}