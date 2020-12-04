package String;

import java.util.ArrayList;

public class Program_13_ArrayList_suom_vai {

	public static void main ( String []args) {
		
		
		
		int a [] = new int [4];
		
		a[0] =10;
		a[1] =20;
		a[2] =30;
		a[3] =40;
		
		
	System.out.println(" Number of Array is :" + a.length);
		
		for ( int i = 0;i< a.length;i++) {
		System.out.println(a[i]);
		}
		ArrayList <Integer> al = new ArrayList <Integer>();
		
		al.add(50);
		al.add(100);
		al.add(200);
		
		System.out.println(al);
	}
}
