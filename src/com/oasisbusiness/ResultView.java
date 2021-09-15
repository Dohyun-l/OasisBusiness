package com.oasisbusiness;

public class ResultView {
	
	public final String RESULT_VIEW_TXT = "당첨 통계\n----------------";
	public final String RESULT_RANK_TXT = "%d개 일치 (%d원) - %d개";
	public final String RESULT_PROFIT_TXT = "총 수익률은 %f입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)";
	
	public void result() {
		System.out.println(RESULT_VIEW_TXT);
	}

}
