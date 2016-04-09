package 剑指offer;

public class Reverse_Words {
    public String ReverseSentence(String str) {
     if(str.trim().equals(""))  return str;
    StringBuilder res = new StringBuilder();
//     if(str==null)  return str;
//     if(str.equals(" "))  return str;
     String[]  strs = str.split(" ");
     int len = strs.length;
     if(len==1)  return str;
     for(int i=0;i<len;i++){
    	 res.append(strs[len-1-i]); 
    	 if(i!=len-1) res.append(" ");
     }
     return res.toString();
    }
    
    
//    public static void main(String[] args){
//    	String s = "  ";
//    	
//    }
}
