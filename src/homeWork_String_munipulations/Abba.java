package homeWork_String_munipulations;

public class Abba {
        public static void main(String[] args) {

        		/*makeAbba("Hi", "Bye") → "HiByeByeHi"
        		makeAbba("Yo", "Alice") → "YoAliceAliceYo"
        		makeAbba("What", "Up") → "WhatUpUpWhat"*/
        		
        		String hi = "Hi",yo="Yo", what="What";
        		String bye = "Bye",alice = "Alice", up = "Up";
        		System.out.println(hi.concat(bye).concat(bye).concat(hi));
        		System.out.println(yo.concat(alice).concat(alice).concat(yo));
        		System.out.println(what.concat(up).concat(up).concat(what));
        	
        	

		}
}
