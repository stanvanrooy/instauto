package com.facebook.video.heroplayer.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.view.Surface;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.video.heroplayer.ipc.HeroServicePlayerListener;
import java.util.List;
import java.util.Map;
import p000X.AMD;
import p000X.AnonymousClass0Z0;
import p000X.C120125Dh;

public interface HeroPlayerServiceApi extends IInterface {

    public abstract class Stub extends Binder implements HeroPlayerServiceApi {

        public final class Proxy implements HeroPlayerServiceApi {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = AnonymousClass0Z0.A03(1031057448);
                this.A00 = iBinder;
                AnonymousClass0Z0.A0A(858212036, A03);
            }

            public final void A4i(TigonStatesListener tigonStatesListener) {
                IBinder iBinder;
                int A03 = AnonymousClass0Z0.A03(-1897151542);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (tigonStatesListener != null) {
                        iBinder = tigonStatesListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.A00.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1688184743, A03);
                }
            }

            public final void A4j(TigonTraceListener tigonTraceListener) {
                IBinder iBinder;
                int A03 = AnonymousClass0Z0.A03(-1380339160);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (tigonTraceListener != null) {
                        iBinder = tigonTraceListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.A00.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1062169960, A03);
                }
            }

            public final void A4k(TigonTrafficShapingListener tigonTrafficShapingListener) {
                IBinder iBinder;
                int A03 = AnonymousClass0Z0.A03(-1584885189);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (tigonTrafficShapingListener != null) {
                        iBinder = tigonTrafficShapingListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.A00.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(787942666, A03);
                }
            }

            public final void A89(String str, boolean z) {
                int A03 = AnonymousClass0Z0.A03(-496173157);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(43, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1592633613, A03);
                }
            }

            public final void A8A(String str, boolean z) {
                int A03 = AnonymousClass0Z0.A03(126135173);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(42, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(660917834, A03);
                }
            }

            public final void A8a() {
                int A03 = AnonymousClass0Z0.A03(-1915363336);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    this.A00.transact(15, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(576815700, A03);
                }
            }

            public final void A8b() {
                int A03 = AnonymousClass0Z0.A03(-530531913);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    this.A00.transact(14, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-317979860, A03);
                }
            }

            public final void A8c() {
                int A03 = AnonymousClass0Z0.A03(1240265986);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    this.A00.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1360445061, A03);
                }
            }

            public final void A8h(String str, String str2) {
                int A03 = AnonymousClass0Z0.A03(1808903563);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-507851979, A03);
                }
            }

            public final void A8p() {
                int A03 = AnonymousClass0Z0.A03(1776646771);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    this.A00.transact(39, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-49514325, A03);
                }
            }

            public final void A9l(String str, boolean z, String str2) {
                int A03 = AnonymousClass0Z0.A03(645774066);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.A00.transact(56, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1042211699, A03);
                }
            }

            public final void ABP(String str) {
                int A03 = AnonymousClass0Z0.A03(-1713361689);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    this.A00.transact(13, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1350043779, A03);
                }
            }

            public final long ADT(List list) {
                int A03 = AnonymousClass0Z0.A03(-1841610207);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeStringList(list);
                    this.A00.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-123062586, A03);
                }
            }

            public final Map AHK(String str) {
                int A03 = AnonymousClass0Z0.A03(-1525052323);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    this.A00.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(335500346, A03);
                }
            }

            public final boolean AeY(VideoPrefetchRequest videoPrefetchRequest) {
                int A03 = AnonymousClass0Z0.A03(-1869646520);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    boolean z = true;
                    if (videoPrefetchRequest != null) {
                        obtain.writeInt(1);
                        videoPrefetchRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-765835936, A03);
                }
            }

            public final void Aop() {
                int A03 = AnonymousClass0Z0.A03(-4067431);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    this.A00.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(639933034, A03);
                }
            }

            public final void Apl(String str) {
                int A03 = AnonymousClass0Z0.A03(-2108103940);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    this.A00.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1001131635, A03);
                }
            }

            public final void As1(boolean z, boolean z2, HeroScrollSetting heroScrollSetting) {
                int A03 = AnonymousClass0Z0.A03(-22680635);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    int i2 = 0;
                    if (z2) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    if (heroScrollSetting != null) {
                        obtain.writeInt(1);
                        heroScrollSetting.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(11, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-2082654790, A03);
                }
            }

            public final void As4(boolean z) {
                int A03 = AnonymousClass0Z0.A03(-1101303233);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1660411704, A03);
                }
            }

            public final void BAT(String str, long j) {
                int A03 = AnonymousClass0Z0.A03(425818343);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.A00.transact(54, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1083490223, A03);
                }
            }

            public final void BCh(int i) {
                int A03 = AnonymousClass0Z0.A03(-1632671252);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeInt(i);
                    this.A00.transact(53, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-52474170, A03);
                }
            }

            public final void BCo(String str, String str2, String str3, long j, long j2, long j3) {
                int A03 = AnonymousClass0Z0.A03(-1140642606);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeLong(j3);
                    this.A00.transact(55, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(671485634, A03);
                }
            }

            public final boolean BWv(long j, boolean z) {
                int A03 = AnonymousClass0Z0.A03(1354109280);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z2 = true;
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1374185787, A03);
                }
            }

            public final boolean BXG(long j, long j2, String str) {
                int A03 = AnonymousClass0Z0.A03(-861256905);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeString(str);
                    boolean z = false;
                    this.A00.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1248056907, A03);
                }
            }

            public final boolean BXb(long j, long j2) {
                int A03 = AnonymousClass0Z0.A03(-1175190824);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    boolean z = false;
                    this.A00.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1368201018, A03);
                }
            }

            public final void BXe() {
                int A03 = AnonymousClass0Z0.A03(835975365);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    this.A00.transact(12, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(473272466, A03);
                }
            }

            public final void BXh(VideoPrefetchRequest videoPrefetchRequest) {
                int A03 = AnonymousClass0Z0.A03(-1772432075);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (videoPrefetchRequest != null) {
                        obtain.writeInt(1);
                        videoPrefetchRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1485966418, A03);
                }
            }

            public final boolean BXu(long j, VideoPlayRequest videoPlayRequest) {
                int A03 = AnonymousClass0Z0.A03(-2004775833);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z = true;
                    if (videoPlayRequest != null) {
                        obtain.writeInt(1);
                        videoPlayRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1134362849, A03);
                }
            }

            public final boolean BXv(long j, VideoPlayRequest videoPlayRequest, boolean z, float f, boolean z2, String str) {
                int A03 = AnonymousClass0Z0.A03(-622747636);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z3 = true;
                    if (videoPlayRequest != null) {
                        obtain.writeInt(1);
                        videoPlayRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    obtain.writeFloat(f);
                    int i2 = 0;
                    if (z2) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.A00.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z3 = false;
                    }
                    return z3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(2112063835, A03);
                }
            }

            public final void BaF(long j, boolean z) {
                int A03 = AnonymousClass0Z0.A03(2069545902);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1607567480, A03);
                }
            }

            public final boolean BaW(long j, ResultReceiver resultReceiver) {
                int A03 = AnonymousClass0Z0.A03(-1217075571);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z = true;
                    if (resultReceiver != null) {
                        obtain.writeInt(1);
                        resultReceiver.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1186489054, A03);
                }
            }

            public final boolean Bda(long j) {
                int A03 = AnonymousClass0Z0.A03(-2071134595);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z = false;
                    this.A00.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-2043038701, A03);
                }
            }

            public final long Be3(long j) {
                int A03 = AnonymousClass0Z0.A03(188924450);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    this.A00.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-548757217, A03);
                }
            }

            public final void Be5(long j) {
                int A03 = AnonymousClass0Z0.A03(1709497073);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    this.A00.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1916771258, A03);
                }
            }

            public final boolean Bew(long j, long j2, long j3, boolean z) {
                int A03 = AnonymousClass0Z0.A03(887272245);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeLong(j3);
                    boolean z2 = true;
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1480665431, A03);
                }
            }

            public final boolean Bg5(long j, int i) {
                int A03 = AnonymousClass0Z0.A03(-1172632709);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    boolean z = false;
                    this.A00.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(343869602, A03);
                }
            }

            public final void Bgk(ContextualConfigListener contextualConfigListener) {
                IBinder iBinder;
                int A03 = AnonymousClass0Z0.A03(863850835);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (contextualConfigListener != null) {
                        iBinder = contextualConfigListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.A00.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-2124864532, A03);
                }
            }

            public final void Bgy(long j, String str) {
                int A03 = AnonymousClass0Z0.A03(-1741105630);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.A00.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1692522004, A03);
                }
            }

            public final void BhA(long j, DeviceOrientationFrame deviceOrientationFrame) {
                int A03 = AnonymousClass0Z0.A03(-851676614);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    if (deviceOrientationFrame != null) {
                        obtain.writeInt(1);
                        deviceOrientationFrame.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-582366680, A03);
                }
            }

            public final void BhC(DynamicPlayerSettings dynamicPlayerSettings) {
                int A03 = AnonymousClass0Z0.A03(-749155465);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (dynamicPlayerSettings != null) {
                        obtain.writeInt(1);
                        dynamicPlayerSettings.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1041769764, A03);
                }
            }

            public final void BhD(Map map) {
                int A03 = AnonymousClass0Z0.A03(725031124);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeMap(map);
                    this.A00.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1246107950, A03);
                }
            }

            public final boolean Bif(long j, boolean z) {
                int A03 = AnonymousClass0Z0.A03(-519148319);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z2 = true;
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(421306834, A03);
                }
            }

            public final boolean Bil(long j, boolean z) {
                int A03 = AnonymousClass0Z0.A03(-1090008729);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z2 = true;
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-2136982954, A03);
                }
            }

            public final boolean BjX(long j, float f) {
                int A03 = AnonymousClass0Z0.A03(-582584717);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeFloat(f);
                    boolean z = false;
                    this.A00.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1012867252, A03);
                }
            }

            public final void Bju(String str) {
                int A03 = AnonymousClass0Z0.A03(1818376639);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    this.A00.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1800693734, A03);
                }
            }

            public final boolean Bk7(long j, long j2) {
                int A03 = AnonymousClass0Z0.A03(-1111760496);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    boolean z = false;
                    this.A00.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(864321330, A03);
                }
            }

            public final void Bkd(long j, SpatialAudioFocusParams spatialAudioFocusParams) {
                int A03 = AnonymousClass0Z0.A03(-87158799);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    if (spatialAudioFocusParams != null) {
                        obtain.writeInt(1);
                        spatialAudioFocusParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(89834882, A03);
                }
            }

            public final boolean Bkx(long j, Surface surface) {
                int A03 = AnonymousClass0Z0.A03(-1909203987);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z = true;
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1545367118, A03);
                }
            }

            public final void BlE(byte[] bArr, int i) {
                int A03 = AnonymousClass0Z0.A03(-1995715731);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i);
                    this.A00.transact(50, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(484961207, A03);
                }
            }

            public final void Blk(VideoLicenseListener videoLicenseListener) {
                IBinder iBinder;
                int A03 = AnonymousClass0Z0.A03(71272358);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (videoLicenseListener != null) {
                        iBinder = videoLicenseListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.A00.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-885859172, A03);
                }
            }

            public final boolean Blu(long j, float f) {
                int A03 = AnonymousClass0Z0.A03(1160953424);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeFloat(f);
                    boolean z = false;
                    this.A00.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(457404462, A03);
                }
            }

            public final void Bm0(ZeroVideoRewriteConfig zeroVideoRewriteConfig) {
                int A03 = AnonymousClass0Z0.A03(303463279);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (zeroVideoRewriteConfig != null) {
                        obtain.writeInt(1);
                        zeroVideoRewriteConfig.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(57, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-710611886, A03);
                }
            }

            public final void Bpz() {
                int A03 = AnonymousClass0Z0.A03(408797285);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    this.A00.transact(51, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1942326076, A03);
                }
            }

            public final void BqU() {
                int A03 = AnonymousClass0Z0.A03(1362712844);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    this.A00.transact(52, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(471854217, A03);
                }
            }

            public final long Btk(long j, VideoPlayRequest videoPlayRequest, HeroServicePlayerListener heroServicePlayerListener) {
                IBinder iBinder;
                int A03 = AnonymousClass0Z0.A03(743042678);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    if (videoPlayRequest != null) {
                        obtain.writeInt(1);
                        videoPlayRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (heroServicePlayerListener != null) {
                        iBinder = heroServicePlayerListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.A00.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1680553364, A03);
                }
            }

            public final void Bu8(VideoPlayRequest videoPlayRequest, Surface surface, float f) {
                int A03 = AnonymousClass0Z0.A03(1784729380);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (videoPlayRequest != null) {
                        obtain.writeInt(1);
                        videoPlayRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeFloat(f);
                    this.A00.transact(38, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-109709474, A03);
                }
            }

            public final long Bu9(VideoPlayRequest videoPlayRequest, Surface surface, float f) {
                int A03 = AnonymousClass0Z0.A03(355044135);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (videoPlayRequest != null) {
                        obtain.writeInt(1);
                        videoPlayRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeFloat(f);
                    this.A00.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-2051317219, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0Z0.A03(-1857591026);
                IBinder iBinder = this.A00;
                AnonymousClass0Z0.A0A(1632231151, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = AnonymousClass0Z0.A03(-903763743);
            attachInterface(this, "com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
            AnonymousClass0Z0.A0A(985108349, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0Z0.A0A(-1053635570, AnonymousClass0Z0.A03(1947165499));
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: com.facebook.video.heroplayer.ipc.DynamicPlayerSettings} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.facebook.video.heroplayer.ipc.HeroScrollSetting} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: com.facebook.video.heroplayer.ipc.VideoPlayRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: com.facebook.video.heroplayer.ipc.VideoPlayRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: com.facebook.video.heroplayer.ipc.VideoPlayRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: com.facebook.video.heroplayer.ipc.VideoPrefetchRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v41, resolved type: com.facebook.video.heroplayer.ipc.VideoPrefetchRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v44, resolved type: com.facebook.video.heroplayer.ipc.DeviceOrientationFrame} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v47, resolved type: com.facebook.video.heroplayer.ipc.SpatialAudioFocusParams} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v63, resolved type: com.facebook.video.heroplayer.ipc.ZeroVideoRewriteConfig} */
        /* JADX WARNING: type inference failed for: r12v0 */
        /* JADX WARNING: type inference failed for: r12v7, types: [com.facebook.video.heroplayer.ipc.VideoLicenseListener] */
        /* JADX WARNING: type inference failed for: r12v11, types: [com.facebook.video.heroplayer.ipc.ContextualConfigListener] */
        /* JADX WARNING: type inference failed for: r12v26, types: [android.view.Surface] */
        /* JADX WARNING: type inference failed for: r12v29, types: [android.os.ResultReceiver] */
        /* JADX WARNING: type inference failed for: r12v32, types: [android.view.Surface] */
        /* JADX WARNING: type inference failed for: r12v35, types: [android.view.Surface] */
        /* JADX WARNING: type inference failed for: r12v50, types: [com.facebook.video.heroplayer.ipc.TigonStatesListener] */
        /* JADX WARNING: type inference failed for: r12v54, types: [com.facebook.video.heroplayer.ipc.TigonTraceListener] */
        /* JADX WARNING: type inference failed for: r12v58, types: [com.facebook.video.heroplayer.ipc.TigonTrafficShapingListener] */
        /* JADX WARNING: type inference failed for: r12v66 */
        /* JADX WARNING: type inference failed for: r12v67 */
        /* JADX WARNING: type inference failed for: r12v68 */
        /* JADX WARNING: type inference failed for: r12v69 */
        /* JADX WARNING: type inference failed for: r12v70 */
        /* JADX WARNING: type inference failed for: r12v71 */
        /* JADX WARNING: type inference failed for: r12v72 */
        /* JADX WARNING: type inference failed for: r12v73 */
        /* JADX WARNING: type inference failed for: r12v74 */
        /* JADX WARNING: type inference failed for: r12v75 */
        /* JADX WARNING: type inference failed for: r12v76 */
        /* JADX WARNING: type inference failed for: r12v77 */
        /* JADX WARNING: type inference failed for: r12v78 */
        /* JADX WARNING: type inference failed for: r12v79 */
        /* JADX WARNING: type inference failed for: r12v80 */
        /* JADX WARNING: type inference failed for: r12v81 */
        /* JADX WARNING: type inference failed for: r12v82 */
        /* JADX WARNING: type inference failed for: r12v83 */
        /* JADX WARNING: type inference failed for: r12v84 */
        /* JADX WARNING: type inference failed for: r12v85 */
        /* JADX WARNING: type inference failed for: r12v86 */
        /* JADX WARNING: type inference failed for: r12v87 */
        /* JADX WARNING: type inference failed for: r12v88 */
        /* JADX WARNING: type inference failed for: r12v89 */
        /* JADX WARNING: Multi-variable type inference failed */
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            HeroServicePlayerListener proxy;
            VideoPlayRequest videoPlayRequest;
            VideoPlayRequest videoPlayRequest2;
            int A03 = AnonymousClass0Z0.A03(-1409869744);
            int i4 = i;
            Parcel parcel3 = parcel2;
            if (i4 != 1598968902) {
                boolean z = false;
                ? r12 = 0;
                Parcel parcel4 = parcel;
                switch (i) {
                    case 1:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        A8h(parcel4.readString(), parcel4.readString());
                        parcel3.writeNoException();
                        i3 = -654526683;
                        break;
                    case 2:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        A8c();
                        parcel3.writeNoException();
                        i3 = -1381776043;
                        break;
                    case 3:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long ADT = ADT(parcel4.createStringArrayList());
                        parcel3.writeNoException();
                        parcel3.writeLong(ADT);
                        i3 = -968321933;
                        break;
                    case 4:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        if (parcel4.readInt() != 0) {
                            r12 = (DynamicPlayerSettings) DynamicPlayerSettings.CREATOR.createFromParcel(parcel4);
                        }
                        BhC(r12);
                        i3 = 151129155;
                        break;
                    case 5:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        BhD(parcel4.readHashMap(getClass().getClassLoader()));
                        i3 = -2096184102;
                        break;
                    case 6:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        Map AHK = AHK(parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeMap(AHK);
                        i3 = 439703723;
                        break;
                    case 7:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        Bju(parcel4.readString());
                        i3 = -25685913;
                        break;
                    case 8:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        Aop();
                        parcel3.writeNoException();
                        i3 = -1326819113;
                        break;
                    case 9:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        Apl(parcel4.readString());
                        i3 = 1187244829;
                        break;
                    case 10:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        if (parcel4.readInt() != 0) {
                            z = true;
                        }
                        As4(z);
                        parcel3.writeNoException();
                        i3 = 67221692;
                        break;
                    case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        boolean z2 = false;
                        if (parcel4.readInt() != 0) {
                            z2 = true;
                        }
                        if (parcel4.readInt() != 0) {
                            z = true;
                        }
                        if (parcel4.readInt() != 0) {
                            r12 = (HeroScrollSetting) HeroScrollSetting.CREATOR.createFromParcel(parcel4);
                        }
                        As1(z2, z, r12);
                        i3 = -1693392592;
                        break;
                    case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        BXe();
                        i3 = -1626522875;
                        break;
                    case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        ABP(parcel4.readString());
                        i3 = -1620324504;
                        break;
                    case C120125Dh.VIEW_TYPE_LINK /*14*/:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        A8b();
                        i3 = -11272749;
                        break;
                    case 15:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        A8a();
                        i3 = 874391243;
                        break;
                    case 16:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        IBinder readStrongBinder = parcel4.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.facebook.video.heroplayer.ipc.VideoLicenseListener");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof VideoLicenseListener)) {
                                r12 = new VideoLicenseListener$Stub$Proxy(readStrongBinder);
                            } else {
                                r12 = (VideoLicenseListener) queryLocalInterface;
                            }
                        }
                        Blk(r12);
                        parcel3.writeNoException();
                        i3 = 1924455538;
                        break;
                    case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        IBinder readStrongBinder2 = parcel4.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.facebook.video.heroplayer.ipc.ContextualConfigListener");
                            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof ContextualConfigListener)) {
                                r12 = new ContextualConfigListener$Stub$Proxy(readStrongBinder2);
                            } else {
                                r12 = (ContextualConfigListener) queryLocalInterface2;
                            }
                        }
                        Bgk(r12);
                        parcel3.writeNoException();
                        i3 = -1573806564;
                        break;
                    case 18:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long readLong = parcel4.readLong();
                        if (parcel4.readInt() != 0) {
                            r12 = (VideoPlayRequest) VideoPlayRequest.CREATOR.createFromParcel(parcel4);
                        }
                        IBinder readStrongBinder3 = parcel4.readStrongBinder();
                        if (readStrongBinder3 == null) {
                            proxy = null;
                        } else {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                            if (queryLocalInterface3 == null || !(queryLocalInterface3 instanceof HeroServicePlayerListener)) {
                                proxy = new HeroServicePlayerListener.Stub.Proxy(readStrongBinder3);
                            } else {
                                proxy = (HeroServicePlayerListener) queryLocalInterface3;
                            }
                        }
                        long Btk = Btk(readLong, r12, proxy);
                        parcel3.writeNoException();
                        parcel3.writeLong(Btk);
                        i3 = -552815007;
                        break;
                    case 19:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long readLong2 = parcel4.readLong();
                        if (parcel4.readInt() != 0) {
                            r12 = (VideoPlayRequest) VideoPlayRequest.CREATOR.createFromParcel(parcel4);
                        }
                        boolean BXu = BXu(readLong2, r12);
                        parcel3.writeNoException();
                        parcel3.writeInt(BXu);
                        i3 = -1013408260;
                        break;
                    case 20:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long readLong3 = parcel4.readLong();
                        if (parcel4.readInt() != 0) {
                            r12 = (VideoPlayRequest) VideoPlayRequest.CREATOR.createFromParcel(parcel4);
                        }
                        boolean z3 = false;
                        if (parcel4.readInt() != 0) {
                            z3 = true;
                        }
                        float readFloat = parcel4.readFloat();
                        boolean z4 = false;
                        if (parcel4.readInt() != 0) {
                            z4 = true;
                        }
                        boolean BXv = BXv(readLong3, r12, z3, readFloat, z4, parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeInt(BXv);
                        i3 = -283107405;
                        break;
                    case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        boolean BXG = BXG(parcel4.readLong(), parcel4.readLong(), parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeInt(BXG);
                        i3 = -1831343323;
                        break;
                    case C120125Dh.NUM_VIEW_TYPES /*22*/:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long readLong4 = parcel4.readLong();
                        if (parcel4.readInt() != 0) {
                            z = true;
                        }
                        boolean BWv = BWv(readLong4, z);
                        parcel3.writeNoException();
                        parcel3.writeInt(BWv);
                        i3 = -1440976600;
                        break;
                    case 23:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        boolean Bda = Bda(parcel4.readLong());
                        parcel3.writeNoException();
                        parcel3.writeInt(Bda);
                        i3 = 316045108;
                        break;
                    case 24:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long readLong5 = parcel4.readLong();
                        long readLong6 = parcel4.readLong();
                        long readLong7 = parcel4.readLong();
                        boolean z5 = false;
                        if (parcel4.readInt() != 0) {
                            z5 = true;
                        }
                        boolean Bew = Bew(readLong5, readLong6, readLong7, z5);
                        parcel3.writeNoException();
                        parcel3.writeInt(Bew);
                        i3 = -624799461;
                        break;
                    case 25:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        boolean BXb = BXb(parcel4.readLong(), parcel4.readLong());
                        parcel3.writeNoException();
                        parcel3.writeInt(BXb);
                        i3 = -283031107;
                        break;
                    case OdexSchemeArtXdex.OREO_SDK_INT:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        boolean Bk7 = Bk7(parcel4.readLong(), parcel4.readLong());
                        parcel3.writeNoException();
                        parcel3.writeInt(Bk7);
                        i3 = 864163270;
                        break;
                    case 27:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        boolean Blu = Blu(parcel4.readLong(), parcel4.readFloat());
                        parcel3.writeNoException();
                        parcel3.writeInt(Blu);
                        i3 = 1604115872;
                        break;
                    case 28:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        boolean BjX = BjX(parcel4.readLong(), parcel4.readFloat());
                        parcel3.writeNoException();
                        parcel3.writeInt(BjX);
                        i3 = -1265423008;
                        break;
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long readLong8 = parcel4.readLong();
                        if (parcel4.readInt() != 0) {
                            z = true;
                        }
                        boolean Bil = Bil(readLong8, z);
                        parcel3.writeNoException();
                        parcel3.writeInt(Bil);
                        i3 = 102409345;
                        break;
                    case 30:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long readLong9 = parcel4.readLong();
                        if (parcel4.readInt() != 0) {
                            r12 = (Surface) Surface.CREATOR.createFromParcel(parcel4);
                        }
                        boolean Bkx = Bkx(readLong9, r12);
                        parcel3.writeNoException();
                        parcel3.writeInt(Bkx);
                        i3 = 1712660258;
                        break;
                    case 31:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long readLong10 = parcel4.readLong();
                        if (parcel4.readInt() != 0) {
                            r12 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel4);
                        }
                        boolean BaW = BaW(readLong10, r12);
                        parcel3.writeNoException();
                        parcel3.writeInt(BaW);
                        i3 = -543591353;
                        break;
                    case 32:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long readLong11 = parcel4.readLong();
                        if (parcel4.readInt() != 0) {
                            z = true;
                        }
                        boolean Bif = Bif(readLong11, z);
                        parcel3.writeNoException();
                        parcel3.writeInt(Bif);
                        i3 = 218900176;
                        break;
                    case 33:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        boolean Bg5 = Bg5(parcel4.readLong(), parcel4.readInt());
                        parcel3.writeNoException();
                        parcel3.writeInt(Bg5);
                        i3 = -9568829;
                        break;
                    case 34:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long readLong12 = parcel4.readLong();
                        if (parcel4.readInt() != 0) {
                            z = true;
                        }
                        BaF(readLong12, z);
                        parcel3.writeNoException();
                        i3 = -568828892;
                        break;
                    case 35:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        Bgy(parcel4.readLong(), parcel4.readString());
                        parcel3.writeNoException();
                        i3 = -253796549;
                        break;
                    case 36:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        Be5(parcel4.readLong());
                        parcel3.writeNoException();
                        i3 = 1163213503;
                        break;
                    case 37:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long Be3 = Be3(parcel4.readLong());
                        parcel3.writeNoException();
                        parcel3.writeLong(Be3);
                        i3 = 1673298655;
                        break;
                    case 38:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        if (parcel4.readInt() != 0) {
                            videoPlayRequest = (VideoPlayRequest) VideoPlayRequest.CREATOR.createFromParcel(parcel4);
                        } else {
                            videoPlayRequest = null;
                        }
                        if (parcel4.readInt() != 0) {
                            r12 = (Surface) Surface.CREATOR.createFromParcel(parcel4);
                        }
                        Bu8(videoPlayRequest, r12, parcel4.readFloat());
                        i3 = 1507506887;
                        break;
                    case 39:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        A8p();
                        i3 = 773941021;
                        break;
                    case 40:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        if (parcel4.readInt() != 0) {
                            videoPlayRequest2 = (VideoPlayRequest) VideoPlayRequest.CREATOR.createFromParcel(parcel4);
                        } else {
                            videoPlayRequest2 = null;
                        }
                        if (parcel4.readInt() != 0) {
                            r12 = (Surface) Surface.CREATOR.createFromParcel(parcel4);
                        }
                        long Bu9 = Bu9(videoPlayRequest2, r12, parcel4.readFloat());
                        parcel3.writeNoException();
                        parcel3.writeLong(Bu9);
                        i3 = 236785897;
                        break;
                    case 41:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        if (parcel4.readInt() != 0) {
                            r12 = (VideoPrefetchRequest) VideoPrefetchRequest.CREATOR.createFromParcel(parcel4);
                        }
                        BXh(r12);
                        parcel3.writeNoException();
                        i3 = 1463962937;
                        break;
                    case 42:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        String readString = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            z = true;
                        }
                        A8A(readString, z);
                        i3 = -2109717201;
                        break;
                    case 43:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        String readString2 = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            z = true;
                        }
                        A89(readString2, z);
                        i3 = 113530660;
                        break;
                    case 44:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        if (parcel4.readInt() != 0) {
                            r12 = (VideoPrefetchRequest) VideoPrefetchRequest.CREATOR.createFromParcel(parcel4);
                        }
                        boolean AeY = AeY(r12);
                        parcel3.writeNoException();
                        parcel3.writeInt(AeY);
                        i3 = 54830738;
                        break;
                    case 45:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long readLong13 = parcel4.readLong();
                        if (parcel4.readInt() != 0) {
                            r12 = (DeviceOrientationFrame) DeviceOrientationFrame.CREATOR.createFromParcel(parcel4);
                        }
                        BhA(readLong13, r12);
                        parcel3.writeNoException();
                        i3 = 252969756;
                        break;
                    case 46:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        long readLong14 = parcel4.readLong();
                        if (parcel4.readInt() != 0) {
                            r12 = (SpatialAudioFocusParams) SpatialAudioFocusParams.CREATOR.createFromParcel(parcel4);
                        }
                        Bkd(readLong14, r12);
                        parcel3.writeNoException();
                        i3 = 1635493990;
                        break;
                    case 47:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        IBinder readStrongBinder4 = parcel4.readStrongBinder();
                        if (readStrongBinder4 != null) {
                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.facebook.video.heroplayer.ipc.TigonStatesListener");
                            if (queryLocalInterface4 == null || !(queryLocalInterface4 instanceof TigonStatesListener)) {
                                r12 = new TigonStatesListener$Stub$Proxy(readStrongBinder4);
                            } else {
                                r12 = (TigonStatesListener) queryLocalInterface4;
                            }
                        }
                        A4i(r12);
                        parcel3.writeNoException();
                        i3 = -40838894;
                        break;
                    case 48:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        IBinder readStrongBinder5 = parcel4.readStrongBinder();
                        if (readStrongBinder5 != null) {
                            IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.facebook.video.heroplayer.ipc.TigonTraceListener");
                            if (queryLocalInterface5 == null || !(queryLocalInterface5 instanceof TigonTraceListener)) {
                                r12 = new TigonTraceListener$Stub$Proxy(readStrongBinder5);
                            } else {
                                r12 = (TigonTraceListener) queryLocalInterface5;
                            }
                        }
                        A4j(r12);
                        parcel3.writeNoException();
                        i3 = 1291666195;
                        break;
                    case 49:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        IBinder readStrongBinder6 = parcel4.readStrongBinder();
                        if (readStrongBinder6 != null) {
                            IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.facebook.video.heroplayer.ipc.TigonTrafficShapingListener");
                            if (queryLocalInterface6 == null || !(queryLocalInterface6 instanceof TigonTrafficShapingListener)) {
                                r12 = new TigonTrafficShapingListener$Stub$Proxy(readStrongBinder6);
                            } else {
                                r12 = (TigonTrafficShapingListener) queryLocalInterface6;
                            }
                        }
                        A4k(r12);
                        parcel3.writeNoException();
                        i3 = -684576478;
                        break;
                    case AMD.MAX_LIKES_PER_FETCH /*50*/:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        BlE(parcel4.createByteArray(), parcel4.readInt());
                        i3 = -349531347;
                        break;
                    case 51:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        Bpz();
                        i3 = 1965571100;
                        break;
                    case 52:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        BqU();
                        i3 = 1155641918;
                        break;
                    case 53:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        BCh(parcel4.readInt());
                        i3 = -1327961936;
                        break;
                    case 54:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        BAT(parcel4.readString(), parcel4.readLong());
                        i3 = -1676687295;
                        break;
                    case 55:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        BCo(parcel4.readString(), parcel4.readString(), parcel4.readString(), parcel4.readLong(), parcel4.readLong(), parcel4.readLong());
                        i3 = -1325816158;
                        break;
                    case 56:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        String readString3 = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            z = true;
                        }
                        A9l(readString3, z, parcel4.readString());
                        parcel3.writeNoException();
                        i3 = 519312122;
                        break;
                    case 57:
                        parcel4.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        if (parcel4.readInt() != 0) {
                            r12 = (ZeroVideoRewriteConfig) ZeroVideoRewriteConfig.CREATOR.createFromParcel(parcel4);
                        }
                        Bm0(r12);
                        parcel3.writeNoException();
                        i3 = -953475716;
                        break;
                    default:
                        boolean onTransact = super.onTransact(i4, parcel4, parcel3, i2);
                        AnonymousClass0Z0.A0A(-84299968, A03);
                        return onTransact;
                }
            } else {
                parcel3.writeString("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                i3 = -1348906248;
            }
            AnonymousClass0Z0.A0A(i3, A03);
            return true;
        }
    }

    void A4i(TigonStatesListener tigonStatesListener);

    void A4j(TigonTraceListener tigonTraceListener);

    void A4k(TigonTrafficShapingListener tigonTrafficShapingListener);

    void A89(String str, boolean z);

    void A8A(String str, boolean z);

    void A8a();

    void A8b();

    void A8c();

    void A8h(String str, String str2);

    void A8p();

    void A9l(String str, boolean z, String str2);

    void ABP(String str);

    long ADT(List list);

    Map AHK(String str);

    boolean AeY(VideoPrefetchRequest videoPrefetchRequest);

    void Aop();

    void Apl(String str);

    void As1(boolean z, boolean z2, HeroScrollSetting heroScrollSetting);

    void As4(boolean z);

    void BAT(String str, long j);

    void BCh(int i);

    void BCo(String str, String str2, String str3, long j, long j2, long j3);

    boolean BWv(long j, boolean z);

    boolean BXG(long j, long j2, String str);

    boolean BXb(long j, long j2);

    void BXe();

    void BXh(VideoPrefetchRequest videoPrefetchRequest);

    boolean BXu(long j, VideoPlayRequest videoPlayRequest);

    boolean BXv(long j, VideoPlayRequest videoPlayRequest, boolean z, float f, boolean z2, String str);

    void BaF(long j, boolean z);

    boolean BaW(long j, ResultReceiver resultReceiver);

    boolean Bda(long j);

    long Be3(long j);

    void Be5(long j);

    boolean Bew(long j, long j2, long j3, boolean z);

    boolean Bg5(long j, int i);

    void Bgk(ContextualConfigListener contextualConfigListener);

    void Bgy(long j, String str);

    void BhA(long j, DeviceOrientationFrame deviceOrientationFrame);

    void BhC(DynamicPlayerSettings dynamicPlayerSettings);

    void BhD(Map map);

    boolean Bif(long j, boolean z);

    boolean Bil(long j, boolean z);

    boolean BjX(long j, float f);

    void Bju(String str);

    boolean Bk7(long j, long j2);

    void Bkd(long j, SpatialAudioFocusParams spatialAudioFocusParams);

    boolean Bkx(long j, Surface surface);

    void BlE(byte[] bArr, int i);

    void Blk(VideoLicenseListener videoLicenseListener);

    boolean Blu(long j, float f);

    void Bm0(ZeroVideoRewriteConfig zeroVideoRewriteConfig);

    void Bpz();

    void BqU();

    long Btk(long j, VideoPlayRequest videoPlayRequest, HeroServicePlayerListener heroServicePlayerListener);

    void Bu8(VideoPlayRequest videoPlayRequest, Surface surface, float f);

    long Bu9(VideoPlayRequest videoPlayRequest, Surface surface, float f);
}
