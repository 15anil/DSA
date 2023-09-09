package Hashing;

import java.util.HashMap;

public class HashSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hmap = new HashMap<>();
		hmap.put("Tiger",1);
		hmap.put("Lion",5);
		hmap.put("Leopard",3);
		hmap.put("Cheetah",7);
		
		String key ="Tiger";
		if(hmap.containsKey(key)) {
			int value = hmap.get(key);
			System.out.println("Value for key " + key + " and value found is " + value);
		}else {
			System.out.println("key " + key + " not found ");
		}
		
		

	}

}
