//https://practice.geeksforgeeks.org/problems/reverse-an-array/0
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int i;
		    for(i=0;i<=n-1;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int start=0, end=n-1, temp;
		    while(start<end)
		    {
		        temp=a[start];
		        a[start]=a[end];
		        a[end]=temp;
		        start++;
		        end--;
		    }
		    for(i=0;i<=n-1;i++)
		    {
		        System.out.print(a[i]+" ");
		    }
		    System.out.println();
		}
	}
}