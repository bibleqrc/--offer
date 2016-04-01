package 剑指offer;

public class Jishu__Before__Odd {
	
	//奇偶数相对位置改变
//  public void reOrderArray(int [] array) {
//        if(array==null|array.length==0)  return;
//        int end = array.length-1;
//        int begin = 0;
//        
//        while(begin<end){
//        	while(begin<end&&(array[begin]&0x1)!=0){
//        		begin++;
//        	}
//        	
//        	while(begin<end&&(array[end]&0x1)==0){
//        		end--;
//        	}
//        	
//        	if(begin<end){
//        		int temp = array[begin];
//        		array[begin] = array[end];
//        		array[end] = temp;
//        		
//        	}
//        }
//    }
	
	public static void reOrderArray(int [] array) {
		if(array==null||array.length==0)  return;
		
		int len = array.length;
		int odd[] = new int[len];
		int odd_number = 0;
		int even[] = new int[len];
		int even_number = 0;
		
		for(int i=0;i<len;i++){
			if((array[i]&0x1)!=0){
				odd[odd_number] = array[i];
				odd_number++;
			}
			
			if((array[i]&0x1)==0){
				even[even_number] = array[i];
				even_number++;
			}
			
		}
		
		int k = 0;
		for(int i=0;i<odd_number;i++){
			array[k] = odd[i];
			k++;
		}
		
		for(int i=0;i<even_number;i++){
			array[k] = even[i];
			k++;
		}
		
	}

	 
	public static void main(String[] args){
		int array[] ={1,2,3,4,5,6,7};
		reOrderArray(array);
	}
}
