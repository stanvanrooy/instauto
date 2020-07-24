package com.google.android.gms.vision.clearcut;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DynamiteClearcutLogger {
    public static final ThreadPoolExecutor A00 = new ThreadPoolExecutor(1, 2, 2, TimeUnit.SECONDS, new LinkedBlockingQueue(10), new ThreadPoolExecutor.DiscardPolicy());
}
