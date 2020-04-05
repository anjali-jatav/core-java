package map;

import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;

/*
  remove
  get
  put
  equals
  values
  hashCode
  clear
  isEmpty
  replace
  replaceAll
  size
  entrySet
  putAll
  putIfAbsent
  forEach
  keySet
  compute
  computeIfAbsent
  computeIfPresent
  containsKey
  containsValue
  getOrDefault
  merge
  23

 */
    

public class MapExample {
	
	
	
	public static void main(String[] args) {
		
	
	String []str= {"A","B","A","C","B","A"};
	Map<Integer,String>map=new HashMap<>();
	map.put(01,"Anjali");
	map.put(02,"Mitali");
	map.put(03,"Shweta");
	String value=map.get(3);
	System.out.println(value);
	for(Map.Entry<Integer, String>e:map.entrySet()) {
		System.out.println(e.getKey()+" "+e.getValue());
		
		
	}
	
	
	
	
	
	
   
	
	}

}















