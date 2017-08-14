package demo;

import java.util.Arrays;

public class Quick2 {
	
	/*public static void main(String[] args) {
		int[] array = {10,5,3,1,7,2,8};
		//8.5.3.1.7.2.10
		//2.5.3.1.7.8.10
		//1.5.3.2.7.8.10
		//1.2.3.5.7.8.10
		
		//66  13  51  76  81  26  57  69  23
		//23.13.51.76.81.26.57.69.66
		//23.13.51.66.81.26.57.69.76
		//
		
		int right = array.length-1;
		int left=0;
		int emp=0;
		
		
		emp=array[left];
		while(left!=right){
			
			while(emp<array[right]){
				right --;
			}
			array[left]=array[right];
			array[right]=emp;
			
			while(emp>array[left]){
				left ++;
			}
			array[right]=array[left];
			array[left]=emp;
		}
	}
	*/
	public static int[] quick(int[] array,int left,int right){
		int emp=0;
		emp=array[left];
		while(left!=right){
			
			while(emp<array[right]){
				right --;
			}
			array[left]=array[right];
			array[right]=emp;
			
			while(emp>array[left]){
				left ++;
			}
			array[right]=array[left];
			array[left]=emp;
			if(right==0){
				
				return array;
			}
		}
		quick(array,0,right);
		return array;
	}
	
	public static void main(String[] args) {
		int[] array = {66,13,51,76,81,26,57,69,23};
		int[] quick = quick(array,0,array.length-1);
		System.out.println(Arrays.toString(quick));
	}
}
