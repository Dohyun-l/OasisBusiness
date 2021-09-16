package com.oasisbusiness.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.oasisbusiness.ResultView;

class ResultViewTest {

	private ResultView rv;
	
	@BeforeEach
	void setUp() throws Exception {
		rv = new ResultView();
	}

	@Test
	void testResult() {
		List<Integer> winningCntList = new ArrayList<Integer>(Arrays.asList(1, 3, 6));
		rv.result(winningCntList);
	}
	
	@Test
	void testProfit() {
		List<Integer> winningCntList = new ArrayList<Integer>(Arrays.asList(1, 3, 3, 4, 5));
		rv.profit(winningCntList);
	}

}
