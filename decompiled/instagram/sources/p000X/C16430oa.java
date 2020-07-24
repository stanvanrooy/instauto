package p000X;

import java.util.Collections;

/* renamed from: X.0oa  reason: invalid class name and case insensitive filesystem */
public final class C16430oa implements C14250k8 {
    public final C16440ob A00;
    public final Object A01;
    public final AnonymousClass0R7 A02;
    public final C14250k8 A03;
    public final C16410oY A04;

    public final C26211Cc startRequest(AnonymousClass1C4 r10, C256019m r11, AnonymousClass1CB r12) {
        C26211Cc A002;
        AnonymousClass0R7 r1;
        C256019m r5 = r11;
        AnonymousClass1CB r6 = r12;
        AnonymousClass1C4 r4 = r10;
        if (r11.A05 != C15920nk.Image) {
            return this.A03.startRequest(r10, r11, r12);
        }
        synchronized (this.A01) {
            if (!this.A00.A02() || !this.A04.A03.isEmpty()) {
                AnonymousClass1GS r0 = r11.A04;
                if (!(r0 == null || (r1 = this.A02) == null)) {
                    r1.Alh(r0.A00.A03);
                }
                A002 = this.A04.A00(r4, r5, r6, Long.MAX_VALUE, (C37391ja) null);
                A00(this);
            } else {
                r12.A04(new C37491jk(this));
                A002 = this.A03.startRequest(r10, r11, r12);
                this.A00.A01(r11);
            }
        }
        return A002;
    }

    public static void A00(C16430oa r6) {
        AnonymousClass0R7 r1;
        synchronized (r6.A01) {
            if (!r6.A04.A03.isEmpty() && r6.A00.A02()) {
                C37411jc AMx = C38171kq.A00().AMx(Collections.unmodifiableList(r6.A04.A03));
                C16410oY r12 = r6.A04;
                C37441jf r5 = new C37441jf(r12, r12.A03.iterator());
                while (true) {
                    if (!r5.A01.hasNext()) {
                        break;
                    }
                    C37411jc r2 = (C37411jc) r5.A01.next();
                    r5.A00 = r2;
                    if (r2 == AMx) {
                        AnonymousClass1GS r0 = AMx.A02.A04;
                        if (!(r0 == null || (r1 = r6.A02) == null)) {
                            r1.Alm(r0.A00.A03);
                        }
                        r2.A04.A04(new C37491jk(r6));
                        r5.A01(r6.A03);
                        r6.A00.A01(AMx.A02);
                    }
                }
            }
        }
    }

    public C16430oa(C16440ob r4, C14250k8 r5, AnonymousClass0R7 r6) {
        Object obj = new Object();
        this.A01 = obj;
        this.A00 = r4;
        this.A04 = new C16410oY(obj, (C16420oZ) null);
        this.A03 = r5;
        this.A02 = r6;
    }
}
