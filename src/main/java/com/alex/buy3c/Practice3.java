package com.alex.buy3c;

import java.util.Arrays;
import java.util.Comparator;

public class Practice3 {

	public static void main(String[] args) {
		Comparator<String> byLenght = (name1,name2)-> name1.length() - name2.length();

		
		
		String[] names = { "Justiin", "Caterpiller", "Bush" };
		Arrays.sort(names, byLenght);
		System.out.println(Arrays.toString(names));
	}

}
