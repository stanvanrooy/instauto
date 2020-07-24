package com.facebook.browser.lite.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public interface AutofillOptOutCallback extends IInterface {

    public abstract class Stub extends Binder implements AutofillOptOutCallback {

        public final class Proxy implements AutofillOptOutCallback {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = AnonymousClass0Z0.A03(720787706);
                this.A00 = iBinder;
                AnonymousClass0Z0.A0A(464571067, A03);
            }

            public final void AuG(String str, boolean z) {
                int A03 = AnonymousClass0Z0.A03(1246329137);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                    obtain.writeString(str);
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(649622755, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0Z0.A03(-1936173714);
                IBinder iBinder = this.A00;
                AnonymousClass0Z0.A0A(-820015047, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = AnonymousClass0Z0.A03(-1742465275);
            attachInterface(this, "com.facebook.browser.lite.ipc.AutofillOptOutCallback");
            AnonymousClass0Z0.A0A(602685671, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0Z0.A0A(-387477542, AnonymousClass0Z0.A03(-617270258));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = AnonymousClass0Z0.A03(-454439569);
            if (i == 1) {
                parcel.enforceInterface("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                String readString = parcel.readString();
                boolean z = false;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                AuG(readString, z);
                i3 = 1617105194;
            } else if (i != 1598968902) {
                boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
                AnonymousClass0Z0.A0A(-2058053722, A03);
                return onTransact;
            } else {
                parcel2.writeString("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                i3 = -918341382;
            }
            AnonymousClass0Z0.A0A(i3, A03);
            return true;
        }
    }

    void AuG(String str, boolean z);
}
