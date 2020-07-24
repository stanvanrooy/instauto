package p000X;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Lx  reason: invalid class name and case insensitive filesystem */
public final class C28481Lx implements C28491Ly {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0RN A01;
    public final /* synthetic */ AnonymousClass1IE A02;
    public final /* synthetic */ C28471Lw A03;
    public final /* synthetic */ AnonymousClass0C1 A04;

    public C28481Lx(C28471Lw r1, Context context, AnonymousClass1IE r3, AnonymousClass0C1 r4, AnonymousClass0RN r5) {
        this.A03 = r1;
        this.A00 = context;
        this.A02 = r3;
        this.A04 = r4;
        this.A01 = r5;
    }

    public final void BUZ(Collection collection, int i) {
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C150686cU r2 = (C150686cU) it.next();
            if (r2.A00 != null && !ImmutableSet.A02(r2.A01).isEmpty()) {
                AnonymousClass1NJ APe = r2.A00.APe();
                AnonymousClass0a4.A06(APe);
                Set set = (Set) hashMap.get(APe);
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(APe, set);
                }
                set.addAll(ImmutableSet.A02(r2.A01));
            }
        }
        C05700Lp.A00().ADc(new C108814mT(this, hashMap));
    }
}
