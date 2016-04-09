package 剑指offer;

import java.util.ArrayList;
import java.util.HashMap;

public class First_unrepteated_char_in_charStream {
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	ArrayList<Character> list = new ArrayList<Character>();
	
	//Insert one char from stringstream
    public void Insert(char ch)
    {
       if(map.containsKey(ch)){
    	   map.put(ch, -1);
       }else{
    	   map.put(ch, 1);
    	   list.add(ch);
       }
       
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {  char c = '#';
       for(char ch:list){
    	   if(map.get(ch)==1){
    		   c = ch;
    		   break;
    	   }
       }
       return c;
    }
}
