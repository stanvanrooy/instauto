package p000X;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* renamed from: X.1Qd  reason: invalid class name and case insensitive filesystem */
public final class C29501Qd {
    public C05380Kf A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C29521Qf A02;
    public final AnonymousClass00B A03;
    public final List A04;

    public final AnonymousClass22D A00(AnonymousClass229 r18, boolean z, boolean z2, int i) {
        AnonymousClass00B r11 = this.A03;
        Handler handler = this.A01;
        C29471Qa r14 = new C29471Qa(this.A04);
        r14.A03 = true;
        boolean z3 = z2;
        AnonymousClass22D r9 = new AnonymousClass22D(z3, r11, handler, r18, r14, this.A02, z);
        if (z) {
            C05700Lp.A00().ADc(r9);
            return r9;
        }
        int i2 = r9.A02;
        AnonymousClass00B r7 = this.A03;
        r7.markerStart(25034759, i2);
        AnonymousClass0ZA.A09(new Handler(Looper.getMainLooper()), new C06750Qg(r7, i2), 10000, 486552430);
        this.A03.markerPoint(25034759, i2, "job_scheduled");
        if (this.A00 == null) {
            AnonymousClass0O0 r2 = new AnonymousClass0O0(C06190Oc.A00, C05700Lp.A00());
            r2.A01 = "AsyncBinderGroupCombinator";
            r2.A00 = i;
            this.A00 = new C05380Kf(r2);
        }
        this.A00.ADc(r9);
        return r9;
    }

    public C29501Qd(List list, C29521Qf r4) {
        this.A04 = list;
        this.A02 = r4;
        this.A03 = AnonymousClass00B.A01;
    }
}
