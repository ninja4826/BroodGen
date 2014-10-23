package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class KhaydarinCore extends Upgrade {
	public KhaydarinCore() {
		KhaydarinCore.produce = new ArbiterTribunal();
		KhaydarinCore.reqs = new Struct[]{new ArbiterTribunal()};
		KhaydarinCore.minerals = new int[]{150};
		KhaydarinCore.gas = new int[]{150};
		KhaydarinCore.time = new int[]{166};
		KhaydarinCore.levelReqs = new Struct[]{new Forge(), new TemplarArchives(), new TemplarArchives()};
		KhaydarinCore.levels = 3;
		
	}
}