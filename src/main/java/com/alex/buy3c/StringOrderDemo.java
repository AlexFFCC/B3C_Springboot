package com.alex.buy3c;

import java.util.Arrays;

public class StringOrderDemo {

	public static void main(String[] args) {
		String[] names = { "Justiin", "Caterpiller", "Bush" };
		Arrays.sort(names,StringOrder::byLength);//方法參考
		System.out.println(Arrays.toString(names));

	}

}
