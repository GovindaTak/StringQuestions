package main;

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


//} Driver Code Ends
//User function template for JAVA

class Solution
{
  //Function to find the minimum indexed character.
  public static int minIndexChar(String str, String patt)
  {
     // List<Integer>indexs=new ArrayList<>();
      for(char c:str.toCharArray())
      {
          if(patt.indexOf(c)!=-1)
          return str.indexOf(c);
      }
    //  Collections.sort(indexs);
  return -1;
  }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    System.out.println(res);
		}
	}
}

//} Driver Code Ends