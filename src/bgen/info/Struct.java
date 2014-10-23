package bgen.info;

public class Struct {

	public static Object[] reqs;
	public static int minerals;
	public static int gas;
	public static int time;
	
	public Object[][] get() {
		
		Object[][] obj = new Object[4][];
		
		obj[0] = new Object[Struct.reqs.length];
		
		for (int i = 0; i < Struct.reqs.length; i++) {
			obj[0][i] = Struct.reqs[i];
		}
		
		obj[1] = new Object[]{Struct.minerals};
		obj[2] = new Object[]{Struct.gas};
		obj[3] = new Object[]{Struct.time};
		
		return(obj);
	}
}
