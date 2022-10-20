
package com.xworks.overriding;

import java.util.Arrays;

public class ConvertNameToBytes{

	public static void main(String[] args) {

		String name="ShARaTz";
		byte[] arr= name.getBytes();
		
		System.out.println(Arrays.toString(arr));
	}

}

