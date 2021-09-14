package com.oasisbusiness;

import java.util.ArrayList;
import java.util.List;

public class LottoWinningPro {

	public List<Integer> numOfWinningGame(List<List<Integer>> lottoList, List<Integer> winningNum) {
		
		List<Integer> winningCnt = new ArrayList<Integer>();
		
		for(int i=0; i<lottoList.size(); i++) {
			winningCnt.add(numOfWinningPerOne(lottoList.get(i), winningNum));
		}
		
		return winningCnt;
	}
	
	public int numOfWinningPerOne(List<Integer> lotto, List<Integer> winningNum) {

		int cnt = 0;
		
		for(int i=0; i<winningNum.size(); i++) {
			cnt += winningNum.contains(lotto.get(i)) ? 1 : 0;
		}
		
		return cnt;
	}
	
}
