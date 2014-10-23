package bgen.info.Protoss.Upgrades;
import bgen.info.Protoss.Structs.*;
import bgen.info.*;

public class KhaydarinAmulet extends Upgrade {
	public KhaydarinAmulet() {
		KhaydarinAmulet.produce = new TemplarArchives();
		KhaydarinAmulet.reqs = new Struct[]{new TemplarArchives()};
		KhaydarinAmulet.minerals = new int[]{150};
		KhaydarinAmulet.gas = new int[]{150};
		KhaydarinAmulet.time = new int[]{166};
		KhaydarinAmulet.levelReqs = new Struct[]{new Forge(), new TemplarArchives(), new TemplarArchives()};
		KhaydarinAmulet.levels = 3;
		
	}
}