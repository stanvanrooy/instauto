package p000X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1js  reason: invalid class name and case insensitive filesystem */
public final class C37571js {
    public static final C27371Ho A00 = new C37581jt();

    public static void A00(AnonymousClass0C1 r2, String str, int i) {
        C37141jB A03 = C37591ju.A03("instagram_ad_async_ad_controller_action_success", A00);
        A03.A50 = str;
        A03.A32 = "timeline_request";
        A03.A0f = i;
        AnonymousClass0WN.A01(r2).BdB(A03.A03());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r0.A0I == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r6 == -1) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r1 = p000X.C37591ju.A03("instagram_ad_async_ad_controller_action_fail", A00);
        r1.A50 = r4;
        r1.A32 = "timeline_request";
        r1.A0e = java.lang.Integer.valueOf(r6).intValue();
        r1.A0f = r3;
        p000X.AnonymousClass0WN.A01(r8).BdB(r1.A03());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (r6 == -1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        A00(r8, r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (r10 < r0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        if (r0 != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return true;
     */
    public static boolean A01(AnonymousClass0C1 r8, AnonymousClass1NG r9, int i, Integer num, Integer num2, boolean z, C32091aX r14, List list, List list2) {
        int size;
        boolean z2;
        boolean z3;
        Integer num3;
        int i2;
        boolean z4;
        String AYw = r9.A0G.AYw();
        if (z) {
            size = list2.size();
        } else {
            size = list.size() + list2.size();
        }
        C29261Pf r0 = r9.A0H;
        C29261Pf r2 = C29261Pf.MEDIA;
        if (r0 == r2) {
            AnonymousClass1NJ A04 = r9.A04();
            C36331hs A01 = AnonymousClass11C.A00(r8).A01(A04);
            if (A01 != null) {
                z4 = A01.A0I;
            } else {
                C30141Sr r02 = A04.A0d;
                if (r02 != null) {
                    z4 = true;
                }
                z4 = false;
            }
            if (z4) {
                A00(r8, AYw, size);
                return true;
            }
        }
        int i3 = 6;
        switch (num2.intValue()) {
            case 0:
                num3 = Constants.ZERO;
                break;
            case 1:
                num3 = Constants.ONE;
                break;
            case 2:
                if (z) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AnonymousClass1NG r1 = (AnonymousClass1NG) it.next();
                            if (r1.A0H == r2) {
                                z3 = !r1.A04().Aho();
                                continue;
                            } else {
                                z3 = false;
                                continue;
                            }
                            if (z3) {
                                z2 = true;
                            }
                        } else {
                            z2 = false;
                        }
                    }
                    i3 = 9;
                    break;
                }
            default:
                i3 = -1;
                break;
        }
        Integer num4 = Constants.ZERO;
        if ((num3 == num4 && num == Constants.ONE) || (num3 == Constants.ONE && num == num4)) {
            i2 = r14.A01;
        } else if (num3 == num4 && num == num4) {
            i2 = r14.A00;
        } else {
            i2 = r14.A02;
        }
    }
}
