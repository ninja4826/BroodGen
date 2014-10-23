package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class ReaverCapacity extends Upgrade {
	public ReaverCapacity() {
		ReaverCapacity.produce = new RoboticsSupportBay();
		ReaverCapacity.reqs = new Struct[]{new RoboticsSupportBay()};
		ReaverCapacity.minerals = new int[]{200};
		ReaverCapacity.gas = new int[]{200};
		ReaverCapacity.time = new int[]{166};
		ReaverCapacity.levelReqs = new Struct[]{new Forge(), new TemplarArchives(), new TemplarArchives()};
		ReaverCapacity.levels = 3;
		
	}
}