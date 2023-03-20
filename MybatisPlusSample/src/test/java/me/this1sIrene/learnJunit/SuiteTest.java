package me.this1sIrene.learnJunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 套件测试
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AssertTest.class,
        LifeCycleTest.class
})
public class SuiteTest {

}
