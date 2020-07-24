package com.google.firebase.iid;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p000X.AnonymousClass0a2;
import p000X.AnonymousClass2N8;
import p000X.AnonymousClass2z3;
import p000X.C51962Mu;
import p000X.C68402z2;
import p000X.C68412z4;
import p000X.C89683uf;
import p000X.C89733uk;
import p000X.C89743ul;
import p000X.C89763un;

public final class Registrar {
    public final List getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        AnonymousClass0a2.A03(cls, "Null interface");
        hashSet.add(cls);
        Collections.addAll(hashSet, new Class[0]);
        C89743ul r4 = new C89743ul(C51962Mu.class, 1);
        AnonymousClass0a2.A03(r4, "Null dependency");
        AnonymousClass0a2.A08(!hashSet.contains(r4.A01), "Components are not allowed to depend on interfaces they themselves provide.");
        hashSet2.add(r4);
        C89743ul r42 = new C89743ul(C89763un.class, 1);
        AnonymousClass0a2.A03(r42, "Null dependency");
        AnonymousClass0a2.A08(!hashSet.contains(r42.A01), "Components are not allowed to depend on interfaces they themselves provide.");
        hashSet2.add(r42);
        C89743ul r43 = new C89743ul(C89733uk.class, 1);
        AnonymousClass0a2.A03(r43, "Null dependency");
        AnonymousClass0a2.A08(!hashSet.contains(r43.A01), "Components are not allowed to depend on interfaces they themselves provide.");
        hashSet2.add(r43);
        C89683uf r6 = C68402z2.A00;
        AnonymousClass0a2.A03(r6, "Null factory");
        AnonymousClass0a2.A09(true, "Instantiation type has already been set.");
        boolean z = false;
        if (r6 != null) {
            z = true;
        }
        AnonymousClass0a2.A09(z, "Missing required property: factory.");
        AnonymousClass2N8 r12 = new AnonymousClass2N8(new HashSet(hashSet), new HashSet(hashSet2), 1, 0, r6, hashSet3);
        Class<AnonymousClass2z3> cls2 = AnonymousClass2z3.class;
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        AnonymousClass0a2.A03(cls2, "Null interface");
        hashSet4.add(cls2);
        Collections.addAll(hashSet4, new Class[0]);
        C89743ul r9 = new C89743ul(cls, 1);
        AnonymousClass0a2.A03(r9, "Null dependency");
        AnonymousClass0a2.A08(!hashSet4.contains(r9.A01), "Components are not allowed to depend on interfaces they themselves provide.");
        hashSet5.add(r9);
        C89683uf r2 = C68412z4.A00;
        AnonymousClass0a2.A03(r2, "Null factory");
        boolean z2 = false;
        if (r2 != null) {
            z2 = true;
        }
        AnonymousClass0a2.A09(z2, "Missing required property: factory.");
        return Arrays.asList(new AnonymousClass2N8[]{r12, new AnonymousClass2N8(new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, r2, hashSet6)});
    }
}
