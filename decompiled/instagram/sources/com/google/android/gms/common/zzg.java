package com.google.android.gms.common;

import java.lang.ref.WeakReference;
import p000X.AnonymousClass0Z0;

public abstract class zzg extends zze {
    public static final WeakReference A01 = new WeakReference((Object) null);
    public WeakReference A00 = A01;

    public abstract byte[] A04();

    public zzg(byte[] bArr) {
        super(bArr);
        int A03 = AnonymousClass0Z0.A03(1156710129);
        AnonymousClass0Z0.A0A(1677693645, A03);
    }

    public final byte[] A03() {
        byte[] bArr;
        int A03 = AnonymousClass0Z0.A03(1639938588);
        synchronized (this) {
            try {
                bArr = (byte[]) this.A00.get();
                if (bArr == null) {
                    bArr = A04();
                    this.A00 = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(-944156660, A03);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(-1824388083, A03);
        return bArr;
    }
}
