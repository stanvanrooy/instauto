package p000X;

import java.lang.Thread;

/* renamed from: X.0Em  reason: invalid class name and case insensitive filesystem */
public final class C04570Em implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ AnonymousClass0aR A00;
    public final /* synthetic */ Thread.UncaughtExceptionHandler A01;

    public C04570Em(AnonymousClass0aR r1, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.A00 = r1;
        this.A01 = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        this.A00.A00(thread, th);
        this.A01.uncaughtException(thread, th);
    }
}
