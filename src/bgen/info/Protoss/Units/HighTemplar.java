package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class HighTemplar extends Unit {
	public HighTemplar() {
		HighTemplar.produce = new Gateway();
		HighTemplar.reqs = new Struct[]{new Gateway(), new TemplarArchives()};
		HighTemplar.supply = 2;
		HighTemplar.minerals = 50;
		HighTemplar.gas = 150;
		HighTemplar.time = 50;
		
	}
}