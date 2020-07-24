package com.instagram.notifications.badging.impl;

import kotlin.coroutines.jvm.internal.DebugMetadata;
import p000X.AnonymousClass101;
import p000X.AnonymousClass10W;
import p000X.AnonymousClass2I1;
import p000X.AnonymousClass2I2;
import p000X.C13150hy;
import p000X.C233610c;
import p000X.C233910f;
import p000X.C46381ze;
import p000X.C50622Ha;
import p000X.C52472Oy;
import p000X.C52552Pg;
import p000X.C52572Pi;

@DebugMetadata(mo50192c = "com.instagram.notifications.badging.impl.ObserverBadgeStore$getBadges$job$1", mo50193f = "ObserverBadgeStore.kt", i = {0, 0}, mo50194l = {36}, mo50195m = "invokeSuspend", n = {"$this$launch", "$this$collect$iv"}, s = {"L$0", "L$1"})
public final class ObserverBadgeStore$getBadges$job$1 extends C233610c implements C46381ze {
    public int A00;
    public Object A01;
    public Object A02;
    public AnonymousClass101 A03;
    public final /* synthetic */ C52472Oy A04;
    public final /* synthetic */ C52552Pg A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObserverBadgeStore$getBadges$job$1(C52552Pg r2, C52472Oy r3, C233910f r4) {
        super(2, r4);
        this.A05 = r2;
        this.A04 = r3;
    }

    public final C233910f A01(Object obj, C233910f r5) {
        C13150hy.A02(r5, "completion");
        ObserverBadgeStore$getBadges$job$1 observerBadgeStore$getBadges$job$1 = new ObserverBadgeStore$getBadges$job$1(this.A05, this.A04, r5);
        observerBadgeStore$getBadges$job$1.A03 = (AnonymousClass101) obj;
        return observerBadgeStore$getBadges$job$1;
    }

    public final Object Adt(Object obj, Object obj2) {
        return ((ObserverBadgeStore$getBadges$job$1) A01(obj, (C233910f) obj2)).A00(C50622Ha.A00);
    }

    public final Object A00(Object obj) {
        AnonymousClass2I1 r4 = AnonymousClass2I1.COROUTINE_SUSPENDED;
        int i = this.A00;
        if (i == 0) {
            AnonymousClass2I2.A01(obj);
            AnonymousClass101 r2 = this.A03;
            C52552Pg r0 = this.A05;
            AnonymousClass10W A002 = r0.A01.A00(r0.A00);
            C52572Pi r02 = new C52572Pi(this);
            this.A01 = r2;
            this.A02 = A002;
            this.A00 = 1;
            if (A002.A91(r02, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass2I2.A01(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C50622Ha.A00;
    }
}
