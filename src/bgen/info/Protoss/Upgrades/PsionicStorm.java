package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class PsionicStorm extends Upgrade {
	public PsionicStorm() {
		PsionicStorm.produce = new TemplarArchives();
		PsionicStorm.reqs = new Struct[]{new TemplarArchives()};
		PsionicStorm.minerals = new int[]{200};
		PsionicStorm.gas = new int[]{200};
		PsionicStorm.time = new int[]{120};
		PsionicStorm.levelReqs = new Struct[]{new Forge(), new TemplarArchives(), new TemplarArchives()};
		PsionicStorm.levels = 3;
		
	}
}