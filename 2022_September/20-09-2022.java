Link : https://practice.geeksforgeeks.org/problems/reverse-an-array/0

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static void rev(int arr[], int l, int h)
    {
        if(l>=h)
        {return;}
        
        //swap
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
        
        rev(arr, l+1, h-1);
    }
    
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int size = sc.nextInt();
	 int arr[] = new int[size];
	 
	 for(int i =0; i<size; i++)
	 {
	     arr[i] = sc.nextInt();
	 }
	 
	 rev(arr, 0, size-1);
	 
	 for(int i =0; i<size; i++)
	 {
	     System.out.print(arr[i]+" ");
	 }
	 
	 }
}
