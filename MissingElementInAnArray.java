package week3.day1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {1,2,3,4,7,6,8};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);   
        }
        for (int j=1; j<arr.length; j++) {
            if(j!=arr[j-1]) {
        		System.out.println(j);
        		break;
        	}
        }
	}

}