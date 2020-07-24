package com.instagram.notifications.badging.p007ui.viewmodel;

import kotlin.coroutines.jvm.internal.DebugMetadata;
import p000X.AnonymousClass10J;
import p000X.AnonymousClass2I2;
import p000X.C13150hy;
import p000X.C233610c;
import p000X.C233910f;
import p000X.C25313BDk;
import p000X.C46381ze;
import p000X.C50622Ha;

@DebugMetadata(mo50192c = "com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeViewModel$badgeObservable$1", mo50193f = "ToastingBadgeViewModel.kt", i = {}, mo50194l = {}, mo50195m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeViewModel$badgeObservable$1 */
public final class ToastingBadgeViewModel$badgeObservable$1 extends C233610c implements C46381ze {
    public AnonymousClass10J A00;
    public final /* synthetic */ C25313BDk A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToastingBadgeViewModel$badgeObservable$1(C25313BDk bDk, C233910f r3) {
        super(2, r3);
        this.A01 = bDk;
    }

    public final C233910f A01(Object obj, C233910f r4) {
        C13150hy.A02(r4, "completion");
        ToastingBadgeViewModel$badgeObservable$1 toastingBadgeViewModel$badgeObservable$1 = new ToastingBadgeViewModel$badgeObservable$1(this.A01, r4);
        toastingBadgeViewModel$badgeObservable$1.A00 = (AnonymousClass10J) obj;
        return toastingBadgeViewModel$badgeObservable$1;
    }

    public final Object Adt(Object obj, Object obj2) {
        return ((ToastingBadgeViewModel$badgeObservable$1) A01(obj, (C233910f) obj2)).A00(C50622Ha.A00);
    }

    public final Object A00(Object obj) {
        int i;
        AnonymousClass2I2.A01(obj);
        AnonymousClass10J r3 = this.A00;
        C25313BDk bDk = this.A01;
        AnonymousClass10J r0 = bDk.A00;
        if (r0 != null) {
            i = new Integer(r0.A00()).intValue();
        } else {
            i = 0;
        }
        if (i > 0 && r3.A00() == 0) {
            bDk.A09.A09(bDk.A0B);
        }
        this.A01.A00 = r3;
        return C50622Ha.A00;
    }
}
