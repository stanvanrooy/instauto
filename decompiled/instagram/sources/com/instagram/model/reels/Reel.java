package com.instagram.model.reels;

import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.venue.Venue;
import com.instagram.reels.persistence.UserReelMediasStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass172;
import p000X.AnonymousClass176;
import p000X.AnonymousClass177;
import p000X.AnonymousClass179;
import p000X.AnonymousClass17A;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass22C;
import p000X.AnonymousClass26H;
import p000X.AnonymousClass2Ay;
import p000X.AnonymousClass2B1;
import p000X.AnonymousClass30F;
import p000X.AnonymousClass9G0;
import p000X.AnonymousClass9G1;
import p000X.AnonymousClass9G2;
import p000X.BTS;
import p000X.C05770Lw;
import p000X.C106504ic;
import p000X.C106534if;
import p000X.C13300iJ;
import p000X.C23300zv;
import p000X.C249316p;
import p000X.C249616t;
import p000X.C249716u;
import p000X.C249916w;
import p000X.C252117x;
import p000X.C28261La;
import p000X.C30671Ut;
import p000X.C30781Djv;
import p000X.C30782Djw;
import p000X.C31551Yt;
import p000X.C33971dn;
import p000X.C35241g2;
import p000X.C35881h5;
import p000X.C35891h6;
import p000X.C35911h8;
import p000X.C35951hC;
import p000X.C35961hD;
import p000X.C35981hF;
import p000X.C36681iR;
import p000X.C36791ic;
import p000X.C37321jT;
import p000X.C38031kc;
import p000X.C39941no;
import p000X.C40131o8;
import p000X.C40141o9;
import p000X.C43301uA;
import p000X.C469121m;
import p000X.C475224i;
import p000X.C57792em;
import p000X.C92873zr;
import p000X.DjR;

public final class Reel implements C249616t {
    public static final C249716u A15 = new C249716u();
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public C57792em A06;
    public AnonymousClass1NJ A07;
    public AnonymousClass1NJ A08;
    public AttributedAREffect A09;
    public C92873zr A0A;
    public C30781Djv A0B;
    public C38031kc A0C;
    public AnonymousClass26H A0D;
    public AnonymousClass2B1 A0E;
    public AnonymousClass30F A0F;
    public C469121m A0G;
    public C30782Djw A0H;
    public AnonymousClass172 A0I;
    public AnonymousClass9G0 A0J;
    public AnonymousClass9G1 A0K;
    public AnonymousClass9G2 A0L;
    public C249916w A0M;
    public DjR A0N;
    public Venue A0O;
    public AnonymousClass22C A0P;
    public C35981hF A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Long A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public List A0c;
    public List A0d;
    public List A0e = Collections.emptyList();
    public List A0f;
    public List A0g = Collections.emptyList();
    public List A0h = Collections.emptyList();
    public List A0i = Collections.emptyList();
    public List A0j;
    public List A0k;
    public Set A0l = Collections.emptySet();
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public Boolean A0z;
    public List A10 = Collections.emptyList();
    public List A11 = Collections.emptyList();
    public final Object A12;
    public final String A13;
    public volatile boolean A14;

    public static boolean A06(Long l) {
        return l == null || l.longValue() <= (System.currentTimeMillis() / 1000) - 86400;
    }

    public final void A0K() {
        this.A14 = true;
    }

    public final boolean Afk() {
        return true;
    }

