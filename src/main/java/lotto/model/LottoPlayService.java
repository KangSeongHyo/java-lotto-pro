package lotto.model;

import java.util.List;
import lotto.constant.ErrorMessage;
import lotto.vo.Lotto;
import lotto.vo.Lottos;

public class LottoPlayService {

    private static final int LOTTO_PRICE = 1000;
    private static final int LOTTO_MAX_PURCHASE_PRICE = 10_000_000;

    private final LottoGeneratorService lottoGeneratorService;

    public LottoPlayService() {
        lottoGeneratorService = new LottoGeneratorService();
    }

    public Lottos convertMoneyToLottos(int money) {
        validateMoney(money);

        int playCount = money / LOTTO_PRICE;
        return new Lottos(playCount);
    }

    private void validateMoney(int money) {
        validateLackMoney(money);
        validateOverMoney(money);
        validateUnitMoney(money);
    }

    private void validateLackMoney(int money) {
        if(money < LOTTO_PRICE){
            throw new IllegalArgumentException(ErrorMessage.LACK_MONEY);
        }
    }

    private void validateOverMoney(int money) {
        if(money >= LOTTO_MAX_PURCHASE_PRICE){
            throw new IllegalArgumentException(ErrorMessage.OVER_MONEY);
        }
    }

    private void validateUnitMoney(int money) {
        if(money % LOTTO_PRICE != 0){
            throw new IllegalArgumentException(ErrorMessage.INCORRECT_UNIT_MONEY);
        }
    }

    public Lottos playLottoByCount(int playCount) {
        Lottos lottos = new Lottos(playCount);
        for (int play = 0; play < lottos.getPlayCount(); play++) {
            Lotto lotto = lottoGeneratorService.generateLotto();
            lottos.addLotto(lotto);
        }
        return lottos;
    }

    public void playLottoGame(Lottos lottos, List<Integer> winningNumberList) {

    }
}
