package bgen.info;

public class Build {

	Object[] list = new Object[0];
	
	public void add(Unit enti) {
		
		Object[] reqs = enti.get()[1];
		Object[] newList = new Object[0];
		Object[] tempList;
		
		for (int r = 0; r < reqs.length; r++) {
			if (reqCheck(reqs[r])) {
				tempList = new Object[newList.length + 1];
				
				for (int i = 0; i < newList.length; i++) {
					tempList[i] = newList[i];
				}
				
				tempList[newList.length] = reqs[r];
				newList = tempList;
			}
		}
		
		tempList = new Object[this.list.length + newList.length];
		
		for (int i = 0; i < this.list.length; i++) {
			
			tempList[i] = this.list[i];
			
		}
		for (int i = this.list.length; i < tempList.length; i++) {
			
			tempList[i] = newList[i];
			
		}
		
		this.list = tempList;
	}
	
	public void add (Struct enti) {
		
		Object[] reqs = enti.get()[0];
		Object[] newList = new Object[0];
		Object[] tempList;
		
		for (int r = 0; r < reqs.length; r++) {
			if (reqCheck(reqs[r])) {
				tempList = new Object[newList.length + 1];
				
				for (int i = 0; i < newList.length; i++) {
					tempList[i] = newList[i];
				}
				
				tempList[newList.length] = reqs[r];
				newList = tempList;
			}
		}
		
		tempList = new Object[this.list.length + newList.length];
		
		for (int i = 0; i < this.list.length; i++) {
			
			tempList[i] = this.list[i];
			
		}
		for (int i = this.list.length; i < tempList.length; i++) {
			
			tempList[i] = newList[i];
			
		}
		
		this.list = tempList;
	}
	
	public boolean reqCheck(Object enti) {
		
		boolean exist = false;
		for (int i = 0; i < list.length; i++) {
			if (this.list[i] == enti) {
				exist = true;
			}
		}
		return exist;
	}
	
	public Object[] get() {
		return this.list;
	}
}
