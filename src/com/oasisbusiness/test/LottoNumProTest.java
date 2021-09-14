package com.oasisbusiness.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.oasisbusiness.LottoNumPro;

class LottoNumProTest {

	private LottoNumPro lnp;
	
	@BeforeEach
	void setUp() throws Exception {
		lnp = new LottoNumPro();
	}

	@Test
	void check_min_max_std_lotto_array() {
		for(int i=0; i<45; i++) {
			assertTrue(lnp.stdLottoArray().get(i) >= 1 && lnp.stdLottoArray().get(i) <= 45);
		}
	}
	
	@Test
	void check_min_max_new_create() {
		for(int i=0; i<6; i++) {
			assertTrue(lnp.createNewLottoNum()[i] >= 1 && lnp.createNewLottoNum()[i] <= 45);
		}
	}
	
	@Test
	void buy_3_return_3_lotto_list() {
		assertEquals(3, lnp.buyLotto(3).length);
	}

	@Test
	void buy_5_return_5_lotto_list() {
		assertEquals(5, lnp.buyLotto(5).length);
	}
	
	@Test
	void new_create_lotto_overlap() {
		int[][] lottoList = {{1, 2, 3, 4, 5, 6},{1, 2, 3, 4, 5, 7}};
		int[] newLotto = {1, 2, 3, 4, 5, 8};
		assertTrue(lnp.overlap(lottoList, newLotto));
	}
	
}
