package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class GroundArmor extends Upgrade {
	public GroundArmor() {
		GroundArmor.produce = new Forge();
		GroundArmor.reqs = new Struct[]{new Forge()};
		GroundArmor.minerals = new int[]{100, 75};
		GroundArmor.gas = new int[]{100, 75};
		GroundArmor.time = new int[]{266, 32};
		GroundArmor.levelReqs = new Struct[]{new Forge(), new TemplarArchives(), new TemplarArchives()};
		GroundArmor.levels = 3;
		
	}
}