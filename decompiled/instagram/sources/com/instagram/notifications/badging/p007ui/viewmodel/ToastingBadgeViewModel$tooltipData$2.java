package com.instagram.notifications.badging.p007ui.viewmodel;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import p000X.AnonymousClass2I2;
import p000X.AnonymousClass79W;
import p000X.C13150hy;
import p000X.C233610c;
import p000X.C233910f;
import p000X.C25313BDk;
import p000X.C46381ze;
import p000X.C50512Gp;
import p000X.C50622Ha;

@DebugMetadata(mo50192c = "com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeViewModel$tooltipData$2", mo50193f = "ToastingBadgeViewModel.kt", i = {}, mo50194l = {}, mo50195m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeViewModel$tooltipData$2 */
public final class ToastingBadgeViewModel$tooltipData$2 extends C233610c implements C46381ze {
    public AnonymousClass79W A00;
    public final /* synthetic */ C25313BDk A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToastingBadgeViewModel$tooltipData$2(C25313BDk bDk, C233910f r3) {
        super(2, r3);
        this.A01 = bDk;
    }

    public final C233910f A01(Object obj, C233910f r4) {
        C13150hy.A02(r4, "completion");
        ToastingBadgeViewModel$tooltipData$2 toastingBadgeViewModel$tooltipData$2 = new ToastingBadgeViewModel$tooltipData$2(this.A01, r4);
        toastingBadgeViewModel$tooltipData$2.A00 = (AnonymousClass79W) obj;
        return toastingBadgeViewModel$tooltipData$2;
    }

    public final Object Adt(Object obj, Object obj2) {
        return ((ToastingBadgeViewModel$tooltipData$2) A01(obj, (C233910f) obj2)).A00(C50622Ha.A00);
    }

    public final Object A00(Object obj) {
        AnonymousClass2I2.A01(obj);
        C50512Gp r0 = this.A01.A01;
        if (r0 != null) {
            r0.A7y((CancellationException) null);
        }
        return C50622Ha.A00;
    }
}
