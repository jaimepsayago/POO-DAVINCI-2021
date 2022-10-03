package pruebapeaku;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

@SuppressWarnings("unchecked")
public class Ejercicio2 {

	public static void main(String[] args) {
		 //[6, 2, 3, 8]
				 int [] a =  {6, 2, 3, 8};
				 System.out.println(makeArrayConsecutive2(a));
	}
	
	public static int makeArrayConsecutive2(int[] statues){
	    int[] m = new int[2];
	    m = minNum(statues);
	    int large = m[1] - m[0] + 1;
	    return large - statues.length;
	}

	public static int[] minNum(int[] array) {
	    int[] m = new int[2];
	    m[0] = array[0];
	    m[1] = array[0];
	    for(int i= 1; i < array.length; i++) {
	        if(m[0] > array[i])
	            m[0] = array[i];
	        if(m[1] < array[i])
	            m[1] = array[i];
	    }
	    return m;
	}
	
	
	boolean checkPalindrome(String inputString) {
		
	    int i = inputString.length()-1;
	    int j = 0;
	    while(i!=j && j<i) 
	    {
	        if(inputString.charAt(j++) != inputString.charAt(i--))
	            return true;

	            
	    }
	    return false;
	    
	}
	
	/**
	 * @param dishes
	 * @return
	 
	List groupDishes(String[][] dishes) {
	    Map<String,Set> store = new TreeMap<>();
	    List grouped = new ArrayList();
	    for(String[] dish: dishes) {
	        for(int i = 1; i< dish.length;i++) {
	            //Create a map for ingredient at first
	            if(!store.containsKey(dish[i])) store.put(dish[i], new TreeSet());
	            
	            Set dishSet = store.get(dish[i]);
	           // dishSet.add(dish[]);
	        }
	    }
	    
	    for(Map.Entry<String, Set> entrySet: store.entrySet()) {
	        System.out.println(entrySet.getKey() + " -> " + entrySet.getValue());
	        if(entrySet.getValue().size() > 1) {
	            List l = new ArrayList();
	            l.add(entrySet.getKey());
	            for(Object o: entrySet.getValue()) l.add(o);
	            grouped.add(l);
	        }
	    }
	    return grouped;
	}
*/
}
