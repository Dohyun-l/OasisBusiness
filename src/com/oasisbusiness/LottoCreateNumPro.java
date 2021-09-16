package com.oasisbusiness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoCreateNumPro {
	
	private final int MINNUM = 1;
	private final int MAXNUM = 45; 

	public List<Integer> stdLottoArray() {

		List<Integer> lottoArray = new ArrayList<Integer>();
		for (int i = MINNUM; i <= MAXNUM; i++) {
			lottoArray.add(i);
		}

		return lottoArray;
	}

	public List<Integer> createNewLottoNum() {

		List<Integer> lottoNum = new ArrayList<Integer>();
		
		List<Integer> lottoNumArray = stdLottoArray();

		Collections.shuffle(lottoNumArray);
		
		for (int i = 0; i < 6; i++) {
			lottoNum.add(lottoNumArray.get(i));
		}

		Collections.sort(lottoNum);
		
		return lottoNum;
	}
	
	public List<List<Integer>> buyLotto(int buyCnt) {
		
		List<List<Integer>> lottoList = new ArrayList<List<Integer>>();
		for(int i=0; i<buyCnt; i++) {
			lottoList.add(createNewLottoNum());
		}
		
		return lottoList;
	}
	
}
