package com.revature.Launchers;

public class StringLauncher {
	public static void main(String[] args) {
		String s = "hello";
		String s2 = "hello";
		String s3 = "hello world";
		String s4 = s3.substring(0,5);
		
		System.out.println(s);
		System.out.println(s4);
		
		System.out.println(s.equals(s4));
		
		StringBuilder sb = new StringBuilder("hello");
		sb.append(" world");
		System.out.println(sb);
		System.out.println(sb.toString().equals(s3));
	}
}
