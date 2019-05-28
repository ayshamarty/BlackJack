package com.bae.blackjack.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bae.blackjack.main.BlackJack;

public class unitTests {
	
	static BlackJack blackjack;
	@BeforeClass
	public static void setup() {
		blackjack = new BlackJack();
	}
	@Test
	public void test1() {
		assertEquals(-1,blackjack.play(0, 0));
	}
	@Test
	public void test2() {
		assertEquals(-1,blackjack.play(0, 21));		
	}
	@Test
	public void test3() {
		assertEquals(-1,blackjack.play(21, 0));		
	}
	@Test
	public void test4() {
		assertEquals(10,blackjack.play(10, 10));		
	}
	@Test
	public void test5() {
		assertEquals(21,blackjack.play(30, 21));		
	}
	@Test
	//our valid range is 3 - 30 (minimum and maximum score range)
	//dealer must twist is score < 16
	public void test6() {
		assertEquals(-1,blackjack.play(31, 22));		
	}
	@Test
	public void test7() {
		assertEquals(0,blackjack.play(30, 22));		
	}
	@Test
	public void test01() {
		System.out.println(100);
		int a  = blackjack.twist();
		assertEquals(10 + a, blackjack.play(25, 10 + a));		
	}
	@Test
	public void test02() {
		System.out.println(200);
		assertEquals(10,blackjack.play(10, 25));		
	}
	@Test
	public void test03() {
		System.out.println(300);
		assertEquals(0,blackjack.play(25, 25));		
	}
	@Test
	public void test04() {
		System.out.println(400);
		assertEquals(21,blackjack.play(10, 21));		
	}
	@Test
	public void test05() {
		System.out.println(500);
		assertEquals(21,blackjack.play(21, 10));		
	}
	@Test
	public void test06() {
		System.out.println(600);
		assertEquals(-1,blackjack.play(31, 31));		
	}
	@Test
	public void test07() {
		System.out.println(700);
		assertEquals(-1,blackjack.play(1, 1));		
	}
	@Test
	public void test08() {
		System.out.println(800);
		assertEquals(-1,blackjack.play(10, 31));		
	}
	@Test
	public void test09() {
		System.out.println(900);
		assertEquals(-1,blackjack.play(31, 10));		
	}
	@Test
	public void test10() {
		System.out.println(1000);
		assertEquals(-1,blackjack.play(31, 10));		
	}
	@Test
	public void test11() {
		System.out.println(1100);
		int a  = blackjack.twist();
		assertEquals(10 + a ,blackjack.play(30, 10 + a));		
	}
	@Test
	public void test12() {
		System.out.println(1200);
		assertEquals(-1,blackjack.play(1, 10));		
	}
	@Test
	public void test13() {
		System.out.println(1300);
		assertEquals(10,blackjack.play(4, 10));		
	}
	@Test
	public void test14Twist() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			testList.add(blackjack.twist());
		} for (int a : testList) {
			if(a > 1 && a < 12) {
				continue;
			} else {
				fail("Expected value between 1 & 11 but got " + a);
			}
		
		}
	}
}
