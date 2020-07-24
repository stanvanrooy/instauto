package p000X;

import android.widget.Adapter;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1he  reason: invalid class name and case insensitive filesystem */
public final class C36191he extends C256219o {
    public final AnonymousClass1SG A00;
    public final AnonymousClass1HD A01;
    public final C68182ya A02;

    public final void A08(C255119b r3, int i) {
        AnonymousClass0Z0.A0A(-1257678141, AnonymousClass0Z0.A03(-1154911985));
    }

    public final void A09(C255119b r3, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int A03 = AnonymousClass0Z0.A03(-1547958063);
        if (!this.A01.isResumed()) {
            i6 = 1308880662;
        } else {
            this.A00.A01();
            i6 = -816583881;
        }
        AnonymousClass0Z0.A0A(i6, A03);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public C36191he(AnonymousClass1HD r10, C68182ya r11, C71583Bh r12, AnonymousClass1LO r13, AnonymousClass0C1 r14) {
        this(r1, r11, r12, r4, r14, new HashSet(), AnonymousClass2NV.A01.A00, true);
        AnonymousClass1HD r1 = r10;
        AnonymousClass1LO r4 = r13;
    }

    public C36191he(AnonymousClass1HD r23, C68182ya r24, C71583Bh r25, AnonymousClass1LO r26, AnonymousClass0C1 r27, Set set, int i, boolean z) {
        AnonymousClass1HD r7 = r23;
        this.A01 = r7;
        C68182ya r5 = r24;
        this.A02 = r5;
        AnonymousClass0C1 r10 = r27;
        AnonymousClass1LO r9 = r26;
        C71583Bh r6 = r25;
        boolean z2 = z;
        Set set2 = set;
        this.A00 = new AnonymousClass1SG((C27361Hn) r7, (Adapter) r5, new C68222ye(r7, r5, r6, r9, r10, set2, z2), new C68232yf(r5, r6, r7, (AnonymousClass0RN) r7, r9, r10, set2, i, z2));
    }
}
