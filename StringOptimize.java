package optimization;

public class StringOptimize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		String result = " ";
		for(int i=0;i<100000;i++) {
			result += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("time taken: " + (end-start));
		
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int j=0;j<100000;j++) {
			sb.append(j);
		}
		end = System.currentTimeMillis();
		System.out.println("time taken: " +(end-start));
		
		String str1 = "hello";
		String str2 = "world";

	}

}
