package me.this1sIrene.learnJunit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class TimeOutTest {

    public static String log;

    private final CountDownLatch latch = new CountDownLatch(1);

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1); // 10 seconds max per method tested

    @Test(timeout = 3000)
    public void timeOutTest() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2000);
        System.out.println("in timeout exception");
    }

    @Test
    public void testSleepForTooLong() throws Exception {
        log += "ran1";
        TimeUnit.SECONDS.sleep(1); // sleep for 1 seconds
    }

    @Test
    public void testBlockForever() throws Exception {
        log += "ran2";
        latch.await(); // will block
    }

}
