import java.util.*;
class Main{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		int target = 70;
		int beg = 0;
		int end = arr.length-1;
		int flag = 0;
		while(beg <= end){
			int mid = (beg+end)/2;
			if(arr[mid] == target){
				flag = 1 ;
				System.out.println("Element is found in the array");
				break;
			}
			else if(arr[mid]> target){
				
				end = mid-1;	
			}
			else{
				beg = mid+1;
			}
		}
		if(flag == 0){
			System.out.println("Element is not found");
		}
	}
}
		