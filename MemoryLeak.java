package optimization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MemoryLeak {
	public int sum(int array[]) {
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum * sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			FileInputStream fis = new FileInputStream("myfile.txt");
//			
//		} catch (FileNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		int array[] = {1,2,3,4,5};
		MemoryLeak m = new MemoryLeak();
		int result = m.sum(array);
		System.out.println(result);

	}

}
