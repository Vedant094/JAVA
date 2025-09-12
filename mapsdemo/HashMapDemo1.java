package mapsdemo;

import java.util.HashMap;
import java.util.Map;

/**
* Author  : Vedant.Raturi
* Date    : Sep 9, 2025
* Time    : 2:46:35 PM
* Project : CoreJava

*/

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(111, "John");
		hm.put(222, "Jim");
		hm.put(333, "Mike");
		hm.put(444, null);
		hm.put(null, "Jimmy");
		hm.put(null, "Jack");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
