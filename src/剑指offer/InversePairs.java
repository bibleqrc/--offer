package 剑指offer;

public class InversePairs {
  public int InversePairs(int [] array) {
       if(array==null||array.length==0)  return 0;
       
       int copy[] = new int[array.length];
       for(int i=0;i<array.length;i++){
           copy[i] = array[i];
       }
       
       int count = InversePairsCore(array,copy,0,array.length-1);
       
       return count;
    }

    private int InversePairsCore(int[] array, int[] copy, int start, int end) {
	   if(start==end) {
		   copy[start] = array[start];
		   return 0;
	   }
	   
	   int len = (end-start)/2;
	   
	   int left  = InversePairsCore(copy,array,start,start+len);
	   int right  = InversePairsCore(copy,array,start+len+1,end);
	   
	   //i初始化为前半段最后一个数字的下标
	   int i = start+len;
	   //j初始化为后半段最后一个数字的下标
	   int j = end;
	   int indexCopy = end;
	   int count  = 0;
	   while(i>=start && j>=start+len+1){
		   if(array[i]>array[j]){
			   copy[indexCopy--] = array[i--];
			   count+=j-start-len;
		   }else{
			   copy[indexCopy--]=array[j--];
		   }
	   }
	   for(;i>=start;--i){
		   copy[indexCopy--]=array[i];
	   }
	   for(;j>=start+len+1;--j){
		   copy[indexCopy--]=array[j];
	   }
	   
	   return left+right+count;
}
}
