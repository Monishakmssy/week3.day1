package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name="monisha";
        char[] CharArray=name.toCharArray();
       	for(int i=CharArray.length-1; i>=0; i--) {
       	System.out.println(CharArray[i]);	
       	}
	}
}