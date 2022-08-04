package week3.day1;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums= {8,6,5,7,9,1,3};
        int length= nums.length;
        Arrays.sort(nums);
        System.out.println("Sorted Array");
        for(int i=0; i<nums.length; i++) {
        System.out.println(nums[i]);
        }
        System.out.println("Minimum value"+nums[0]);
        System.out.println("Maximum value"+nums[length-1]);
	}
}