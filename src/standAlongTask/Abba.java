package standAlongTask;

public class Abba {
public static void main(String[] args) {
	/*makeAbba("Hi", "Bye") → "HiByeByeHi"
	makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	makeAbba("What", "Up") → "WhatUpUpWhat"*/
	
	String hi = "Hi";
	String bye = "Bye";
	System.out.println(hi.concat(bye).concat(hi).concat(bye));
	
	
}
}
