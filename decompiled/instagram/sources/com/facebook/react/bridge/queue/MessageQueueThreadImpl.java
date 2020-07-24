package com.facebook.react.bridge.queue;

import android.os.Looper;
import android.os.Process;
import android.util.Pair;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000X.A4H;
import p000X.A4W;
import p000X.A4X;
import p000X.A4Y;
import p000X.A4Z;
import p000X.A4a;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CH;
import p000X.AnonymousClass0ZA;
import p000X.C228039ra;
import p000X.C228139ro;
import p000X.C23068A4l;
import p000X.C23071A4p;
import p000X.C23078A4z;

public class MessageQueueThreadImpl implements MessageQueueThread {
    public C23078A4z A00;
    public final Looper A01;
    public final String A02;
    public final A4H A03;
    public final String A04;
    public volatile boolean A05 = false;

    public void quitSynchronous() {
        this.A05 = true;
        this.A01.quit();
        if (this.A01.getThread() != Thread.currentThread()) {
            try {
                this.A01.getThread().join();
            } catch (InterruptedException unused) {
                throw new RuntimeException(AnonymousClass000.A0E("Got interrupted waiting to join thread ", this.A02));
            }
        }
    }

    public static MessageQueueThreadImpl A00(A4Z a4z, C23071A4p a4p) {
        String str;
        Integer num = a4z.A01;
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                MessageQueueThreadImpl messageQueueThreadImpl = new MessageQueueThreadImpl(a4z.A02, Looper.getMainLooper(), a4p, (C23078A4z) null);
                if (C228039ra.A03()) {
                    Process.setThreadPriority(-4);
                    return messageQueueThreadImpl;
                }
                C228039ra.A01(new C23068A4l());
                return messageQueueThreadImpl;
            case 1:
                String str2 = a4z.A02;
                long j = a4z.A00;
                A4W a4w = new A4W();
                new Thread((ThreadGroup) null, new A4Y(a4w), AnonymousClass000.A0E("mqt_", str2), j).start();
                try {
                    Pair pair = (Pair) a4w.get();
                    return new MessageQueueThreadImpl(str2, (Looper) pair.first, a4p, (C23078A4z) pair.second);
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            default:
                if (num == null) {
                    str = "null";
                } else if (1 - intValue != 0) {
                    str = "MAIN_UI";
                } else {
                    str = "NEW_BACKGROUND";
                }
                throw new RuntimeException(AnonymousClass000.A0E("Unknown thread type: ", str));
        }
    }

    public Future callOnQueue(Callable callable) {
        A4W a4w = new A4W();
        runOnQueue(new A4X(this, a4w, callable));
        return a4w;
    }

    public boolean isOnThread() {
        if (this.A01.getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public void resetPerfStats() {
        runOnQueue(new A4a(this));
    }

    public void runOnQueue(Runnable runnable) {
        if (this.A05) {
            AnonymousClass0CH.A07("ReactNative", AnonymousClass000.A0J("Tried to enqueue runnable on already finished thread: '", this.A02, "... dropping Runnable."));
        }
        AnonymousClass0ZA.A0E(this.A03, runnable, -1093141153);
    }

    public MessageQueueThreadImpl(String str, Looper looper, C23071A4p a4p, C23078A4z a4z) {
        this.A02 = str;
        this.A01 = looper;
        this.A03 = new A4H(looper, a4p);
        this.A00 = a4z;
        this.A04 = AnonymousClass000.A0J("Expected to be called from the '", this.A02, "' thread!");
    }

    public C23078A4z getPerfStats() {
        return this.A00;
    }

    public void assertIsOnThread() {
        C228139ro.A00(isOnThread(), this.A04);
    }

    public void assertIsOnThread(String str) {
        C228139ro.A00(isOnThread(), AnonymousClass000.A0J(this.A04, " ", str));
    }
}
