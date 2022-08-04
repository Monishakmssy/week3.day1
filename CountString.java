package week3.day1;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input="TestLeaf";
        int count=0;
        char[] CharArray=input.toCharArray();
        for(int i=0; i<CharArray.length; i++) {
        if(CharArray[i]=='e')
        count++;
}
        System.out.println("The count of 'e' is"+ count);
}
}