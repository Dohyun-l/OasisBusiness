package com.oasisbusiness.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.oasisbusiness.LottoBuy;

class LottoBuyTest {

	private LottoBuy lotto;

	@BeforeEach
	void setUp() throws Exception {
		lotto = new LottoBuy();
	}

	@Test
	void buy__give_10000_and_get_10() {
		assertEquals(10, lotto.buy(10000));
	}

	@Test
	void buy__give_10500_and_get_10() {
		assertEquals(10, lotto.buy(10500));
	}

	@Test
	void buy__give_20000_and_get_20() {
		assertEquals(20, lotto.buy(20000));
	}

	@Test
	void createLotto__buy_3_return_int_3_6() {
		assertArrayEquals(new int[3][6], lotto.createLotto(3));
	}
	
	@Test
	void createLotto__buy_6_return_int_6_6() {
		assertArrayEquals(new int[6][6], lotto.createLotto(6));
	}

}
