package lotto.model;

import lotto.constant.ErrorMessage;
import lotto.constant.LottoRoleConst;

public class LottoStore {

    private final LottoPaper lottoPaper;

    public LottoStore(Money money, LottoSelfCount lottoSelfCount) {
        int totalCount = money.getMoney() / LottoRoleConst.LOTTO_PRICE;
        this.lottoPaper = new LottoPaper(totalCount, lottoSelfCount.getSelfCount());
        validateOverCount(totalCount, lottoPaper);
    }

    private void validateOverCount(int totalCount, LottoPaper lottoPaper) {
        if (totalCount < lottoPaper.getSelfCount()) {
            throw new IllegalArgumentException(ErrorMessage.NOT_ENOUGH_MEONY);
        }
    }

    public LottoPaper issueLottoPaper() {
        return lottoPaper;
    }
}
