package p000X;

import android.os.SystemClock;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.17m  reason: invalid class name and case insensitive filesystem */
public final class C251517m extends C251617n implements AnonymousClass0RN {
    public AnonymousClass0QT A00 = AnonymousClass0QT.A01(C11890fq.A06, this, AnonymousClass0QV.A03);

    public final boolean A07() {
        return false;
    }

    public final void B2s(C935242t r1) {
    }

    public final String getModuleName() {
        return "java/com/instagram/memory";
    }

    public final long A01() {
        return (long) (((Integer) C05680Ln.A3O.A00(C11890fq.A06)).intValue() << 10);
    }

    public final long A02() {
        return (long) (((Integer) C05680Ln.A3P.A00(C11890fq.A06)).intValue() << 10);
    }

    public final boolean A08() {
        return ((Boolean) C05680Ln.A3i.A00(C11890fq.A06)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017e, code lost:
        if (r6.A05 != r2) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a7, code lost:
        if (r6.A05 != r5.A05) goto L_0x01a9;
     */
    public final void A2q(C251117i r18, Map map, List list) {
        boolean z;
        boolean z2;
        C92713zb r7 = new C92713zb(this.A00.A02("android_memory_red_metric"));
        if (r7.A0B()) {
            C92743ze r6 = new C92743ze();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C181927pj r1 = (C181927pj) it.next();
                C181917pi r11 = r1.A02;
                if (r11 == C181917pi.A0E) {
                    long j = r1.A01;
                    long j2 = j - r1.A00;
                    long A04 = A04(j);
                    long A03 = A03(j);
                    Integer num = Constants.ZERO;
                    if (j2 <= A04) {
                        num = Constants.ONE;
                        if (j2 <= A03) {
                            num = Constants.A0C;
                        }
                    }
                    r6.A06 = num;
                    r6.A01 = j2;
                } else {
                    if (r11 == C181917pi.A0J) {
                        long j3 = r1.A01;
                        long j4 = j3;
                        if (j3 > 0) {
                            long j5 = j3 - r1.A00;
                            long A06 = A06(j4);
                            long A05 = A05(j4);
                            Integer num2 = Constants.ZERO;
                            if (j5 <= A06) {
                                num2 = Constants.ONE;
                                if (j5 <= A05) {
                                    num2 = Constants.A0C;
                                }
                            }
                            r6.A07 = num2;
                            r6.A02 = j5;
                        }
                    }
                    if (r11 == C181917pi.A04) {
                        long j6 = r1.A00;
                        long A02 = A02();
                        long A01 = A01();
                        Integer num3 = Constants.ZERO;
                        if (j6 <= A02) {
                            num3 = Constants.ONE;
                            if (j6 <= A01) {
                                num3 = Constants.A0C;
                            }
                        }
                        r6.A05 = num3;
                        r6.A03 = j6;
                    } else if (r11 == C181917pi.A05) {
                        r6.A00 = r1.A00;
                    }
                }
            }
            r6.A04 = SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder((map.size() * 60) + 10 + (list.size() * 35));
            sb.append('{');
            boolean z3 = true;
            for (Map.Entry entry : map.entrySet()) {
                if (z3) {
                    z3 = false;
                } else {
                    sb.append(',');
                }
                sb.append('\"');
                sb.append((String) entry.getKey());
                sb.append("\":\"");
                sb.append((String) entry.getValue());
                sb.append('\"');
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C181927pj r2 = (C181927pj) it2.next();
                if (z3) {
                    z3 = false;
                } else {
                    sb.append(',');
                }
                sb.append('\"');
                C181917pi r112 = r2.A02;
                sb.append(r112.A00());
                sb.append("\":\"");
                sb.append(r2.A00);
                sb.append('\"');
                long j7 = r2.A01;
                long j8 = j7;
                if (j7 != -1) {
                    sb.append(",\"");
                    sb.append(r112.A01());
                    sb.append("\":\"");
                    sb.append(j8);
                    sb.append('\"');
                }
            }
            sb.append('}');
            r6.A09 = sb.toString();
            r6.A08 = AnonymousClass09Q.A02();
            r6.A0A = AnonymousClass09Q.A04();
            if (A07()) {
                Integer num4 = r6.A06;
                Integer num5 = Constants.ZERO;
                if (num4 == num5 && r6.A07 == num5) {
                    z2 = false;
                }
                z2 = true;
                if (z2) {
                    C251617n.A00(r7, r6);
                    r7.A01();
                }
            } else if (A08()) {
                C92743ze r5 = this.A00;
                C251117i r4 = r18;
                if (r5 != null) {
                    if (r6.A06 == r5.A06 && r6.A07 == r5.A07) {
                        z = true;
                    }
                    z = false;
                    if (z && r4.A02) {
                        return;
                    }
                }
                if (r5 != null) {
                    C251617n.A00(r7, r6);
                    r7.A07("prev_largest_address_space_chunk", Long.valueOf(r5.A03));
                    r7.A07("prev_free_java_heap", Long.valueOf(r5.A01));
                    r7.A07("prev_free_total_memory", Long.valueOf(r5.A02));
                    r7.A07("prev_all_process_resident_anonymous", Long.valueOf(r5.A00));
                    r7.A08("prev_asl_endpoint", r5.A08);
                    r7.A08("prev_memory_snapshot_json", r5.A09);
                    r7.A08("prev_address_space_state", AnonymousClass416.A00(r5.A05));
                    r7.A08("prev_java_heap_state", AnonymousClass416.A00(r5.A06));
                    r7.A08("prev_system_memory_state", AnonymousClass416.A00(r5.A07));
                    r7.A07("prev_state_seconds", Long.valueOf((r6.A04 - r5.A04) / 1000));
                } else {
                    C251617n.A00(r7, r6);
                }
                r7.A01();
                this.A00 = r6;
                if (!r4.A02) {
                    this.A00 = null;
                }
            }
        }
    }

    public final long A03(long j) {
        C05000Hl r1;
        if (j < 132096) {
            r1 = C05680Ln.A3Q;
        } else if (j < 263168) {
            r1 = C05680Ln.A3R;
        } else if (j < 394240) {
            r1 = C05680Ln.A3S;
        } else {
            r1 = C05680Ln.A3T;
        }
        return ((long) ((Integer) r1.A00(C11890fq.A06)).intValue()) * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
    }

    public final long A04(long j) {
        C05000Hl r1;
        if (j < 132096) {
            r1 = C05680Ln.A3U;
        } else if (j < 263168) {
            r1 = C05680Ln.A3V;
        } else if (j < 394240) {
            r1 = C05680Ln.A3W;
        } else {
            r1 = C05680Ln.A3X;
        }
        return ((long) ((Integer) r1.A00(C11890fq.A06)).intValue()) * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
    }

    public final long A05(long j) {
        C05000Hl r1;
        if (j <= 1048576) {
            r1 = C05680Ln.A3Z;
        } else if (j <= 1572864) {
            r1 = C05680Ln.A3Y;
        } else if (j <= 2621440) {
            r1 = C05680Ln.A3a;
        } else if (j <= 3670016) {
            r1 = C05680Ln.A3b;
        } else {
            r1 = C05680Ln.A3c;
        }
        return ((long) ((Integer) r1.A00(C11890fq.A06)).intValue()) * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
    }

    public final long A06(long j) {
        C05000Hl r1;
        if (j <= 1048576) {
            r1 = C05680Ln.A3e;
        } else if (j <= 1572864) {
            r1 = C05680Ln.A3d;
        } else if (j <= 2621440) {
            r1 = C05680Ln.A3f;
        } else if (j <= 3670016) {
            r1 = C05680Ln.A3g;
        } else {
            r1 = C05680Ln.A3h;
        }
        return ((long) ((Integer) r1.A00(C11890fq.A06)).intValue()) * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
    }
}
