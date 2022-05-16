package lotto.model;

import lotto.constant.ErrorMessage;
import lotto.constant.LottoRoleConst;

public class Money {
    private final int money;

    public Money(String moneyWord) {
        try {
            this.money = Integer.parseInt(moneyWord);
            validateMoney(money);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.CANT_CONVERT_MONEY);
        }
    }

    private void validateMoney(int money) {
        validateLackMoney(money);
        validateOverMoney(money);
        validateUnitMoney(money);
    }

    private void validateLackMoney(int money) {
        if (money < LottoRoleConst.LOTTO_PRICE) {
            throw new IllegalArgumentException(ErrorMessage.LACK_MONEY);
        }
    }

    private void validateOverMoney(int money) {
        if (money >= LottoRoleConst.LOTTO_MAX_PURCHASE_PRICE) {
            throw new IllegalArgumentException(ErrorMessage.OVER_MONEY);
        }
    }

    private void validateUnitMoney(int money) {
        if (money % LottoRoleConst.LOTTO_PRICE != 0) {
            throw new IllegalArgumentException(ErrorMessage.INCORRECT_UNIT_MONEY);
        }
    }

    public int getMoney() {
        return money;
    }

}
