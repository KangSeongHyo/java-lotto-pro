package lotto.vo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import lotto.model.Lotto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LottoTest {

    @DisplayName("로또 맞춘 개수 구하기")
    @Test
    void matchNumberCount() {
        Lotto lotto = new Lotto(Arrays.asList(1, 3, 15, 25, 36, 45));
        assertAll(
                () -> assertEquals(3, lotto.matchNumberCount(Arrays.asList(1, 10, 15, 40, 41, 45))),
                () -> assertEquals(4, lotto.matchNumberCount(Arrays.asList(1, 3, 15, 25, 41, 43))),
                () -> assertEquals(5, lotto.matchNumberCount(Arrays.asList(1, 10, 15, 25, 36, 45))),
                () -> assertEquals(6, lotto.matchNumberCount(Arrays.asList(1, 3, 15, 25, 36, 45)))
        );
    }

}
