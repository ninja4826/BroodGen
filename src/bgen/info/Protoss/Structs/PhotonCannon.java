package bgen.info.Protoss.Structs;
import bgen.info.*;

public class PhotonCannon extends Struct {
	public PhotonCannon() {
		PhotonCannon.reqs = new Struct[]{new Forge()};
		PhotonCannon.minerals = 150;
		PhotonCannon.gas = 0;
		PhotonCannon.time = 50;
		
	}
}