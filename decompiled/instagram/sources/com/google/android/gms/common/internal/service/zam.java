package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import p000X.AnonymousClass0Z0;
import p000X.BAQ;

public final class zam extends zaa implements zal {
    public zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
        AnonymousClass0Z0.A0A(129274110, AnonymousClass0Z0.A03(-232220019));
    }

    /* JADX INFO: finally extract failed */
    public final void Buq(zaj zaj) {
        int A03 = AnonymousClass0Z0.A03(827629527);
        Parcel A00 = A00();
        BAQ.A01(A00, zaj);
        int A032 = AnonymousClass0Z0.A03(-1691246703);
        try {
            this.A00.transact(1, A00, (Parcel) null, 1);
            A00.recycle();
            AnonymousClass0Z0.A0A(-353042594, A032);
            AnonymousClass0Z0.A0A(-1491197426, A03);
        } catch (Throwable th) {
            A00.recycle();
            AnonymousClass0Z0.A0A(-1601516113, A032);
            throw th;
        }
    }
}
