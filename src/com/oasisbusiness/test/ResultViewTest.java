package com.oasisbusiness.test;

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
		rv.result();
	}

}
