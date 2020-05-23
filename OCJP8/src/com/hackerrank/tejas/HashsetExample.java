package com.hackerrank.tejas;

import java.util.HashSet;
import java.util.Scanner;

public class HashsetExample {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> setone = new HashSet<String>();

         for(int j=0;j<t;j++)
         {
             setone.add(pair_right[j]+"|"+pair_left[j]);
             System.out.println("count of set is "+setone.size());
         }
	}

}
