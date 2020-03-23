package com.epam.TDDJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class STest {
	/*
	 * 1.ABCD=BCD
	 * 2.AACD=CD
	 * 3.BACD=BCD
	 * 4.BBAA=BBAA
	 * 5.AABAA=BAA
	 */
	STest1 st=new STest1();
	@Test
	void test1() {
		
		assertEquals("BCD",st.swap("ABCD"));
		
	}
	@Test
	void test2() {
		
		assertEquals("CD",st.swap("AACD"));
		
	}
	@Test
	void test3() {
		
		assertEquals("BCD",st.swap("BACD"));
		
	}
	@Test
	void test4() {
		
		assertEquals("BBAA",st.swap("BBAA"));
		
	}
	@Test
	void test5() {
		
		assertEquals("BAA",st.swap("AABAA"));
		
	}
	

}

