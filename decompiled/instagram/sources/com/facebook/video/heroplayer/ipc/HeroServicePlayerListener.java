package com.facebook.video.heroplayer.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.C120125Dh;

public interface HeroServicePlayerListener extends IInterface {

    public abstract class Stub extends Binder implements HeroServicePlayerListener {

        public final class Proxy implements HeroServicePlayerListener {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = AnonymousClass0Z0.A03(-894749311);
                this.A00 = iBinder;
                AnonymousClass0Z0.A0A(1686880861, A03);
            }

            public final void Atp(ServicePlayerState servicePlayerState, LiveState liveState, boolean z) {
                int A03 = AnonymousClass0Z0.A03(2101184926);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    int i = 0;
                    if (servicePlayerState != null) {
                        obtain.writeInt(1);
                        servicePlayerState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (liveState != null) {
                        obtain.writeInt(1);
                        liveState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(10, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1220761103, A03);
                }
            }

            public final void Atr(ServicePlayerState servicePlayerState, boolean z) {
                int A03 = AnonymousClass0Z0.A03(-633576093);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    int i = 0;
                    if (servicePlayerState != null) {
                        obtain.writeInt(1);
                        servicePlayerState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(11, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1322381417, A03);
                }
            }

            public final void Aug(ServicePlayerState servicePlayerState, String str) {
                int A03 = AnonymousClass0Z0.A03(1088303849);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    if (servicePlayerState != null) {
                        obtain.writeInt(1);
                        servicePlayerState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.A00.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(644089221, A03);
                }
            }

            public final void Axn(ServicePlayerState servicePlayerState, boolean z) {
                int A03 = AnonymousClass0Z0.A03(1148742971);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    int i = 0;
                    if (servicePlayerState != null) {
                        obtain.writeInt(1);
                        servicePlayerState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(2136090163, A03);
                }
            }

            public final void Ayv(List list) {
                int A03 = AnonymousClass0Z0.A03(876877147);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    obtain.writeTypedList(list);
                    this.A00.transact(16, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1111076936, A03);
                }
            }

            public final void AzH(String str, boolean z, long j) {
                int A03 = AnonymousClass0Z0.A03(-196954204);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    obtain.writeString(str);
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.A00.transact(20, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1116797004, A03);
                }
            }

