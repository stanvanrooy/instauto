package com.instagram.notifications.badging.graph;

import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import p000X.AnonymousClass109;
import p000X.AnonymousClass10J;
import p000X.AnonymousClass2I2;
import p000X.C13150hy;
import p000X.C233610c;
import p000X.C233910f;
import p000X.C234210i;
import p000X.C50622Ha;

@DebugMetadata(mo50192c = "com.instagram.notifications.badging.graph.UseCaseGraphImpl$UseCaseNode$flow$1", mo50193f = "UseCaseGraphImpl.kt", i = {}, mo50194l = {}, mo50195m = "invokeSuspend", n = {}, s = {})
public final class UseCaseGraphImpl$UseCaseNode$flow$1 extends C233610c implements C234210i {
    public AnonymousClass10J A00;
    public List A01;
    public final /* synthetic */ AnonymousClass109 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UseCaseGraphImpl$UseCaseNode$flow$1(AnonymousClass109 r2, C233910f r3) {
        super(3, r3);
        this.A02 = r2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass10J r3 = (AnonymousClass10J) obj;
        List list = (List) obj2;
        C233910f r5 = (C233910f) obj3;
        C13150hy.A02(r3, "badge");
        C13150hy.A02(list, "childList");
        C13150hy.A02(r5, "continuation");
        UseCaseGraphImpl$UseCaseNode$flow$1 useCaseGraphImpl$UseCaseNode$flow$1 = new UseCaseGraphImpl$UseCaseNode$flow$1(this.A02, r5);
        useCaseGraphImpl$UseCaseNode$flow$1.A00 = r3;
        useCaseGraphImpl$UseCaseNode$flow$1.A01 = list;
        return useCaseGraphImpl$UseCaseNode$flow$1.A00(C50622Ha.A00);
    }

    public final Object A00(Object obj) {
        AnonymousClass2I2.A01(obj);
        AnonymousClass10J r4 = this.A00;
        return new AnonymousClass10J(this.A02.A00, r4.A00, this.A01);
    }
}
