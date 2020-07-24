package p000X;

import android.os.AsyncTask;

/* renamed from: X.A4c */
public final class A4c implements Runnable {
    public final /* synthetic */ A4J A00;

    public A4c(A4J a4j) {
        this.A00 = a4j;
    }

    public final void run() {
        AsyncTask.execute(new A4I(this));
    }
}
