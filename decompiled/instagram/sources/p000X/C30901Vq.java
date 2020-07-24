package p000X;

import android.util.Pair;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Vq  reason: invalid class name and case insensitive filesystem */
public final class C30901Vq implements C30911Vr {
    public final AnonymousClass0C1 A00;
    public final int A01;
    public final int A02;

    public final /* bridge */ /* synthetic */ C37461jh AMw(List list, List list2, C30931Vt r17) {
        List list3;
        int i;
        int i2;
        Set A09 = ((C30921Vs) r17).A09();
        C37461jh r3 = null;
        if (((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.GPS_IMPROVEMENTS_LAUNCHER, "main_feed_manhattan_distance", false, (AnonymousClass04H) null)).booleanValue()) {
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                C37461jh r6 = (C37461jh) it.next();
                if (A01(r6, A09)) {
                    C37651k0 A002 = A00(A09);
                    Pair pair = ((C37651k0) r6.A02).A00;
                    Integer num = (Integer) pair.first;
                    int intValue = num.intValue();
                    Pair pair2 = A002.A00;
                    Object obj = pair2.first;
                    int intValue2 = ((Integer) obj).intValue();
                    int abs = Math.abs(intValue - intValue2);
                    int intValue3 = ((Integer) pair.second).intValue();
                    int abs2 = abs + (Math.abs(intValue3) << 1);
                    if (intValue < intValue2 || ((num.equals(obj) && intValue3 < ((Integer) pair2.second).intValue()) || intValue3 < 0)) {
                        abs2 = -abs2;
                    }
                    if (r3 == null || ((abs2 < 0 && abs2 > i3) || ((abs2 >= 0 && i3 < 0) || (abs2 >= 0 && abs2 < i3)))) {
                        r3 = r6;
                        i3 = abs2;
                    }
                }
            }
        } else if (((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.GPS_IMPROVEMENTS_LAUNCHER, "lowest_bytes_first", false, (AnonymousClass04H) null)).booleanValue()) {
            int i4 = 0;
            int i5 = Integer.MAX_VALUE;
            while (true) {
                list3 = list2;
                if (i4 >= list.size()) {
                    break;
                }
                boolean z = false;
                if (((C37461jh) list.get(i4)).A01.A01 != null) {
                    z = true;
                }
                if (z && A01((C37461jh) list.get(i4), A09)) {
                    C39631nE r0 = (C39631nE) list3.get(i4);
                    if (r0 == null) {
                        i2 = 0;
                    } else {
                        i2 = r0.A01;
                    }
                    i5 = Math.min(i5, i2);
                }
                i4++;
            }
            for (int i6 = 0; i6 < list.size(); i6++) {
                C37461jh r2 = (C37461jh) list.get(i6);
                if (A01(r2, A09)) {
                    boolean z2 = false;
                    if (r2.A01.A01 != null) {
                        z2 = true;
                    }
                    if (z2) {
                        C39631nE r02 = (C39631nE) list3.get(i6);
                        if (r02 == null) {
                            i = 0;
                        } else {
                            i = r02.A01;
                        }
                        if (i > i5) {
                            continue;
                        }
                    }
                    r3 = r2;
                    if (((Integer) ((C37651k0) r2.A02).A00.first).intValue() >= ((Integer) A00(A09).A00.first).intValue()) {
                        break;
                    }
                }
            }
        } else {
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.FEED_ADS_PPR, "enable_prefetch_ads_prioritazation", false, (AnonymousClass04H) null)).booleanValue();
            if (!list.isEmpty()) {
                Collections.sort(list, new C39641nF(A00(A09), booleanValue));
                C37461jh r1 = (C37461jh) list.get(0);
                if (!A01(r1, A09)) {
                    return null;
                }
                return r1;
            }
        }
        return r3;
    }

    public C30901Vq(AnonymousClass0C1 r6) {
        this.A00 = r6;
        AnonymousClass0L7 r4 = AnonymousClass0L7.AGGRESSIVE_CAROUSEL_PREFETCH;
        if (((Boolean) AnonymousClass0L6.A02(r6, r4, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            this.A01 = ((Integer) AnonymousClass0L6.A02(r6, r4, "limit", 2, (AnonymousClass04H) null)).intValue();
        } else {
            this.A01 = 2;
        }
        if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.MULTIPOST_VIDEO_PERFORMANCE_IMPROVEMENT_LAUNCHER, "enable_feature", false, (AnonymousClass04H) null)).booleanValue()) {
            this.A02 = ((Integer) AnonymousClass0L6.A02(r6, AnonymousClass0L7.MULTIPOST_VIDEO_PERFORMANCE_IMPROVEMENT_LAUNCHER, "carousel_video_limit", 1, (AnonymousClass04H) null)).intValue();
        } else {
            this.A02 = 1;
        }
    }

    public static C37651k0 A00(Set set) {
        Iterator it = set.iterator();
        if (it.hasNext()) {
            return (C37651k0) it.next();
        }
        return new C37651k0(new Pair(0, 0), Constants.ZERO);
    }

    private boolean A01(C37461jh r8, Set set) {
        int i;
        Iterator it = set.iterator();
        boolean z = false;
        if (r8.A01.A01 != null) {
            z = true;
        }
        if (z) {
            i = this.A02;
        } else {
            i = this.A01;
        }
        while (it.hasNext()) {
            Pair pair = ((C37651k0) it.next()).A00;
            Object obj = pair.first;
            Pair pair2 = ((C37651k0) r8.A02).A00;
            if (obj == pair2.first) {
                int intValue = ((Integer) pair2.second).intValue();
                int intValue2 = ((Integer) pair.second).intValue();
                if (intValue < intValue2 || intValue - intValue2 >= i) {
                    return false;
                }
                return true;
            }
        }
        int intValue3 = ((Integer) ((C37651k0) r8.A02).A00.second).intValue();
        if (intValue3 < 0 || intValue3 >= i) {
            return false;
        }
        return true;
    }
}
