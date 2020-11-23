//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
//https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array/0
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while (t-- >0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int i;
		    for(i=0;i<=n-1;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    if (n==1)
		        System.out.println(a[0]+" "+a[0]);
		    else if(n==2)
		    {
		        if(a[0]<a[1])
		            System.out.println(a[0]+" "+a[1]);
		        else
		           System.out.println(a[1]+" "+a[0]);
		    }
		    else 
		    {
		        int max=a[0],min=a[0];
		        for(i=1;i<=n-1;i++)
		        {
		            if(max<a[i])
		                max=a[i];
		            if(min>a[i])
		                min=a[i];
		        }
		        System.out.println(min+" "+max);
		    }
		}
	}
}