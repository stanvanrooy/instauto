package com.facebook.push.fbns.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public interface IFbnsAIDLService extends IInterface {

    public abstract class Stub extends Binder implements IFbnsAIDLService {

        public final class Proxy implements IFbnsAIDLService {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = AnonymousClass0Z0.A03(502217712);
                this.A00 = iBinder;
                AnonymousClass0Z0.A0A(1131072382, A03);
            }

            public final FbnsAIDLResult BYm(FbnsAIDLRequest fbnsAIDLRequest) {
                FbnsAIDLResult fbnsAIDLResult;
                int A03 = AnonymousClass0Z0.A03(1819998277);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                    if (fbnsAIDLRequest != null) {
                        obtain.writeInt(1);
                        fbnsAIDLRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        fbnsAIDLResult = (FbnsAIDLResult) FbnsAIDLResult.CREATOR.createFromParcel(obtain2);
                    } else {
                        fbnsAIDLResult = null;
                    }
                    return fbnsAIDLResult;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1651473098, A03);
                }
            }

            public final void BsK(FbnsAIDLRequest fbnsAIDLRequest) {
                int A03 = AnonymousClass0Z0.A03(1204005627);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                    if (fbnsAIDLRequest != null) {
                        obtain.writeInt(1);
                        fbnsAIDLRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1041951890, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0Z0.A03(-335947478);
                IBinder iBinder = this.A00;
                AnonymousClass0Z0.A0A(-1666669739, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = AnonymousClass0Z0.A03(-986241021);
            attachInterface(this, "com.facebook.push.fbns.ipc.IFbnsAIDLService");
            AnonymousClass0Z0.A0A(-1802141584, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0Z0.A0A(920453875, AnonymousClass0Z0.A03(1307666724));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = AnonymousClass0Z0.A03(-761289823);
            FbnsAIDLRequest fbnsAIDLRequest = null;
            if (i == 1) {
                parcel.enforceInterface("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                if (parcel.readInt() != 0) {
                    fbnsAIDLRequest = (FbnsAIDLRequest) FbnsAIDLRequest.CREATOR.createFromParcel(parcel);
                }
                FbnsAIDLResult BYm = BYm(fbnsAIDLRequest);
                parcel2.writeNoException();
                if (BYm != null) {
                    parcel2.writeInt(1);
                    BYm.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                i3 = -925902130;
            } else if (i == 2) {
                parcel.enforceInterface("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                if (parcel.readInt() != 0) {
                    fbnsAIDLRequest = (FbnsAIDLRequest) FbnsAIDLRequest.CREATOR.createFromParcel(parcel);
                }
                BsK(fbnsAIDLRequest);
                i3 = 987443338;
            } else if (i != 1598968902) {
                boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
                AnonymousClass0Z0.A0A(-1143376027, A03);
                return onTransact;
            } else {
                parcel2.writeString("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                i3 = -1081379517;
            }
            AnonymousClass0Z0.A0A(i3, A03);
            return true;
        }
    }

    FbnsAIDLResult BYm(FbnsAIDLRequest fbnsAIDLRequest);

    void BsK(FbnsAIDLRequest fbnsAIDLRequest);
}
