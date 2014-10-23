package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class GraviticDrive extends Upgrade {
	public GraviticDrive() {
		GraviticDrive.produce = new RoboticsSupportBay();
		GraviticDrive.reqs = new Struct[]{new RoboticsSupportBay()};
		GraviticDrive.minerals = new int[]{200};
		GraviticDrive.gas = new int[]{200};
		GraviticDrive.time = new int[]{166};
		GraviticDrive.levelReqs = new Struct[]{new CyberneticsCore(), new FleetBeacon(), new FleetBeacon()};
		GraviticDrive.levels = 3;
		
	}
}