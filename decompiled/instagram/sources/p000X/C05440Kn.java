package p000X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.0Kn  reason: invalid class name and case insensitive filesystem */
public final class C05440Kn extends Thread {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C05420Kl A01;
    public final /* synthetic */ AnonymousClass0Kk A02;
    public final /* synthetic */ boolean A03;

    public C05440Kn(C05420Kl r1, boolean z, Context context, AnonymousClass0Kk r4) {
        this.A01 = r1;
        this.A03 = z;
        this.A00 = context;
        this.A02 = r4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "instacrash_resolved");
        hashMap.put("user_is_logged_in", Boolean.valueOf(this.A03));
        C05420Kl.A00(this.A00, this.A02, hashMap);
    }
}
