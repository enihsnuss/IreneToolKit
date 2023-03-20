package me.this1sIrene.learnJunit;

import org.junit.*;

/**
 * 学习使用Junit单元测试
 * 生命周期
 */
public class LifeCycleTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("执行一次beforeclass方法");
    }

    @Before
    public void before () {
        System.out.println("执行多次before方法");
    }

    @AfterClass
    public static void afterClasss() {
        System.out.println("执行一次afterclass方法");
    }

    @After
    public void after() {
        System.out.println("执行多次after方法");
    }

    @Test
    public void test1 () {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Ignore
    @Test
    public void test3() {
        System.out.println("test3");
    }

}
