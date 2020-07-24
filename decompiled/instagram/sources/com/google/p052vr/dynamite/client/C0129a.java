package com.google.p052vr.dynamite.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.p045a.p046a.C0108b;
import p000X.AnonymousClass0Z0;
import p000X.C25213B7y;

/* renamed from: com.google.vr.dynamite.client.a */
public final class C0129a extends C0108b implements ILoadedInstanceCreator {
    public C0129a(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.ILoadedInstanceCreator");
        AnonymousClass0Z0.A0A(1993359244, AnonymousClass0Z0.A03(578768120));
    }

    public final INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        INativeLibraryLoader bVar;
        int A03 = AnonymousClass0Z0.A03(1396916038);
        Parcel A00 = A00();
        C25213B7y.A00(A00, iObjectWrapper);
        C25213B7y.A00(A00, iObjectWrapper2);
        Parcel A01 = A01(1, A00);
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.dynamite.client.INativeLibraryLoader");
            if (queryLocalInterface instanceof INativeLibraryLoader) {
                bVar = (INativeLibraryLoader) queryLocalInterface;
            } else {
                bVar = new C0130b(readStrongBinder);
            }
        }
        A01.recycle();
        AnonymousClass0Z0.A0A(-2015230473, A03);
        return bVar;
    }
}
