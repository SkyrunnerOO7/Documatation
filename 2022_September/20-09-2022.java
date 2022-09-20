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



//By using only single index
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static void rev(int arr[], int i, int n)
    {
        if(i>=n/2)
        {return;}
        
        //swap
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        
        rev(arr, i+1, n);
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
	 
	 rev(arr, 0, size);
	 
	 for(int i =0; i<size; i++)
	 {
	     System.out.print(arr[i]+" ");
	 }
	 
	 }
}
===========================================================================================================================================================
Q2 
Link: https://practice.geeksforgeeks.org/problems/palindrome-string0817/1

class Solution {
    
    int b = 1;
    
    void pal(String s, int i, int n)
    {
        if(i >= n/2){return;}
        if(s.charAt(i) != s.charAt(n-i-1))
        {
            b = 0;
            return;
        }
        
        pal(s, i+1, n);
    }
    int isPalindrome(String S) {
        // code here
        
        pal(S, 0, S.length()-1);
        return b;
    }
};
