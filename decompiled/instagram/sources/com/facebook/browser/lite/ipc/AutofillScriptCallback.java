package com.facebook.browser.lite.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public interface AutofillScriptCallback extends IInterface {

    public abstract class Stub extends Binder implements AutofillScriptCallback {

        public final class Proxy implements AutofillScriptCallback {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = AnonymousClass0Z0.A03(-1557325651);
                this.A00 = iBinder;
                AnonymousClass0Z0.A0A(516694902, A03);
            }

            public final void AuF(String str) {
                int A03 = AnonymousClass0Z0.A03(-1602331463);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.AutofillScriptCallback");
                    obtain.writeString(str);
                    this.A00.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1732556768, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0Z0.A03(475732767);
                IBinder iBinder = this.A00;
                AnonymousClass0Z0.A0A(700273535, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = AnonymousClass0Z0.A03(-1631264194);
            attachInterface(this, "com.facebook.browser.lite.ipc.AutofillScriptCallback");
            AnonymousClass0Z0.A0A(-737463034, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0Z0.A0A(-1605374822, AnonymousClass0Z0.A03(1505159352));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = AnonymousClass0Z0.A03(-295573265);
            if (i == 1) {
                parcel.enforceInterface("com.facebook.browser.lite.ipc.AutofillScriptCallback");
                AuF(parcel.readString());
                i3 = 1012021015;
            } else if (i != 1598968902) {
                boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
                AnonymousClass0Z0.A0A(-379189614, A03);
                return onTransact;
            } else {
                parcel2.writeString("com.facebook.browser.lite.ipc.AutofillScriptCallback");
                i3 = -1864008284;
            }
            AnonymousClass0Z0.A0A(i3, A03);
            return true;
        }
    }

    void AuF(String str);
}
