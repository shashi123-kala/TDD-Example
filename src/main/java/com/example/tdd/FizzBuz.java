package com.example.tdd;

public class FizzBuz {

	public String play(int number) {
		
		if(number % 3 ==0 ) 
			return "Fizz";		
		if(number % 5 == 0 ) 
			return "Buzz";
		
			return String.valueOf(number);
	}
}
