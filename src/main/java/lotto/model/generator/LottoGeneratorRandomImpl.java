package lotto.model.generator;

import java.util.ArrayList;
import java.util.List;
import lotto.constant.LottoRoleConst;
import lotto.model.Lotto;
import lotto.model.LottoPaper;
import lotto.model.Lottos;
import lotto.utils.RandomNumberUtils;

public class LottoGeneratorRandomImpl implements LottoGenerator {

    @Override
    public Lottos generateLottos(Lottos selfLottos, LottoPaper lottoPaper) {
        List<Lotto> lottos = new ArrayList<>(selfLottos.getLottos());
        for (int gameCount = 0; gameCount < lottoPaper.randomCount(); gameCount++) {
            List<Integer> randomNumbers = RandomNumberUtils
                    .generateRandomNumbers(LottoRoleConst.LOW_NUMBER, LottoRoleConst.MAX_NUMBER,
                            LottoRoleConst.LOTTO_NUMBER_LIST_SIZE);
            lottos.add(new Lotto(randomNumbers));
        }
        return new Lottos(lottos);
    }
}
