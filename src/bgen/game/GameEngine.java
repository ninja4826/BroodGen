package bgen.game;

import bgen.info.Struct;
import bgen.info.Unit;
import bgen.info.Protoss.Structs.*;
import bgen.info.Protoss.Units.*;
import bgen.info.Terran.Structs.*;
import bgen.info.Terran.Units.*;
import bgen.info.Zerg.Structs.*;
import bgen.info.Zerg.Units.*;

public class GameEngine {

	public Struct startBase;
	public Unit[] startUnits;
	public int[] startRecs;
	public double baseCollectSpeed = 1;
	public double[] collectSpeed = new double[]{this.baseCollectSpeed, this.baseCollectSpeed * 1.6};
	
	public GameEngine(String race) {
		
		switch (race.toUpperCase()){
		case "PROTOSS":
			this.startBase = new Nexus();
			this.startUnits = new Unit[]{new Probe(), new Probe(), new Probe(), new Probe()};
			
			//this.startRecs = new int[]{current supply, total supply, minerals, gas};
			this.startRecs = new int[]{4, 9, 50, 0};
			this.baseCollectSpeed = 1.18;
			break;
		case "TERRAN":
			this.startBase = new CommandCenter();
			this.startUnits = new Unit[]{new SCV(), new SCV(), new SCV(), new SCV()};
			
			this.startRecs = new int[]{4, 10, 50, 0};
			this.baseCollectSpeed = 1;
			break;
		case "ZERG":
			this.startBase = new Hatchery();
			this.startUnits = new Unit[]{new Drone(), new Drone(), new Drone(), new Drone()};
			
			this.startRecs = new int[]{4, 9, 50, 0};
			this.baseCollectSpeed = 1.05;
		}
	}
	
	
}
