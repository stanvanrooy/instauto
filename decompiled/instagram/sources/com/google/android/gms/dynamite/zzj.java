package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import p000X.AnonymousClass0Z0;
import p000X.C25250BAb;

public final class zzj extends zza implements zzi {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
        AnonymousClass0Z0.A0A(916991582, AnonymousClass0Z0.A03(1794340059));
    }

    public final int Bv6(IObjectWrapper iObjectWrapper, String str, boolean z) {
        int A03 = AnonymousClass0Z0.A03(-1992855556);
        Parcel A00 = A00();
        C25250BAb.A00(A00, iObjectWrapper);
        A00.writeString(str);
        A00.writeInt(z ? 1 : 0);
        Parcel A01 = A01(3, A00);
        int readInt = A01.readInt();
        A01.recycle();
        AnonymousClass0Z0.A0A(-2050213867, A03);
        return readInt;
    }

    public final IObjectWrapper Bv7(IObjectWrapper iObjectWrapper, String str, int i) {
        int A03 = AnonymousClass0Z0.A03(-1570364668);
        Parcel A00 = A00();
        C25250BAb.A00(A00, iObjectWrapper);
        A00.writeString(str);
        A00.writeInt(i);
        Parcel A01 = A01(2, A00);
        IObjectWrapper A012 = IObjectWrapper.Stub.A01(A01.readStrongBinder());
        A01.recycle();
        AnonymousClass0Z0.A0A(-67919632, A03);
        return A012;
    }

    public final int BvS() {
        int A03 = AnonymousClass0Z0.A03(561611238);
        Parcel A01 = A01(6, A00());
        int readInt = A01.readInt();
        A01.recycle();
        AnonymousClass0Z0.A0A(1117871110, A03);
        return readInt;
    }

    public final int BvT(IObjectWrapper iObjectWrapper, String str, boolean z) {
        int A03 = AnonymousClass0Z0.A03(899906419);
        Parcel A00 = A00();
        C25250BAb.A00(A00, iObjectWrapper);
        A00.writeString(str);
        A00.writeInt(z ? 1 : 0);
        Parcel A01 = A01(5, A00);
        int readInt = A01.readInt();
        A01.recycle();
        AnonymousClass0Z0.A0A(-739119468, A03);
        return readInt;
    }

    public final IObjectWrapper BvV(IObjectWrapper iObjectWrapper, String str, int i) {
        int A03 = AnonymousClass0Z0.A03(1348124851);
        Parcel A00 = A00();
        C25250BAb.A00(A00, iObjectWrapper);
        A00.writeString(str);
        A00.writeInt(i);
        Parcel A01 = A01(4, A00);
        IObjectWrapper A012 = IObjectWrapper.Stub.A01(A01.readStrongBinder());
        A01.recycle();
        AnonymousClass0Z0.A0A(2137917974, A03);
        return A012;
    }
}
