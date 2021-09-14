package com.oasisbusiness.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.oasisbusiness.LottoCreateNumPro;

class LottoCreateNumProTest {

	private LottoCreateNumPro lnp;
	
	@BeforeEach
	void setUp() throws Exception {
		lnp = new LottoCreateNumPro();
	}

	@Test
	void check_min_max_std_lotto_array() {
		for(int i=0; i<45; i++) {
			assertTrue(lnp.stdLottoArray().get(i) >= 1 && lnp.stdLottoArray().get(i) <= 45);
		}
	}
	
	@Test
	void check_min_max_new_create() {
		List<Integer> newLotto = lnp.createNewLottoNum();
		for(int i=0; i<6; i++) {
			assertTrue(newLotto.get(i) >= 1 && newLotto.get(i) <= 45);
		}
	}
	
	@Test
	void buy_3_return_3_lotto_list() {
		assertEquals(3, lnp.buyLotto(3).size());
	}

	@Test
	void buy_5_return_5_lotto_list() {
		assertEquals(5, lnp.buyLotto(5).size());
	}
	
	@Test
	void new_create_lotto_overlap_return_true() {
		List<List<Integer>> lottoList 
			= new ArrayList<List<Integer>>(Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6),Arrays.asList(1, 2, 3, 4, 5, 7)));
		List<Integer> newLotto = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));  
		assertTrue(lnp.overlap(lottoList, newLotto));
	}
	
	@Test
	void new_create_lotto_unoverlap_return_false() {
		List<List<Integer>> lottoList 
			= new ArrayList<List<Integer>>(Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6),Arrays.asList(1, 2, 3, 4, 5, 7)));
		List<Integer> newLotto = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 8));  
		assertFalse(lnp.overlap(lottoList, newLotto));
	}
	
}
