package com.instagram.notifications.badging.p007ui.viewmodel;

import kotlin.coroutines.jvm.internal.DebugMetadata;
import p000X.AnonymousClass101;
import p000X.AnonymousClass2GA;
import p000X.AnonymousClass2GC;
import p000X.AnonymousClass2I1;
import p000X.AnonymousClass2I2;
import p000X.AnonymousClass79W;
import p000X.BD9;
import p000X.C13150hy;
import p000X.C233610c;
import p000X.C233910f;
import p000X.C25313BDk;
import p000X.C46381ze;
import p000X.C50512Gp;
import p000X.C50622Ha;

@DebugMetadata(mo50192c = "com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeViewModel$tooltipData$6", mo50193f = "ToastingBadgeViewModel.kt", i = {0}, mo50194l = {83}, mo50195m = "invokeSuspend", n = {"it"}, s = {"L$0"})
/* renamed from: com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeViewModel$tooltipData$6 */
public final class ToastingBadgeViewModel$tooltipData$6 extends C233610c implements C46381ze {
    public int A00;
    public Object A01;
    public AnonymousClass79W A02;
    public final /* synthetic */ C25313BDk A03;
    public final /* synthetic */ AnonymousClass101 A04;

    @DebugMetadata(mo50192c = "com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeViewModel$tooltipData$6$1", mo50193f = "ToastingBadgeViewModel.kt", i = {0}, mo50194l = {82}, mo50195m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeViewModel$tooltipData$6$1 */
    public final class C00431 extends C233610c implements C46381ze {
        public int A00;
        public Object A01;
        public AnonymousClass101 A02;

        public final C233910f A01(Object obj, C233910f r4) {
            C13150hy.A02(r4, "completion");
            C00431 r1 = new C00431(r4);
            r1.A02 = (AnonymousClass101) obj;
            return r1;
        }

        public final Object Adt(Object obj, Object obj2) {
            return ((C00431) A01(obj, (C233910f) obj2)).A00(C50622Ha.A00);
        }

        public final Object A00(Object obj) {
            AnonymousClass2I1 r4 = AnonymousClass2I1.COROUTINE_SUSPENDED;
            int i = this.A00;
            if (i == 0) {
                AnonymousClass2I2.A01(obj);
                AnonymousClass101 r2 = this.A02;
                long j = ToastingBadgeViewModel$tooltipData$6.this.A03.A05;
                this.A01 = r2;
                this.A00 = 1;
                if (BD9.A00(j, this) == r4) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToastingBadgeViewModel$tooltipData$6(C25313BDk bDk, AnonymousClass101 r3, C233910f r4) {
        super(2, r4);
        this.A03 = bDk;
        this.A04 = r3;
    }

    public final C233910f A01(Object obj, C233910f r5) {
        C13150hy.A02(r5, "completion");
        ToastingBadgeViewModel$tooltipData$6 toastingBadgeViewModel$tooltipData$6 = new ToastingBadgeViewModel$tooltipData$6(this.A03, this.A04, r5);
        toastingBadgeViewModel$tooltipData$6.A02 = (AnonymousClass79W) obj;
        return toastingBadgeViewModel$tooltipData$6;
    }

    public final Object Adt(Object obj, Object obj2) {
        return ((ToastingBadgeViewModel$tooltipData$6) A01(obj, (C233910f) obj2)).A00(C50622Ha.A00);
    }

    public final Object A00(Object obj) {
        AnonymousClass2I1 r7 = AnonymousClass2I1.COROUTINE_SUSPENDED;
        int i = this.A00;
        if (i == 0) {
            AnonymousClass2I2.A01(obj);
            AnonymousClass79W r5 = this.A02;
            this.A03.A01 = AnonymousClass2GA.A00(this.A04, (AnonymousClass2GC) null, new C00431((C233910f) null), 3);
            C50512Gp r0 = this.A03.A01;
            if (r0 != null) {
                this.A01 = r5;
                this.A00 = 1;
                if (r0.AiV(this) == r7) {
                    return r7;
                }
            }
        } else if (i == 1) {
            AnonymousClass2I2.A01(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C50622Ha.A00;
    }
}
