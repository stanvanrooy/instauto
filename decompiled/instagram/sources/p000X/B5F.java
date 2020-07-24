package p000X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.B5F */
public final class B5F implements B5R {
    public final IBinder A00;

    public B5F(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final void AiU(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
            obtain.writeInt(i);
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
