package 剑指offer;

import java.util.LinkedHashMap;

public class First_CharAppearOnce {
	  public int FirstNotRepeatingChar(String str) {
	        if(str==null||str.length()==0)  return -1;
	        LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
	        int len = str.length();
	        for(int i=0;i<len;i++){
	        	if(!map.containsKey(str.charAt(i))){
	        		map.put(str.charAt(i), i);
	        	}else{
	        		map.remove(str.charAt(i));
	        	}
	        }
	        
	        if(map.size()!=0) return (int) map.values().toArray()[0];
	        else return -1;
	        
	    }
}
