package p000X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.0of  reason: invalid class name and case insensitive filesystem */
public final class C16480of implements C14250k8 {
    public final C16490og A00;
    public final C14250k8 A01;
    public final AnonymousClass0OT A02;
    public final AnonymousClass0O3 A03;
    public final C15130mO A04;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r1.A07(r6.A0A) == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        if (r11 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
        if (r1.A07(r6.A0A) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r6 == p000X.Constants.A0N) goto L_0x001b;
     */
    public final C26211Cc startRequest(AnonymousClass1C4 r19, C256019m r20, AnonymousClass1CB r21) {
        Integer num;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C17190pp r7;
        C256019m r5 = r20;
        String str = r5.A03;
        AnonymousClass1CB r2 = r21;
        AnonymousClass1C4 r3 = r19;
        if (str == null || (num = r5.A07) == Constants.ZERO) {
            return this.A01.startRequest(r3, r5, r2);
        }
        if (num != Constants.A0C) {
            z = false;
        }
        z = true;
        if (z) {
            C15180mT r0 = C15180mT.A05;
            C33301ch r6 = new C33301ch(str);
            C15220mX r1 = r0.A00;
            if (r1.A07(r6.A0C)) {
                z3 = true;
            }
            z3 = false;
            if (z3) {
                long j = r5.A01;
                if (j != -1) {
                    boolean z5 = false;
                    try {
                        Iterator it = C15180mT.A05.A00(r5.A03, r3.A04.getPath(), r3.hashCode(), false, r5).A02.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                r7 = null;
                                break;
                            }
                            r7 = (C17190pp) it.next();
                            if (r7.A00.equalsIgnoreCase("X-IG-ANDROID-FROM-DISK-CACHE")) {
                                break;
                            }
                        }
                        if (r7 != null) {
                            if (System.currentTimeMillis() - Long.parseLong(r7.A01) > j) {
                                z5 = true;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    z4 = false;
                }
                z4 = true;
                if (z4) {
                    C33321cj r62 = new C33321cj(this, r3, r5, r2);
                    this.A02.ADc(new C33331ck(this, r62));
                    C33341cl r52 = new C33341cl(this, r62);
                    AnonymousClass1CX.A00().Amv(r3.A04.getPath(), true);
                    return r52;
                }
            }
        }
        if (r5.A07 == Constants.A0C) {
            C15180mT r12 = C15180mT.A05;
            C33301ch r63 = new C33301ch(r5.A03);
            C15220mX r13 = r12.A00;
            if (r13.A07(r63.A0C)) {
                z2 = true;
            }
            z2 = false;
            if (!z2) {
                C43771v3 r53 = new C43771v3(this);
                this.A02.ADc(new C43781v4(this, r2, r3));
                return r53;
            }
        }
        C15180mT.A05.A01(r2, r3, r5.A03);
        C26211Cc startRequest = this.A01.startRequest(r3, r5, r2);
        AnonymousClass1CX.A00().Amv(r3.A04.getPath(), false);
        return startRequest;
    }

    public C16480of(C14250k8 r3, C16490og r4, AnonymousClass0O3 r5, C15130mO r6) {
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = "request_cache_layer";
        C05450Ko A012 = A002.A01();
        this.A01 = r3;
        this.A02 = A012;
        this.A00 = r4;
        this.A03 = r5;
        this.A04 = r6;
    }
}
