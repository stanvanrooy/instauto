package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;
import p000X.AnonymousClass0Z0;

public interface IObjectWrapper extends IInterface {

    public class Stub extends zzb implements IObjectWrapper {

        public final class zza extends com.google.android.gms.internal.common.zza implements IObjectWrapper {
            public zza(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
                AnonymousClass0Z0.A0A(-1775093967, AnonymousClass0Z0.A03(1515770207));
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
            AnonymousClass0Z0.A0A(315065025, AnonymousClass0Z0.A03(369804989));
        }

        public static IObjectWrapper A01(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof IObjectWrapper) {
                return (IObjectWrapper) queryLocalInterface;
            }
            return new zza(iBinder);
        }
    }
}
