package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LinkedHashedMapAccess {

	public static void main(String[] args) {
		
		//HashMap hMap = new HashMap();
	
		//Generic
		HashMap<Integer, String> hMap1 = new HashMap<Integer, String>();
		// HashMap
		 // map 1
		 HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
		 hmap1.put(100, "ND");
		 hmap1.put(1, "NY");
		 hmap1.put(2, "NJ");
		 hmap1.put(3, "CA");
		 hmap1.put(3, "PA");
		 hmap1.put(null, "MI");
		 hmap1.put(4, null);
		 hmap1.put(5, "ND");
		 hmap1.put(200, "SD");

		 // map 2
		 HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		 hmap2.put(999, "PQ");
		 hmap2.put(1000, "QR");

		 // print statements
		 System.out.println(hmap1.containsValue("MI"));
		 System.out.println(hmap1.containsKey(null));
		 System.out.println(hmap1.get(200));
		 System.out.println(hmap1.replace(2, "XY"));
		 System.out.println(hmap1.remove(2));
		 System.out.println(hmap1.get(200).hashCode());

		 // adding map into a map
		 hmap1.putAll(hmap2);

		 // printing all entries for HashMap
		 System.out.println("=============All entries HashMap=============");
		 for (Map.Entry<Integer, String> entry : hmap1.entrySet())
		 System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		 // LinkedHashMap - Insertion Order
		 // map 1
		 LinkedHashMap<Integer, String> lmap1 = new LinkedHashMap<Integer, String>();
		 lmap1.put(100, "ND");
		 lmap1.put(1, "NY");
		 lmap1.put(2, "NJ");
		 lmap1.put(3, "CA");
		 lmap1.put(3, "PA");
		 lmap1.put(null, "MI");
		 lmap1.put(4, null);
		 lmap1.put(5, "ND");
		 lmap1.put(200, "SD");

		 // map 2
		 LinkedHashMap<Integer, String> lmap2 = new LinkedHashMap<Integer, String>();
		 lmap2.put(999, "PQ");
		 lmap2.put(1000, "QR");

		 // adding map into a map
		 lmap1.putAll(lmap2);

		 System.out.println(lmap1.putIfAbsent(201, "AB"));

		 // printing all entries for LinkedHashMap
		 System.out.println("=============All entries LinkedHashMap - Insertion Order=============");
		 for (Map.Entry<Integer, String> entry : lmap1.entrySet())
		 System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		 // LinkedHashMap - Access Order
		 // map 1
		 LinkedHashMap<Integer, String> lmap1Access = new LinkedHashMap<Integer, String>(16, .75f, true);
		 lmap1Access.put(100, "ND");
		 lmap1Access.put(1, "NY");
		 lmap1Access.put(2, "NJ");
		 lmap1Access.put(3, "CA");
		 lmap1Access.put(3, "PA");
		 lmap1Access.put(null, "MI");
		 lmap1Access.put(4, null);
		 lmap1Access.put(5, "ND");
		 lmap1Access.put(200, "SD");

		 // map 2
		 LinkedHashMap<Integer, String> lmap2Access = new LinkedHashMap<Integer, String>();
		 lmap2Access.put(999, "PQ");
		 lmap2Access.put(1000, "QR");

		 // adding map into a map
		 lmap1Access.putAll(lmap2Access);

		 System.out.println(lmap1Access.putIfAbsent(201, "AB"));

		 // Accessing elements
		 lmap1Access.get(100);
		 lmap1Access.get(100);
		 lmap1Access.get(1000);
		 lmap1Access.get(999);
		 lmap1Access.get(100);
		 lmap1Access.get(null);
		 lmap1Access.get(1);

		 // printing all entries for LinkedHashMap
		 System.out.println("=============All entries LinkedHashMap - Access Order=============");
		 for (Map.Entry<Integer, String> entry : lmap1Access.entrySet())
		 System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		 // TreeMap - Sorted
		 // map 1
		 TreeMap<Integer, String> tmap1 = new TreeMap<Integer, String>();
		 tmap1.put(100, "ND");
		 tmap1.put(1, "NY");
		 tmap1.put(2, "NJ");
		 tmap1.put(3, "CA");
		 tmap1.put(3, "PA");
		 tmap1.put(4, null);
		 tmap1.put(5, "ND");
		 tmap1.put(200, "SD");
		 

		 // map 2
		 TreeMap<Integer, String> tmap2 = new TreeMap<Integer, String>();
		 tmap2.put(999, "PQ");
		 tmap2.put(1000, "QR");

		 // adding map into a map
		 tmap1.putAll(tmap2);

		 System.out.println(tmap1.putIfAbsent(201, "AB"));
		 
		 //Reverse Order
		 Map<Integer, String> newMap = new TreeMap<>(Collections.reverseOrder());
		 newMap.putAll(tmap1);

		 // printing all entries for TreeMap
		 System.out.println("=============All entries TreeMap=============");
		 for (Map.Entry<Integer, String> entry : newMap.entrySet())
		 System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		 }
}
