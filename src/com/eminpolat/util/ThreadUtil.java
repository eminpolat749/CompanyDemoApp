package com.eminpolat.util;

public class ThreadUtil {
    public static void sleep(long millisecond)
    {
        try {
            Thread.sleep(millisecond);
        }
        catch (InterruptedException ignore) {

        }
    }
}