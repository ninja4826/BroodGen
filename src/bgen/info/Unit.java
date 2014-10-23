package bgen.info;

public class Unit {
	
	public static Object produce;
	public static Object[] reqs;
	public static int supply;
	public static int minerals;
	public static int gas;
	public static int time;
	
	
	
	public Object[][] get() {
		
		Object[][] obj = new Object[6][];
		
		obj[0] = new Object[]{Unit.produce};
		obj[1] = new Object[Unit.reqs.length];
		
		for (int i = 0; i < Unit.reqs.length; i++) {
			obj[1][i] = Unit.reqs[i];
		}
		
		obj[2] = new Object[]{Unit.supply};
		obj[3] = new Object[]{Unit.minerals};
		obj[4] = new Object[]{Unit.gas};
		obj[5] = new Object[]{Unit.time};
		
		return(obj);
	}
}
