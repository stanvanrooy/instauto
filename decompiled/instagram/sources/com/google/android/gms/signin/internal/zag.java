package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import p000X.AnonymousClass0Z0;
import p000X.BAQ;

public final class zag extends zaa implements zaf {
    public zag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
        AnonymousClass0Z0.A0A(-1420970491, AnonymousClass0Z0.A03(-2009484054));
    }

    public final void Bun(IAccountAccessor iAccountAccessor, int i, boolean z) {
        int A03 = AnonymousClass0Z0.A03(-461708748);
        Parcel A00 = A00();
        BAQ.A01(A00, iAccountAccessor);
        A00.writeInt(i);
        A00.writeInt(z ? 1 : 0);
        A01(9, A00);
        AnonymousClass0Z0.A0A(1556036995, A03);
    }

    public final void Bus(zah zah, zad zad) {
        int A03 = AnonymousClass0Z0.A03(-355105802);
        Parcel A00 = A00();
        if (zah == null) {
            A00.writeInt(0);
        } else {
            A00.writeInt(1);
            zah.writeToParcel(A00, 0);
        }
        BAQ.A01(A00, zad);
        A01(12, A00);
        AnonymousClass0Z0.A0A(940594164, A03);
    }

    public final void Bv4(int i) {
        int A03 = AnonymousClass0Z0.A03(-992328904);
        Parcel A00 = A00();
        A00.writeInt(i);
        A01(7, A00);
        AnonymousClass0Z0.A0A(-1952191658, A03);
    }
}
