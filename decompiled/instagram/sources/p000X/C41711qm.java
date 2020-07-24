package p000X;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1qm  reason: invalid class name and case insensitive filesystem */
public final class C41711qm {
    public final Context A00;
    public final AnonymousClass0C1 A01;
    public final String A02;

    public static C37631jy A00(C41711qm r4, C40361oX r5, Integer num, boolean z, boolean z2, boolean z3) {
        AnonymousClass1NJ r0;
        Integer num2 = num;
        if (r5 instanceof C41731qo) {
            C41731qo r52 = (C41731qo) r5;
            boolean z4 = false;
            if (AnonymousClass2CJ.A00(r52.A00, r4.A01) != null) {
                z4 = true;
            }
            if (!z4) {
                return null;
            }
            r0 = r52.APe();
        } else {
            if (r5 instanceof C41741qp) {
                r0 = ((C41741qp) r5).A00.A00;
            } else if (r5 instanceof C41751qq) {
                r0 = ((C41751qq) r5).A00.A00;
            } else if (z) {
                return C37621jx.A02(((C40391oa) r5).APe(), r4.A00, r4.A02, num2, false, z2);
            } else {
                if (r5 instanceof C40401ob) {
                    return C37621jx.A03(((C40401ob) r5).APe(), r4.A02, z3);
                }
                return null;
            }
            if (r0 == null) {
                return null;
            }
        }
        return C37621jx.A01(r0, r4.A00, r4.A02, num);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (p000X.C40571os.A00(r11, r9.A00) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dd, code lost:
        if (r2 != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0120, code lost:
        if (((p000X.C40391oa) r8).AeL() == false) goto L_0x0122;
     */
    public final void A01(Integer num, List list, boolean z, int i, int i2, boolean z2, boolean z3) {
        int i3;
        boolean z4;
        C38871lz r2;
        boolean z5;
        AnonymousClass1NJ r22;
        C37631jy A012;
        if (z) {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                Integer num2 = num;
                int i4 = i2;
                if (next instanceof C41721qn) {
                    C41721qn r3 = (C41721qn) next;
                    if (r3 instanceof C216949Xg) {
                        C216949Xg r9 = (C216949Xg) r3;
                        for (int i5 = 0; i5 < r3.getItemCount(); i5++) {
                            int A002 = r9.A00(i5);
                            int A013 = r9.A01(i5);
                            C38871lz AO8 = r3.AO8(i5);
                            if (r9 instanceof C216939Xf) {
                                C216939Xf r1 = (C216939Xf) r9;
                                r2 = r1.AO8(r1.A02());
                            } else {
                                r2 = null;
                                if (r9 instanceof AnonymousClass9Z7) {
                                    AnonymousClass9Z7 r23 = (AnonymousClass9Z7) r9;
                                    int i6 = 2;
                                    if (r23.A00 == 0) {
                                        i6 = 0;
                                    }
                                    r2 = r23.AO8(i6);
                                }
                            }
                            if (r2 != null && AO8.A01().equals(r2.A01())) {
                                z5 = true;
                            }
                            z5 = false;
                            switch (AO8.A00.ordinal()) {
                                case 1:
                                    r22 = (AnonymousClass1NJ) AO8.A0G;
                                    if (!z5 || !((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.EXPLORE_RANKER_FETCH_VIDEO_IF_AUTO_IS_ELIGIBLE_HOLDOUT, "is_fix_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                                        A012 = C37621jx.A03(r22, this.A02, false);
                                        break;
                                    }
                                case 2:
                                    r22 = ((C39931nn) AO8.A0G).A00;
                                    A012 = C37621jx.A01(r22, this.A00, this.A02, num2);
                                    break;
                                case 4:
                                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                                case 25:
                                    A012 = null;
                                    r22 = C216869Wy.A00(AO8, this.A01);
                                    break;
                                default:
                                    A012 = null;
                                    break;
                            }
                            A012 = C37621jx.A01(r22, this.A00, this.A02, num2);
                            if (A012 != null) {
                                arrayList.add(new C37461jh(A012, new C41761qr(new Pair(Integer.valueOf(A013 + i), Integer.valueOf(A002)), z5)));
                                if (i4 != -1 && arrayList.size() > i4) {
                                }
                            }
                        }
                        i3 = r9.AUm();
                    } else {
                        continue;
                    }
                } else if (next instanceof C40481oj) {
                    C40481oj r32 = (C40481oj) next;
                    for (C40361oX r8 : r32.A01) {
                        if (r8 instanceof C40391oa) {
                            z4 = true;
                        }
                        z4 = false;
                        Integer num3 = num2;
                        C37631jy A003 = A00(this, r8, num3, z4, z2, z3);
                        if (A003 != null) {
                            Object obj = r32.A02.get(r8);
                            AnonymousClass11J.A00(obj);
                            C40411oc r12 = (C40411oc) obj;
                            arrayList.add(new C37461jh(A003, new C41761qr(new Pair(Integer.valueOf(r12.A01 + i), Integer.valueOf(r12.A00)), z4)));
                            if (i4 != -1 && arrayList.size() > i4) {
                            }
                        }
                    }
                    i3 = r32.A00;
                } else {
                    continue;
                }
                i += i3;
            }
        }
        if (z) {
            AnonymousClass1F6.A00(this.A01).A0C(arrayList, this.A02);
        } else {
            AnonymousClass1F6.A00(this.A01).A0B(arrayList, this.A02);
        }
    }

    public C41711qm(Context context, String str, AnonymousClass0C1 r3) {
        this.A00 = context;
        this.A02 = str;
        this.A01 = r3;
    }
}
