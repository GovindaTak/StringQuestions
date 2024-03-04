package main;

import java.util.Scanner;

public class ReverseWords {
	
	public static String reverseWords(String s)
	{
		StringBuilder sb=new StringBuilder();
		String[] arr=s.trim().split("\\s+");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			sb.append(arr[i]).append(" ");
		}
		return sb.toString().trim();
	}

	  public static String reverseWords1(String s) {
	        // Split the string into words
	        String[] words = s.trim().split("\\s+");
	        
	        // Reverse the order of words
	        StringBuilder reversed = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversed.append(words[i]).append(" ");
	        }
	        
	        // Remove the trailing space and return the reversed string
	        return reversed.toString().trim();
	    }
	  


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter a string :- ");
			System.out.println(ReverseWords.reverseWords(sc.nextLine()));
		}
	}

}
