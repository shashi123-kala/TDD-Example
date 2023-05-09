package com.example.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest {
	
	private FizzBuz fizzBuz;
	@Before
	public void setup() {
		 fizzBuz = new FizzBuz();
	}
	@Test
	public void testNumber() {		
		int number = 1;
		String numberReurned = fizzBuz.play(number);
		Assert.assertEquals("1",numberReurned );
	}
	
	@Test
	public void testFizz() {
		int number = 3;
		String numberReturned = fizzBuz.play(number);
		Assert.assertEquals("Fizz",numberReturned );
	}
	
	@Test
	public void testFizzDividedBy3() {
		int number = 6;
		String numberReturned = fizzBuz.play(number);
		Assert.assertEquals("Fizz",numberReturned );
	}
	
	@Test
	public void testBuzz() {
		int number = 5;
		String numberReturned = fizzBuz.play(number);
		Assert.assertEquals("Buzz",numberReturned );
	}
	
	@Test
	public void testDivisbleBy5() {
		int number = 10;
		String numberReturned = fizzBuz.play(number);
		Assert.assertEquals("Buzz",numberReturned );
	}	

}
