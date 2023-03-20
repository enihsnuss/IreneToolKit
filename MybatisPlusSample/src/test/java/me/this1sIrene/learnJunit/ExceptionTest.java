package me.this1sIrene.learnJunit;

import org.junit.Test;

public class ExceptionTest {
    @Test(expected = NullPointerException.class)
    public void exceptionTest01 () {
        System.out.println("in exception fail test");
        int a = 0;
        int b = 1 / a;
    }

    @Test(expected = ArithmeticException.class)
    public void exceptionTest02() {
        System.out.println("in exception success test");
        int a = 0;
        int b = 1 / a;
    }
}
