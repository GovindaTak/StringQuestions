package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
	
	 public static boolean isAnagram(String a, String b) {
	      if (a.length() != b.length()) {
	          return false;
	      }

	      Map<Character, Integer> recordA = new HashMap<>();
	      Map<Character, Integer> recordB = new HashMap<>();
	      populateRecord(recordA, a);
	      populateRecord(recordB, b);

	      return recordA.equals(recordB);
	  }

	  static void populateRecord(Map<Character, Integer> record, String s) {
	      for (char c : s.toCharArray()) {
	          record.put(c, record.getOrDefault(c, 0) + 1);
	      }
	  }

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    
		    if(isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}

}



