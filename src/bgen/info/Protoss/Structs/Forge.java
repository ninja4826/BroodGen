package bgen.info.Protoss.Structs;
import bgen.info.*;

public class Forge extends Struct {
	public Forge() {
		Forge.reqs = new Struct[]{new Nexus()};
		Forge.minerals = 150;
		Forge.gas = 0;
		Forge.time = 40;
		
	}
}