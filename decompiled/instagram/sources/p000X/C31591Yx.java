package p000X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1Yx  reason: invalid class name and case insensitive filesystem */
public final class C31591Yx implements C06570Po {
    public C59302hM A00;
    public boolean A01;
    public final AnonymousClass0C1 A02;
    public final Set A03;
    public final Set A04;
    public final Context A05 = StoredPreferences.A00;
    public final Comparator A06;

    public static boolean A03(String str, String str2, String str3) {
        String str4 = str;
        try {
            AnonymousClass18D.A03.BWk(str);
            return true;
        } catch (Exception e) {
            AnonymousClass0DB.A0G("ReelMediaPreloader", "invalid uri", e);
            AnonymousClass0QD.A05("ReelMediaPreloader#invalidUri", AnonymousClass000.A0P("uri: ", str4, " mediaId: ", str2, " reelId: ", str3), e);
            return false;
        }
    }

    public final void A08(List list) {
        C39941no r13;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Reel reel = (Reel) list.get(i);
            int i2 = reel.A02;
            if (i2 > 0) {
                String id = reel.getId();
                if (reel.A0i(this.A02)) {
                    r13 = null;
                } else {
                    AnonymousClass0C1 r1 = this.A02;
                    AnonymousClass1NJ r0 = reel.A08;
                    if (r0 == null) {
                        r13 = null;
                    } else {
                        r13 = new C39941no(r0.A0c(r1), reel.A13, reel.A08, Constants.ONE);
                    }
                }
                arrayList.add(new C40901pR(id, i2, -1, -1, r13));
            }
        }
        A0A(arrayList, (AnonymousClass2B3) null, "reel_server_prefetch");
    }

    public static C31591Yx A00(AnonymousClass0C1 r2) {
        return (C31591Yx) r2.AVA(C31591Yx.class, new C31601Yy(r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0068, code lost:
        if (r1 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0184, code lost:
        if (((p000X.C39941no) r8.get(r12)).A14() == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0207, code lost:
        if (((p000X.C39941no) r8.get(r3)).A14() != false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0275, code lost:
        if (((p000X.C39941no) r8.get(r3)).A14() != false) goto L_0x0277;
     */
    public static void A01(C31591Yx r21, Reel reel, C40901pR r23, C40911pS r24, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C37671k2 A0J;
        C31591Yx r11 = r21;
        if (!r11.A01) {
            Reel reel2 = reel;
            String id = reel2.getId();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashSet hashSet = new HashSet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            HashSet hashSet2 = new HashSet();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put(AnonymousClass000.A0E(id, "-cover"), reel2.A0A());
            hashSet2.add(reel2.A0A());
            ArrayList<C39941no> arrayList = new ArrayList<>();
            C40901pR r1 = r23;
            C39941no r0 = r1.A03;
            if (r0 != null) {
                arrayList.add(r0);
            } else {
                int i = r1.A02;
                if (i == -1) {
                    i = reel2.A08(r11.A02);
                }
                int min = Math.min(r1.A01 + i, reel2.A07(r11.A02));
                while (i < min) {
                    arrayList.add(reel2.A0C(r11.A02, i));
                    i++;
                }
            }
            for (C39941no r3 : arrayList) {
                if (!r3.A0t()) {
                    boolean z5 = false;
                    if (r3.A0E == Constants.A0j) {
                        z5 = true;
                    }
                    z4 = false;
                }
                z4 = true;
                if (z4) {
                    linkedHashMap.put(r3.getId(), r3);
                    ExtendedImageUrl A0S = r3.A08.A0S(r11.A05);
                    if (A03(A0S.AZc(), r3.getId(), id)) {
                        hashSet2.add(A0S);
                        linkedHashMap3.put(r3.getId(), A0S);
                    }
                    if (r3.A08.AiO() && !r3.A0f() && (A0J = r3.A0J(r11.A02)) != null) {
                        String A042 = A0J.A04();
                        if (A042.isEmpty() || !A03(A042, r3.getId(), id)) {
                            AnonymousClass0QD.A01("ReelMediaPreloader", "Received invalid video url");
                        }
                    }
                } else if (r3.A0o() || (r3.A0n() && ((Boolean) AnonymousClass0L6.A02(r11.A02, AnonymousClass0L7.LIVE_PERFORMANCE_IMPROVEMENT_LAUNCHER, "enable_live_prefetch", false, (AnonymousClass04H) null)).booleanValue())) {
                    linkedHashMap.put(r3.getId(), r3);
                    A0J = r3.A0J(r11.A02);
                    if (A0J == null) {
                    }
                }
                hashSet.add(A0J);
                linkedHashMap2.put(r3.getId(), A0J);
            }
            C40911pS r15 = r24;
            if (!A02(r11, r15, id, hashSet, hashSet2)) {
                boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r11.A02, AnonymousClass0L7.LAUNCHER_STORY_PREFETCH_USE_PREFETCH_SCHEDULER_FOR_ALL, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
                String str2 = str;
                boolean A002 = C40921pT.A00(str2);
                if (booleanValue || A002) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : linkedHashMap3.entrySet()) {
                        String str3 = (String) entry.getKey();
                        ImageUrl imageUrl = (ImageUrl) entry.getValue();
                        if (linkedHashMap.containsKey(str3)) {
                            z = true;
                        }
                        z = false;
                        C469821u r2 = new C469821u(r11, z, id, str3);
                        AnonymousClass1GH r12 = null;
                        if (imageUrl != null) {
                            r12 = AnonymousClass12C.A0c.A0D(imageUrl, str2);
                        }
                        if (r12 != null) {
                            r12.A0G = true;
                            r12.A02(r2);
                            hashMap.put(str3, r12.A00());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        String str4 = (String) entry2.getKey();
                        C39941no r8 = (C39941no) entry2.getValue();
                        AnonymousClass1GK r6 = (AnonymousClass1GK) hashMap.get(str4);
                        C37671k2 r5 = (C37671k2) linkedHashMap2.get(str4);
                        C49152Az r32 = null;
                        if (r5 != null) {
                            r32 = new C49152Az(r11, id, str4);
                        }
                        if (AnonymousClass1F6.A00(r11.A02).A0D(str2, new C37461jh(new C37631jy(str4, r6, r5), r8, r32))) {
                            r11.A06(new AnonymousClass2B0(r11, id, str4));
                        }
                    }
                    return;
                }
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    String str5 = (String) entry3.getKey();
                    C37671k2 r13 = (C37671k2) entry3.getValue();
                    if (linkedHashMap.containsKey(str5)) {
                        z3 = true;
                    }
                    z3 = false;
                    C39821nc r52 = new C39821nc(r13, str2);
                    C40961pX r14 = r17;
                    C40961pX r17 = new C40961pX(r11, id, hashSet, r13, r15, hashSet2, z3, str5);
                    int intValue = ((Integer) AnonymousClass0L6.A02(r11.A02, AnonymousClass0L7.STORIES_VIDEO_PREFETCH_KB, "prefetch_kb", 0, (AnonymousClass04H) null)).intValue();
                    if (intValue > 0) {
                        r52.A01 = intValue << 10;
                    }
                    r52.A02 = new WeakReference(r14);
                    C39831nd.A00(r52, r11.A02);
                    if (z3) {
                        r11.A06(new C40971pY(r11, id, str5));
                    }
                }
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    String str6 = (String) entry4.getKey();
                    ImageUrl imageUrl2 = (ImageUrl) entry4.getValue();
                    if (linkedHashMap.containsKey(str6)) {
                        z2 = true;
                    }
                    z2 = false;
                    C40931pU r22 = r16;
                    C40931pU r16 = new C40931pU(r11, id, imageUrl2, hashSet2, r15, hashSet, z2, str6);
                    AnonymousClass1GH r18 = null;
                    if (imageUrl2 != null) {
                        r18 = AnonymousClass12C.A0c.A0D(imageUrl2, str2);
                    }
                    if (r18 != null) {
                        r18.A0G = true;
                        r18.A02(r22);
                        r18.A01();
                    }
                    if (z2) {
                        r11.A06(new C40941pV(r11, id, str6));
                    }
                }
            }
        }
    }

    public static boolean A02(C31591Yx r1, C40911pS r2, String str, Set set, Set set2) {
        if (r1.A01) {
            return true;
        }
        if (!set.isEmpty() || !set2.isEmpty()) {
            return false;
        }
        r2.A00(str);
        return true;
    }

    public final void A04(C61472lr r4) {
        boolean z;
        Iterator it = this.A03.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            C61472lr r0 = (C61472lr) weakReference.get();
            if (r0 == null) {
                this.A03.remove(weakReference);
            } else if (r0 == r4) {
                z = true;
                break;
            }
        }
        if (!z) {
            this.A03.add(new WeakReference(r4));
        }
    }

    public final void A05(C61472lr r4) {
        for (WeakReference weakReference : this.A03) {
            C61472lr r0 = (C61472lr) weakReference.get();
            if (r0 == null) {
                this.A03.remove(weakReference);
            } else if (r0 == r4) {
                this.A03.remove(weakReference);
                return;
            }
        }
    }

    public final void A06(C40951pW r4) {
        for (WeakReference weakReference : this.A03) {
            C61472lr r0 = (C61472lr) weakReference.get();
            if (r0 == null) {
                this.A03.remove(weakReference);
            } else {
                r4.A7Q(r0);
            }
        }
    }

    public final void A07(String str, int i, AnonymousClass2B3 r11, String str2) {
        C40901pR r2 = new C40901pR(str, i, -1, -1, (C39941no) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(r2);
        A0A(arrayList, r11, str2);
    }

    public final void A09(List list, int i, AnonymousClass2B3 r12, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(new C40901pR((String) list.get(i2), i, -1, -1, (C39941no) null));
        }
        A0A(arrayList, r12, str);
    }

    public final void A0A(List list, AnonymousClass2B3 r12, String str) {
        boolean z;
        if (this.A01) {
            return;
        }
        if (!list.isEmpty()) {
            Collections.sort(list, this.A06);
            C40911pS r8 = new C40911pS(list, r12);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C40901pR r2 : new ArrayList(r8.A02.values())) {
                Reel A0G = ReelStore.A02(this.A02).A0G(r2.A04);
                if (A0G == null || (r2.A03 == null && !A0G.A0i(this.A02))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    A01(this, A0G, r2, r8, str);
                } else {
                    linkedHashSet.add(r2);
                }
            }
            if (C40921pT.A00(str)) {
                AnonymousClass1F6.A00(this.A02).A09.A02();
            }
            if (!linkedHashSet.isEmpty()) {
                LinkedHashSet<C40901pR> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
                if (!this.A01) {
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    for (C40901pR r0 : linkedHashSet2) {
                        linkedHashSet3.add(r0.A04);
                    }
                    C06360Ot.A04(",", linkedHashSet3);
                    for (C40901pR r6 : linkedHashSet2) {
                        C49872Dy r5 = new C49872Dy(this, r6, r8, str);
                        A06(new C49882Dz(this, r6));
                        this.A04.add(r5);
                        AnonymousClass2E0.A00(this.A02).A03(r6.A04, (String) null, r5);
                    }
                    if (C40921pT.A00(str)) {
                        if (this.A00 == null) {
                            this.A00 = new C59302hM(this);
                        }
                        AnonymousClass2E0.A00(this.A02).A04(linkedHashSet3, this.A00, (Map) null, str);
                    } else {
                        AnonymousClass2E0.A00(this.A02).A04(linkedHashSet3, (C59302hM) null, (Map) null, str);
                    }
                }
                linkedHashSet.clear();
            }
        } else if (r12 != null) {
            r12.onFinish();
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass2E0 A002 = AnonymousClass2E0.A00(this.A02);
            for (C476424v A012 : this.A04) {
                A002.A01(A012);
            }
            this.A04.clear();
            this.A03.clear();
        }
    }

    public C31591Yx(AnonymousClass0C1 r2) {
        this.A02 = r2;
        r2.BYi(C31591Yx.class, this);
        this.A04 = new HashSet();
        this.A03 = new CopyOnWriteArraySet();
        this.A06 = new AnonymousClass1Yz(this);
    }
}
