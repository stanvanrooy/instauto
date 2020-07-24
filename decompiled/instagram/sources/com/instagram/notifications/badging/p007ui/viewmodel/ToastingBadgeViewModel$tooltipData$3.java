package com.instagram.notifications.badging.p007ui.viewmodel;

import kotlin.coroutines.jvm.internal.DebugMetadata;
import p000X.AnonymousClass2I2;
import p000X.AnonymousClass79W;
import p000X.C13150hy;
import p000X.C233610c;
import p000X.C233910f;
import p000X.C234210i;
import p000X.C234910p;
import p000X.C50622Ha;

@DebugMetadata(mo50192c = "com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeViewModel$tooltipData$3", mo50193f = "ToastingBadgeViewModel.kt", i = {}, mo50194l = {}, mo50195m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeViewModel$tooltipData$3 */
public final class ToastingBadgeViewModel$tooltipData$3 extends C233610c implements C234210i {
    public AnonymousClass79W A00;
    public boolean A01;

    public ToastingBadgeViewModel$tooltipData$3(C233910f r2) {
        super(3, r2);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass79W r4 = (AnonymousClass79W) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C233910f r6 = (C233910f) obj3;
        C13150hy.A02(r4, "data");
        C13150hy.A02(r6, "continuation");
        ToastingBadgeViewModel$tooltipData$3 toastingBadgeViewModel$tooltipData$3 = new ToastingBadgeViewModel$tooltipData$3(r6);
        toastingBadgeViewModel$tooltipData$3.A00 = r4;
        toastingBadgeViewModel$tooltipData$3.A01 = booleanValue;
        return toastingBadgeViewModel$tooltipData$3.A00(C50622Ha.A00);
    }

    public final Object A00(Object obj) {
        AnonymousClass2I2.A01(obj);
        return C234910p.A00(this.A00, Boolean.valueOf(this.A01));
    }
}
