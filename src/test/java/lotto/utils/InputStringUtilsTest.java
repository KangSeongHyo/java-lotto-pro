package lotto.utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class InputStringUtilsTest {

    @DisplayName("입력된 문자열을 구분자로 split 하고 숫자 리스트로 반환한다.")
    @ParameterizedTest
    @CsvSource(value = {"1,2,3,4,5,6:,:6","1-2-3:-:3"},delimiter = ':')
    void splitToNumberListByDelimiter(String inputString, String delimiter, int expectedSize){
        List<Integer> numberList = InputStringUtils.splitToNumberListByDelimiter(inputString, delimiter);
        assertThat(numberList).hasSize(expectedSize);
    }

}
