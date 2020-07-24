package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a2;

public abstract class zze extends zzj {
    public int A00;

    public abstract byte[] A03();

    public static byte[] A00(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public zze(byte[] bArr) {
        int A03 = AnonymousClass0Z0.A03(-1737770902);
        AnonymousClass0a2.A06(bArr.length == 25);
        this.A00 = Arrays.hashCode(bArr);
        AnonymousClass0Z0.A0A(2129783815, A03);
    }

    public final IObjectWrapper BvU() {
        int A03 = AnonymousClass0Z0.A03(1213450632);
        ObjectWrapper objectWrapper = new ObjectWrapper(A03());
        AnonymousClass0Z0.A0A(1859805196, A03);
        return objectWrapper;
    }

    public final int BvZ() {
        int A03 = AnonymousClass0Z0.A03(1181488412);
        int hashCode = hashCode();
        AnonymousClass0Z0.A0A(1282559117, A03);
        return hashCode;
    }

    public final boolean equals(Object obj) {
        int i;
        int A03 = AnonymousClass0Z0.A03(-1137826036);
        if (obj == null || !(obj instanceof zzi)) {
            i = -335708328;
        } else {
            try {
                zzi zzi = (zzi) obj;
                if (zzi.BvZ() != hashCode()) {
                    i = -1409724247;
                } else {
                    IObjectWrapper BvU = zzi.BvU();
                    if (BvU == null) {
                        i = 709984107;
                    } else {
                        boolean equals = Arrays.equals(A03(), (byte[]) ObjectWrapper.A00(BvU));
                        AnonymousClass0Z0.A0A(822253146, A03);
                        return equals;
                    }
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                AnonymousClass0Z0.A0A(-908459464, A03);
                return false;
            }
        }
        AnonymousClass0Z0.A0A(i, A03);
        return false;
    }

    public final int hashCode() {
        int A03 = AnonymousClass0Z0.A03(-789971493);
        int i = this.A00;
        AnonymousClass0Z0.A0A(1197059395, A03);
        return i;
    }
}
