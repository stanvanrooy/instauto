package com.facebook.cameracore.mediapipeline.asyncscripting;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public interface IJsVm extends IInterface {

    public abstract class Stub extends Binder implements IJsVm {

        public final class Proxy implements IJsVm {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = AnonymousClass0Z0.A03(620808280);
                this.A00 = iBinder;
                AnonymousClass0Z0.A0A(-1856199118, A03);
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0Z0.A03(1701007223);
                IBinder iBinder = this.A00;
                AnonymousClass0Z0.A0A(-1385908481, A03);
                return iBinder;
            }

            public final void destroy() {
                int A03 = AnonymousClass0Z0.A03(1036175516);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm");
                    this.A00.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1545677806, A03);
                }
            }

            public final void enqueueMessages(int i, String str) {
                int A03 = AnonymousClass0Z0.A03(427653562);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(832303529, A03);
                }
            }

            public final void enqueueScript(int i, String str) {
                int A03 = AnonymousClass0Z0.A03(802268943);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.A00.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1547936392, A03);
                }
            }

            public final void execute() {
                int A03 = AnonymousClass0Z0.A03(-1474589944);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm");
                    this.A00.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(840586074, A03);
                }
            }

            /* renamed from: gc */
            public final void mo48736gc() {
                int A03 = AnonymousClass0Z0.A03(1047885744);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm");
                    this.A00.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(621469096, A03);
                }
            }
        }

        public Stub() {
            int A03 = AnonymousClass0Z0.A03(-2032457863);
            attachInterface(this, "com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm");
            AnonymousClass0Z0.A0A(224776790, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0Z0.A0A(1833317482, AnonymousClass0Z0.A03(1200048791));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = AnonymousClass0Z0.A03(1497468752);
            if (i == 1) {
                parcel.enforceInterface("com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm");
                enqueueMessages(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                i3 = 1808259660;
            } else if (i == 2) {
                parcel.enforceInterface("com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm");
                enqueueScript(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                i3 = 345714691;
            } else if (i == 3) {
                parcel.enforceInterface("com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm");
                execute();
                parcel2.writeNoException();
                i3 = -849921121;
            } else if (i == 4) {
                parcel.enforceInterface("com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm");
                destroy();
                parcel2.writeNoException();
                i3 = 643273019;
            } else if (i == 5) {
                parcel.enforceInterface("com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm");
                mo48736gc();
                parcel2.writeNoException();
                i3 = -461292295;
            } else if (i != 1598968902) {
                boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
                AnonymousClass0Z0.A0A(1358129505, A03);
                return onTransact;
            } else {
                parcel2.writeString("com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm");
                i3 = -389537917;
            }
            AnonymousClass0Z0.A0A(i3, A03);
            return true;
        }
    }

    void destroy();

    void enqueueMessages(int i, String str);

    void enqueueScript(int i, String str);

    void execute();

    /* renamed from: gc */
    void mo48736gc();
}
