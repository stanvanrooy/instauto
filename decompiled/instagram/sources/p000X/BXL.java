package p000X;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.BXL */
public final class BXL {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    public static BXQ A00(Context context, AnonymousClass0C1 r19, C49182Bc r20) {
        BXQ bxq;
        Object obj;
        Integer num;
        Boolean bool;
        Boolean bool2;
        String str;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        BYP byp;
        BY1 by1;
        Integer num2;
        C49182Bc r2 = r20;
        String str2 = r2.A00;
        if ("OR_TYPE".equalsIgnoreCase(str2) || str2 == null) {
            bxq = new BXM();
        } else if ("NOR_TYPE".equalsIgnoreCase(str2)) {
            bxq = new BXN();
        } else {
            bxq = new BXO();
        }
        try {
            List<C49202Be> list = r2.A02;
            AnonymousClass0C1 r4 = r19;
            Context context2 = context;
            if (list != null) {
                for (C49202Be r6 : list) {
                    switch (r6.A00.ordinal()) {
                        case 0:
                            Integer num3 = r6.A01.A01;
                            if (num3 != null) {
                                obj = new C111344qo(num3.intValue());
                                break;
                            }
                        case 1:
                            C49222Bh r1 = r6.A01;
                            C49222Bh A00 = r6.A00("event");
                            C49222Bh A002 = r6.A00("event_count");
                            C49222Bh A003 = r6.A00("metric");
                            C49222Bh r10 = r1;
                            obj = null;
                            if (!(r1 == null || A00 == null || A002 == null || A003 == null)) {
                                BYP[] values = BYP.values();
                                int length = values.length;
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        byp = values[i2];
                                        if (!byp.name().equalsIgnoreCase(A00.A03)) {
                                            i2++;
                                        }
                                    } else {
                                        byp = null;
                                    }
                                }
                                BY1[] values2 = BY1.values();
                                int length2 = values2.length;
                                while (true) {
                                    if (i < length2) {
                                        by1 = values2[i];
                                        if (!by1.name().equalsIgnoreCase(A003.A03)) {
                                            i++;
                                        }
                                    } else {
                                        by1 = null;
                                    }
                                }
                                String str3 = r10.A03;
                                if (!(TextUtils.isEmpty(str3) || byp == null || by1 == null || (num2 = A002.A01) == null)) {
                                    obj = new BXP(str3, byp, by1, num2.longValue());
                                    break;
                                }
                            }
                        case 2:
                            C49222Bh r0 = r6.A01;
                            C49222Bh r62 = r0;
                            if (!(r0 == null || !"value".equalsIgnoreCase(r0.A02) || (bool7 = r62.A00) == null)) {
                                obj = new AnonymousClass6KZ(context2, bool7.booleanValue());
                                break;
                            }
                        case 3:
                            C49222Bh r02 = r6.A01;
                            C49222Bh r63 = r02;
                            if (!(r02 == null || !"value".equalsIgnoreCase(r02.A02) || (bool6 = r63.A00) == null)) {
                                obj = new C25715BWk(context2, bool6.booleanValue());
                                break;
                            }
                        case 4:
                            C49222Bh r03 = r6.A01;
                            C49222Bh r64 = r03;
                            if (!(r03 == null || !"value".equalsIgnoreCase(r03.A02) || (bool5 = r64.A00) == null)) {
                                obj = new C156046lT(r4, bool5.booleanValue());
                                break;
                            }
                        case 5:
                            C49222Bh r04 = r6.A01;
                            C49222Bh r65 = r04;
                            if (!(r04 == null || !"value".equalsIgnoreCase(r04.A02) || (bool4 = r65.A00) == null)) {
                                obj = new C25720BWq(context2, bool4.booleanValue());
                                break;
                            }
                        case 6:
                            C49222Bh r05 = r6.A01;
                            C49222Bh r66 = r05;
                            if (!(r05 == null || !"value".equalsIgnoreCase(r05.A02) || r66.A00 == null)) {
                                obj = new BXK(context2);
                                break;
                            }
                        case 7:
                            C49222Bh r06 = r6.A01;
                            C49222Bh r67 = r06;
                            if (!(r06 == null || !"value".equalsIgnoreCase(r06.A02) || r67.A00 == null)) {
                                obj = new BXJ(context2);
                                break;
                            }
                        case 8:
                            C49222Bh r07 = r6.A01;
                            C49222Bh r68 = r07;
                            if (!(r07 == null || !"value".equalsIgnoreCase(r07.A02) || r68.A00 == null)) {
                                obj = new BXI(context2);
                                break;
                            }
                        case 9:
                            C49222Bh r08 = r6.A01;
                            C49222Bh r69 = r08;
                            if (!(r08 == null || !"value".equalsIgnoreCase(r08.A02) || r69.A00 == null)) {
                                obj = new C112234sH(r4);
                                break;
                            }
                        case 10:
                            C49222Bh r09 = r6.A01;
                            C49222Bh r610 = r09;
                            if (!(r09 == null || !"value".equalsIgnoreCase(r09.A02) || (bool3 = r610.A00) == null)) {
                                obj = new C110934q7(context2, bool3.booleanValue());
                                break;
                            }
                        case C120125Dh.VIEW_TYPE_SPINNER:
                            C49222Bh r010 = r6.A01;
                            if (!(r010 == null || (num = r010.A01) == null)) {
                                obj = new C110924q6(r4, num);
                                break;
                            }
                        case C120125Dh.VIEW_TYPE_BADGE:
                            C49222Bh r011 = r6.A01;
                            C49222Bh r611 = r011;
                            if (!(r011 == null || !"value".equalsIgnoreCase(r011.A02) || (str = r611.A03) == null)) {
                                obj = new AnonymousClass5AL(r4, str);
                                break;
                            }
                        case C120125Dh.VIEW_TYPE_LINK:
                            C49222Bh r012 = r6.A01;
                            C49222Bh r612 = r012;
                            if (!(r012 == null || !"value".equalsIgnoreCase(r012.A02) || (bool2 = r612.A00) == null)) {
                                obj = new BXT(context2, bool2.booleanValue());
                                break;
                            }
                        case 15:
                            C49222Bh r013 = r6.A01;
                            C49222Bh r613 = r013;
                            if (!(r013 == null || !"value".equalsIgnoreCase(r013.A02) || (bool = r613.A00) == null)) {
                                obj = new C110914q5(context2, r4, bool.booleanValue());
                                break;
                            }
                        case 16:
                            String str4 = r6.A02;
                            String str5 = str4;
                            if (str4 != null) {
                                if (!"ERROR".equals(str5)) {
                                    if ("PASS".equals(str5) || "FAIL".equals(str5)) {
                                        obj = new BXR(str5);
                                        break;
                                    }
                                } else {
                                    throw new BXV();
                                }
                            }
                    }
                    obj = null;
                    if (obj != null) {
                        bxq.A00.add(obj);
                    }
                }
            }
            List<C49182Bc> list2 = r2.A01;
            if (list2 == null) {
                return bxq;
            }
            for (C49182Bc A004 : list2) {
                bxq.A00.add(A00(context2, r4, A004));
            }
            return bxq;
        } catch (BXV unused) {
            return new BXS();
        }
    }
}
