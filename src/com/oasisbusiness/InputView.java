package com.oasisbusiness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InputView {

	public final String INPUT_MONEY_TXT = "구입금액을 입력해 주세요.";
	public final String BUY_LOTTO_TXT = "%d개를 구매했습니다.\n";
	public final String WINNING_NUM_TXT = "\n지난 주 당첨 번호를 입력해 주세요.";

	Scanner scan;

	public int buyLotto() {
		scan = new Scanner(System.in);
		System.out.println(INPUT_MONEY_TXT);
		int numOfLotto = scan.nextInt() / 1000;
		System.out.printf(BUY_LOTTO_TXT, numOfLotto);
		return numOfLotto;
	}

	public List<Integer> inputWinningNum() {
		scan = new Scanner(System.in);
		List<Integer> winningNum = new ArrayList<Integer>();
		String winningNumStr = "";
		System.out.println(WINNING_NUM_TXT);
		winningNumStr = scan.nextLine();

		winningNumStr = winningNumStr.replaceAll("[^0-9]", ",");

		for (int i = 0; i < winningNumStr.split(",").length; i++) {
			winningNum.add(strCheck(winningNumStr.split(",")[i]));
		}
		
		winningNum.removeIf(n -> (n == 0));
		
		Collections.sort(winningNum);
		
		return winningNum;
	}

	public int strCheck(String s) {

		if(s == "") {
			return 0;
		}
		
		return Integer.parseInt(s);
	}
}
