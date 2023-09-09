package optimization;

public class LoopOptimization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		int array[] = new int[10000];
		int value;
		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
			value += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("time taken for for loop : " + (end - start));

		start = System.currentTimeMillis();
		int array1[] = new int[10000];
		for (int num : array1) {
			System.out.println(num);
		}
		end = System.currentTimeMillis();
		System.out.println("time taken: " + (end - start));

	}

}
