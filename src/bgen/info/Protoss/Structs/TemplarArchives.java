package bgen.info.Protoss.Structs;
import bgen.info.*;

public class TemplarArchives extends Struct {
	public TemplarArchives() {
		TemplarArchives.reqs = new Struct[]{new CitadelOfAdun()};
		TemplarArchives.minerals = 150;
		TemplarArchives.gas = 200;
		TemplarArchives.time = 60;
		
	}
}