package bgen.info.Zerg.Structs;

import bgen.info.*;

public class EvolutionChamber extends Struct {

	public EvolutionChamber() {
		EvolutionChamber.reqs = new Struct[]{new Hatchery()};
		EvolutionChamber.minerals = 75;
		EvolutionChamber.gas = 0;
		EvolutionChamber.time = 40;
	}
}
