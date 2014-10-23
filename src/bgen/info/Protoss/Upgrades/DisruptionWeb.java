package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class DisruptionWeb extends Upgrade {
	public DisruptionWeb() {
		DisruptionWeb.produce = new FleetBeacon();
		DisruptionWeb.reqs = new Struct[]{new FleetBeacon()};
		DisruptionWeb.minerals = new int[]{200};
		DisruptionWeb.gas = new int[]{200};
		DisruptionWeb.time = new int[]{80};
		DisruptionWeb.levelReqs = new Struct[]{new CyberneticsCore(), new FleetBeacon(), new FleetBeacon()};
		DisruptionWeb.levels = 3;
		
	}
}