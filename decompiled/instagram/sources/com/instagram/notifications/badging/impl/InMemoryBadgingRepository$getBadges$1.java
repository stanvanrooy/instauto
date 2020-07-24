package com.instagram.notifications.badging.impl;

import kotlin.coroutines.jvm.internal.DebugMetadata;
import p000X.AnonymousClass2GA;
import p000X.AnonymousClass2GC;
import p000X.AnonymousClass2HP;
import p000X.AnonymousClass2I2;
import p000X.C13150hy;
import p000X.C233610c;
import p000X.C233910f;
import p000X.C234610m;
import p000X.C46381ze;
import p000X.C50622Ha;

@DebugMetadata(mo50192c = "com.instagram.notifications.badging.impl.InMemoryBadgingRepository$getBadges$1", mo50193f = "InMemoryBadgingRepository.kt", i = {}, mo50194l = {}, mo50195m = "invokeSuspend", n = {}, s = {})
public final class InMemoryBadgingRepository$getBadges$1 extends C233610c implements C46381ze {
    public AnonymousClass2HP A00;
    public final /* synthetic */ C234610m A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InMemoryBadgingRepository$getBadges$1(C234610m r2, C233910f r3) {
        super(2, r3);
        this.A01 = r2;
    }

    public final C233910f A01(Object obj, C233910f r4) {
        C13150hy.A02(r4, "completion");
        InMemoryBadgingRepository$getBadges$1 inMemoryBadgingRepository$getBadges$1 = new InMemoryBadgingRepository$getBadges$1(this.A01, r4);
        inMemoryBadgingRepository$getBadges$1.A00 = (AnonymousClass2HP) obj;
        return inMemoryBadgingRepository$getBadges$1;
    }

    public final Object Adt(Object obj, Object obj2) {
        return ((InMemoryBadgingRepository$getBadges$1) A01(obj, (C233910f) obj2)).A00(C50622Ha.A00);
    }

    public final Object A00(Object obj) {
        AnonymousClass2I2.A01(obj);
        C234610m r4 = this.A01;
        if (!r4.A00 && !r4.A01) {
            AnonymousClass2GA.A00(r4.A05, (AnonymousClass2GC) null, new InMemoryBadgingRepository$refreshBadgeData$1(r4, (C233910f) null), 3);
        }
        return C50622Ha.A00;
    }
}
