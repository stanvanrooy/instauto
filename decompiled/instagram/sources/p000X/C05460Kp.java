package p000X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.0Kp  reason: invalid class name and case insensitive filesystem */
public final class C05460Kp extends Thread {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C05420Kl A01;
    public final /* synthetic */ AnonymousClass0Kk A02;

    public C05460Kp(C05420Kl r1, Context context, AnonymousClass0Kk r3) {
        this.A01 = r1;
        this.A00 = context;
        this.A02 = r3;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "instacrash_mitigated");
        C05420Kl.A00(this.A00, this.A02, hashMap);
    }
}
