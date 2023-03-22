/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
public static void main (String[] args) 
{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++)
		{
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    
		    for(int j=0; j<n; j++)
		    {
		    arr[j] = sc.nextInt();
		    }
		
		    HashMap<Integer, Integer> map = new HashMap<>();
		    for(int a : arr)
		    {
		    map.put(a, map.getOrDefault(a,0)+1);
		    }
		    
		    List<Integer> list = new ArrayList<>(map.keySet());
		    Collections.sort(list,(a, b) -> (map.get(b) - map.get(a)) );
		    for(int a: list)
		    {
		        for(int k=0; k<map.get(a); k++)
		        {
		            System.out.print(a + " ");
		        }
		    }
		    System.out.println();
		}
	}
}