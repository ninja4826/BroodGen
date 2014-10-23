package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class DarkTemplar extends Unit {
	public DarkTemplar() {
		DarkTemplar.produce = new Gateway();
		DarkTemplar.reqs = new Struct[]{new Gateway(), new TemplarArchives()};
		DarkTemplar.supply = 2;
		DarkTemplar.minerals = 125;
		DarkTemplar.gas = 100;
		DarkTemplar.time = 50;
		
	}
}