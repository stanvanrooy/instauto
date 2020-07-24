package p000X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.14w  reason: invalid class name and case insensitive filesystem */
public final class C245114w {
    public AnonymousClass14Q A00;
    public final C243614h A01;
    public final Context A02;
    public final C244714s A03;

    public final AnonymousClass4YF A00(AnonymousClass4WK r13, C105814hT r14) {
        Set set;
        if (r13 != null) {
            C244714s r5 = this.A03;
            Iterator it = r14.A08.iterator();
            loop0:
            while (true) {
                if (it.hasNext()) {
                    C106364iO AOd = r5.A03.AOd(r14.A04, (AnonymousClass15G) it.next());
                    if (AOd != null && AOd.A02 == Constants.ONE) {
                        for (C243714i r0 : AOd.A04) {
                            if (r0.A00) {
                                break loop0;
                            }
                        }
                        continue;
                    }
                } else {
                    ArrayList<AnonymousClass4YE> arrayList = new ArrayList<>();
                    if (((Boolean) r5.A00.apply(r14.A04)).booleanValue()) {
                        for (AnonymousClass15G r2 : r5.A02.A00(r14, Collections.singletonList(r14.A00))) {
                            arrayList.add(C244714s.A00(r5, r13, r2, r5.A03.AOd(r13.A08, r2)));
                        }
                    } else {
                        C243214d r1 = r5.A03;
                        C105924he r3 = new C105924he(C105914hd.RUNNABLE);
                        r3.BtC(r14, r1);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(r14.A00);
                        for (AnonymousClass15G r22 : C105904hc.A00(r14, r3, arrayList2, false)) {
                            arrayList.add(C244714s.A00(r5, r13, r22, r5.A03.AOd(r13.A08, r22)));
                        }
                    }
                    HashMap hashMap = new HashMap();
                    for (AnonymousClass4YE r10 : arrayList) {
                        Set set2 = r10.A02;
                        AnonymousClass4YE r7 = (AnonymousClass4YE) hashMap.get(set2);
                        if (r7 == null) {
                            hashMap.put(set2, r10);
                        } else {
                            long j = r7.A00;
                            long j2 = r10.A00;
                            long j3 = j2;
                            if (j > j2) {
                                hashMap.put(set2, new AnonymousClass4YE(j3, r10.A02, AnonymousClass000.A0J(r7.A01, " && ", r10.A01)));
                            }
                        }
                    }
                    set = new HashSet(hashMap.values());
                }
            }
            set = Collections.emptySet();
        } else {
            set = Collections.emptySet();
        }
        return new AnonymousClass4YF(r14.A03, this.A00, r14.A04, set, new C15780nW(this.A02), this.A01);
    }

    public C245114w(C244714s r1, C243614h r2, Context context) {
        this.A03 = r1;
        this.A01 = r2;
        this.A02 = context;
    }
}
