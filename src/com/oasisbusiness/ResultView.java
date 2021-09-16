package com.oasisbusiness;

import java.util.Collections;
import java.util.List;

public class ResultView {
	
	public final String RESULT_VIEW_TXT = "\n당첨 통계\n----------------";
	public final String RESULT_RANK_TXT = "%d개 일치 (%d원) - %d개\n";
	public final String RESULT_PROFIT_TXT = "총 수익률은 %f입니다.";

	public final int[] LOTTO_NUM_OF_MATCHES = {3, 4, 5, 6};
	public final int[] LOTTO_PRICE = {5000, 50000, 1500000, 2000000000};
	
	public void result(List<Integer> winningCntList) {
		System.out.println(RESULT_VIEW_TXT);
		for (int i=0; i<LOTTO_NUM_OF_MATCHES.length; i++) {
			System.out.printf(RESULT_RANK_TXT, LOTTO_NUM_OF_MATCHES[i], LOTTO_PRICE[i], Collections.frequency(winningCntList, LOTTO_NUM_OF_MATCHES[i]));
		}
		System.out.printf(RESULT_PROFIT_TXT, profit(winningCntList));
	}
	
	public double profit(List<Integer> winningCntList) {

		double sumOfPrice = 0;
		for (int i=0; i<LOTTO_NUM_OF_MATCHES.length; i++) {
			sumOfPrice += Collections.frequency(winningCntList, LOTTO_NUM_OF_MATCHES[i]) * LOTTO_PRICE[i];
		}
		
		return sumOfPrice / (winningCntList.size() * 1000);
	}

}
