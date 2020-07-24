package com.instagram.notifications.badging.impl;

import kotlin.coroutines.jvm.internal.DebugMetadata;
import p000X.AnonymousClass101;
import p000X.AnonymousClass2H2;
import p000X.AnonymousClass2I1;
import p000X.AnonymousClass2I2;
import p000X.AnonymousClass2I8;
import p000X.AnonymousClass2IM;
import p000X.C12810hQ;
import p000X.C13150hy;
import p000X.C17850qu;
import p000X.C233610c;
import p000X.C233910f;
import p000X.C234410k;
import p000X.C234510l;
import p000X.C25301BCs;
import p000X.C46381ze;
import p000X.C50622Ha;

@DebugMetadata(mo50192c = "com.instagram.notifications.badging.impl.BadgingApiImpl$fetchBadgeInfoAsync$1", mo50193f = "BadgingApiImpl.kt", i = {0}, mo50194l = {26}, mo50195m = "invokeSuspend", n = {"$this$async"}, s = {"L$0"})
public final class BadgingApiImpl$fetchBadgeInfoAsync$1 extends C233610c implements C46381ze {
    public int A00;
    public Object A01;
    public Object A02;
    public AnonymousClass101 A03;
    public final /* synthetic */ C234410k A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgingApiImpl$fetchBadgeInfoAsync$1(C234410k r2, C233910f r3) {
        super(2, r3);
        this.A04 = r2;
    }

    public final C233910f A01(Object obj, C233910f r4) {
        C13150hy.A02(r4, "completion");
        BadgingApiImpl$fetchBadgeInfoAsync$1 badgingApiImpl$fetchBadgeInfoAsync$1 = new BadgingApiImpl$fetchBadgeInfoAsync$1(this.A04, r4);
        badgingApiImpl$fetchBadgeInfoAsync$1.A03 = (AnonymousClass101) obj;
        return badgingApiImpl$fetchBadgeInfoAsync$1;
    }

    public final Object Adt(Object obj, Object obj2) {
        return ((BadgingApiImpl$fetchBadgeInfoAsync$1) A01(obj, (C233910f) obj2)).A00(C50622Ha.A00);
    }

    public final Object A00(Object obj) {
        AnonymousClass2I1 r3 = AnonymousClass2I1.COROUTINE_SUSPENDED;
        int i = this.A00;
        if (i == 0) {
            AnonymousClass2I2.A01(obj);
            this.A01 = this.A03;
            this.A02 = this;
            this.A00 = 1;
            AnonymousClass2I8 r2 = new AnonymousClass2I8(AnonymousClass2H2.A00(this));
            C234410k r1 = this.A04;
            C17850qu A002 = C234510l.A00(r1.A01, r1.A00.A00);
            A002.A00 = new AnonymousClass2IM(r2, this);
            C12810hQ.A01(A002);
            obj = r2.A00();
            if (obj == r3) {
                C25301BCs.A00(this);
            }
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass2I2.A01(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
