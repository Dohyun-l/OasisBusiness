package com.oasisbusiness;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LottoNumPro {
	
	private final int MINNUM = 1;
	private final int MAXNUM = 45; 

	public List<Integer> stdLottoArray() {

		List<Integer> lottoArray = new ArrayList<Integer>();
		for (int i = MINNUM; i <= MAXNUM; i++) {
			lottoArray.add(i);
		}

		return lottoArray;
	}

	public int[] createNewLottoNum() {

		int[] lottoNum = new int[6];
		
		List<Integer> lottoNumArray = stdLottoArray();

		Collections.shuffle(lottoNumArray);
		
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = lottoNumArray.get(i);
		}

		Arrays.sort(lottoNum);
		
		return lottoNum;
	}
	
	public int[][] buyLotto(int buyCnt) {
		
		int[][] lottoList = new int[buyCnt][6];
		for(int i=0; i<buyCnt; i++) {
			lottoList[i] = createNewLottoNum();
		}
		
		return lottoList;
	}

	public boolean overlap(int[][] lottoList, int[] newLotto) {
		
		for(int i=0; i<lottoList.length; i++) {
			if(Arrays.toString(lottoList[i]).equals(Arrays.toString(newLotto))) {
				return false;
			}
		}
		
		return true;
	}
	
}
