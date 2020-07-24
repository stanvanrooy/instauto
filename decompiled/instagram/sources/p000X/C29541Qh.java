package p000X;

import android.content.Context;
import android.location.Location;
import android.util.Pair;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Qh  reason: invalid class name and case insensitive filesystem */
public final class C29541Qh {
    public AnonymousClass1PE A00;
    public C27321Hj A01;
    public AnonymousClass0C1 A02;

    public C29541Qh(C27321Hj r1, AnonymousClass1PE r2, AnonymousClass0C1 r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0282, code lost:
        if (r24 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010a, code lost:
        if (p000X.C36821if.A01(r9) != false) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0131  */
    public final void A00(C15880ng r22, List list, boolean z, C28571Mg r25, C32091aX r26, Integer num, C43411uN r28, B3G b3g, AnonymousClass2FD r30, String str, String str2) {
        C28571Mg r0;
        boolean z2;
        HashMap hashMap;
        int i;
        boolean z3;
        List<AnonymousClass1NG> list2 = list;
        C12670hC.A02();
        Iterator it = list2.iterator();
        while (true) {
            r0 = r25;
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass1NG r3 = (AnonymousClass1NG) it.next();
            if (r3.A0H == C29261Pf.MEDIA) {
                r3.A04().A3G.add(r0);
            }
        }
        C15880ng r1 = r22;
        Integer num2 = r1.A04;
        for (AnonymousClass1NG r4 : list2) {
            if (r4.A0H == C29261Pf.MEDIA) {
                r4.A04().A1T = num2;
            }
        }
        C27321Hj r7 = this.A01;
        Context context = r7.getContext();
        if (context != null) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (isEnabled && isTouchExplorationEnabled && r7.A0h) {
                r7.A0X.announceForAccessibility(r7.getResources().getString(C0003R.string.feed_refereshed));
            }
        }
        boolean z4 = z;
        if (z) {
            C27321Hj r6 = this.A01;
            r6.A1V.A00 = r1.A06;
            if (r6.mView != null) {
                r6.getScrollingViewProxy().AaK().post(new C36701iT(this));
            }
            AnonymousClass1PE r42 = this.A00;
            r42.A0T.A06();
            r42.A0C = true;
            if (!r42.A0h) {
                r42.A0O();
            }
        }
        C32091aX r18 = r26;
        if (r26 != null) {
            ArrayList<AnonymousClass1NG> arrayList = new ArrayList<>(list2);
            LinkedHashSet linkedHashSet = new LinkedHashSet(list2);
            linkedHashSet.removeAll(Collections.unmodifiableList(this.A00.A0T.A01));
            list2 = new ArrayList<>(linkedHashSet);
            if (!C05770Lw.A00().A00.getBoolean("force_disable_gre", false)) {
                AnonymousClass0C1 r12 = this.A02;
                List unmodifiableList = Collections.unmodifiableList(this.A00.A0T.A01);
                ArrayList arrayList2 = new ArrayList();
                List list3 = unmodifiableList;
                Integer num3 = Constants.A0C;
                if (!z) {
                    int size = list3.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        AnonymousClass1NG r9 = (AnonymousClass1NG) list3.get(size);
                        if (!C36821if.A00(r9)) {
                            z3 = false;
                        }
                        z3 = true;
                        if (z3) {
                            i = (list3.size() - size) - 1;
                            if (C36821if.A00(r9)) {
                                num3 = Constants.ZERO;
                            } else {
                                num3 = Constants.ONE;
                            }
                        } else {
                            size--;
                        }
                    }
                    C37561jr r32 = new C37561jr(i, num3);
                    int i2 = r32.A00;
                    Integer num4 = r32.A01;
                    for (AnonymousClass1NG r13 : list2) {
                        if (C36821if.A00(r13)) {
                            if (C37571js.A01(r12, r13, i2, Constants.ZERO, num4, z4, r18, unmodifiableList, arrayList2)) {
                                arrayList2.add(r13);
                                num4 = Constants.ZERO;
                            }
                        } else if (C36821if.A01(r13)) {
                            if (C37571js.A01(r12, r13, i2, Constants.ONE, num4, z4, r18, unmodifiableList, arrayList2)) {
                                arrayList2.add(r13);
                                num4 = Constants.ONE;
                            }
                        } else {
                            arrayList2.add(r13);
                            i2++;
                        }
                        i2 = 0;
                    }
                    list2 = arrayList2;
                }
                i = 0;
                C37561jr r322 = new C37561jr(i, num3);
                int i22 = r322.A00;
                Integer num42 = r322.A01;
                while (r7.hasNext()) {
                }
                list2 = arrayList2;
            }
            ArrayList<AnonymousClass1NG> arrayList3 = new ArrayList<>();
            for (AnonymousClass1NG r43 : arrayList) {
                if (!list2.contains(r43)) {
                    arrayList3.add(r43);
                }
            }
            if (!arrayList3.isEmpty()) {
                AnonymousClass0RU A012 = AnonymousClass0WN.A01(this.A02);
                for (AnonymousClass1NG A002 : arrayList3) {
                    AnonymousClass0P4 A013 = AnonymousClass0P4.A01("instagram_feed_item_removed", "feed_timeline");
                    C28741Mx.A01(A013, r1);
                    C28741Mx.A00(A013, A002);
                    A012.BcG(A013);
                }
            }
        }
        if (r0 != C28571Mg.CACHED) {
            C27321Hj r11 = this.A01;
            int itemCount = this.A00.getItemCount();
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A01("generatePrefetchResources", -707366891);
            }
            try {
                FragmentActivity activity = r11.getActivity();
                if (activity != null) {
                    AnonymousClass0C1 r8 = r11.A0V;
                    int itemCount2 = r11.A0I.getItemCount();
                    if (((Boolean) AnonymousClass0L6.A02(r8, AnonymousClass0L7.MAINFEED_GENERATE_PREFETCH_BACKGROUND, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                        C05700Lp.A00().ADc(new C37601jv(r11, activity, r8, itemCount, list2, r11, z4, itemCount2));
                    } else {
                        int size2 = list2.size();
                        ArrayList arrayList4 = new ArrayList(size2);
                        for (int i3 = 0; i3 < size2; i3++) {
                            List A003 = C37611jw.A00(activity, r8, r11, itemCount + i3, (AnonymousClass1NG) list2.get(i3));
                            if (!A003.isEmpty()) {
                                arrayList4.addAll(A003);
                            }
                        }
                        String moduleName = r11.getModuleName();
                        if (z || itemCount2 == 0) {
                            AnonymousClass1F6.A00(r8).A0C(arrayList4, moduleName);
                        } else {
                            AnonymousClass1F6.A00(r8).A0B(arrayList4, moduleName);
                        }
                    }
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(1082292083);
                    }
                } else if (C06530Pk.A00) {
                    AnonymousClass0ZB.A00(367615950);
                }
            } catch (Throwable th) {
                th = th;
                if (C06530Pk.A00) {
                    AnonymousClass0ZB.A00(1796663991);
                }
                throw th;
            }
        }
        C05770Lw A014 = C05770Lw.A01(this.A01.getContext());
        if (!A014.A07().isEmpty() || !A014.A06().isEmpty()) {
            z2 = true;
        }
        z2 = false;
        if (z2) {
            Context context2 = this.A01.getContext();
            AnonymousClass0C1 r82 = this.A02;
            C05770Lw A015 = C05770Lw.A01(context2);
            Set A07 = A015.A07();
            Set A06 = A015.A06();
            AnonymousClass2FB A004 = AnonymousClass2FA.A00("feed_netego");
            AnonymousClass2FB A005 = AnonymousClass2FA.A00("feed_ads");
            ArrayList<String> arrayList5 = new ArrayList<>();
            arrayList5.addAll(A004.ANc(context2, A07));
            arrayList5.addAll(A005.ANc(context2, A06));
            ArrayList arrayList6 = new ArrayList();
            for (String A006 : arrayList5) {
                try {
                    AnonymousClass1NG A007 = AnonymousClass1NG.A00(AnonymousClass0IY.A00(r82, A006));
                    A007.A0Z = true;
                    arrayList6.add(A007);
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Unable to parse the JSON; make sure your injection is formatted properly!");
                }
            }
            list2.addAll(1, arrayList6);
        }
        C27321Hj r33 = this.A01;
        if (num != null) {
            r33.A0B.A00 = num.intValue();
        }
        int A03 = this.A00.A0T.A03();
        AnonymousClass1PE r132 = this.A00;
        List list4 = list2;
        String str3 = str;
        String str4 = str2;
        int i4 = 0;
        while (true) {
            if (i4 >= list2.size()) {
                break;
            }
            AnonymousClass1NG r72 = (AnonymousClass1NG) list2.get(i4);
            if (r72.A0H == C29261Pf.END_OF_FEED_DEMARCATOR) {
                AnonymousClass1SO r92 = (AnonymousClass1SO) r72.A0G;
                C474423y r83 = r92.A00;
                if (r83 != null) {
                    list2.add(i4 + 1, new AnonymousClass1NG(r83.getId(), r83));
                }
                if (r92.A05 && ((Boolean) AnonymousClass0L6.A02(r132.A0b, AnonymousClass0L7.LOW_RAM_ANIMATIONS, "end_of_feed", true, (AnonymousClass04H) null)).booleanValue()) {
                    int i5 = i4 + 1;
                    r132.A0Z.A00 = new AnonymousClass2FC(r132, list2.subList(i5, list2.size()), str3, str4);
                    r132.A0C = false;
                    list4 = list2.subList(0, i5);
                }
            } else {
                i4++;
            }
        }
        r132.A0T.A0N(list4, r132.A0U, str3, str4);
        C43411uN r62 = r28;
        r132.A03 = r62;
        if (r132.A0h && r28 != null) {
            r132.AXG(r62);
        }
        r132.A0S(r132.A0A, (Runnable) null);
        r132.A0A = false;
        AnonymousClass0RU A016 = AnonymousClass0WN.A01(this.A02);
        for (AnonymousClass1NG A008 : list2) {
            AnonymousClass0P4 A017 = AnonymousClass0P4.A01("instagram_feed_item_inserted", "feed_timeline");
            C28741Mx.A01(A017, r1);
            C28741Mx.A00(A017, A008);
            A017.A0E("expected_position", Integer.valueOf(A03));
            A016.BcG(A017);
            A03++;
        }
        if (!list2.isEmpty() && r0 != C28571Mg.CACHED) {
            C29181Ox A009 = C29181Ox.A00(this.A01.getContext(), this.A02);
            AnonymousClass0ZA.A0D(A009.A07, A009.A07.obtainMessage(1, new C37711k6(list2, C17070pd.MAIN_FEED)));
        }
        B3G b3g2 = b3g;
        if (b3g != null) {
            C31011Wc r34 = this.A01.A0E;
            r34.A04 = b3g2;
            C27321Hj r14 = r34.A0C;
            if (r14 != null) {
                r14.A0B(r34);
            }
            C31011Wc.A01(r34);
        }
        C27321Hj r63 = this.A01;
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("setMegaphone", 186343259);
        }
        AnonymousClass2FD r35 = r30;
        if (r30 == null && z) {
            try {
                if (r0 != C28571Mg.CACHED) {
                    AnonymousClass1OC r44 = r63.A0T;
                    AnonymousClass0C1 r84 = r63.A0V;
                    C16180oA A0010 = C16180oA.A00(r84);
                    Pair pair = null;
                    if (A0010.A00.getString("torch_relay_prefecture", (String) null) != null) {
                        float f = A0010.A00.getFloat("torch_relay_lat", BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                        float f2 = A0010.A00.getFloat("torch_relay_lng", BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                        if (!(f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || f2 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)) {
                            pair = new Pair(Float.valueOf(f), Float.valueOf(f2));
                        }
                    }
                    if (pair == null) {
                        pair = null;
                        if (((Boolean) AnonymousClass0L6.A02(r84, AnonymousClass0L7.JP_TORCH_RELAY_STICKER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                            C16230oG r02 = C16230oG.A00;
                            Location lastLocation = r02 != null ? r02.getLastLocation(r84) : null;
                            if (lastLocation != null) {
                                pair = new Pair(Float.valueOf((float) lastLocation.getLatitude()), Float.valueOf((float) lastLocation.getLongitude()));
                            }
                        }
                    }
                    if (pair == null) {
                        hashMap = null;
                    } else {
                        hashMap = new HashMap();
                        hashMap.put("lat", Float.toString(((Float) pair.first).floatValue()));
                        hashMap.put("lng", Float.toString(((Float) pair.second).floatValue()));
                    }
                    r44.BL5(hashMap);
                }
            } catch (Throwable th2) {
                th = th2;
                if (C06530Pk.A00) {
                    AnonymousClass0ZB.A00(488598300);
                }
                throw th;
            }
        }
        boolean z5 = false;
        if (r30 != null) {
            z5 = true;
        }
        r63.A0c = z5;
        if (r30 != null && !r35.A00()) {
            AnonymousClass2FF.A01(C27321Hj.A00(r63).A02, r35, Constants.ZERO, Constants.A0N);
            r63.A0I.A0Q(r35);
        }
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A00(1612625687);
        }
        for (AnonymousClass1NG A05 : list2) {
            AnonymousClass1NJ A052 = A05.A05();
            if (!(A052 == null || !A052.Aho() || C30671Ut.A0D(this.A02, A052) == null)) {
                C37211jI r36 = (C37211jI) this.A02.AVA(C37211jI.class, new C37221jJ());
                List A0D = C30671Ut.A0D(this.A02, A052);
                if (A0D != null && !A0D.isEmpty()) {
                    r36.A00 = A0D;
                }
            }
        }
    }
}
