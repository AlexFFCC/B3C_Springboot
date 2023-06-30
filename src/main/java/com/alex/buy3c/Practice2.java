package com.alex.buy3c;

import java.util.Arrays;
import java.util.Comparator;

public class Practice2 {
	public static void main(String[] args) {
		
		Comparator<String> byLenght = new Comparator<String>() {

			@Override
			public int compare(String name1, String name2) {
				// TODO Auto-generated method stub
				return name1.length() - name2.length();
			}
			
		};
		String[] t = { "Justiin", "Caterpiller", "Bush" };
		
		String[] names = { "Justiin", "Caterpiller", "Bush" };
		Arrays.sort(names, byLenght);
		
	}
	
		
	
}
