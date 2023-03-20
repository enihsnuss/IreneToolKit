package me.this1sIrene.learnJunit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * 首先要分清几个概念：测试方法、测试类、测试集、测试运行器。
 * 其中测试方法就是用@Test注解的一些函数。
 * 测试类是包含一个或多个测试方法的一个**Test.java文件。
 * 测试集是一个suite，可能包含多个测试类。
 * 测试运行器则决定了用什么方式偏好去运行这些测试集/类/方法。
 *
 * 而@Runwith就是放在测试类名之前，用来确定这个类怎么运行的。也可以不标注，会使用默认运行器。
 * 常见的运行器有：@RunWith(Parameterized.class) 参数化运行器，
 * 配合@Parameters使用JUnit的参数化功能
 * @RunWith(Suite.class) @SuiteClasses({ATest.class,BTest.class,CTest.class}) 测试集运行器配合使用测试集功能
 * @RunWith(JUnit4.class)， junit4的默认运行器
 * @RunWith(JUnit38ClassRunner.class)，用于兼容junit3.8的运行器
 * 一些其它运行器具备更多功能。例如@RunWith(SpringJUnit4ClassRunner.class)集成了spring的一些功能
 */

@RunWith(Parameterized.class) // 步骤一: 指定定参数运行器
public class ParameterizedTest {
    /**
     * 步骤二：声明变量
     */
    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;

    /**
     * 步骤三：为测试类声明一个带有参数的公共构造函数，为变量赋值
     */
    public ParameterizedTest(Integer inputNumber,Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    /**
     * 步骤四：为测试类声明一个 使用注解 org.junit.runners.Parameterized.Parameters 修饰的，返回值为java.util.Collection 的公共静态方法，并在此方法中初始化所有需要测试的参数对
     *
     1）该方法必须由Parameters注解修饰
     2）该方法必须为public static的
     3）该方法必须返回Collection类型
     4）该方法的名字不做要求
     5）该方法没有参数
     */
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {2, true},
                {6, false},
                {19, true},
                {22, false},
                {23, true}
        });
    }

    @Before
    public void initialize() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    /**
     * 步骤五：编写测试方法，使用自定义变量进行测试
     */
    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Parameterized Number is : " + inputNumber);
        Assert.assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
    }


}
