package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class MindControl extends Upgrade {
	public MindControl() {
		MindControl.produce = new TemplarArchives();
		MindControl.reqs = new Struct[]{new TemplarArchives()};
		MindControl.minerals = new int[]{200};
		MindControl.gas = new int[]{200};
		MindControl.time = new int[]{120};
		MindControl.levelReqs = new Struct[]{new Forge(), new TemplarArchives(), new TemplarArchives()};
		MindControl.levels = 3;
		
	}
}