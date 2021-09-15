package com.oasisbusiness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InputView {

	public final String inputMoneyTxt = "구입금액을 입력해 주세요.";
	public final String buyLottoTxt = "%d개를 구매했습니다.\n";
	public final String winningNumTxt = "지난 주 당첨 번호를 입력해 주세요.";

	Scanner scan = new Scanner(System.in);

	public int buyLotto() {
		System.out.println(inputMoneyTxt);
		int numOfLotto = scan.nextInt() / 1000;
		System.out.printf(buyLottoTxt, numOfLotto);
		return numOfLotto;
	}

	public List<Integer> inputWinningNum() {
		List<Integer> winningNum = new ArrayList<Integer>();
		String winningNumStr = "";
		System.out.println(winningNumTxt);
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
