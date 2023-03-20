package me.this1sIrene.learnJunit;

import org.junit.Assert;
import org.junit.Test;


/**
 * 断言测试
 */
public class AssertTest {

    int i = 1;
    int j = 1;
    int m = 2;
    String s1 = "11";
    String s2 = "11";
    int [] arr1 = {1, 2 ,3};
    int [] arr2 = {1, 2 ,3};


    @Test
    public void assertTest (){
        Assert.assertEquals("应该为true", s1, s2);
        Assert.assertNotSame("应该为true", s1, i);
        Assert.assertArrayEquals(arr1, arr2);
        Assert.assertNotNull(j);

    }
}
