package com.facebook.cameracore.mediapipeline.asyncscripting;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm;
import com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient;
import p000X.AnonymousClass0Z0;

public interface IAsyncScriptingService extends IInterface {

    public abstract class Stub extends Binder implements IAsyncScriptingService {

        public final class Proxy implements IAsyncScriptingService {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = AnonymousClass0Z0.A03(924517914);
                this.A00 = iBinder;
                AnonymousClass0Z0.A0A(1266805516, A03);
            }

            public final IJsVm ABH(IScriptingClient iScriptingClient) {
                IBinder iBinder;
                IJsVm iJsVm;
                int A03 = AnonymousClass0Z0.A03(-1538577711);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.cameracore.mediapipeline.asyncscripting.IAsyncScriptingService");
                    if (iScriptingClient != null) {
                        iBinder = iScriptingClient.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        iJsVm = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.facebook.cameracore.mediapipeline.asyncscripting.IJsVm");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof IJsVm)) {
                            iJsVm = new IJsVm.Stub.Proxy(readStrongBinder);
                        } else {
                            iJsVm = (IJsVm) queryLocalInterface;
                        }
                    }
                    return iJsVm;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(320755389, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0Z0.A03(1423698248);
                IBinder iBinder = this.A00;
                AnonymousClass0Z0.A0A(-775474166, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = AnonymousClass0Z0.A03(1164939362);
            attachInterface(this, "com.facebook.cameracore.mediapipeline.asyncscripting.IAsyncScriptingService");
            AnonymousClass0Z0.A0A(1262119678, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0Z0.A0A(-1714008954, AnonymousClass0Z0.A03(-276172850));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            IScriptingClient proxy;
            IBinder iBinder;
            int A03 = AnonymousClass0Z0.A03(-79947513);
            if (i == 1) {
                parcel.enforceInterface("com.facebook.cameracore.mediapipeline.asyncscripting.IAsyncScriptingService");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    proxy = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof IScriptingClient)) {
                        proxy = new IScriptingClient.Stub.Proxy(readStrongBinder);
                    } else {
                        proxy = (IScriptingClient) queryLocalInterface;
                    }
                }
                IJsVm ABH = ABH(proxy);
                parcel2.writeNoException();
                if (ABH != null) {
                    iBinder = ABH.asBinder();
                } else {
                    iBinder = null;
                }
                parcel2.writeStrongBinder(iBinder);
                i3 = -1525674664;
            } else if (i != 1598968902) {
                boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
                AnonymousClass0Z0.A0A(2028596487, A03);
                return onTransact;
            } else {
                parcel2.writeString("com.facebook.cameracore.mediapipeline.asyncscripting.IAsyncScriptingService");
                i3 = 1684625220;
            }
            AnonymousClass0Z0.A0A(i3, A03);
            return true;
        }
    }

    IJsVm ABH(IScriptingClient iScriptingClient);
}
