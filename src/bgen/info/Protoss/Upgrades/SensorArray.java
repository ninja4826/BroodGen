package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class SensorArray extends Upgrade {
	public SensorArray() {
		SensorArray.produce = new Observatory();
		SensorArray.reqs = new Struct[]{new Observatory()};
		SensorArray.minerals = new int[]{150};
		SensorArray.gas = new int[]{150};
		SensorArray.time = new int[]{133};
		SensorArray.levelReqs = new Struct[]{new Forge(), new TemplarArchives(), new TemplarArchives()};
		SensorArray.levels = 3;
		
	}
}