package com.oasisbusiness;

public class LottoBuy {

	public int buy (int money) {
		return money/1000;
	}
	
	public int[][] createLotto(int numOfLotto) {
		return new int[numOfLotto][6];
	}
	
}
