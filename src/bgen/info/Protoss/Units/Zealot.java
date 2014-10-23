package bgen.info.Protoss.Units;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class Zealot extends Unit {
	public Zealot() {
		Zealot.produce = new Gateway();
		Zealot.reqs = new Struct[]{new Gateway()};
		Zealot.supply = 2;
		Zealot.minerals = 100;
		Zealot.gas = 0;
		Zealot.time = 40;
		
	}
}