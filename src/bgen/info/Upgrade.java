package bgen.info;

public class Upgrade {


	public static Object produce;
	public static Object[] reqs;
	public static int[] minerals;
	public static int[] gas;
	public static int[] time;
	public static Object[] levelReqs = new Object[0];
	public static int levels = 1;
	
	public Object[][] get() {
		Object[][] obj;
		if (Upgrade.levels == 1) {
			obj = new Object[5][];
			
			obj[2] = new Object[]{Upgrade.minerals[0]};
			obj[3] = new Object[]{Upgrade.gas[0]};
			obj[4] = new Object[]{Upgrade.time[0]};
		} else {
			obj = new Object[7][];
			
			obj[2] = new Object[]{Upgrade.minerals[0], Upgrade.minerals[1]};
			obj[3] = new Object[]{Upgrade.gas[0], Upgrade.gas[1]};
			obj[4] = new Object[]{Upgrade.time[0], Upgrade.time[1]};
			obj[5] = new Object[Upgrade.levelReqs.length];
			
			for (int i = 0; i < Upgrade.levelReqs.length; i++) {
				obj[5][i] = Upgrade.levelReqs[i];
			}
			
			obj[6] = new Object[]{Upgrade.levels};
		}
		
		obj[0] = new Object[]{Upgrade.produce};
		obj[1] = new Object[Upgrade.reqs.length];
		
		for (int i = 0; i < Upgrade.reqs.length; i++) {
			obj[1][i] = Upgrade.reqs[i];
		}
		
		obj[2] = new Object[]{Upgrade.minerals[0]};
		obj[3] = new Object[]{Upgrade.gas[0]};
		obj[4] = new Object[]{Upgrade.time[0]};
		
			
		return(obj);
	}
}
