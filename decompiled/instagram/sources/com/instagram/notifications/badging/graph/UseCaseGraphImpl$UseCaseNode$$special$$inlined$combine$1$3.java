package com.instagram.notifications.badging.graph;

import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import p000X.AnonymousClass10J;
import p000X.AnonymousClass10Y;
import p000X.AnonymousClass2HP;
import p000X.AnonymousClass2I1;
import p000X.AnonymousClass2I2;
import p000X.C233610c;
import p000X.C233910f;
import p000X.C234210i;
import p000X.C50622Ha;
import p000X.C52862Qm;

@DebugMetadata(mo50192c = "com.instagram.notifications.badging.graph.UseCaseGraphImpl$UseCaseNode$$special$$inlined$combine$1$3", mo50193f = "UseCaseGraphImpl.kt", i = {0, 0}, mo50194l = {304}, mo50195m = "invokeSuspend", n = {"$receiver", "it"}, s = {"L$0", "L$1"})
public final class UseCaseGraphImpl$UseCaseNode$$special$$inlined$combine$1$3 extends C233610c implements C234210i {
    public int A00;
    public Object A01;
    public Object A02;
    public AnonymousClass2HP A03;
    public Object[] A04;
    public final /* synthetic */ AnonymousClass10Y A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UseCaseGraphImpl$UseCaseNode$$special$$inlined$combine$1$3(C233910f r2, AnonymousClass10Y r3) {
        super(3, r2);
        this.A05 = r3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UseCaseGraphImpl$UseCaseNode$$special$$inlined$combine$1$3 useCaseGraphImpl$UseCaseNode$$special$$inlined$combine$1$3 = new UseCaseGraphImpl$UseCaseNode$$special$$inlined$combine$1$3((C233910f) obj3, this.A05);
        useCaseGraphImpl$UseCaseNode$$special$$inlined$combine$1$3.A03 = (AnonymousClass2HP) obj;
        useCaseGraphImpl$UseCaseNode$$special$$inlined$combine$1$3.A04 = (Object[]) obj2;
        return useCaseGraphImpl$UseCaseNode$$special$$inlined$combine$1$3.A00(C50622Ha.A00);
    }

    public final Object A00(Object obj) {
        AnonymousClass2I1 r4 = AnonymousClass2I1.COROUTINE_SUSPENDED;
        int i = this.A00;
        if (i == 0) {
            AnonymousClass2I2.A01(obj);
            AnonymousClass2HP r2 = this.A03;
            Object[] objArr = this.A04;
            List A002 = C52862Qm.A00((AnonymousClass10J[]) objArr);
            this.A01 = r2;
            this.A02 = objArr;
            this.A00 = 1;
            if (r2.ACq(A002, this) == r4) {
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
