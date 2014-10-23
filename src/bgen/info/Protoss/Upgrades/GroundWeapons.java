package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class GroundWeapons extends Upgrade {
	public GroundWeapons() {
		GroundWeapons.produce = new Forge();
		GroundWeapons.reqs = new Struct[]{new Forge()};
		GroundWeapons.minerals = new int[]{100, 50};
		GroundWeapons.gas = new int[]{100, 50};
		GroundWeapons.time = new int[]{266, 32};
		GroundWeapons.levelReqs = new Struct[]{new Forge(), new TemplarArchives(), new TemplarArchives()};
		GroundWeapons.levels = 3;
		
	}
}