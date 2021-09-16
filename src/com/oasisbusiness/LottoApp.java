package com.oasisbusiness;

import java.util.List;

public class LottoApp {

	public static void main(String[] args) {
		
		InputView iv = new InputView();
		
		int buyEA = iv.buyLotto();
		
		List<List<Integer>> myLotto = new LottoCreateNumPro().buyLotto(buyEA);
		
		for (int i=0; i<myLotto.size(); i++) {
			System.out.println(myLotto.get(i));
		}
		
		List<Integer> winningGame =  iv.inputWinningNum();
		
		List<Integer> gameResult = new LottoWinningPro().numOfWinningGame(myLotto, winningGame);
		
		new ResultView().result(gameResult);
		
	}
	
}
