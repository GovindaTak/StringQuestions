package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommonPrefix {
	static String longestCommonPrefix(String arr[], int n){
	      // code here
	      if(n==0)return "-1";
	  StringBuilder sb=new StringBuilder();
	  String first=arr[0];
	  for(int i=0;i<first.length();i++)
	  {
	      char c=first.charAt(i);
	      for(int j=1;j<n;j++)
	      {
	          if(i>=arr[j].length()||arr[j].charAt(i)!=c)
	          { 
	              if(sb.length()==0)return "-1";
	              return sb.toString();}
	      }
	      sb.append(c);
	  }
	  return sb.toString();
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	      int t = Integer.parseInt(read.readLine());
	      while(t-- > 0)
	      {
	          int n = Integer.parseInt(read.readLine().trim());
	          String arr[] = read.readLine().trim().split(" ");

	         
	          System.out.println(longestCommonPrefix(arr, n));
	      }
	  }

	}

}
//{ Driver Code Starts
//Initial Template for Java



