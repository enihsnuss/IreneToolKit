package me.this1sIrene.learnJunit;

/**
 * 用于学习junit单元测试
 * @runwith
 */
public class PrimeNumberChecker {

    /**
     * 判断质数
     * @param primeNumber
     * @return
     */
    public Boolean validate(final Integer primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
