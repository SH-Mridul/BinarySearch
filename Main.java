package BinarySearch;

public class Main {

	public static void main(String[] args) {
		int nums[] = {10,25,32,44,67,88};
		System.out.println(binarySearch(nums,88));
	}

	
	public static int binarySearch(int nums[],int target)
	{
		int start = 0,end = nums.length - 1;
		
		while(start <= end)
		{
			//find the middle element
			//int mid = (start+end)/2 ------> this avoid for might be possible excceds the range of integer
			int mid = start+(end-start)/2;
			
			if(nums[mid] == target)
				return mid;
			else if(nums[mid]<target)
				start = mid+1;
			else
				end = mid-1;
		}
		
		
		return -1;
	}
}
