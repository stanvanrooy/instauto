package com.instagram.notifications.badging.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass101;
import p000X.AnonymousClass107;
import p000X.AnonymousClass108;
import p000X.AnonymousClass109;
import p000X.AnonymousClass10B;
import p000X.AnonymousClass10E;
import p000X.AnonymousClass10J;
import p000X.AnonymousClass2GB;
import p000X.AnonymousClass2GC;
import p000X.AnonymousClass2GD;
import p000X.AnonymousClass2H2;
import p000X.AnonymousClass2I1;
import p000X.AnonymousClass2I2;
import p000X.AnonymousClass2I4;
import p000X.AnonymousClass2I8;
import p000X.C13150hy;
import p000X.C13300iJ;
import p000X.C233610c;
import p000X.C233910f;
import p000X.C234410k;
import p000X.C234610m;
import p000X.C234710n;
import p000X.C234910p;
import p000X.C235010q;
import p000X.C25301BCs;
import p000X.C25305BCw;
import p000X.C25912Bc2;
import p000X.C46381ze;
import p000X.C50622Ha;
import p000X.C51582Lh;
import p000X.C51702Lu;
import p000X.C51712Lv;

@DebugMetadata(mo50192c = "com.instagram.notifications.badging.impl.InMemoryBadgingRepository$refreshBadgeData$1", mo50193f = "InMemoryBadgingRepository.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, mo50194l = {49, 53}, mo50195m = "invokeSuspend", n = {"$this$launch", "$this$launch", "remoteInfo", "$this$mapNotNull$iv", "$this$mapNotNullTo$iv$iv", "destination$iv$iv", "$this$forEach$iv$iv$iv", "element$iv$iv$iv", "element$iv$iv", "entry", "it"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "L$10"})
public final class InMemoryBadgingRepository$refreshBadgeData$1 extends C233610c implements C46381ze {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public AnonymousClass101 A0D;
    public final /* synthetic */ C234610m A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InMemoryBadgingRepository$refreshBadgeData$1(C234610m r2, C233910f r3) {
        super(2, r3);
        this.A0E = r2;
    }

    public final C233910f A01(Object obj, C233910f r4) {
        C13150hy.A02(r4, "completion");
        InMemoryBadgingRepository$refreshBadgeData$1 inMemoryBadgingRepository$refreshBadgeData$1 = new InMemoryBadgingRepository$refreshBadgeData$1(this.A0E, r4);
        inMemoryBadgingRepository$refreshBadgeData$1.A0D = (AnonymousClass101) obj;
        return inMemoryBadgingRepository$refreshBadgeData$1;
    }

    public final Object Adt(Object obj, Object obj2) {
        return ((InMemoryBadgingRepository$refreshBadgeData$1) A01(obj, (C233910f) obj2)).A00(C50622Ha.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b A[Catch:{ Exception -> 0x019f, all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012a A[Catch:{ Exception -> 0x019f, all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012f A[Catch:{ Exception -> 0x019f, all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0141 A[Catch:{ Exception -> 0x019f, all -> 0x01ad }] */
    public final Object A00(Object obj) {
        Iterator it;
        Map map;
        Collection collection;
        Map map2;
        Map map3;
        C51582Lh r2;
        AnonymousClass101 r1;
        AnonymousClass10J r12;
        AnonymousClass10E A002;
        AnonymousClass2I4 r22;
        Object obj2 = obj;
        AnonymousClass2I1 r10 = AnonymousClass2I1.COROUTINE_SUSPENDED;
        int i = this.A00;
        if (i == 0) {
            AnonymousClass2I2.A01(obj2);
            r1 = this.A0D;
            try {
                C234610m r0 = this.A0E;
                r0.A01 = true;
                C234410k r4 = r0.A03;
                AnonymousClass101 r23 = r4.A02;
                BadgingApiImpl$fetchBadgeInfoAsync$1 badgingApiImpl$fetchBadgeInfoAsync$1 = new BadgingApiImpl$fetchBadgeInfoAsync$1(r4, (C233910f) null);
                AnonymousClass2GB r02 = AnonymousClass2GB.A00;
                Integer num = Constants.ZERO;
                AnonymousClass2GC A003 = AnonymousClass2GD.A00(r23, r02);
                boolean z = false;
                if (num == Constants.ONE) {
                    z = true;
                }
                if (z) {
                    r22 = new C25305BCw(A003, badgingApiImpl$fetchBadgeInfoAsync$1);
                } else {
                    r22 = new AnonymousClass2I4(A003, true);
                }
                r22.A0W(num, r22, badgingApiImpl$fetchBadgeInfoAsync$1);
                this.A01 = r1;
                this.A00 = 1;
                obj2 = AnonymousClass2I4.A01(r22, this);
                if (obj2 == r10) {
                    return r10;
                }
            } catch (Exception e) {
                AnonymousClass0QD.A09("Badging", e);
            } catch (Throwable th) {
                this.A0E.A01 = false;
                throw th;
            }
        } else if (i == 1) {
            r1 = (AnonymousClass101) this.A01;
            AnonymousClass2I2.A01(obj2);
        } else if (i == 2) {
            Object obj3 = this.A04;
            it = (Iterator) this.A09;
            map = (Map) this.A08;
            collection = (Collection) this.A07;
            map2 = (Map) this.A06;
            map3 = (Map) this.A05;
            r2 = (C51582Lh) this.A02;
            r1 = (AnonymousClass101) this.A01;
            AnonymousClass2I2.A01(obj2);
            C235010q r03 = C234910p.A00(obj3, obj2);
            if (r03 != null) {
                collection.add(r03);
            }
            if (!it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                C234710n r122 = (C234710n) this.A0E.A04.get(entry.getKey());
                if (r122 != null) {
                    obj3 = entry.getKey();
                    this.A01 = r1;
                    this.A02 = r2;
                    this.A05 = map3;
                    this.A06 = map2;
                    this.A07 = collection;
                    this.A08 = map;
                    this.A09 = it;
                    this.A0A = entry;
                    this.A0B = entry;
                    this.A0C = entry;
                    this.A03 = r122;
                    this.A04 = obj3;
                    this.A00 = 2;
                    AnonymousClass2I8 r13 = new AnonymousClass2I8(AnonymousClass2H2.A00(this));
                    C51702Lu r14 = new C51702Lu(r13);
                    AnonymousClass0C1 r123 = r122.A00;
                    int i2 = 0;
                    for (C13300iJ r04 : r123.A05.A00.A01(r123.A06)) {
                        i2 += r04.A00;
                    }
                    AnonymousClass10J r124 = new AnonymousClass10J(AnonymousClass108.OTHER_ACCOUNTS, i2);
                    C13150hy.A02(r124, "badge");
                    r14.A00.Be0(r124);
                    obj2 = r13.A00();
                    if (obj2 == r10) {
                        C25301BCs.A00(this);
                    }
                    if (obj2 == r10) {
                        return r10;
                    }
                    C235010q r032 = C234910p.A00(obj3, obj2);
                    if (r032 != null) {
                    }
                    if (!it.hasNext()) {
                        Map A052 = C51712Lv.A05((List) collection);
                        C234610m r102 = this.A0E;
                        HashMap hashMap = r2.A01;
                    }
                }
                r032 = null;
                if (r032 != null) {
                }
                if (!it.hasNext()) {
                }
            }
            Map A0522 = C51712Lv.A05((List) collection);
            C234610m r1022 = this.A0E;
            HashMap hashMap2 = r2.A01;
            for (AnonymousClass108 r132 : AnonymousClass108.values()) {
                Integer num2 = (Integer) hashMap2.get(r132.toString());
                if (num2 != null) {
                    r12 = new AnonymousClass10J(r132, num2.intValue(), (List) null);
                } else {
                    r12 = (AnonymousClass10J) A0522.get(r132);
                }
                if (r12 == null) {
                    r12 = new AnonymousClass10J(r132, 0, (List) null);
                }
                AnonymousClass107 r05 = r1022.A02;
                C13150hy.A02(r12, "badge");
                AnonymousClass109 r24 = (AnonymousClass109) r05.A00.get(r12.A01);
                if (r24 != null) {
                    C13150hy.A02(r12, "badge");
                    if (r24.A00 == r12.A01 && (A002 = AnonymousClass10B.A00(r24.A01, r12)) != null) {
                        Throwable th2 = A002.A00;
                        if (th2 == null) {
                            th2 = new C25912Bc2();
                        }
                        throw th2;
                    }
                }
            }
            this.A0E.A00 = true;
            this.A0E.A01 = false;
            return C50622Ha.A00;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        map = this.A0E.A04;
        collection = new ArrayList();
        it = map.entrySet().iterator();
        r2 = (C51582Lh) obj2;
        map3 = map;
        map2 = map;
        if (!it.hasNext()) {
        }
        Map A05222 = C51712Lv.A05((List) collection);
        C234610m r10222 = this.A0E;
        HashMap hashMap22 = r2.A01;
        while (r5 < r6) {
        }
        this.A0E.A00 = true;
        this.A0E.A01 = false;
        return C50622Ha.A00;
    }
}
