package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class ScarabDamage extends Upgrade {
	public ScarabDamage() {
		ScarabDamage.produce = new RoboticsSupportBay();
		ScarabDamage.reqs = new Struct[]{new RoboticsSupportBay()};
		ScarabDamage.minerals = new int[]{200};
		ScarabDamage.gas = new int[]{200};
		ScarabDamage.time = new int[]{166};
		ScarabDamage.levelReqs = new Struct[]{new Forge(), new TemplarArchives(), new TemplarArchives()};
		ScarabDamage.levels = 3;
		
	}
}