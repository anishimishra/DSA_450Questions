//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/0
//https://www.youtube.com/watch?v=BOt1DAvR0zI
//https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/


//by partition process of quick sort or dutch national flag problem
class countzot { 
	public static void sort012(int a[], int n){
    		// code here 
    		int low=0, high=n-1, mid=0,i;
    		int temp;
    		while(mid<=high)
    		{
        		switch(a[mid])
        		{
            			case 0:
                			temp=a[mid];
                			a[mid]=a[low];
                			a[low]=temp;
                			mid++; low++;
                			break;
            			case 1:
                			mid++;
                			break;
            			case 2:
                			temp=a[high];
                			a[high]=a[mid];
                			a[mid]=temp;
                			high--;
                			break;
        		}
    		}
	}
	static void printArray(int arr[], int arr_size) 
    	{ 
        	int i; 
        	for (i = 0; i < arr_size; i++) 
            		System.out.print(arr[i] + " "); 
        	System.out.println(""); 
    	} 
	public static void main(String[] args) 
    	{ 
        	int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
        	int arr_size = arr.length; 
        	sort012(arr, arr_size); 
        	System.out.println("Array after seggregation "); 
        	printArray(arr, arr_size); 
    	} 
}

//another approach is:COUNTING THE NUMBER OF 0's,1's,2's

class GFG { 
    // Utility function to print the contents of an array 
    static void printArr(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
      
    // Function to sort the array of 0s, 1s and 2s 
    static void sortArr(int arr[], int n) 
    { 
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0; 
      
        // Count the number of 0s, 1s and 2s in the array 
        for (i = 0; i < n; i++) { 
            switch (arr[i]) { 
            case 0: 
                cnt0++; 
                break; 
            case 1: 
                cnt1++; 
                break; 
            case 2: 
                cnt2++; 
                break; 
            } 
        } 
      
        // Update the array 
        i = 0; 
      
        // Store all the 0s in the beginning 
        while (cnt0 > 0) { 
            arr[i++] = 0; 
            cnt0--; 
        } 
      
        // Then all the 1s 
        while (cnt1 > 0) { 
            arr[i++] = 1; 
            cnt1--; 
        } 
      
        // Finally all the 2s 
        while (cnt2 > 0) { 
            arr[i++] = 2; 
            cnt2--; 
        } 
      
        // Print the sorted array 
        printArr(arr, n); 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
        int n = arr.length; 
        sortArr(arr, n); 
    } 
} 