            public final void AzI(int i, int i2, int i3, int i4) {
                int A03 = AnonymousClass0Z0.A03(-234972300);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    this.A00.transact(21, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1718422607, A03);
                }
            }

            public final void B0w(ParcelableFormat parcelableFormat, String str, List list) {
                int A03 = AnonymousClass0Z0.A03(1049569830);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    if (parcelableFormat != null) {
                        obtain.writeInt(1);
                        parcelableFormat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringList(list);
                    this.A00.transact(15, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-586568783, A03);
                }
            }

            public final void B1b() {
                int A03 = AnonymousClass0Z0.A03(1594921261);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    this.A00.transact(18, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(531304359, A03);
                }
            }

            public final void B2l(String str, String str2, String str3, String str4) {
                int A03 = AnonymousClass0Z0.A03(668900074);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.A00.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-424598108, A03);
                }
            }

            public final void B9K(LiveState liveState) {
                int A03 = AnonymousClass0Z0.A03(1875470377);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    if (liveState != null) {
                        obtain.writeInt(1);
                        liveState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(13, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-2084245159, A03);
                }
            }

            public final void BCp(byte[] bArr, long j) {
                int A03 = AnonymousClass0Z0.A03(1463008873);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.A00.transact(22, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-44392094, A03);
                }
            }

            public final void BE3(ServicePlayerState servicePlayerState, long j, String str) {
                int A03 = AnonymousClass0Z0.A03(1711828330);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    if (servicePlayerState != null) {
                        obtain.writeInt(1);
                        servicePlayerState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.A00.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1085635404, A03);
                }
            }

            public final void BEZ(ServicePlayerState servicePlayerState) {
                int A03 = AnonymousClass0Z0.A03(1755750036);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    if (servicePlayerState != null) {
                        obtain.writeInt(1);
                        servicePlayerState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(12, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-748828408, A03);
                }
            }

            public final void BFI(ServicePlayerState servicePlayerState, String str) {
                int A03 = AnonymousClass0Z0.A03(698041360);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    if (servicePlayerState != null) {
                        obtain.writeInt(1);
                        servicePlayerState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.A00.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(841362029, A03);
                }
            }

            public final void BI9(boolean z) {
                int A03 = AnonymousClass0Z0.A03(-520201956);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(14, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-725145441, A03);
                }
            }

            public final void BLr(long j, ServicePlayerState servicePlayerState) {
                int A03 = AnonymousClass0Z0.A03(-1010067767);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    obtain.writeLong(j);
                    if (servicePlayerState != null) {
                        obtain.writeInt(1);
                        servicePlayerState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(19, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1399172952, A03);
                }
            }

            public final void BOA(int i) {
                int A03 = AnonymousClass0Z0.A03(1824430373);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    obtain.writeInt(i);
                    this.A00.transact(17, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-690799362, A03);
                }
            }

            public final void BOl(ServicePlayerState servicePlayerState, boolean z, boolean z2, String str, String str2) {
                int A03 = AnonymousClass0Z0.A03(-798497234);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    int i = 0;
                    if (servicePlayerState != null) {
                        obtain.writeInt(1);
                        servicePlayerState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    int i2 = 0;
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    if (z2) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.A00.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-102713150, A03);
                }
            }

            public final void BRd(List list) {
                int A03 = AnonymousClass0Z0.A03(-77761502);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    obtain.writeTypedList(list);
                    this.A00.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-642101105, A03);
                }
            }

            public final void BVO(int i, int i2) {
                int A03 = AnonymousClass0Z0.A03(-1528740210);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.A00.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1056541933, A03);
                }
            }

            public final void BWE(String str, String str2) {
                int A03 = AnonymousClass0Z0.A03(725882934);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.A00.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-2062577535, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0Z0.A03(-295432239);
                IBinder iBinder = this.A00;
                AnonymousClass0Z0.A0A(47914171, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = AnonymousClass0Z0.A03(351207851);
            attachInterface(this, "com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            AnonymousClass0Z0.A0A(1365206130, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0Z0.A0A(-593935156, AnonymousClass0Z0.A03(411903282));
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.facebook.video.heroplayer.ipc.ServicePlayerState} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.facebook.video.heroplayer.ipc.ServicePlayerState} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: com.facebook.video.heroplayer.ipc.ServicePlayerState} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: com.facebook.video.heroplayer.ipc.ServicePlayerState} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: com.facebook.video.heroplayer.ipc.ServicePlayerState} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: com.facebook.video.heroplayer.ipc.LiveState} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: com.facebook.video.heroplayer.ipc.ServicePlayerState} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: com.facebook.video.heroplayer.ipc.ServicePlayerState} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: com.facebook.video.heroplayer.ipc.LiveState} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: com.facebook.video.heroplayer.ipc.ParcelableFormat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: com.facebook.video.heroplayer.ipc.ServicePlayerState} */
        /* JADX WARNING: type inference failed for: r7v0 */
        /* JADX WARNING: type inference failed for: r7v34 */
        /* JADX WARNING: type inference failed for: r7v35 */
        /* JADX WARNING: type inference failed for: r7v36 */
        /* JADX WARNING: type inference failed for: r7v37 */
        /* JADX WARNING: type inference failed for: r7v38 */
        /* JADX WARNING: type inference failed for: r7v39 */
        /* JADX WARNING: type inference failed for: r7v40 */
        /* JADX WARNING: type inference failed for: r7v41 */
        /* JADX WARNING: type inference failed for: r7v42 */
        /* JADX WARNING: type inference failed for: r7v43 */
        /* JADX WARNING: type inference failed for: r7v44 */
        /* JADX WARNING: Multi-variable type inference failed */
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            ServicePlayerState servicePlayerState;
            int A03 = AnonymousClass0Z0.A03(1787293848);
            if (i != 1598968902) {
                boolean z = false;
                ? r7 = 0;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        B2l(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        i3 = 804394714;
                        break;
                    case 2:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        BWE(parcel.readString(), parcel.readString());
                        i3 = -612720809;
                        break;
                    case 3:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        BRd(parcel.createTypedArrayList(ParcelableTimeRange.CREATOR));
                        i3 = 1519392472;
                        break;
                    case 4:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            r7 = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        BFI(r7, parcel.readString());
                        i3 = 118406524;
                        break;
                    case 5:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            r7 = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        boolean z2 = false;
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        }
                        boolean z3 = false;
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        BOl(r7, z2, z3, parcel.readString(), parcel.readString());
                        i3 = 881844382;
                        break;
                    case 6:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            r7 = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        BE3(r7, parcel.readLong(), parcel.readString());
                        i3 = -405999541;
                        break;
                    case 7:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            r7 = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        Aug(r7, parcel.readString());
                        i3 = -720892506;
                        break;
                    case 8:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            r7 = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        Axn(r7, z);
                        i3 = -926821827;
                        break;
                    case 9:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        BVO(parcel.readInt(), parcel.readInt());
                        i3 = 354541677;
                        break;
                    case 10:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            servicePlayerState = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        } else {
                            servicePlayerState = null;
                        }
                        if (parcel.readInt() != 0) {
                            r7 = (LiveState) LiveState.CREATOR.createFromParcel(parcel);
                        }
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        Atp(servicePlayerState, r7, z);
                        i3 = 981591675;
                        break;
                    case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            r7 = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        Atr(r7, z);
                        i3 = 1268377193;
                        break;
                    case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            r7 = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        BEZ(r7);
                        i3 = 1085818137;
                        break;
                    case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            r7 = (LiveState) LiveState.CREATOR.createFromParcel(parcel);
                        }
                        B9K(r7);
                        i3 = -1675495979;
                        break;
                    case C120125Dh.VIEW_TYPE_LINK /*14*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        BI9(z);
                        i3 = -969383678;
                        break;
                    case 15:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            r7 = (ParcelableFormat) ParcelableFormat.CREATOR.createFromParcel(parcel);
                        }
                        B0w(r7, parcel.readString(), parcel.createStringArrayList());
                        i3 = -2017079106;
                        break;
                    case 16:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        Ayv(parcel.createTypedArrayList(ParcelableCue.CREATOR));
                        i3 = -766714454;
                        break;
                    case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        BOA(parcel.readInt());
                        i3 = -448739952;
                        break;
                    case 18:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        B1b();
                        i3 = 120394002;
                        break;
                    case 19:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        long readLong = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            r7 = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        BLr(readLong, r7);
                        i3 = -1765213315;
                        break;
                    case 20:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        AzH(readString, z, parcel.readLong());
                        i3 = 665630712;
                        break;
                    case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        AzI(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        i3 = 1856351915;
                        break;
                    case C120125Dh.NUM_VIEW_TYPES /*22*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        BCp(parcel.createByteArray(), parcel.readLong());
                        i3 = 1548949887;
                        break;
                    default:
                        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
                        AnonymousClass0Z0.A0A(-1788813740, A03);
                        return onTransact;
                }
            } else {
                parcel2.writeString("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                i3 = -1118030129;
            }
            AnonymousClass0Z0.A0A(i3, A03);
            return true;
        }
    }

    void Atp(ServicePlayerState servicePlayerState, LiveState liveState, boolean z);

    void Atr(ServicePlayerState servicePlayerState, boolean z);

    void Aug(ServicePlayerState servicePlayerState, String str);

    void Axn(ServicePlayerState servicePlayerState, boolean z);

    void Ayv(List list);

    void AzH(String str, boolean z, long j);

    void AzI(int i, int i2, int i3, int i4);

    void B0w(ParcelableFormat parcelableFormat, String str, List list);

    void B1b();

    void B2l(String str, String str2, String str3, String str4);

    void B9K(LiveState liveState);

    void BCp(byte[] bArr, long j);

    void BE3(ServicePlayerState servicePlayerState, long j, String str);

    void BEZ(ServicePlayerState servicePlayerState);

    void BFI(ServicePlayerState servicePlayerState, String str);

    void BI9(boolean z);

    void BLr(long j, ServicePlayerState servicePlayerState);

    void BOA(int i);

    void BOl(ServicePlayerState servicePlayerState, boolean z, boolean z2, String str, String str2);

    void BRd(List list);

    void BVO(int i, int i2);

    void BWE(String str, String str2);
}
