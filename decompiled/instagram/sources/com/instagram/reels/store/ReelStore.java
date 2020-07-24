package com.instagram.reels.store;

import android.util.LruCache;
import com.google.common.collect.MapMakerInternalMap;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.GroupUserStoryTarget;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass14J;
import p000X.AnonymousClass14Q;
import p000X.AnonymousClass175;
import p000X.AnonymousClass17O;
import p000X.AnonymousClass1CJ;
import p000X.AnonymousClass1CL;
import p000X.AnonymousClass1CN;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass26F;
import p000X.AnonymousClass26H;
import p000X.AnonymousClass2Ay;
import p000X.C05640Lj;
import p000X.C06570Po;
import p000X.C105814hT;
import p000X.C106504ic;
import p000X.C106534if;
import p000X.C106634ip;
import p000X.C11200ea;
import p000X.C12890hY;
import p000X.C13300iJ;
import p000X.C13460iZ;
import p000X.C13530ig;
import p000X.C22490yW;
import p000X.C23160zf;
import p000X.C23300zv;
import p000X.C249216o;
import p000X.C249316p;
import p000X.C249416q;
import p000X.C249516r;
import p000X.C249816v;
import p000X.C249916w;
import p000X.C250016x;
import p000X.C33911dh;
import p000X.C33971dn;
import p000X.C35241g2;
import p000X.C37331jU;
import p000X.C38031kc;
import p000X.C38051ke;
import p000X.C39711nM;
import p000X.C39721nN;
import p000X.C40131o8;
import p000X.C40141o9;
import p000X.C42421sK;
import p000X.C51232Ju;
import p000X.C51242Jv;
import p000X.C51252Jw;
import p000X.C51262Jx;

public final class ReelStore implements C06570Po {
    public C11200ea A00;
    public Reel A01;
    public C249516r A02;
    public AnonymousClass17O A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C23300zv A07;
    public final C249316p A08;
    public final C249416q A09;
    public final AnonymousClass0C1 A0A;
    public final Map A0B = new HashMap();
    public final Map A0C = new HashMap();
    public final Set A0D = new HashSet();
    public final ConcurrentMap A0E;
    public final boolean A0F;

    public static synchronized C249516r A01(ReelStore reelStore, C249516r r7, boolean z) {
        C249516r r2;
        synchronized (reelStore) {
            r2 = new C249516r(reelStore.A0F);
            for (Reel reel : r7.A00()) {
                if (reel.A0W()) {
                    C38051ke r1 = reel.A0C.A08;
                    if (!r1.A00() && r1 != C38051ke.HIDDEN) {
                        AnonymousClass0C1 r3 = reelStore.A0A;
                        if (((C40131o8) r3.AVA(C40131o8.class, new C40141o9(r3))).A00.getBoolean(reel.A0C.A0I, false)) {
                        }
                    }
                }
                if (reel.A0x) {
                    r2.A02(C250016x.A01(reelStore.A0A).A04(reel));
                } else if (!reel.A0l(reelStore.A0A) || !reel.A0i(reelStore.A0A)) {
                    r2.A02(reel);
                }
            }
            if (!reelStore.A04 || z) {
                r2.A04(Reel.A01(reelStore.A0A, r2.A01()));
                reelStore.A04 = true;
            } else {
                r2.A04(new C37331jU(reelStore));
            }
        }
        return r2;
    }

