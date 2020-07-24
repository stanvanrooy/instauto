package com.facebook.cameracore.mediapipeline.asyncscripting;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public interface IScriptingClient extends IInterface {

    public abstract class Stub extends Binder implements IScriptingClient {

        public final class Proxy implements IScriptingClient {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = AnonymousClass0Z0.A03(453762452);
                this.A00 = iBinder;
                AnonymousClass0Z0.A0A(-722914831, A03);
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0Z0.A03(1221083897);
                IBinder iBinder = this.A00;
                AnonymousClass0Z0.A0A(-1481972022, A03);
                return iBinder;
            }

            public final String call(int i, String str) {
                int A03 = AnonymousClass0Z0.A03(-1405299298);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1802856851, A03);
                }
            }

            public final void onObjectsReleased(int i, String str) {
                int A03 = AnonymousClass0Z0.A03(148219703);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.A00.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1077639952, A03);
                }
            }

            public final void onScriptingError(int i, String str) {
                int A03 = AnonymousClass0Z0.A03(1519534640);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.A00.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(399845062, A03);
                }
            }

            public final String postMsg(int i, String str) {
                int A03 = AnonymousClass0Z0.A03(-502161664);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.A00.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-559195698, A03);
                }
            }
        }

        public Stub() {
            int A03 = AnonymousClass0Z0.A03(-1987584607);
            attachInterface(this, "com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient");
            AnonymousClass0Z0.A0A(1938215930, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0Z0.A0A(-1465280929, AnonymousClass0Z0.A03(1175370875));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = AnonymousClass0Z0.A03(495627488);
            if (i == 1) {
                parcel.enforceInterface("com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient");
                String call = call(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(call);
                i3 = -887385785;
            } else if (i == 2) {
                parcel.enforceInterface("com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient");
                String postMsg = postMsg(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(postMsg);
                i3 = -981056117;
            } else if (i == 3) {
                parcel.enforceInterface("com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient");
                onScriptingError(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                i3 = 1032047546;
            } else if (i == 4) {
                parcel.enforceInterface("com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient");
                onObjectsReleased(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                i3 = 1777351722;
            } else if (i != 1598968902) {
                boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
                AnonymousClass0Z0.A0A(-107051023, A03);
                return onTransact;
            } else {
                parcel2.writeString("com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient");
                i3 = -1229750545;
            }
            AnonymousClass0Z0.A0A(i3, A03);
            return true;
        }
    }

    String call(int i, String str);

    void onObjectsReleased(int i, String str);

    void onScriptingError(int i, String str);

    String postMsg(int i, String str);
}
