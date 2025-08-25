package java_basics;

import java.util.Arrays;

public class Data_types {
	
	public static void main(String[] args) {
		
		
		// Primitive data type
		
		byte a = 1;
		short b = 2;
		int c = 1000;
		long d = 3534224;
		float e = 1.2f;
		double f = 10.4;
		boolean g = true;
		char h = 'j';
		
		
		// non -primitive data type
		
		//string
		String ab = new String("Abbas");
		String cd = "Virat";
		
		//Array
		
		int[] arr = {1,2,3,4,5};
		
		
		
		System.out.println("Byte: "+a);
		System.out.println("Short: "+b);
		System.out.println("Integer: "+c);
		System.out.println("long: "+d );
		System.out.println("float: "+e);
		System.out.println("double: "+f);
		System.out.println("boolean: "+g);
		System.out.println("Char: "+h);
		System.out.println("String: "+ab);
		System.out.println("arr" + Arrays.toString(arr));
		

	}

}
