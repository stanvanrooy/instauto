package p000X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Set;

/* renamed from: X.0gt  reason: invalid class name and case insensitive filesystem */
public final class C12530gt extends C10030cY {
    public final C12540gu A00;

    public final AnonymousClass0IF getListenerMarkers() {
        C12100gB r1 = this.A00.A02;
        if (r1.A0B()) {
            return new AnonymousClass0IF((int[]) null, r1.A01);
        }
        return AnonymousClass0IF.A05;
    }

    public final void onMarkerCancel(AnonymousClass0ID r4) {
        this.A00.A00(r4.A04, r4.A03);
    }

    public final void onQuickMarkerEnd(int i, int i2) {
        this.A00.A00(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r1.contains(java.lang.Integer.valueOf(r14)) == false) goto L_0x002b;
     */
    public final boolean onQuickMarkerStart(int i, int i2) {
        int i3;
        AnonymousClass29A r3;
        int i4;
        int AGu;
        boolean z;
        C12230gP A04 = this.A00.A02.A04(i);
        for (AnonymousClass299 r2 : A04.A05) {
            if (i2 != 0) {
                Set set = r2.A02;
                if (set != null) {
                    z = true;
                }
                z = false;
                if (z) {
                }
            }
            if (!AnonymousClass299.A06.contains(Integer.valueOf(r2.A04)) || C12230gP.A06) {
                C12390gf A002 = C12230gP.A00(A04, r2);
                boolean z2 = A002 instanceof C12370gd;
                if (z2) {
                    C12240gQ r1 = A04.A04;
                    String A003 = AnonymousClass299.A00(r2.A04);
                    C12210gM r8 = r1.A00;
                    if (!r8.A00) {
                        AnonymousClass29A r6 = new AnonymousClass29A(35, (Integer) null, true);
                        r6.A02("booster", A003);
                        r6.A02("event", AnonymousClass29B.A00(35));
                        r6.A00(2);
                        r8.AlA(r6);
                    }
                }
                try {
                    i3 = A002.BdH(A04.A02, Integer.valueOf(i2));
                } catch (Exception e) {
                    C12190gK r22 = A04.A00;
                    if (!(A002 == null || A002.AGu() == -1)) {
                        C12190gK.A02(r22.A01, A002);
                    }
                    if (A002 != null) {
                        AGu = A002.AGu();
                    } else {
                        AGu = C12370gd.A00.AGu();
                    }
                    C12190gK.A01(r22, e);
                    r22.A00.BpD(C12190gK.A00("BoosterFailsRequestWithException", AGu, e.getMessage()), e);
                    i3 = 3;
                }
                if (i3 == 2) {
                    C12190gK r4 = A04.A00;
                    if (!(A002 == null || A002.AGu() == -1)) {
                        C12190gK.A02(r4.A02, A002);
                    }
                }
                A04.A00.A04(A002);
                C12240gQ r62 = A04.A04;
                int i5 = A04.A02;
                C12210gM r42 = r62.A00;
                if (r42.A00 && !z2 && (A002 instanceof C12380ge)) {
                    C12380ge r32 = (C12380ge) A002;
                    String A004 = AnonymousClass299.A00(r32.AGu());
                    if ("".equals(A004)) {
                        A004 = r32.getClass().getSimpleName();
                    }
                    if (i3 == 1) {
                        Integer valueOf = Integer.valueOf(i2);
                        AnonymousClass29A r33 = new AnonymousClass29A(25, (Integer) null, false);
                        r33.A02("event", AnonymousClass29B.A00(25));
                        r33.A01("trigger_source_id", (long) i5);
                        r33.A02("booster", A004);
                        if (valueOf != null) {
                            r33.A01("trigger_source_key", (long) valueOf.intValue());
                        }
                        C12210gM r43 = r62.A00;
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(A004);
                        stringBuffer.append("_");
                        stringBuffer.append(i5);
                        stringBuffer.append("_");
                        if (valueOf != null) {
                            i4 = valueOf.intValue();
                        } else {
                            i4 = 0;
                        }
                        stringBuffer.append(i4);
                        String stringBuffer2 = stringBuffer.toString();
                        C12220gO r12 = r43.A01;
                        if (!r12.A00.containsKey(stringBuffer2)) {
                            r12.A00.put(stringBuffer2, r33);
                        }
                        if (!r33.A04) {
                            C12210gM.A01(r33, C12590h0.A02);
                        }
                    } else {
                        if (i3 == 2) {
                            Integer valueOf2 = Integer.valueOf(i2);
                            r3 = new AnonymousClass29A(25, (Integer) null, true);
                            r3.A02("event", AnonymousClass29B.A00(25));
                            r3.A02("booster", A004);
                            r3.A01("trigger_source_id", (long) i5);
                            r3.A00(3);
                            if (valueOf2 != null) {
                                r3.A01("trigger_source_key", (long) valueOf2.intValue());
                            }
                        } else if (i3 == 3) {
                            Integer valueOf3 = Integer.valueOf(i2);
                            r3 = new AnonymousClass29A(25, valueOf3, true);
                            r3.A02("event", AnonymousClass29B.A00(25));
                            r3.A01("trigger_source_id", (long) i5);
                            r3.A02("booster", A004);
                            r3.A00(87);
                            if (valueOf3 != null) {
                                r3.A01("trigger_source_key", (long) valueOf3.intValue());
                            }
                        }
                        r42.AlA(r3);
                    }
                }
            }
        }
        return true;
    }

    public final void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
        C12580gz r2 = new C12580gz(quickPerformanceLogger, new C10550dU());
        synchronized (C12590h0.class) {
            C12590h0.A01.add(r2);
        }
    }

    public C12530gt(C12540gu r1) {
        this.A00 = r1;
    }
}
