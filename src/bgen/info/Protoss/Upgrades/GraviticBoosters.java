package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class GraviticBoosters extends Upgrade {
	public GraviticBoosters() {
		GraviticBoosters.produce = new Observatory();
		GraviticBoosters.reqs = new Struct[]{new Observatory()};
		GraviticBoosters.minerals = new int[]{150};
		GraviticBoosters.gas = new int[]{150};
		GraviticBoosters.time = new int[]{133};
		GraviticBoosters.levelReqs = new Struct[]{new CyberneticsCore(), new FleetBeacon(), new FleetBeacon()};
		GraviticBoosters.levels = 3;
		
	}
}