    public final boolean Agp() {
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getId()});
    }

    private C39941no A00(AnonymousClass0C1 r11, C28261La r12) {
        synchronized (this.A12) {
            List A0J2 = A0J(r11);
            for (int A082 = A08(r11); A082 < A0J2.size(); A082++) {
                C39941no r6 = (C39941no) A0J2.get(A082);
                boolean z = false;
                if (r6.A03() > A09(r11)) {
                    z = true;
                }
                if (z && r12.apply(r6)) {
                    return r6;
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r6.A09(r15) <= 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        if (r6.A09(r15) <= 0) goto L_0x0099;
     */
    public static Comparator A01(AnonymousClass0C1 r15, List list) {
        long j;
        boolean z;
        boolean z2;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            if (reel.A0x && !reel.A0a()) {
                j = -9223372036854775807L;
            } else if (!reel.A0Z() || !(!reel.A0g.isEmpty())) {
                boolean z3 = reel.A0t;
                if (z3) {
                    if (z3) {
                        z2 = true;
                    }
                    z2 = false;
                    if (!z2) {
                        j = -9223372036854775805L;
                    }
                }
                if (reel.A04 != -9223372036854775807L) {
                    j = reel.A05;
                    if (j != -9223372036854775807L) {
                        if (!reel.A0w) {
                            if (!reel.A0m(r15) || reel.A0a()) {
                                if (reel.A0t) {
                                    z = true;
                                }
                                z = false;
                                if (!z) {
                                    if (reel.A0u) {
                                        j = reel.A04 + 2000000000;
                                    } else {
                                        j = reel.A04;
                                    }
                                }
                            }
                            j = reel.A05 + 3000000000L;
                        }
                        j += 5000000000L;
                    }
                }
                j = reel.A03 * -1;
                if (!reel.A0w) {
                    if (reel.A0m(r15) && !reel.A0a()) {
                        j += 3000000000L;
                    } else if (reel.A0u) {
                        j += 2000000000;
                    }
                }
                j += 5000000000L;
            } else {
                j = -9223372036854775806L;
            }
            hashMap.put(reel, Long.valueOf(j));
        }
        return new C31551Yt(hashMap);
    }

    public static List A02(C249316p r8, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C106504ic r6 = (C106504ic) it.next();
            C106534if r4 = (C106534if) r8.A01.get(AnonymousClass000.A0B(r6.A06.A04, r6.A00()));
            if (r4 == null) {
                r4 = new C106534if(r8.A00, r6);
                r8.A01.put(AnonymousClass000.A0B(r6.A06.A04, r6.A00()), r4);
            } else {
                r4.A00(r6);
            }
            arrayList.add(r4);
        }
        return arrayList;
    }

    public static void A03(Reel reel, List list) {
        A04(reel, reel.A11, list);
        if (!list.isEmpty()) {
            long AVw = ((AnonymousClass2Ay) list.get(list.size() - 1)).AVw();
            if (AVw > reel.A03) {
                reel.A03 = AVw;
            }
        }
    }

    public static void A04(Reel reel, List list, List list2) {
        boolean z;
        reel.A11 = list;
        reel.A0h = list2;
        List asList = Arrays.asList(new List[]{list, list2});
        AnonymousClass176 r2 = new AnonymousClass176(reel);
        AnonymousClass0a4.A07(asList, "iterables");
        AnonymousClass0a4.A07(r2, "comparator");
        ArrayList<AnonymousClass2Ay> A002 = AnonymousClass17A.A00(new AnonymousClass179(new AnonymousClass177(asList, r2)));
        if (reel.A0Z()) {
            for (AnonymousClass2Ay r3 : A002) {
                Iterator it = reel.A0g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((AnonymousClass2Ay) it.next()).getId().equals(r3.getId())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    reel.A0q = true;
                }
            }
        }
        reel.A0g = A002;
        reel.A0K();
    }

    public static void A05(Reel reel, Set set, AnonymousClass0C1 r15) {
        synchronized (reel.A12) {
            if (!reel.A0l.isEmpty()) {
                HashSet hashSet = new HashSet(reel.A0l);
                HashSet hashSet2 = new HashSet();
                Iterator it = hashSet.iterator();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                while (it.hasNext()) {
                    AnonymousClass1NJ r7 = (AnonymousClass1NJ) it.next();
                    String A0u2 = r7.A0u();
                    if (!set.contains(A0u2)) {
                        arrayList.add(A0u2);
                    } else if (r7.A1Y()) {
                        arrayList2.add(A0u2);
                    } else {
                        hashSet2.add(A0u2);
                    }
                    it.remove();
                }
                if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                    AnonymousClass0QD.A01("Reel#removeInvalidMedia", AnonymousClass000.A0P("current reel ID: ", reel.A13, ", invalid media IDs: ", arrayList.toString(), ", expired media IDs: ", arrayList2.toString()));
                }
                reel.A0K();
                hashSet2.addAll(arrayList2);
                if (hashSet2.equals(set) || !((Boolean) AnonymousClass0L6.A02(r15, AnonymousClass0L7.STORIES_SEND_CLIENT_REELS_ON_TRAY_FETCH, "invalidate_on_media_ids", false, (AnonymousClass04H) null)).booleanValue()) {
                    reel.A0l = Collections.unmodifiableSet(hashSet);
                } else {
                    reel.A0l = Collections.emptySet();
                }
            }
        }
    }

    public final long A09(AnonymousClass0C1 r3) {
        String id;
        if (this.A0t) {
            id = "NUX";
        } else {
            id = getId();
        }
        return C35891h6.A00(r3).A02(id);
    }

    public final ImageUrl A0A() {
        AnonymousClass2B1 r1 = this.A0E;
        boolean z = false;
        if (r1 != null) {
            z = true;
        }
        if (z && A0a()) {
            return r1.A01.A02;
        }
        C249916w r0 = this.A0M;
        if (r0 == null) {
            return null;
        }
        return r0.AJ5();
    }

    public final C39941no A0B(AnonymousClass0C1 r4) {
        C39941no r0;
        synchronized (this.A12) {
            r0 = (C39941no) A0J(r4).get(A08(r4));
        }
        return r0;
    }

    public final C13300iJ A0F() {
        C249916w r0 = this.A0M;
        if (r0 == null) {
            return null;
        }
        return r0.AZf();
    }

    public final Integer A0G() {
        C249916w r0 = this.A0M;
        if (r0 == null) {
            return null;
        }
        return r0.AZG();
    }

    public final String A0H() {
        AnonymousClass0a4.A07(this.A0S, "Trying to get the netego ID without netego type");
        switch (this.A0S.intValue()) {
            case 0:
                AnonymousClass0a4.A07(this.A0K, "Bakeoff netego should have simple action");
                return this.A0K.getId();
            case 1:
                AnonymousClass0a4.A07(this.A0J, "Ad4ad netego should have ad4ad object");
                return this.A0J.getId();
            case 2:
                AnonymousClass0a4.A07(this.A0L, "Suggested Users netego should have suggested user object");
                return this.A0L.getId();
            default:
                throw new UnsupportedOperationException("Trying to get the netego ID of a non-netego unit");
        }
    }

    public final List A0J(AnonymousClass0C1 r13) {
        C39941no r6;
        C39941no r3;
        if (this.A14) {
            synchronized (this.A12) {
                if (this.A14) {
                    ArrayList arrayList = new ArrayList(this.A10.size());
                    ArrayList arrayList2 = new ArrayList(this.A0e.size());
                    if (A0c()) {
                        AnonymousClass0a4.A07(this.A0S, "Netego reel should have a netego type");
                        switch (this.A0S.intValue()) {
                            case 0:
                                AnonymousClass0a4.A07(this.A07, "Netego bake off should have a background media set");
                                AnonymousClass0a4.A07(this.A0K, "Bakeoff reel should have a simple action");
                                r3 = new C39941no((C13300iJ) null, this.A13, this.A0S, this.A0K, (AnonymousClass9G0) null, (AnonymousClass9G2) null, this.A07);
                                break;
                            case 1:
                                AnonymousClass0a4.A07(this.A07, "Netego ad4ad should have a background media set");
                                AnonymousClass0a4.A07(this.A0J, "Ad4ad reel should have an ad4ad object");
                                arrayList.add(new C39941no(this.A07.A0c(r13), this.A13, this.A0S, (AnonymousClass9G1) null, this.A0J, (AnonymousClass9G2) null, this.A07));
                                break;
                            case 2:
                                AnonymousClass0a4.A07(this.A0L, "Suggested Users reel should have a SimpleSuggestedUsers object");
                                r3 = new C39941no((C13300iJ) null, this.A13, this.A0S, (AnonymousClass9G1) null, (AnonymousClass9G0) null, this.A0L, (AnonymousClass1NJ) null);
                                break;
                            default:
                                throw new IllegalArgumentException("Unsupported netego type");
                        }
                        arrayList.add(r3);
                    } else if (Aho()) {
                        for (AnonymousClass1NJ r7 : this.A0i) {
                            C39941no r62 = new C39941no(r7.A0c(r13), this.A13, r7, Constants.ONE);
                            r62.A03 = this.A0j;
                            arrayList.add(r62);
                        }
                    } else {
                        for (AnonymousClass1NJ r72 : this.A0l) {
                            boolean z = false;
                            boolean z2 = false;
                            if (r72.A05 != 0) {
                                z2 = true;
                            }
                            boolean A042 = C36791ic.A00(r13).A04(r72);
                            if (r72.A3R && C05770Lw.A00().A00.getBoolean("hide_internal_only_reel_media", false)) {
                                z = true;
                            }
                            if (z2 || A042 || z) {
                                arrayList2.add(r72.A0k());
                            } else {
                                boolean z3 = false;
                                if (this.A0I == AnonymousClass172.AR_EFFECT_PREVIEW) {
                                    z3 = true;
                                }
                                if (z3) {
                                    r6 = new C39941no(r72.A0c(r13), this.A13, r72, Constants.A12);
                                    r6.A00 = this.A09;
                                } else {
                                    r6 = new C39941no(r72.A0c(r13), this.A13, r72, Constants.ONE);
                                }
                                if (this.A0t) {
                                    r6.A05 = true;
                                }
                                r6.A04 = A0a();
                                r6.A02 = this.A0U;
                                arrayList.add(r6);
                            }
                        }
                        if (!this.A0g.isEmpty()) {
                            C249916w r32 = this.A0M;
                            AnonymousClass0a4.A06(r32);
                            C13300iJ AZf = r32.AZf();
                            boolean z4 = false;
                            if (AZf != null) {
                                z4 = true;
                            }
                            if (z4 || A0Z()) {
                                if (!z4) {
                                    AZf = r13.A06;
                                }
                                for (AnonymousClass2Ay r5 : this.A0g) {
                                    arrayList.add(new C39941no(this.A13, r5, AZf));
                                }
                                this.A0X = null;
                            } else {
                                AnonymousClass0QD.A02("com.instagram.model.reels.Reel", "Reel with pending media should have an owner.");
                            }
                        }
                        if (this.A0C != null) {
                            if (!((C40131o8) r13.AVA(C40131o8.class, new C40141o9(r13))).A00.getBoolean(this.A0C.A0I, false)) {
                                arrayList.add(new C39941no(this.A13, this.A0C, false));
                            }
                        }
                        AnonymousClass26H r33 = this.A0D;
                        if (r33 != null) {
                            for (C38031kc r63 : r33.A07) {
                                if (!((C40131o8) r13.AVA(C40131o8.class, new C40141o9(r13))).A00.getBoolean(r63.A0I, false)) {
                                    arrayList.add(new C39941no(this.A13, r63, true));
                                } else {
                                    arrayList2.add(Long.valueOf(r63.A05));
                                }
                            }
                        }
                        Collections.sort(arrayList, A15);
                        if (arrayList.isEmpty() && !arrayList2.isEmpty()) {
                            this.A03 = 0;
                        } else if (arrayList2.contains(Long.valueOf(this.A03)) && !arrayList.isEmpty()) {
                            this.A03 = ((C39941no) arrayList.get(arrayList.size() - 1)).A03();
                        }
                    }
                    this.A14 = false;
                    this.A10 = Collections.unmodifiableList(arrayList);
                    this.A0e = Collections.unmodifiableList(arrayList2);
                }
            }
        }
        return this.A10;
    }

    public final void A0L(AnonymousClass1NJ r8) {
        synchronized (this.A12) {
            HashSet hashSet = new HashSet(this.A0l);
            hashSet.add(r8);
            if (r8.A0k().longValue() > this.A03) {
                this.A03 = r8.A0k().longValue();
            }
            A0K();
            this.A0l = Collections.unmodifiableSet(hashSet);
        }
    }

    public final void A0M(C38031kc r11) {
        char booleanValue;
        long longValue;
        long longValue2;
        boolean z;
        long longValue3;
        long longValue4;
        char booleanValue2;
        Boolean bool = r11.A0E;
        if (bool == null) {
            booleanValue = 65535;
        } else {
            booleanValue = bool.booleanValue();
        }
        if (booleanValue != 65535) {
            if (bool == null) {
                booleanValue2 = 65535;
            } else {
                booleanValue2 = bool.booleanValue();
            }
            boolean z2 = true;
            if (booleanValue2 != 1) {
                z2 = false;
            }
            this.A0w = z2;
        }
        C38031kc r0 = this.A0C;
        if (r0 == null) {
            this.A0C = r11;
        } else {
            long j = r11.A05;
            long j2 = j;
            long j3 = r0.A05;
            long j4 = j3;
            if (j != j3) {
                AnonymousClass0QD.A01("reel_broadcast_item_publish_error", AnonymousClass000.A0D("previous: ", j4, " new: ", j2));
            }
            this.A0C.A05(r11);
        }
        Long l = r11.A0G;
        if (l == null) {
            longValue = -9223372036854775807L;
        } else {
            longValue = l.longValue();
        }
        if (longValue != -9223372036854775807L) {
            if (l == null) {
                longValue4 = -9223372036854775807L;
            } else {
                longValue4 = l.longValue();
            }
            this.A04 = longValue4;
        }
        Long l2 = r11.A0H;
        if (l2 == null) {
            longValue2 = -9223372036854775807L;
        } else {
            longValue2 = l2.longValue();
        }
        if (longValue2 != -9223372036854775807L) {
            if (l2 == null) {
                longValue3 = -9223372036854775807L;
            } else {
                longValue3 = l2.longValue();
            }
            this.A05 = longValue3;
        }
        this.A03 = r11.A05;
        this.A0V = Long.valueOf(r11.A04);
        Boolean bool2 = r11.A0D;
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        this.A0s = z;
    }

    public final void A0Q(AnonymousClass0C1 r14, AnonymousClass26H r15) {
        char c;
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        char c2;
        if (C43301uA.A04(r15.A06)) {
            AnonymousClass0QD.A02("Reel#merge.", StringFormatUtil.formatStrLocaleSafe(" Invalid Replay Reel. ID: %s, ItemCount: %d", r15.A06, Integer.valueOf(r15.A07.size())));
        }
        if (this.A0D == null) {
            this.A0D = r15;
        }
        AnonymousClass0a4.A09(r15.A01.equals(this.A0D.A01));
        List list = r15.A07;
        if (list != null) {
            ArrayList<C38031kc> arrayList = new ArrayList<>(list);
            AnonymousClass26H r0 = this.A0D;
            HashMap hashMap = new HashMap();
            for (C38031kc r1 : r0.A07) {
                hashMap.put(r1.A0I, r1);
            }
            this.A0D.A07.clear();
            for (C38031kc r4 : arrayList) {
                if (!r4.A06(r14) && r4.A08.A03()) {
                    List list2 = this.A0D.A07;
                    if (hashMap.containsKey(r4.A0I)) {
                        try {
                            C38031kc r02 = (C38031kc) hashMap.get(r4.A0I);
                            r02.A05(r4);
                            r4 = r02;
                        } catch (NullPointerException unused) {
                            String str = r4.A0I;
                            String str2 = "";
                            for (Map.Entry entry : hashMap.entrySet()) {
                                C36681iR A012 = C36681iR.A01("\n * ");
                                String A0J2 = AnonymousClass000.A0J((String) entry.getKey(), "->", ((C38031kc) entry.getValue()).A0I);
                                Object[] objArr = new Object[0];
                                AnonymousClass0a4.A06(objArr);
                                str2 = A012.A03(new BTS(objArr, str2, A0J2));
                            }
                            AnonymousClass0QD.A02("Reel#safeMergeItem: Broadcast Replay failed to merge", StringFormatUtil.formatStrLocaleSafe("Broadcast ID (being merged): %s\nPrevious mapped Broadcast IDs: \n%s", str, str2));
                        }
                    }
                    list2.add(r4);
                }
            }
        } else {
            Iterator it = this.A0D.A07.iterator();
            while (it.hasNext()) {
                if (((C38031kc) it.next()).A06(r14)) {
                    it.remove();
                }
            }
        }
        A0K();
        Boolean bool = r15.A03;
        if (bool == null) {
            c = 65535;
        } else {
            c = 0;
            if (bool.booleanValue()) {
                c = 1;
            }
        }
        if (c != 65535) {
            if (bool == null) {
                c2 = 65535;
            } else {
                c2 = 0;
                if (bool.booleanValue()) {
                    c2 = 1;
                }
            }
            boolean z2 = false;
            if (c2 == 1) {
                z2 = true;
            }
            this.A0w = z2;
        }
        this.A0m = r15.A08;
        this.A0n = r15.A09;
        this.A0D.A00 = r15.A00;
        Integer num = r15.A04;
        if (num != null) {
            j = (long) num.intValue();
        } else {
            j = 0;
        }
        if (j != -9223372036854775807L) {
            if (num != null) {
                j4 = (long) num.intValue();
            } else {
                j4 = 0;
            }
            this.A04 = j4;
        }
        Integer num2 = r15.A05;
        if (num2 != null) {
            j2 = (long) num2.intValue();
        } else {
            j2 = 999999999;
        }
        if (j2 != -9223372036854775807L) {
            if (num2 != null) {
                j3 = (long) num2.intValue();
            } else {
                j3 = 999999999;
            }
            this.A05 = j3;
        }
        if (!A0J(r14).isEmpty()) {
            this.A03 = A0C(r14, A0J(r14).size() - 1).A03();
        } else {
            this.A03 = 0;
        }
        A0P(r14, (long) r15.A00);
        Boolean bool2 = r15.A02;
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        this.A0s = z;
    }

    public final void A0R(AnonymousClass0C1 r8, C33971dn r9) {
        long longValue;
        int intValue;
        char booleanValue;
        List list;
        List list2;
        List list3;
        char booleanValue2;
        int intValue2;
        long longValue2;
        this.A0I = r9.A0D;
        this.A0f = r9.A0k;
        this.A0S = r9.A0P;
        this.A07 = r9.A05;
        this.A0K = r9.A0F;
        this.A0J = r9.A0E;
        this.A0L = r9.A0G;
        this.A0F = r9.A0A;
        this.A0N = r9.A0J;
        if (r9.A00() != -9223372036854775807L) {
            this.A04 = r9.A00();
        }
        Long l = r9.A0Y;
        if (l == null) {
            longValue = -9223372036854775807L;
        } else {
            longValue = l.longValue();
        }
        if (longValue != -9223372036854775807L) {
            if (l == null) {
                longValue2 = -9223372036854775807L;
            } else {
                longValue2 = l.longValue();
            }
            this.A05 = longValue2;
        }
        Integer num = r9.A0Q;
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue != -1) {
            if (num == null) {
                intValue2 = -1;
            } else {
                intValue2 = num.intValue();
            }
            this.A01 = intValue2;
        }
        this.A0W = r9.A0Z;
        this.A0m = r9.A0n;
        this.A0n = r9.A0o;
        this.A0t = r9.A0u;
        List A032 = r9.A03();
        if (A032 != null) {
            A0S(A032);
        }
        List list4 = this.A0f;
        if (list4 != null) {
            A05(this, new HashSet(list4), r8);
        }
        if (A032 != null && !A032.isEmpty()) {
            this.A0q = false;
        }
        this.A0b = r9.A0g;
        this.A0X = r9.A0c;
        Boolean bool = r9.A0O;
        if (bool == null) {
            booleanValue = 65535;
        } else {
            booleanValue = bool.booleanValue();
        }
        if (booleanValue != 65535) {
            if (bool == null) {
                booleanValue2 = 65535;
            } else {
                booleanValue2 = bool.booleanValue();
            }
            boolean z = true;
            if (booleanValue2 != 1) {
                z = false;
            }
            this.A0w = z;
        }
        A0P(r8, (long) r9.A01);
        this.A03 = r9.A03;
        this.A0M = r9.A01(r8);
        this.A02 = r9.A02;
        this.A08 = r9.A06;
        this.A0A = r9.A07;
        this.A0H = r9.A0C;
        this.A0G = r9.A0B;
        this.A0o = r9.A0p;
        this.A0r = r9.A0r;
        this.A0E = r9.A09;
        this.A0a = r9.A0f;
        this.A0V = r9.A0W;
        this.A0R = r9.A0T;
        this.A0Y = r9.A0d;
        this.A0T = r9.A0R;
        this.A00 = r9.A00;
        List list5 = r9.A0l;
        if (list5 != null) {
            list = Collections.unmodifiableList(list5);
        } else {
            list = null;
        }
        this.A0j = list;
        List list6 = r9.A0m;
        if (list6 != null) {
            list2 = Collections.unmodifiableList(list6);
        } else {
            list2 = null;
        }
        this.A0k = list2;
        List list7 = r9.A0h;
        if (list7 != null) {
            list3 = Collections.unmodifiableList(list7);
        } else {
            list3 = null;
        }
        this.A0c = list3;
        this.A0p = r9.A0q;
        this.A0s = r9.A0s;
        this.A0Z = r9.A0e;
        this.A0U = r9.A0S;
        this.A0O = r9.A0K;
        this.A0d = r9.A0i;
        this.A0Q = r9.A0M;
        this.A0P = r9.A0L;
        this.A06 = r9.A04;
        this.A0B = r9.A08;
        if (!C252117x.A02().A07() && !C252117x.A02().A06()) {
            if ((((Boolean) AnonymousClass0L6.A02(r8, AnonymousClass0L7.STORIES_SEND_CLIENT_REELS_ON_TRAY_FETCH, "user_reel_persist_enabled", false, (AnonymousClass04H) null)).booleanValue() || ((Boolean) AnonymousClass0L6.A02(r8, AnonymousClass0L7.LAUNCHER_BACKGROUND_WIFI_PREFETCH, "reel_prefetch_from_client", false, (AnonymousClass04H) null)).booleanValue()) && this.A13 != null) {
                boolean z2 = false;
                if (this.A0I == AnonymousClass172.USER) {
                    z2 = true;
                }
                if (z2 && !this.A0x && r9.A0T != null && r9.A03() != null && !r9.A03().isEmpty() && r9.A0t) {
                    UserReelMediasStore.A03(new C475224i(r8, this.A13, r9.A03()), r8, (long) ((Integer) AnonymousClass0L6.A02(r8, AnonymousClass0L7.STORIES_SEND_CLIENT_REELS_ON_TRAY_FETCH, "write_delay_ms", 500, (AnonymousClass04H) null)).intValue());
                }
            }
        }
    }

    public final void A0S(List list) {
        synchronized (this.A12) {
            A0K();
            if (Aho()) {
                this.A0i = Collections.unmodifiableList(list);
            } else {
                this.A0l = Collections.unmodifiableSet(new HashSet(list));
            }
        }
    }

    public final boolean A0U() {
        for (AnonymousClass2Ay ANQ : this.A0g) {
            if (!ANQ.ANQ()) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0V() {
        if (this.A0I == AnonymousClass172.ARCHIVE_DAY) {
            return true;
        }
        return false;
    }

    public final boolean A0W() {
        if (this.A0C != null) {
            return true;
        }
        return false;
    }

    public final boolean A0X() {
        if (this.A0D != null) {
            return true;
        }
        return false;
    }

    public final boolean A0Y() {
        Long l = this.A0V;
        if (l == null) {
            return false;
        }
        if (l.longValue() <= System.currentTimeMillis() / 1000) {
            return true;
        }
        return false;
    }

    public final boolean A0c() {
        if (this.A0I == AnonymousClass172.NETEGO) {
            return true;
        }
        return false;
    }

    public final boolean A0d() {
        AnonymousClass172 r2 = this.A0I;
        if (r2 == AnonymousClass172.HIGHLIGHT || r2 == AnonymousClass172.SHOPPING_AUTOHIGHLIGHT) {
            return true;
        }
        return false;
    }

    public final boolean A0e() {
        AnonymousClass172 r2 = this.A0I;
        if (r2 == AnonymousClass172.SUGGESTED_HIGHLIGHT || r2 == AnonymousClass172.SUGGESTED_SHOP_HIGHLIGHT) {
            return true;
        }
        return false;
    }

    public final boolean A0g() {
        return Constants.A0C.equals(this.A0T);
    }

    public final boolean A0h(AnonymousClass0C1 r3) {
        if (!this.A0x) {
            return this.A0o;
        }
        if (A00(r3, new C35881h5(this)) != null) {
            return true;
        }
        return false;
    }

    public final boolean A0j(AnonymousClass0C1 r3) {
        if (!this.A0x) {
            return this.A0r;
        }
        if (A00(r3, new C35961hD(this)) != null) {
            return true;
        }
        return false;
    }

    public final boolean A0k(AnonymousClass0C1 r3) {
        if (this.A0e.isEmpty() || !A0l(r3)) {
            return false;
        }
        return true;
    }

    public final boolean A0n(AnonymousClass0C1 r4) {
        Integer num = Constants.ZERO;
        Integer num2 = this.A0T;
        if ((num.equals(num2) || Constants.A0C.equals(num2)) && A0J(r4).size() > 1) {
            return true;
        }
        return false;
    }

    public final boolean A0o(AnonymousClass0C1 r5) {
        if (this.A0z == null) {
            this.A0z = (Boolean) AnonymousClass0L6.A02(r5, AnonymousClass0L7.TOP_CLIPS_POSITION_KILLSWITCH, "is_enabled", false, (AnonymousClass04H) null);
        }
        return this.A0z.booleanValue();
    }

    public final boolean A0p(String str) {
        for (AnonymousClass1NJ id : this.A0l) {
            if (id.getId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final String AWS(AnonymousClass0C1 r4) {
        List list = this.A10;
        if (list.isEmpty() || !((C39941no) list.get(0)).A0t()) {
            return null;
        }
        return C30671Ut.A0A(r4, ((C39941no) list.get(0)).A08);
    }

    public final boolean Aho() {
        if (this.A0I == AnonymousClass172.ADS) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Reel) || !AnonymousClass17M.A00(((Reel) obj).getId(), getId())) {
            return false;
        }
        return true;
    }

    public final String getId() {
        return this.A13;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("{id: ");
        sb.append(this.A13);
        sb.append(" owner: ");
        C249916w r0 = this.A0M;
        if (r0 != null) {
            str = r0.toString();
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(" reel type: ");
        sb.append(this.A0I);
        sb.append("}");
        return sb.toString();
    }

    public Reel(String str, C249916w r5, boolean z) {
        boolean z2 = true;
        this.A14 = true;
        this.A04 = -9223372036854775807L;
        this.A05 = -9223372036854775807L;
        this.A01 = -1;
        this.A0m = true;
        this.A12 = new Object();
        if (z && r5.AZG() != Constants.ONE) {
            z2 = false;
        }
        AnonymousClass0a4.A0A(z2);
        this.A13 = str;
        this.A0M = r5;
        this.A0x = z;
    }

    public final int A07(AnonymousClass0C1 r2) {
        return A0J(r2).size();
    }

    public final int A08(AnonymousClass0C1 r9) {
        if (!A0m(r9) && !A0W() && !A0a() && !A0V() && !Aho()) {
            if (!A0f() || !A0o(r9)) {
                long A092 = A09(r9);
                List A0J2 = A0J(r9);
                for (int i = 0; i < A0J2.size(); i++) {
                    if (((C39941no) A0J2.get(i)).A03() > A092) {
                        return i;
                    }
                }
            } else {
                AnonymousClass0a4.A0B(A0f(), "getSeenPosition() should only be used for Top Clips! See T57151133 for more info");
                return C35891h6.A00(r9).A01(getId()) + 1;
            }
        }
        return 0;
    }

    public final C39941no A0C(AnonymousClass0C1 r2, int i) {
        return (C39941no) A0J(r2).get(i);
    }

    public final AnonymousClass22C A0D(AnonymousClass0C1 r4) {
        C39941no A002;
        if (A0h(r4)) {
            return null;
        }
        if (!this.A0x || (A002 = A00(r4, new C37321jT(this))) == null) {
            return this.A0P;
        }
        if (A002.A0E == Constants.ZERO) {
            return A002.A0C().AUg();
        }
        return null;
    }

    public final C35981hF A0E(AnonymousClass0C1 r2) {
        C39941no A002;
        if (A0h(r2)) {
            return null;
        }
        if (!this.A0x || (A002 = A00(r2, new C35951hC(this))) == null) {
            return this.A0Q;
        }
        return A002.A0H();
    }

    public final String A0I() {
        if (A0W() && !this.A0C.A04().isEmpty()) {
            return "live_with";
        }
        if (A0W()) {
            return "live";
        }
        if (A0X()) {
            return "replay";
        }
        if (A0d()) {
            return "highlight";
        }
        if (A0e()) {
            return "suggested_highlight";
        }
        if (A0b()) {
            return "live_question_and_answer";
        }
        if (A0Z()) {
            return "group";
        }
        return "story";
    }

    public final void A0N(AnonymousClass0C1 r3) {
        C23300zv.A00(r3).BXT(new C35241g2(this));
    }

    public final void A0O(AnonymousClass0C1 r3) {
        C23300zv.A00(r3).A04(new C35241g2(this));
    }

    public final void A0P(AnonymousClass0C1 r8, long j) {
        String id;
        boolean z;
        if (!A0W() && !Aho() && !A0c()) {
            if (this.A0t) {
                id = "NUX";
            } else {
                id = getId();
            }
            C35891h6 A002 = C35891h6.A00(r8);
            synchronized (A002) {
                C35911h8 r4 = A002.A02;
                synchronized (r4) {
                    C35911h8.A00(r4);
                    if (!r4.A03.containsKey(id) || j > ((Long) r4.A03.get(id)).longValue()) {
                        while (r4.A02.size() >= r4.A00) {
                            List list = r4.A02;
                            r4.A01.remove((String) list.remove(list.size() - 1));
                        }
                        r4.A02.remove(id);
                        r4.A02.add(0, id);
                        HashMap hashMap = r4.A01;
                        Long valueOf = Long.valueOf(j);
                        hashMap.put(id, valueOf);
                        r4.A03.put(id, valueOf);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    A002.A00.A01(Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    public final boolean A0T() {
        if (A0W() || A0X()) {
            return true;
        }
        return false;
    }

    public final boolean A0Z() {
        if (A0G() == Constants.A02) {
            return true;
        }
        return false;
    }

    public final boolean A0a() {
        if (A0d() || A0e()) {
            return true;
        }
        return false;
    }

    public final boolean A0b() {
        if (A0W()) {
            boolean z = false;
            if (this.A0C.A0F != null) {
                z = true;
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0f() {
        if (A0G() == Constants.A03) {
            return true;
        }
        return false;
    }

    public final boolean A0i(AnonymousClass0C1 r8) {
        List A0J2 = A0J(r8);
        if (!A0Z() || !this.A0q) {
            long j = -1;
            if (!this.A0e.isEmpty()) {
                j = ((Long) Collections.max(this.A0e)).longValue();
            }
            if (A0J2.isEmpty()) {
                if (j >= this.A03) {
                    return true;
                }
            } else if (Math.max(((C39941no) A0J2.get(A0J2.size() - 1)).A03(), j) >= this.A03) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0l(AnonymousClass0C1 r2) {
        return A0J(r2).isEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public final boolean A0m(AnonymousClass0C1 r7) {
        long max;
        if (A0W()) {
            return false;
        }
        List A0J2 = A0J(r7);
        if (A0J2.isEmpty()) {
            max = this.A03;
        } else if (!A0f() || !A0o(r7)) {
            max = Math.max(((C39941no) A0J2.get(A0J2.size() - 1)).A03(), this.A03);
        } else {
            AnonymousClass0a4.A0B(A0f(), "getSeenPosition() should only be used for Top Clips! See T57151133 for more info");
            if (C35891h6.A00(r7).A01(getId()) == A0J(r7).size() - 1) {
                return true;
            }
            return false;
        }
        if (max > A09(r7)) {
            return false;
        }
    }
}
