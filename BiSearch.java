class BinarySearch { 
	int binarySearch(int arr[], int l, int r, int x) 
	{ 
		if (r >= l) { 
			int mid = l + (r - l) / 2; 
			if (arr[mid] == x) 
				return mid; 
			if (arr[mid] > x) 
				return binarySearch(arr, l, mid - 1, x);  
			return binarySearch(arr, mid + 1, r, x); 
		}  
		return -1; 
	} 

	public static void main(String args[]) 
	{ 
		BinarySearch z = new BinarySearch(); 
		int arr[] = { 1, 3, 9, 10, 15 }; 
		int n = arr.length; 
		int x = 10; 
		int res = z.binarySearch(arr, 0, n - 1, x); 
		if (res == -1) 
			System.out.println("Element not find"); 
		else
			System.out.println("Element found at index " + res); 
	} 
} 

