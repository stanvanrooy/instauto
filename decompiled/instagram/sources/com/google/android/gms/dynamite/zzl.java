package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import p000X.AnonymousClass0Z0;
import p000X.C25250BAb;

public final class zzl extends zza implements zzk {
    public zzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
        AnonymousClass0Z0.A0A(2052350434, AnonymousClass0Z0.A03(342040230));
    }

    public final IObjectWrapper Bv8(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) {
        int A03 = AnonymousClass0Z0.A03(316457433);
        Parcel A00 = A00();
        C25250BAb.A00(A00, iObjectWrapper);
        A00.writeString(str);
        A00.writeInt(i);
        C25250BAb.A00(A00, iObjectWrapper2);
        Parcel A01 = A01(2, A00);
        IObjectWrapper A012 = IObjectWrapper.Stub.A01(A01.readStrongBinder());
        A01.recycle();
        AnonymousClass0Z0.A0A(787089045, A03);
        return A012;
    }

    public final IObjectWrapper BvW(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) {
        int A03 = AnonymousClass0Z0.A03(1183326274);
        Parcel A00 = A00();
        C25250BAb.A00(A00, iObjectWrapper);
        A00.writeString(str);
        A00.writeInt(i);
        C25250BAb.A00(A00, iObjectWrapper2);
        Parcel A01 = A01(3, A00);
        IObjectWrapper A012 = IObjectWrapper.Stub.A01(A01.readStrongBinder());
        A01.recycle();
        AnonymousClass0Z0.A0A(-408506067, A03);
        return A012;
    }
}
