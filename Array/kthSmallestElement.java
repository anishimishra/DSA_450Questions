//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
import java.io.*;
import java.util.*;
class gfg 
{
  	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			int k=sc.nextInt();
			System.out.println(kthSmallest(a,0,n-1,k);
		}
	}
	public static int kthSmallest(int[] arr, int l, int r, int k) 
	{ 
    		//Your code here
    		for(int i=0;i<=r;i++)  
    		{  
        		for (int j=0;j<=r;j++)  
        		{  
            			if(arr[i]<arr[j])  
            			{  
                			int temp = arr[i];  
                			arr[i]=arr[j];  
                			arr[j] = temp;   
            			}  
        		}  
    		}
    		return (arr[k-1]);
	}
}

//OPTIMIZED SOLUTION: 
//USE QUICK SELECT

//idea of quick sort is that the element is in its sorted position if all the elements on the left side should
//be smaller than that element and all the elements on the right side should be greater than that element then
//that element is in sorted position
//quick sort follows divide&conquer
//quick sort sorts the whole array while quick select searches for the one element, 
//they have partition algorithm in common
//https://www.geeksforgeeks.org/quickselect-algorithm/     youtube: https://www.youtube.com/watch?v=fnbImb8lo88
//https://www.geeksforgeeks.org/quick-sort/     youtube: https://www.youtube.com/watch?v=7h1s2SojIRw

import java.io.*;
import java.util.*;
class GFG 
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    
		    System.out.println(kthSmallest(arr, 0, n-1, k));
		}
	}
	
	public static int partition (int[] arr,  int low, int high) 
	{ 
        	int pivot = arr[high], pivotloc = low; 
        	for (int i = low; i <= high; i++) 
        	{ 
            		if(arr[i] < pivot) 
            		{ 
                		int temp = arr[i]; 
                		arr[i] = arr[pivotloc]; 
                		arr[pivotloc] = temp; 
                		pivotloc++; 
            		} 
        	}  
        	int temp = arr[high]; 
        	arr[high] = arr[pivotloc]; 
        	arr[pivotloc] = temp; 
          
        	return pivotloc; 
    	} 
	public static int kthSmallest(int[] arr, int l, int r, int k) 
	{ 
		//Your code here
        	int partition = partition(arr,l,r);
        	if(partition == k-1) 
            		return arr[partition];
        	else if(partition < k ) 
            		return kthSmallest(arr, partition + 1, r, k ); 
        	else
            		return kthSmallest(arr, l, partition-1, k );
	} 
}

//more optimized:

import java.io.*;
import java.util.*;
class GFG 
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    
		    System.out.println(kthSmallest(arr, 0, n-1, k));
		}
	}
	

	public static int kthSmallest(int[] arr, int l, int r, int k) 
	{ 
    		//Your code here
      		Arrays.sort(arr); 
  
        	// Return k'th element in  
        	// the sorted array 
        	return arr[k-1]; 
	} 
}