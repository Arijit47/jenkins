package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.math.Maths;

public class TestMaths {
private static Maths math;
	
	@BeforeAll
	public static void init() {
		math = new Maths();
	}
	
	@Test
	public void testAdd() {
		assertEquals(30, math.add(10, 20));
	}
	
	@Test
	public void testSubs() {
		assertEquals(10, math.subs(20, 10));
	}
	
	@Test
	public void testDiv() {
		assertEquals(5, math.div(50, 10));
	}
	
	@Test
	public void negativeDiv() {
		assertThrows(ArithmeticException.class, () -> math.div(2, 0));
	}
	
	@Test
	public void testSquare() {
		assertEquals(4, math.square(2));
	}
}
