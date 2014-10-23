package bgen.info.Protoss.Structs;
import bgen.info.*;

public class ArbiterTribunal extends Struct {
	public ArbiterTribunal() {
		ArbiterTribunal.reqs = new Struct[]{new Stargate(), new TemplarArchives()};
		ArbiterTribunal.minerals = 200;
		ArbiterTribunal.gas = 150;
		ArbiterTribunal.time = 60;
	}
}
