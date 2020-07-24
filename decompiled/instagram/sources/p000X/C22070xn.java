package p000X;

import android.content.Context;
import android.os.Handler;
import java.util.UUID;

/* renamed from: X.0xn  reason: invalid class name and case insensitive filesystem */
public final class C22070xn extends C22080xo {
    public C68802zv A00;
    public final Context A01;

    public final AnonymousClass0O9 A01(AnonymousClass0C1 r2, C150426c4 r3) {
        return new C147526Sh(this, r2, r3);
    }

    public final C68802zv A02() {
        if (this.A00 == null) {
            this.A00 = new C68802zv();
        }
        return this.A00;
    }

    public C22070xn(Context context) {
        this.A01 = context;
    }

    public final void A03(AnonymousClass0C1 r10, boolean z) {
        long j;
        C17850qu A03;
        C37991kY A012 = C37991kY.A01(r10);
        Context context = this.A01;
        AnonymousClass0C1 r0 = A012.A04;
        C38011ka r5 = new C38011ka(r0, context, (C150426c4) null);
        boolean booleanValue = C38141kn.A00(r0).booleanValue();
        if (A012.A03() || A012.A02) {
            r5.A00();
            return;
        }
        A012.A02 = true;
        if (booleanValue) {
            AnonymousClass0C1 r2 = A012.A04;
            if (!((C38161kp) r2.AVA(C38161kp.class, new C38181kr(r2))).A00.getBoolean("prefetch_and_store_to_disk_on_next_startup", false)) {
                UUID.randomUUID().toString();
                AnonymousClass0C1 r8 = A012.A04;
                boolean z2 = false;
                if (r5.A02 != null) {
                    z2 = true;
                }
                if (z2) {
                    A03 = null;
                } else {
                    String A002 = C38201kt.A00("discover/topical_explore/", (String) null, (String) null, (String) null, (C52992Rb[]) null);
                    C15890nh r3 = new C15890nh(r8);
                    r3.A09 = Constants.A0N;
                    r3.A0C = "discover/topical_explore/";
                    r3.A06 = new C22930zG(C38211ku.class, new AnonymousClass0IZ(r8));
                    r3.A0B = A002;
                    r3.A08 = Constants.A0C;
                    A03 = r3.A03();
                }
                if (A03 == null) {
                    A03 = C37991kY.A00(A012, A012.A04, r5, true);
                } else {
                    A03.A00 = new C38221kv(A012, r5);
                }
                C12810hQ.A02(A03);
                return;
            }
            C37991kY.A02(A012, r5, true);
            return;
        }
        C150426c4 r1 = r5.A02;
        boolean z3 = false;
        if (r1 != null) {
            z3 = true;
        }
        if (!z3) {
            Handler handler = A012.A03;
            AnonymousClass23W r32 = new AnonymousClass23W(A012, r5);
            boolean z4 = false;
            if (r1 != null) {
                z4 = true;
            }
            if (z4) {
                j = 0;
            } else {
                j = 1000;
            }
            AnonymousClass0ZA.A09(handler, r32, j, -2144020387);
            return;
        }
        C37991kY.A02(A012, r5, false);
    }
}
