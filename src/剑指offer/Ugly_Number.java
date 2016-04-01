package 剑指offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ugly_Number {
	public static int GetUglyNumber_Solution(int index) {
        if(index<=0) return 0;

        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        int nextUglyNumber = 1;
        
        int num2=0;
        int num3=0;
        int num5=0;
        while(nextUglyNumber<index){
        	
        	int min = Math.min(Math.min(list.get(num2)*2, list.get(num3)*3), list.get(num5)*5);
   
        	list.add(min);
    
        	while(list.get(num2)*2<=list.get(nextUglyNumber)){
        		num2++;
        	}
        	
        	while(list.get(num3)*3<=list.get(nextUglyNumber)){
        		num3++;
        	}
        	
        	while(list.get(num5)*5<=list.get(nextUglyNumber)){
        		num5++;
        	}
        	
        	nextUglyNumber++;
       }
        int ugly = list.get(index-1);
        return ugly;
    }
	
	public static void main(String[] args){
		System.out.println(GetUglyNumber_Solution(1));
		System.out.println(GetUglyNumber_Solution(2));
		System.out.println(GetUglyNumber_Solution(3));
		System.out.println(GetUglyNumber_Solution(4));
		System.out.println(GetUglyNumber_Solution(5));
		System.out.println(GetUglyNumber_Solution(6));
	}

}
