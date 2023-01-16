package com.alex.buy3c;


import java.util.Arrays;
import java.util.Comparator;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "Justiin", "Caterpiller", "Bush" };
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String name1, String name2) {
				// TODO Auto-generated method stub
				return name1.length() - name2.length();
			}

		});

	}
}
