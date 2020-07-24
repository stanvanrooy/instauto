package com.google.p052vr.dynamite.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.p045a.p046a.C0108b;
import p000X.AnonymousClass0Z0;

/* renamed from: com.google.vr.dynamite.client.b */
public final class C0130b extends C0108b implements INativeLibraryLoader {
    public C0130b(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
        AnonymousClass0Z0.A0A(-414131614, AnonymousClass0Z0.A03(-2131490757));
    }

    public final int checkVersion(String str) {
        int A03 = AnonymousClass0Z0.A03(1415172034);
        Parcel A00 = A00();
        A00.writeString(str);
        Parcel A01 = A01(2, A00);
        int readInt = A01.readInt();
        A01.recycle();
        AnonymousClass0Z0.A0A(-1664313816, A03);
        return readInt;
    }

    public final long initializeAndLoadNativeLibrary(String str) {
        int A03 = AnonymousClass0Z0.A03(-952629516);
        Parcel A00 = A00();
        A00.writeString(str);
        Parcel A01 = A01(1, A00);
        long readLong = A01.readLong();
        A01.recycle();
        AnonymousClass0Z0.A0A(515652715, A03);
        return readLong;
    }
}
