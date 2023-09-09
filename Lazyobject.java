package optimization;

public class Lazyobject {
	
	private Object myobject;
	
	
	
	public Object getMyobject() {
		if(myobject == null) {
			myobject = new Object();
		}
		return myobject;
	}
	public static void main(String[] args) {
		
	}

}
