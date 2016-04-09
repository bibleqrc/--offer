package 剑指offer;

import java.util.HashMap;

public class Count_number_in_array {
	public int GetNumberOfK(int [] array , int k) {
	      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); 
	      if(array==null||array.length==0)  return 0;
	      for(int i=0;i<array.length;i++){
	    	  if(!map.containsKey(array[i])){
	    		  map.put(array[i], 1);
	    	  }else{
	    		  map.put(array[i], map.get(array[i])+1);
	    	  }
	      }
	      if(map.containsKey(k))   return map.get(k);
	      else return 0;
    }
}
