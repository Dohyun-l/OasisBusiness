package com.oasisbusiness.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.oasisbusiness.LottoWinningPro;

class LottoWinningProTest {

	private LottoWinningPro lotto;
	
	@BeforeEach
	void setUp() throws Exception {
		lotto = new LottoWinningPro();
	}

	@Test
	void testNumOfWinningPerOne_return_1() {
		List<Integer> myLotto = new ArrayList<Integer>(Arrays.asList(8, 21, 23, 41, 42, 43));
		List<Integer> WinningNum = new ArrayList<Integer>(Arrays.asList(1, 21, 3, 4, 5, 6));
		assertEquals(1, lotto.numOfWinningPerOne(myLotto, WinningNum));
	}
	
	@Test
	void testNumOfWinningPerOne_return_3() {
		List<Integer> myLotto = new ArrayList<Integer>(Arrays.asList(8, 21, 23, 41, 42, 43));
		List<Integer> WinningNum = new ArrayList<Integer>(Arrays.asList(1, 17, 21, 23, 41, 45));
		assertEquals(3, lotto.numOfWinningPerOne(myLotto, WinningNum));
	}
	
	@Test
	void testNumOfWinningPerOne_return_6() {
		List<Integer> myLotto = new ArrayList<Integer>(Arrays.asList(8, 21, 23, 41, 42, 43));
		List<Integer> WinningNum = new ArrayList<Integer>(Arrays.asList(8, 21, 23, 41, 42, 43));
		assertEquals(6, lotto.numOfWinningPerOne(myLotto, WinningNum));
	}

	@Test
	void testNumOfWinningGame() {
		List<List<Integer>> myLotto = new ArrayList<List<Integer>>(Arrays.asList(Arrays.asList(1, 21, 3, 4, 5, 6),Arrays.asList(1, 17, 21, 23, 41, 45),Arrays.asList(8, 21, 23, 41, 42, 43)));
		List<Integer> WinningNum = new ArrayList<Integer>(Arrays.asList(8, 21, 23, 41, 42, 43));
		List<Integer> answer = new ArrayList<Integer>(Arrays.asList(1, 3, 6));
		assertEquals(answer, lotto.numOfWinningGame(myLotto, WinningNum));
	}

}
