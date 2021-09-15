package com.oasisbusiness.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.oasisbusiness.InputView;

class InputViewTest {

	private InputView iv;
	
	@BeforeEach
	void setUp() throws Exception {
		iv = new InputView();
	}

	@Test
	void testBuyLotto() {
		iv.buyLotto();
	}
	
	@Test
	void testInputWinningNum() {
		System.out.println(iv.inputWinningNum());
	}

}
