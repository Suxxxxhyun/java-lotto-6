package view;

import domain.Lotto;

import java.util.List;

public class OutputView {
    private static String OUTPUT_PURCHASE_AMOUNT_MESSAGE = "개를 구매했습니다.";
    private static final String WINNING_STATISTICS_HEADER = "당첨 통계";
    private static final String SEPARATOR = "---";

    public static void printNumberOfLottosPurchased(int numberOfLottosPurchased){
        System.out.println(numberOfLottosPurchased + OUTPUT_PURCHASE_AMOUNT_MESSAGE);
    }

    public static void printLottos(List<Lotto> lottos){
        for(Lotto lotto : lottos){
            System.out.println(lotto.getNumbers());
        }
    }

    public static void printWinningStatisticsHeader() {
        System.out.println(WINNING_STATISTICS_HEADER);
        System.out.println(SEPARATOR);
    }

    public static void printWinningMessage(String winningMessage, String rateOfReturn){
        System.out.println(winningMessage);
        System.out.println(rateOfReturn);
    }
}