    public static synchronized void A07(ReelStore reelStore, Reel reel) {
        synchronized (reelStore) {
            Reel A042 = C250016x.A01(reelStore.A0A).A04(reel);
            ArrayList arrayList = new ArrayList();
            for (Reel reel2 : reelStore.A02.A00()) {
                if (reelStore.A0A.A06.equals(reel2.A0M.AZf())) {
                    arrayList.add(reel2);
                }
            }
            reelStore.A02.A06(arrayList);
            C249516r r2 = reelStore.A02;
            if (r2.A02) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(A042.getId(), A042);
                linkedHashMap.putAll(r2.A00);
                r2.A00 = linkedHashMap;
            } else {
                r2.A01.add(0, A042);
            }
        }
    }

    public static synchronized void A08(ReelStore reelStore, C249516r r7, AnonymousClass26F r8) {
        synchronized (reelStore) {
            if (r8 != null) {
                List list = r8.A00;
                if (list != null && !list.isEmpty()) {
                    for (AnonymousClass26H r4 : r8.A00) {
                        String str = r4.A06;
                        C13300iJ r1 = r4.A01;
                        Reel A002 = reelStore.A00(str, new C249816v(r1), r1.equals(reelStore.A0A.A06));
                        A002.A0Q(reelStore.A0A, r4);
                        C250016x.A01(reelStore.A0A).A06(A002);
                        if (!r4.A01.equals(reelStore.A0A.A06)) {
                            r7.A02(A002);
                        }
                    }
                }
            }
        }
    }

    public static synchronized void A09(ReelStore reelStore, C249516r r6, List list) {
        synchronized (reelStore) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C38031kc r3 = (C38031kc) it.next();
                    Reel A002 = reelStore.A00(r3.A0I, new C249816v(r3.A0C), false);
                    A002.A0M(r3);
                    r6.A02(A002);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r11.equals(r6.A01(r8.A0A).AZf()) == false) goto L_0x0032;
     */
    public static synchronized void A0A(ReelStore reelStore, C249516r r9, List list, C13300iJ r11) {
        String str;
        boolean z;
        synchronized (reelStore) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C33971dn r6 = (C33971dn) it.next();
                    try {
                        if (r6.A01(reelStore.A0A).AZG() == Constants.ONE) {
                            z = true;
                        }
                        z = false;
                        Reel A002 = reelStore.A00(r6.A0b, r6.A01(reelStore.A0A), z);
                        A002.A0R(reelStore.A0A, r6);
                        C250016x.A01(reelStore.A0A).A06(A002);
                        ((C39711nM) reelStore.A0A.AVA(C39711nM.class, new C39721nN())).A01(A002);
                        if (!A002.A0Y() || C22490yW.A00()) {
                            r9.A02(A002);
                        }
                        if (A002.A0t) {
                            reelStore.A01 = A002;
                        }
                    } catch (RuntimeException e) {
                        if (r6 == null) {
                            AnonymousClass0QD.A06("populateReelsFromReelTrayResponse#mergeReelFailed", "reelResponseItem is null", e);
                        } else {
                            try {
                                StringWriter stringWriter = new StringWriter();
                                C13460iZ A052 = C12890hY.A00.A05(stringWriter);
                                C33911dh.A00(A052, r6);
                                A052.close();
                                str = stringWriter.toString();
                            } catch (IOException | RuntimeException unused) {
                                str = "serialization-failed";
                            }
                            AnonymousClass0QD.A06("populateReelsFromReelTrayResponse#mergeReelFailed", AnonymousClass000.A0N("reelResponseItem: ", r6.A02(reelStore.A0A), " json: ", str), e);
                        }
                    }
                }
            }
        }
    }

    public final synchronized List A0K(String str) {
        List A062;
        List A0M = A0M(false);
        if (this.A0C.containsKey(str) && !((List) this.A0C.get(str)).isEmpty()) {
            A0M = (List) this.A0C.get(str);
        }
        A062 = A06(this.A0A, A0M);
        if (!this.A0C.containsKey(str)) {
            A062 = A05(this, A062);
            AnonymousClass0C1 r3 = this.A0A;
            AnonymousClass0L7 r6 = AnonymousClass0L7.STORIES_IFU_LOADING_LATENCY;
            if (((Boolean) AnonymousClass0L6.A02(r3, r6, "reduce_tray_size", false, (AnonymousClass04H) null)).booleanValue()) {
                A062 = A062.subList(0, Math.min(((Integer) AnonymousClass0L6.A02(this.A0A, r6, "tray_size", 30, (AnonymousClass04H) null)).intValue(), A062.size()));
            }
            this.A0C.put(str, A062);
        }
        this.A0D.add(str);
        return A062;
    }

    public final synchronized List A0L(List list, String str) {
        List arrayList;
        List A062;
        if (!this.A0C.containsKey(str) || ((List) this.A0C.get(str)).isEmpty()) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) this.A0E.get((String) it.next());
                if (reel != null) {
                    arrayList.add(reel);
                }
            }
        } else {
            arrayList = (List) this.A0C.get(str);
        }
        A062 = A06(this.A0A, arrayList);
        if (!this.A0C.containsKey(str)) {
            A062 = A05(this, A062);
            this.A0C.put(str, A062);
        }
        return A062;
    }

    public final synchronized List A0M(boolean z) {
        boolean z2;
        C249516r A012 = A01(this, this.A02, z);
        C249516r r1 = this.A02;
        r1.A00.clear();
        r1.A01.clear();
        this.A02.A03(A012.A01());
        C249516r r12 = this.A02;
        if (r12.A02) {
            z2 = r12.A00.isEmpty();
        } else {
            z2 = r12.A01.isEmpty();
        }
        if (z2) {
            AnonymousClass0QD.A01("com.instagram.reels.store.ReelStore", "main feed tray reels is empty");
        }
        return this.A02.A01();
    }

    public final synchronized void A0O(Reel reel) {
        boolean z;
        C249516r r1 = this.A02;
        if (r1.A02) {
            z = r1.A00.containsKey(reel.getId());
        } else {
            z = r1.A01.contains(reel);
        }
        if (!z) {
            this.A02.A02(reel);
            this.A04 = false;
        }
    }

    public final void A0P(C13300iJ r4, boolean z) {
        for (Reel reel : A0M(false)) {
            C13300iJ AZf = reel.A0M.AZf();
            if (AZf != null && AZf.equals(r4)) {
                reel.A0w = z;
            }
        }
    }

    public final synchronized void A0Q(String str) {
        LruCache lruCache;
        Reel reel = (Reel) this.A0E.remove(str);
        if (reel != null) {
            C249416q r0 = this.A09;
            if (!(str == null || (lruCache = r0.A00) == null)) {
                lruCache.remove(str);
            }
            C249516r r1 = this.A02;
            if (r1.A02) {
                r1.A00.remove(reel.getId());
            } else {
                r1.A01.remove(reel);
            }
            for (Map remove : ((C39711nM) this.A0A.AVA(C39711nM.class, new C39721nN())).A00.values()) {
                remove.remove(reel.getId());
            }
            reel.A0O(this.A0A);
        }
    }

    public final synchronized boolean A0R() {
        int i;
        boolean z;
        C249516r r1 = this.A02;
        if (r1.A02) {
            i = r1.A00.size();
        } else {
            i = r1.A01.size();
        }
        z = true;
        if (i != 1) {
            z = false;
        }
        return z;
    }

    public final synchronized boolean A0S(List list, List list2, AnonymousClass26F r7, C13300iJ r8, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (list == null && list2 == null && r7 == null) {
            return false;
        }
        this.A05 = z;
        this.A04 = false;
        List A012 = this.A02.A01();
        for (Reel reel : this.A02.A00()) {
            reel.A0u = false;
        }
        C249516r r2 = this.A02;
        r2.A00.clear();
        r2.A01.clear();
        A0A(this, this.A02, list, r8);
        A09(this, this.A02, list2);
        A08(this, this.A02, r7);
        A012.clear();
        A03(this, r8);
        Reel A0G = A0G(r8.getId());
        if (A0G == null || A0G.A0l(this.A0A)) {
            z3 = true;
        }
        if (z3) {
            if (A0G == null) {
                A0G = new Reel(r8.getId(), new C249816v(r8), true);
            }
            A0C(A0G.getId(), A0G, false);
        }
        A07(this, A0G);
        C23300zv.A00(this.A0A).A04(new C35241g2(this.A02.A01()));
        C249516r r1 = this.A02;
        if (r1.A02) {
            z2 = r1.A00.isEmpty();
        } else {
            z2 = r1.A01.isEmpty();
        }
        return !z2;
    }

    public final void onUserSessionWillEnd(boolean z) {
        synchronized (this) {
            C249516r r1 = this.A02;
            r1.A00.clear();
            r1.A01.clear();
            this.A0E.clear();
            LruCache lruCache = this.A09.A00;
            if (lruCache != null) {
                lruCache.evictAll();
            }
            this.A0B.clear();
            this.A04 = false;
            this.A05 = false;
            this.A01 = null;
        }
        A0N();
    }

    public static ReelStore A02(AnonymousClass0C1 r2) {
        return (ReelStore) r2.AVA(ReelStore.class, new C249216o(r2));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:373)
        	at java.base/java.util.ArrayList.get(ArrayList.java:425)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized java.util.List A03(com.instagram.reels.store.ReelStore r16, p000X.C13300iJ r17) {
        /*
            r2 = r16
            monitor-enter(r2)
            X.174 r6 = new X.174     // Catch:{ all -> 0x02dd }
            X.0C1 r1 = r2.A0A     // Catch:{ all -> 0x02dd }
            X.16r r0 = r2.A02     // Catch:{ all -> 0x02dd }
            java.util.List r0 = r0.A01()     // Catch:{ all -> 0x02dd }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x02dd }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x02dd }
            r4.<init>()     // Catch:{ all -> 0x02dd }
            r7 = r17
            java.lang.String r0 = r7.getId()     // Catch:{ all -> 0x02dd }
            com.instagram.model.reels.Reel r3 = r2.A0G(r0)     // Catch:{ all -> 0x02dd }
            if (r3 != 0) goto L_0x003c
            com.instagram.model.reels.Reel r3 = new com.instagram.model.reels.Reel     // Catch:{ all -> 0x02dd }
            java.lang.String r8 = r7.getId()     // Catch:{ all -> 0x02dd }
            X.16v r5 = new X.16v     // Catch:{ all -> 0x02dd }
            r5.<init>(r7)     // Catch:{ all -> 0x02dd }
            X.172 r1 = p000X.AnonymousClass172.USER     // Catch:{ all -> 0x02dd }
            r0 = 1
            r3.<init>(r8, r5, r0)     // Catch:{ all -> 0x02dd }
            r3.A0I = r1     // Catch:{ all -> 0x02dd }
            java.lang.String r1 = r3.getId()     // Catch:{ all -> 0x02dd }
            r0 = 0
            r2.A0C(r1, r3, r0)     // Catch:{ all -> 0x02dd }
        L_0x003c:
            com.instagram.pendingmedia.store.PendingMediaStore r1 = r6.A00     // Catch:{ all -> 0x02dd }
            java.lang.Integer r0 = p000X.Constants.A0C     // Catch:{ all -> 0x02dd }
            java.util.List r0 = r1.A06(r0)     // Catch:{ all -> 0x02dd }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x02dd }
            r8.<init>()     // Catch:{ all -> 0x02dd }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x02dd }
        L_0x004d:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x0126
            java.lang.Object r5 = r17.next()     // Catch:{ all -> 0x02dd }
            com.instagram.pendingmedia.model.PendingMedia r5 = (com.instagram.pendingmedia.model.PendingMedia) r5     // Catch:{ all -> 0x02dd }
            boolean r0 = r5.A2c     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x011b
            java.lang.Class<X.2Jr> r0 = p000X.C51222Jr.class
            X.2Jy r11 = new X.2Jy     // Catch:{ IllegalStateException -> 0x0094 }
            r11.<init>(r6)     // Catch:{ IllegalStateException -> 0x0094 }
            java.lang.String r10 = "No 'Close Friends', 'Archive', or 'All' story target for the PendingMedia"
            monitor-enter(r5)     // Catch:{ IllegalStateException -> 0x0094 }
            java.util.List r0 = r5.A0M(r0)     // Catch:{ all -> 0x0091 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0091 }
        L_0x006f:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x008b
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x0091 }
            X.0zf r1 = (p000X.C23160zf) r1     // Catch:{ all -> 0x0091 }
            boolean r0 = r11.apply(r1)     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x006f
            monitor-exit(r5)     // Catch:{ IllegalStateException -> 0x0094 }
            X.2Jx r0 = new X.2Jx     // Catch:{ IllegalStateException -> 0x0094 }
            r0.<init>(r5, r1)     // Catch:{ IllegalStateException -> 0x0094 }
            r8.add(r0)     // Catch:{ IllegalStateException -> 0x0094 }
            goto L_0x004d
        L_0x008b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0091 }
            r0.<init>(r10)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ IllegalStateException -> 0x0094 }
            throw r0     // Catch:{ IllegalStateException -> 0x0094 }
        L_0x0094:
            r16 = move-exception
            java.lang.Class<X.0zf> r0 = p000X.C23160zf.class
            java.util.List r0 = r5.A0M(r0)     // Catch:{ all -> 0x02dd }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x02dd }
            java.lang.String r9 = "["
        L_0x00a1:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x02dd }
            r1 = 2
            r14 = 1
            r13 = 0
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r5 = r15.next()     // Catch:{ all -> 0x02dd }
            X.0zf r5 = (p000X.C23160zf) r5     // Catch:{ all -> 0x02dd }
            boolean r11 = r5 instanceof p000X.C51222Jr     // Catch:{ all -> 0x02dd }
            r12 = 0
            if (r11 == 0) goto L_0x00bc
            r0 = r5
            X.2Jr r0 = (p000X.C51222Jr) r0     // Catch:{ all -> 0x02dd }
            com.instagram.pendingmedia.model.UserStoryTarget r12 = r0.A00()     // Catch:{ all -> 0x02dd }
        L_0x00bc:
            r0 = 5
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x02dd }
            int r0 = r5.AX9()     // Catch:{ all -> 0x02dd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02dd }
            r10[r13] = r0     // Catch:{ all -> 0x02dd }
            com.instagram.pendingmedia.model.constants.ShareType r0 = r5.AVv()     // Catch:{ all -> 0x02dd }
            java.lang.String r5 = "N/A"
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x02dd }
        L_0x00d5:
            r10[r14] = r0     // Catch:{ all -> 0x02dd }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x02dd }
            r10[r1] = r0     // Catch:{ all -> 0x02dd }
            r1 = 3
            if (r12 != 0) goto L_0x00e1
            r14 = 0
        L_0x00e1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x02dd }
            r10[r1] = r0     // Catch:{ all -> 0x02dd }
            r0 = 4
            if (r12 == 0) goto L_0x00ee
            java.lang.String r5 = r12.AZE()     // Catch:{ all -> 0x02dd }
        L_0x00ee:
            r10[r0] = r5     // Catch:{ all -> 0x02dd }
            java.lang.String r0 = "{subShareId: %s, shareType: %s, isMultiConfigStoryTarget: %s, hasUserStoryTarget: %s, UserStoryTargetType: %s}"
            java.lang.String r0 = java.lang.String.format(r0, r10)     // Catch:{ all -> 0x02dd }
            java.lang.String r9 = p000X.AnonymousClass000.A0E(r9, r0)     // Catch:{ all -> 0x02dd }
            goto L_0x00a1
        L_0x00fc:
            r0 = r5
            goto L_0x00d5
        L_0x00fe:
            java.lang.String r0 = "]"
            java.lang.String r5 = p000X.AnonymousClass000.A0E(r9, r0)     // Catch:{ all -> 0x02dd }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x02dd }
            java.lang.String r0 = r16.getMessage()     // Catch:{ all -> 0x02dd }
            r1[r13] = r0     // Catch:{ all -> 0x02dd }
            r1[r14] = r5     // Catch:{ all -> 0x02dd }
            java.lang.String r0 = "LegacyReelShareMapper#mapUserReelShares Exception: %s, ShareTargetList for PendingMedia: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x02dd }
            java.lang.String r0 = "LegacyReelShareMapper#mapUserReelShares"
            p000X.AnonymousClass0QD.A01(r0, r1)     // Catch:{ all -> 0x02dd }
            goto L_0x004d
        L_0x011b:
            X.2Jx r1 = new X.2Jx     // Catch:{ all -> 0x02dd }
            r0 = 0
            r1.<init>(r5, r0)     // Catch:{ all -> 0x02dd }
            r8.add(r1)     // Catch:{ all -> 0x02dd }
            goto L_0x004d
        L_0x0126:
            r2.A0B(r7, r3, r8)     // Catch:{ all -> 0x02dd }
            r4.add(r3)     // Catch:{ all -> 0x02dd }
            monitor-enter(r2)     // Catch:{ all -> 0x02dd }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x02da }
            r9.<init>()     // Catch:{ all -> 0x02da }
            com.instagram.pendingmedia.store.PendingMediaStore r1 = r6.A00     // Catch:{ all -> 0x02da }
            java.lang.Integer r0 = p000X.Constants.A04     // Catch:{ all -> 0x02da }
            java.util.List r0 = r1.A06(r0)     // Catch:{ all -> 0x02da }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x02da }
        L_0x013e:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r5 = r16.next()     // Catch:{ all -> 0x02da }
            com.instagram.pendingmedia.model.PendingMedia r5 = (com.instagram.pendingmedia.model.PendingMedia) r5     // Catch:{ all -> 0x02da }
            java.lang.Class<X.2Jr> r0 = p000X.C51222Jr.class
            java.util.List r0 = r5.A0M(r0)     // Catch:{ all -> 0x02da }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x02da }
        L_0x0154:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x013e
            java.lang.Object r8 = r15.next()     // Catch:{ all -> 0x02da }
            X.2Jr r8 = (p000X.C51222Jr) r8     // Catch:{ all -> 0x02da }
            com.instagram.pendingmedia.model.UserStoryTarget r14 = r8.A00()     // Catch:{ all -> 0x02da }
            boolean r0 = r14 instanceof com.instagram.pendingmedia.model.GroupUserStoryTarget     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x0154
            com.instagram.pendingmedia.model.GroupUserStoryTarget r14 = (com.instagram.pendingmedia.model.GroupUserStoryTarget) r14     // Catch:{ all -> 0x02da }
            java.lang.String r12 = p000X.C51232Ju.A01(r14)     // Catch:{ all -> 0x02da }
            java.util.HashMap r0 = r6.A02     // Catch:{ all -> 0x02da }
            java.lang.Object r10 = r0.get(r12)     // Catch:{ all -> 0x02da }
            com.instagram.model.reels.Reel r10 = (com.instagram.model.reels.Reel) r10     // Catch:{ all -> 0x02da }
            if (r10 != 0) goto L_0x019a
            X.2Jv r11 = new X.2Jv     // Catch:{ all -> 0x02da }
            java.lang.String r13 = r14.A00()     // Catch:{ all -> 0x02da }
            java.lang.String r10 = r14.A01     // Catch:{ all -> 0x02da }
            X.0C1 r1 = r6.A01     // Catch:{ all -> 0x02da }
            java.util.List r0 = r14.A03     // Catch:{ all -> 0x02da }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x02da }
            java.util.List r0 = p000X.C51252Jw.A02(r1, r0)     // Catch:{ all -> 0x02da }
            r11.<init>(r13, r10, r0)     // Catch:{ all -> 0x02da }
            com.instagram.model.reels.Reel r10 = new com.instagram.model.reels.Reel     // Catch:{ all -> 0x02da }
            r0 = 0
            r10.<init>(r12, r11, r0)     // Catch:{ all -> 0x02da }
            java.util.Set r0 = r6.A03     // Catch:{ all -> 0x02da }
            r0.add(r10)     // Catch:{ all -> 0x02da }
        L_0x019a:
            java.lang.Object r1 = r9.get(r10)     // Catch:{ all -> 0x02da }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x02da }
            if (r1 != 0) goto L_0x01a7
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x02da }
            r1.<init>()     // Catch:{ all -> 0x02da }
        L_0x01a7:
            X.2Jx r0 = new X.2Jx     // Catch:{ all -> 0x02da }
            r0.<init>(r5, r8)     // Catch:{ all -> 0x02da }
            r1.add(r0)     // Catch:{ all -> 0x02da }
            r9.put(r10, r1)     // Catch:{ all -> 0x02da }
            java.util.Set r0 = r6.A04     // Catch:{ all -> 0x02da }
            r0.add(r10)     // Catch:{ all -> 0x02da }
            goto L_0x0154
        L_0x01b8:
            java.util.HashMap r0 = r6.A02     // Catch:{ all -> 0x02da }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x02da }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x02da }
        L_0x01c2:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x02da }
            com.instagram.model.reels.Reel r1 = (com.instagram.model.reels.Reel) r1     // Catch:{ all -> 0x02da }
            boolean r0 = r1.A0Z()     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x01c2
            java.util.Set r0 = r9.keySet()     // Catch:{ all -> 0x02da }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x02da }
            if (r0 != 0) goto L_0x01c2
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02da }
            r0.<init>()     // Catch:{ all -> 0x02da }
            r9.put(r1, r0)     // Catch:{ all -> 0x02da }
            java.util.Set r0 = r6.A04     // Catch:{ all -> 0x02da }
            r0.add(r1)     // Catch:{ all -> 0x02da }
            goto L_0x01c2
        L_0x01ec:
            java.util.Set r0 = r6.A03     // Catch:{ all -> 0x02da }
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)     // Catch:{ all -> 0x02da }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x02da }
        L_0x01f6:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x020b
            java.lang.Object r5 = r8.next()     // Catch:{ all -> 0x02da }
            com.instagram.model.reels.Reel r5 = (com.instagram.model.reels.Reel) r5     // Catch:{ all -> 0x02da }
            java.lang.String r1 = r5.getId()     // Catch:{ all -> 0x02da }
            r0 = 0
            r2.A0C(r1, r5, r0)     // Catch:{ all -> 0x02da }
            goto L_0x01f6
        L_0x020b:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x02da }
            r5.<init>()     // Catch:{ all -> 0x02da }
            java.util.Set r0 = r9.entrySet()     // Catch:{ all -> 0x02da }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x02da }
        L_0x0218:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x028d
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x02da }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x02da }
            java.lang.Object r8 = r1.getKey()     // Catch:{ all -> 0x02da }
            com.instagram.model.reels.Reel r8 = (com.instagram.model.reels.Reel) r8     // Catch:{ all -> 0x02da }
            boolean r0 = r8.A0Z()     // Catch:{ all -> 0x02da }
            p000X.AnonymousClass0a4.A09(r0)     // Catch:{ all -> 0x02da }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x02da }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x02da }
            r2.A0B(r7, r8, r0)     // Catch:{ all -> 0x02da }
            X.0C1 r0 = r2.A0A     // Catch:{ all -> 0x02da }
            boolean r0 = r8.A0l(r0)     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x027f
            java.util.List r0 = r8.A0f     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x024d
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x02da }
            r0 = 1
            if (r1 == 0) goto L_0x024e
        L_0x024d:
            r0 = 0
        L_0x024e:
            if (r0 != 0) goto L_0x027f
            X.16r r1 = r2.A02     // Catch:{ all -> 0x02da }
            boolean r0 = r1.A02     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x0261
            java.util.LinkedHashMap r1 = r1.A00     // Catch:{ all -> 0x02da }
            java.lang.String r0 = r8.getId()     // Catch:{ all -> 0x02da }
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x02da }
            goto L_0x0267
        L_0x0261:
            java.util.List r0 = r1.A01     // Catch:{ all -> 0x02da }
            boolean r0 = r0.contains(r8)     // Catch:{ all -> 0x02da }
        L_0x0267:
            if (r0 == 0) goto L_0x027f
            X.16r r1 = r2.A02     // Catch:{ all -> 0x02da }
            boolean r0 = r1.A02     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x0279
            java.util.LinkedHashMap r1 = r1.A00     // Catch:{ all -> 0x02da }
            java.lang.String r0 = r8.getId()     // Catch:{ all -> 0x02da }
            r1.remove(r0)     // Catch:{ all -> 0x02da }
            goto L_0x0218
        L_0x0279:
            java.util.List r0 = r1.A01     // Catch:{ all -> 0x02da }
            r0.remove(r8)     // Catch:{ all -> 0x02da }
            goto L_0x0218
        L_0x027f:
            java.util.List r0 = r8.A0g     // Catch:{ all -> 0x02da }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02da }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0218
            r5.add(r8)     // Catch:{ all -> 0x02da }
            goto L_0x0218
        L_0x028d:
            X.17L r0 = new X.17L     // Catch:{ all -> 0x02da }
            r0.<init>(r2)     // Catch:{ all -> 0x02da }
            java.util.Collections.sort(r5, r0)     // Catch:{ all -> 0x02da }
            X.16r r1 = r2.A02     // Catch:{ all -> 0x02da }
            boolean r0 = r1.A02     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x02a2
            java.util.LinkedHashMap r0 = r1.A00     // Catch:{ all -> 0x02da }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02da }
            goto L_0x02a8
        L_0x02a2:
            java.util.List r0 = r1.A01     // Catch:{ all -> 0x02da }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02da }
        L_0x02a8:
            if (r0 != 0) goto L_0x02ba
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x02da }
            if (r0 != 0) goto L_0x02ba
            X.16r r0 = r2.A02     // Catch:{ all -> 0x02da }
            r0.A06(r5)     // Catch:{ all -> 0x02da }
            X.16r r0 = r2.A02     // Catch:{ all -> 0x02da }
            r0.A05(r5)     // Catch:{ all -> 0x02da }
        L_0x02ba:
            java.util.Set r0 = r6.A04     // Catch:{ all -> 0x02da }
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)     // Catch:{ all -> 0x02da }
            monitor-exit(r2)     // Catch:{ all -> 0x02dd }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x02dd }
        L_0x02c5:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x02d5
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x02dd }
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0     // Catch:{ all -> 0x02dd }
            r4.add(r0)     // Catch:{ all -> 0x02dd }
            goto L_0x02c5
        L_0x02d5:
            A07(r2, r3)     // Catch:{ all -> 0x02dd }
            monitor-exit(r2)
            return r4
        L_0x02da:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02dd }
            throw r0     // Catch:{ all -> 0x02dd }
        L_0x02dd:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.store.ReelStore.A03(com.instagram.reels.store.ReelStore, X.0iJ):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r22 == null) goto L_0x0019;
     */
    public static List A04(ReelStore reelStore, C13300iJ r21, C105814hT r22) {
        boolean z;
        boolean z2;
        List<C106504ic> list;
        String str;
        List list2;
        ReelStore reelStore2 = reelStore;
        AnonymousClass14Q A022 = AnonymousClass14Q.A02(reelStore2.A0A);
        AnonymousClass1CJ r2 = new AnonymousClass1CJ(A022, reelStore2.A0A);
        C105814hT r8 = r22;
        if (reelStore2.A06) {
            z = true;
        }
        z = false;
        synchronized (A022) {
            z2 = A022.A03;
        }
        if (!z2) {
            list = Collections.emptyList();
        } else if (!z) {
            ArrayList arrayList = new ArrayList();
            AnonymousClass14Q r0 = r2.A00;
            AnonymousClass14Q.A0A(r0);
            for (C105814hT A002 : r0.A0H.AYx()) {
                AnonymousClass1CJ.A00(r2, arrayList, A002);
            }
            reelStore2.A06 = true;
            list = arrayList;
        } else {
            ArrayList arrayList2 = new ArrayList();
            AnonymousClass1CJ.A00(r2, arrayList2, r8);
            list = arrayList2;
        }
        C13300iJ r222 = r21;
        AnonymousClass1CL r4 = new AnonymousClass1CL(reelStore2.A0A, reelStore2.A08, r222, reelStore2.A02.A01());
        if (z) {
            str = r8.A04;
        } else {
            str = null;
        }
        if (!r4.A05.containsKey(r4.A02.getId())) {
            C13300iJ r02 = r4.A02;
            Reel reel = new Reel(r02.getId(), new C249816v(r02), true);
            r4.A05.put(reel.getId(), reel);
            r4.A03.add(reel);
        }
        Object obj = r4.A05.get(r4.A02.getId());
        AnonymousClass0a4.A06(obj);
        Reel reel2 = (Reel) obj;
        AnonymousClass1CN r6 = new AnonymousClass1CN();
        for (C106504ic r3 : list) {
            UserStoryTarget userStoryTarget = r3.A01;
            String AZE = userStoryTarget.AZE();
            if (AZE.equals("GROUP")) {
                GroupUserStoryTarget groupUserStoryTarget = (GroupUserStoryTarget) userStoryTarget;
                String A012 = C51232Ju.A01(groupUserStoryTarget);
                Reel reel3 = (Reel) r4.A05.get(A012);
                if (reel3 == null) {
                    reel3 = new Reel(A012, new C51242Jv(groupUserStoryTarget.A00(), groupUserStoryTarget.A01, C51252Jw.A02(r4.A01, Collections.unmodifiableList(groupUserStoryTarget.A03))), false);
                    r4.A05.put(A012, reel3);
                    r4.A03.add(reel3);
                }
                list2 = (List) r6.A00.get(reel3);
                if (list2 == null) {
                    list2 = new ArrayList();
                    r6.A00.put(reel3, list2);
                }
            } else if (!AZE.equals("ARCHIVE")) {
                list2 = (List) r6.A00.get(reel2);
                if (list2 == null) {
                    list2 = new ArrayList();
                    r6.A00.put(reel2, list2);
                }
            }
            list2.add(r3);
        }
        for (Map.Entry entry : r6.A00.entrySet()) {
            Reel reel4 = (Reel) entry.getKey();
            ArrayList arrayList3 = new ArrayList();
            ArrayList<C106504ic> arrayList4 = new ArrayList<>();
            for (C106504ic r1 : (List) entry.getValue()) {
                AnonymousClass1NJ r03 = r1.A05;
                if (r03 != null) {
                    reel4.A0L(r03);
                    arrayList4.add(r1);
                } else {
                    arrayList3.add(r1);
                }
            }
            Collections.sort(arrayList3);
            if (str != null) {
                C249316p r04 = r4.A00;
                synchronized (reel4.A12) {
                    try {
                        List A023 = Reel.A02(r04, arrayList3);
                        List list3 = reel4.A0h;
                        ArrayList arrayList5 = new ArrayList(A023.size() + list3.size());
                        int i = 0;
                        int i2 = 0;
                        while (i < list3.size() && i2 < A023.size()) {
                            C106534if r12 = (C106534if) list3.get(i);
                            C106534if r15 = (C106534if) A023.get(i2);
                            C106504ic r14 = r12.A01;
                            long A003 = r14.A00();
                            long A004 = r15.A01.A00();
                            if (A003 == A004) {
                                arrayList5.add(r15);
                                i++;
                            } else if (A003 < A004) {
                                if (!r14.A06.A04.equals(str)) {
                                    arrayList5.add(r12);
                                }
                                i++;
                            } else {
                                arrayList5.add(r15);
                            }
                            i2++;
                        }
                        while (i < list3.size()) {
                            arrayList5.add(list3.get(i));
                            i++;
                        }
                        while (i2 < A023.size()) {
                            arrayList5.add(A023.get(i2));
                            i2++;
                        }
                        Reel.A03(reel4, Collections.unmodifiableList(arrayList5));
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
            } else {
                C249316p r05 = r4.A00;
                synchronized (reel4.A12) {
                    try {
                        Reel.A03(reel4, Collections.unmodifiableList(Reel.A02(r05, arrayList3)));
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet();
            for (C106504ic A005 : arrayList4) {
                hashSet.add(Long.valueOf(A005.A00()));
            }
            ArrayList arrayList6 = new ArrayList(reel4.A0h);
            boolean z3 = false;
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(Long.valueOf(((C106534if) it.next()).A01.A00()))) {
                    it.remove();
                    z3 = true;
                }
            }
            if (z3) {
                Reel.A03(reel4, Collections.unmodifiableList(arrayList6));
            }
            r4.A04.add(entry.getKey());
        }
        ArrayList<Reel> arrayList7 = new ArrayList<>(Collections.unmodifiableList(r4.A03));
        if (reelStore2.A0G(r222.getId()) == null) {
            arrayList7.add(new Reel(r222.getId(), new C249816v(r222), true));
        }
        for (Reel reel5 : arrayList7) {
            reelStore2.A0C(reel5.getId(), reel5, false);
        }
        Collections.reverse(arrayList7);
        reelStore2.A02.A05(arrayList7);
        Reel A0G = reelStore2.A0G(r222.getId());
        AnonymousClass0a4.A06(A0G);
        A07(reelStore2, A0G);
        return Collections.unmodifiableList(r4.A04);
        throw th;
    }

    public static List A05(ReelStore reelStore, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            if (reel.A0m(reelStore.A0A)) {
                arrayList2.add(reel);
            } else {
                arrayList3.add(reel);
            }
        }
        arrayList.addAll(arrayList3);
        arrayList.addAll(arrayList2);
        return new ArrayList(arrayList);
    }

    public static List A06(AnonymousClass0C1 r4, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            if (!reel.A0x && !reel.A0k(r4) && !reel.A0s && !reel.A0Z()) {
                arrayList.add(reel);
            }
        }
        return arrayList;
    }

    private void A0B(C13300iJ r8, Reel reel, List list) {
        AnonymousClass1NJ r2;
        ArrayList<PendingMedia> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51262Jx r0 = (C51262Jx) it.next();
            PendingMedia pendingMedia = r0.A00;
            C23160zf r02 = r0.A01;
            if (r02 != null) {
                AnonymousClass0a4.A06(r02);
                r2 = (AnonymousClass1NJ) pendingMedia.A2H.get(String.valueOf(r02.AX9()));
            } else {
                r2 = pendingMedia.A0d;
            }
            C42421sK r1 = pendingMedia.A0v;
            if (r2 == null || r8.equals(r2.A0c(this.A0A))) {
                if (r2 == null || !(r1 == C42421sK.CONFIGURED || r1 == C42421sK.CONFIGURING_MULTIPLE_TARGETS)) {
                    arrayList.add(pendingMedia);
                } else {
                    reel.A0L(r2);
                }
            }
        }
        Collections.sort(arrayList, new AnonymousClass175(this));
        synchronized (reel.A12) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (PendingMedia r12 : arrayList) {
                arrayList2.add(new C106634ip(r12));
            }
            if (!arrayList2.isEmpty()) {
                long AVw = ((AnonymousClass2Ay) arrayList2.get(arrayList2.size() - 1)).AVw();
                if (AVw > reel.A03) {
                    reel.A03 = AVw;
                }
            }
            Reel.A04(reel, arrayList2, reel.A0h);
        }
    }

    private void A0C(String str, Reel reel, boolean z) {
        LruCache lruCache;
        if (z) {
            C249416q r0 = this.A09;
            if (!(str == null || reel == null || (lruCache = r0.A00) == null)) {
                lruCache.put(str, reel);
            }
        }
        this.A0E.put(str, reel);
    }

    public final Reel A0D(C38031kc r4) {
        Reel A0I = A0I(r4.A0I, new C249816v(r4.A0C), false);
        A0I.A0M(r4);
        return A0I;
    }

    public final Reel A0E(AnonymousClass26H r5) {
        String str = r5.A06;
        C13300iJ r1 = r5.A01;
        Reel A0I = A0I(str, new C249816v(r1), r1.equals(this.A0A.A06));
        A0I.A0Q(this.A0A, r5);
        C250016x.A01(this.A0A).A06(A0I);
        return A0I;
    }

    public final Reel A0F(C33971dn r5, boolean z) {
        Reel A0I = A0I(r5.A0b, r5.A01(this.A0A), z);
        A0I.A0R(this.A0A, r5);
        C250016x.A01(this.A0A).A06(A0I);
        ((C39711nM) this.A0A.AVA(C39711nM.class, new C39721nN())).A01(A0I);
        return A0I;
    }

    public final Reel A0G(String str) {
        return (Reel) this.A0E.get(str);
    }

    public final Reel A0H(String str) {
        for (Reel reel : this.A0E.values()) {
            AnonymousClass26H r0 = reel.A0D;
            if (r0 != null) {
                for (C38031kc r02 : r0.A07) {
                    if (r02.A0I.equals(str)) {
                        return reel;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public final void A0N() {
        C11200ea r2 = this.A00;
        if (r2 != null) {
            this.A07.A03(AnonymousClass14J.class, r2);
            this.A00 = null;
        }
        if (this.A03 != null) {
            AnonymousClass14Q A022 = AnonymousClass14Q.A02(this.A0A);
            AnonymousClass17O r1 = this.A03;
            synchronized (A022) {
                A022.A0P.remove(r1);
            }
            this.A03 = null;
        }
    }

    public ReelStore(AnonymousClass0C1 r7) {
        C23300zv A002 = C23300zv.A00(r7);
        C249316p r4 = new C249316p(AnonymousClass14Q.A02(r7));
        C249416q r3 = new C249416q();
        boolean booleanValue = ((Boolean) C05640Lj.A00(AnonymousClass0L7.STORIES_DEDUPLICATION, "should_remove_duplicate_reels", false)).booleanValue();
        C13530ig r1 = new C13530ig();
        r1.A01(64);
        r1.A03(MapMakerInternalMap.Strength.A02);
        this.A0E = r1.A00();
        this.A0A = r7;
        this.A07 = A002;
        this.A08 = r4;
        this.A09 = r3;
        this.A0F = booleanValue;
        this.A02 = new C249516r(booleanValue);
    }

    private Reel A00(String str, C249916w r5, boolean z) {
        Reel A0G = A0G(str);
        if (A0G != null) {
            return A0G;
        }
        Reel reel = new Reel(str, r5, z);
        A0C(reel.getId(), reel, false);
        return reel;
    }

    public final Reel A0I(String str, C249916w r5, boolean z) {
        Reel A0G = A0G(str);
        if (A0G != null) {
            return A0G;
        }
        Reel reel = new Reel(str, r5, z);
        A0C(reel.getId(), reel, true);
        return reel;
    }

    public final Reel A0J(String str, C249916w r5, boolean z, List list) {
        Reel A0I = A0I(str, r5, z);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0I.A0L((AnonymousClass1NJ) it.next());
        }
        A0C(str, A0I, true);
        return A0I;
    }
}
