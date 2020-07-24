package p000X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.0Kq  reason: invalid class name and case insensitive filesystem */
public final class C05470Kq extends Thread {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C05420Kl A02;
    public final /* synthetic */ AnonymousClass0Kk A03;

    public C05470Kq(C05420Kl r1, long j, Context context, AnonymousClass0Kk r5) {
        this.A02 = r1;
        this.A00 = j;
        this.A01 = context;
        this.A03 = r5;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("crash_count", Long.valueOf(this.A00));
        hashMap.put("event_name", "instacrash_detected");
        C05420Kl.A00(this.A01, this.A03, hashMap);
    }
}
