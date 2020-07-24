package p000X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1d5  reason: invalid class name and case insensitive filesystem */
public final class C33541d5 implements Runnable {
    public final /* synthetic */ C238311z A00;
    public final /* synthetic */ AtomicInteger A01;
    public final /* synthetic */ AtomicInteger A02;
    public final /* synthetic */ AtomicInteger A03;

    public C33541d5(C238311z r1, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3) {
        this.A00 = r1;
        this.A03 = atomicInteger;
        this.A02 = atomicInteger2;
        this.A01 = atomicInteger3;
    }

    public final void run() {
        C237311p r1;
        if (this.A00.A00.A02 != null) {
            if (C237211o.A02()) {
                for (String A09 : this.A00.A00.A02.A05.A04((String) null)) {
                    AnonymousClass0J1.A09(A09, Constants.A03, new C137185tD(this), (C05180Im) null);
                }
            } else {
                this.A03.set(C16180oA.A00(this.A00.A00.A02).A00.getInt("num_unseen_activities", 0));
            }
        }
        C237211o r4 = this.A00.A00;
        int i = this.A02.get();
        int i2 = this.A01.get();
        int i3 = this.A03.get();
        C12670hC.A01();
        if (r4.A02 == null) {
            i2 = 0;
        } else if (!C06080Nr.A09(r4.A00)) {
            i2 = i3 + i;
        }
        String A022 = C06460Pd.A02(this.A00.A00.A00);
        Context context = this.A00.A00.A00;
        C237311p[] r7 = C237211o.A06;
        int length = r7.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                r1 = r7[r7.length - 1];
                break;
            }
            r1 = r7[i4];
            if (r1.A02(context, A022)) {
                break;
            }
            i4++;
        }
        r1.A01(i2, this.A00.A00.A00);
        if (i2 > 0) {
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_launcher_badge", (AnonymousClass0RN) null);
            A002.A0G("device_id", AnonymousClass0OZ.A00(this.A00.A00.A02).AZO());
            A002.A0G("launcher_name", A022);
            A002.A0E("badge_count", Integer.valueOf(i2));
            AnonymousClass0WN.A01(this.A00.A00.A02).BcG(A002);
        }
    }
}
