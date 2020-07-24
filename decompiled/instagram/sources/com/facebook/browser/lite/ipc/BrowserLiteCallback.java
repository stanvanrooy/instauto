package com.facebook.browser.lite.ipc;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.browser.lite.ipc.AutofillOptOutCallback;
import com.facebook.browser.lite.ipc.AutofillScriptCallback;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.react.modules.camera.CameraRollManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass0Z0;
import p000X.C120125Dh;

public interface BrowserLiteCallback extends IInterface {

    public abstract class Stub extends Binder implements BrowserLiteCallback {

        public final class Proxy implements BrowserLiteCallback {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = AnonymousClass0Z0.A03(1327775068);
                this.A00 = iBinder;
                AnonymousClass0Z0.A0A(-138292883, A03);
            }

            public final void A6u(String str, Map map, Bundle bundle) {
                int A03 = AnonymousClass0Z0.A03(-480276071);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-520399424, A03);
                }
            }

            public final void A8T(Bundle bundle) {
                int A03 = AnonymousClass0Z0.A03(-41538863);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(953622633, A03);
                }
            }

            public final void ADy(AutofillScriptCallback autofillScriptCallback) {
                IBinder iBinder;
                int A03 = AnonymousClass0Z0.A03(1850332226);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    if (autofillScriptCallback != null) {
                        iBinder = autofillScriptCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.A00.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-350602278, A03);
                }
            }

            public final PrefetchCacheEntry ASV(String str) {
                PrefetchCacheEntry prefetchCacheEntry;
                int A03 = AnonymousClass0Z0.A03(-1265314492);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.A00.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        prefetchCacheEntry = (PrefetchCacheEntry) PrefetchCacheEntry.CREATOR.createFromParcel(obtain2);
                    } else {
                        prefetchCacheEntry = null;
                    }
                    return prefetchCacheEntry;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(407969762, A03);
                }
            }

            public final List ASW() {
                int A03 = AnonymousClass0Z0.A03(-306861057);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    this.A00.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1495120046, A03);
                }
            }

            public final void AbB(String str) {
                int A03 = AnonymousClass0Z0.A03(1759965785);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.A00.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1263883452, A03);
                }
            }

            public final int AbN(String str) {
                int A03 = AnonymousClass0Z0.A03(-375372880);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1255314008, A03);
                }
            }

            public final boolean AbP(String str) {
                int A03 = AnonymousClass0Z0.A03(1958676339);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    boolean z = false;
                    this.A00.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(2059432252, A03);
                }
            }

            public final boolean AbS(String str, String str2, String str3, String str4, String str5) {
                int A03 = AnonymousClass0Z0.A03(413535326);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    boolean z = false;
                    this.A00.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-584446207, A03);
                }
            }

            public final boolean AbT(String str) {
                int A03 = AnonymousClass0Z0.A03(789039959);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
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
                    AnonymousClass0Z0.A0A(726175430, A03);
                }
            }

            public final void AbV(String str, String str2) {
                int A03 = AnonymousClass0Z0.A03(-832992702);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.A00.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1539986686, A03);
                }
            }

            public final boolean AbY(String str, String str2) {
                int A03 = AnonymousClass0Z0.A03(-1970581553);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.A00.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-828393000, A03);
                }
            }

            public final void Aii(String str) {
                int A03 = AnonymousClass0Z0.A03(-37818060);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.A00.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1898825193, A03);
                }
            }

            public final void AjU(String str, Map map) {
                int A03 = AnonymousClass0Z0.A03(1534203115);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.A00.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1827450648, A03);
                }
            }

            public final void Alz(String str, long j, long j2, long j3, long j4, long j5, int i, boolean z, boolean z2, boolean z3, Map map, boolean z4, String str2, Map map2) {
                int A03 = AnonymousClass0Z0.A03(-93734897);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeLong(j3);
                    obtain.writeLong(j4);
                    obtain.writeLong(j5);
                    obtain.writeInt(i);
                    int i2 = 1;
                    int i3 = 0;
                    if (z) {
                        i3 = 1;
                    }
                    obtain.writeInt(i3);
                    int i4 = 0;
                    if (z2) {
                        i4 = 1;
                    }
                    obtain.writeInt(i4);
                    int i5 = 0;
                    if (z3) {
                        i5 = 1;
                    }
                    obtain.writeInt(i5);
                    obtain.writeMap(map);
                    if (!z4) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    obtain.writeMap(map2);
                    this.A00.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-511632940, A03);
                }
            }

            public final void Amz(Map map) {
                int A03 = AnonymousClass0Z0.A03(-1872063519);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeMap(map);
                    this.A00.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1777643821, A03);
                }
            }

            public final String Aos(String str) {
                int A03 = AnonymousClass0Z0.A03(-1704342652);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.A00.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(8888453, A03);
                }
            }

            public final void AqG(Bundle bundle) {
                int A03 = AnonymousClass0Z0.A03(182880575);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(372970802, A03);
                }
            }

            public final void Asq(String str, AutofillOptOutCallback autofillOptOutCallback) {
                IBinder iBinder;
                int A03 = AnonymousClass0Z0.A03(-1761575952);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    if (autofillOptOutCallback != null) {
                        iBinder = autofillOptOutCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.A00.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(710765706, A03);
                }
            }

            public final void AyW(String str, Bundle bundle) {
                int A03 = AnonymousClass0Z0.A03(-1678923046);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1685312379, A03);
                }
            }

            public final void B33(String str, String str2, Map map, Bundle bundle) {
                int A03 = AnonymousClass0Z0.A03(-1827940725);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-932773640, A03);
                }
            }

            public final void B3J(String str) {
                int A03 = AnonymousClass0Z0.A03(-1450074326);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.A00.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1217416646, A03);
                }
            }

            public final void B4w() {
                int A03 = AnonymousClass0Z0.A03(49581761);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    this.A00.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(660425260, A03);
                }
            }

            public final void B6p(String str, List list) {
                int A03 = AnonymousClass0Z0.A03(1057898864);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeList(list);
                    this.A00.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(375085294, A03);
                }
            }

            public final void B6s(IABEvent iABEvent, Bundle bundle) {
                int A03 = AnonymousClass0Z0.A03(730745749);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    if (iABEvent != null) {
                        obtain.writeInt(1);
                        iABEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-276180152, A03);
                }
            }

            public final void B8Y(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback) {
                IBinder iBinder;
                int A03 = AnonymousClass0Z0.A03(2002744335);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    if (browserLiteJSBridgeCall != null) {
                        obtain.writeInt(1);
                        browserLiteJSBridgeCall.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (browserLiteJSBridgeCallback != null) {
                        iBinder = browserLiteJSBridgeCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.A00.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1361320787, A03);
                }
            }

            public final void BDZ(String str, int i) {
                int A03 = AnonymousClass0Z0.A03(217473372);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.A00.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(327214321, A03);
                }
            }

            public final void BDc(String str, Bundle bundle, int i, long j) {
                int A03 = AnonymousClass0Z0.A03(2086073855);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.A00.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1456072416, A03);
                }
            }

            public final void BDl(String str, String str2, Bundle bundle) {
                int A03 = AnonymousClass0Z0.A03(-1619222897);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-565490210, A03);
                }
            }

            public final void BE2(String str, boolean z) {
                int A03 = AnonymousClass0Z0.A03(789289479);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    int i = 0;
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.A00.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-109395752, A03);
                }
            }

            public final void BGx(Map map) {
                int A03 = AnonymousClass0Z0.A03(-1769196388);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeMap(map);
                    this.A00.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(1160342537, A03);
                }
            }

            public final void BJz(String str, Bundle bundle) {
                int A03 = AnonymousClass0Z0.A03(-1172591131);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-766818921, A03);
                }
            }

            public final void BLU(String str) {
                int A03 = AnonymousClass0Z0.A03(-1489378407);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.A00.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1408367893, A03);
                }
            }

            public final void BMU() {
                int A03 = AnonymousClass0Z0.A03(463162871);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    this.A00.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-504628911, A03);
                }
            }

            public final void BTn(Bundle bundle, String str) {
                int A03 = AnonymousClass0Z0.A03(991632442);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.A00.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(318205377, A03);
                }
            }

            public final void BTq(Map map, Bundle bundle) {
                int A03 = AnonymousClass0Z0.A03(59897858);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeMap(map);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1893171265, A03);
                }
            }

            public final void BWX(String str) {
                int A03 = AnonymousClass0Z0.A03(1260667473);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.A00.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-747736294, A03);
                }
            }

            public final void BWd(String str, Bundle bundle) {
                int A03 = AnonymousClass0Z0.A03(-1138665642);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1919036971, A03);
                }
            }

            public final void BWi() {
                int A03 = AnonymousClass0Z0.A03(-475474794);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    this.A00.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-1246749503, A03);
                }
            }

            public final void Bcm(long[] jArr) {
                int A03 = AnonymousClass0Z0.A03(317590044);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeLongArray(jArr);
                    this.A00.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-975451074, A03);
                }
            }

            public final void BjE(String str) {
                int A03 = AnonymousClass0Z0.A03(-1263644109);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.A00.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(483150133, A03);
                }
            }

            public final void Br9() {
                int A03 = AnonymousClass0Z0.A03(53440699);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    this.A00.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-957228098, A03);
                }
            }

            public final void Bs4(Bundle bundle) {
                int A03 = AnonymousClass0Z0.A03(1870301993);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0Z0.A0A(-38927022, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0Z0.A03(1291148035);
                IBinder iBinder = this.A00;
                AnonymousClass0Z0.A0A(281641695, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = AnonymousClass0Z0.A03(-48400316);
            attachInterface(this, "com.facebook.browser.lite.ipc.BrowserLiteCallback");
            AnonymousClass0Z0.A0A(-1722318555, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0Z0.A0A(1416617752, AnonymousClass0Z0.A03(1175971799));
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v35, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v38, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v41, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v44, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v47, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v50, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r10v0 */
        /* JADX WARNING: type inference failed for: r10v24, types: [com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall] */
        /* JADX WARNING: type inference failed for: r10v27, types: [com.facebook.browser.lite.ipc.AutofillOptOutCallback] */
        /* JADX WARNING: type inference failed for: r10v31, types: [com.facebook.browser.lite.ipc.AutofillScriptCallback] */
        /* JADX WARNING: type inference failed for: r10v53 */
        /* JADX WARNING: type inference failed for: r10v54 */
        /* JADX WARNING: type inference failed for: r10v55 */
        /* JADX WARNING: type inference failed for: r10v56 */
        /* JADX WARNING: type inference failed for: r10v57 */
        /* JADX WARNING: type inference failed for: r10v58 */
        /* JADX WARNING: type inference failed for: r10v59 */
        /* JADX WARNING: type inference failed for: r10v60 */
        /* JADX WARNING: type inference failed for: r10v61 */
        /* JADX WARNING: type inference failed for: r10v62 */
        /* JADX WARNING: type inference failed for: r10v63 */
        /* JADX WARNING: type inference failed for: r10v64 */
        /* JADX WARNING: type inference failed for: r10v65 */
        /* JADX WARNING: type inference failed for: r10v66 */
        /* JADX WARNING: type inference failed for: r10v67 */
        /* JADX WARNING: type inference failed for: r10v68 */
        /* JADX WARNING: type inference failed for: r10v69 */
        /* JADX WARNING: type inference failed for: r10v70 */
        /* JADX WARNING: Multi-variable type inference failed */
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            IABEvent iABEvent;
            BrowserLiteJSBridgeCallback proxy;
            int A03 = AnonymousClass0Z0.A03(-818611076);
            int i4 = i;
            Parcel parcel3 = parcel2;
            if (i4 != 1598968902) {
                boolean z = false;
                ? r10 = 0;
                Parcel parcel4 = parcel;
                switch (i) {
                    case 1:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        int AbN = AbN(parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeInt(AbN);
                        i3 = -1944335588;
                        break;
                    case 2:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        boolean AbY = AbY(parcel4.readString(), parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeInt(AbY);
                        i3 = -399314222;
                        break;
                    case 3:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        boolean AbS = AbS(parcel4.readString(), parcel4.readString(), parcel4.readString(), parcel4.readString(), parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeInt(AbS);
                        i3 = -63857050;
                        break;
                    case 4:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        if (parcel4.readInt() != 0) {
                            iABEvent = (IABEvent) IABEvent.CREATOR.createFromParcel(parcel4);
                        } else {
                            iABEvent = null;
                        }
                        if (parcel4.readInt() != 0) {
                            r10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        B6s(iABEvent, r10);
                        parcel3.writeNoException();
                        i3 = 2059839948;
                        break;
                    case 5:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String readString = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            r10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        AyW(readString, r10);
                        parcel3.writeNoException();
                        i3 = -187436399;
                        break;
                    case 6:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String readString2 = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            r10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        BJz(readString2, r10);
                        parcel3.writeNoException();
                        i3 = -1453286992;
                        break;
                    case 7:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String readString3 = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            z = true;
                        }
                        BE2(readString3, z);
                        parcel3.writeNoException();
                        i3 = 839953869;
                        break;
                    case 8:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String readString4 = parcel4.readString();
                        long readLong = parcel4.readLong();
                        long readLong2 = parcel4.readLong();
                        long readLong3 = parcel4.readLong();
                        long readLong4 = parcel4.readLong();
                        long readLong5 = parcel4.readLong();
                        int readInt = parcel4.readInt();
                        boolean z2 = false;
                        if (parcel4.readInt() != 0) {
                            z2 = true;
                        }
                        boolean z3 = false;
                        if (parcel4.readInt() != 0) {
                            z3 = true;
                        }
                        boolean z4 = false;
                        if (parcel4.readInt() != 0) {
                            z4 = true;
                        }
                        ClassLoader classLoader = getClass().getClassLoader();
                        HashMap readHashMap = parcel4.readHashMap(classLoader);
                        boolean z5 = false;
                        if (parcel4.readInt() != 0) {
                            z5 = true;
                        }
                        Alz(readString4, readLong, readLong2, readLong3, readLong4, readLong5, readInt, z2, z3, z4, readHashMap, z5, parcel4.readString(), parcel4.readHashMap(classLoader));
                        parcel3.writeNoException();
                        AnonymousClass0Z0.A0A(1406756368, A03);
                        return true;
                    case 9:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String readString5 = parcel4.readString();
                        String readString6 = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            r10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        BDl(readString5, readString6, r10);
                        parcel3.writeNoException();
                        i3 = -1257231161;
                        break;
                    case 10:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String readString7 = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            r10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        BDc(readString7, r10, parcel4.readInt(), parcel4.readLong());
                        parcel3.writeNoException();
                        i3 = 1692036673;
                        break;
                    case C120125Dh.VIEW_TYPE_BANNER:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        BDZ(parcel4.readString(), parcel4.readInt());
                        parcel3.writeNoException();
                        i3 = -2018392114;
                        break;
                    case C120125Dh.VIEW_TYPE_SPINNER:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        Bcm(parcel4.createLongArray());
                        parcel3.writeNoException();
                        i3 = 1034486704;
                        break;
                    case C120125Dh.VIEW_TYPE_BADGE:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String readString8 = parcel4.readString();
                        String readString9 = parcel4.readString();
                        HashMap readHashMap2 = parcel4.readHashMap(getClass().getClassLoader());
                        if (parcel4.readInt() != 0) {
                            r10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        B33(readString8, readString9, readHashMap2, r10);
                        parcel3.writeNoException();
                        i3 = 1724300810;
                        break;
                    case C120125Dh.VIEW_TYPE_LINK:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        BGx(parcel4.readHashMap(getClass().getClassLoader()));
                        parcel3.writeNoException();
                        i3 = 1100877756;
                        break;
                    case 15:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        HashMap readHashMap3 = parcel4.readHashMap(getClass().getClassLoader());
                        if (parcel4.readInt() != 0) {
                            r10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        BTq(readHashMap3, r10);
                        parcel3.writeNoException();
                        i3 = 1726773204;
                        break;
                    case 16:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        AbV(parcel4.readString(), parcel4.readString());
                        parcel3.writeNoException();
                        i3 = -1095503459;
                        break;
                    case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        BLU(parcel4.readString());
                        parcel3.writeNoException();
                        i3 = -80049066;
                        break;
                    case 18:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        List ASW = ASW();
                        parcel3.writeNoException();
                        parcel3.writeStringList(ASW);
                        i3 = 658343132;
                        break;
                    case 19:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        PrefetchCacheEntry ASV = ASV(parcel4.readString());
                        parcel3.writeNoException();
                        if (ASV != null) {
                            parcel3.writeInt(1);
                            ASV.writeToParcel(parcel3, 1);
                        } else {
                            parcel3.writeInt(0);
                        }
                        i3 = 2050278334;
                        break;
                    case 20:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        if (parcel4.readInt() != 0) {
                            r10 = (BrowserLiteJSBridgeCall) BrowserLiteJSBridgeCall.CREATOR.createFromParcel(parcel4);
                        }
                        IBinder readStrongBinder = parcel4.readStrongBinder();
                        if (readStrongBinder == null) {
                            proxy = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof BrowserLiteJSBridgeCallback)) {
                                proxy = new BrowserLiteJSBridgeCallback.Stub.Proxy(readStrongBinder);
                            } else {
                                proxy = (BrowserLiteJSBridgeCallback) queryLocalInterface;
                            }
                        }
                        B8Y(r10, proxy);
                        parcel3.writeNoException();
                        i3 = -743945871;
                        break;
                    case C120125Dh.VIEW_TYPE_BRANDING:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        Br9();
                        parcel3.writeNoException();
                        i3 = -414894584;
                        break;
                    case C120125Dh.NUM_VIEW_TYPES:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        B6p(parcel4.readString(), parcel4.readArrayList(getClass().getClassLoader()));
                        parcel3.writeNoException();
                        i3 = -1395503337;
                        break;
                    case 23:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        boolean AbT = AbT(parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeInt(AbT);
                        i3 = -1466522190;
                        break;
                    case 24:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String Aos = Aos(parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeString(Aos);
                        i3 = -1083752603;
                        break;
                    case 25:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String readString10 = parcel4.readString();
                        IBinder readStrongBinder2 = parcel4.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof AutofillOptOutCallback)) {
                                r10 = new AutofillOptOutCallback.Stub.Proxy(readStrongBinder2);
                            } else {
                                r10 = (AutofillOptOutCallback) queryLocalInterface2;
                            }
                        }
                        Asq(readString10, r10);
                        parcel3.writeNoException();
                        i3 = 1909476050;
                        break;
                    case OdexSchemeArtXdex.OREO_SDK_INT:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        IBinder readStrongBinder3 = parcel4.readStrongBinder();
                        if (readStrongBinder3 != null) {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.facebook.browser.lite.ipc.AutofillScriptCallback");
                            if (queryLocalInterface3 == null || !(queryLocalInterface3 instanceof AutofillScriptCallback)) {
                                r10 = new AutofillScriptCallback.Stub.Proxy(readStrongBinder3);
                            } else {
                                r10 = (AutofillScriptCallback) queryLocalInterface3;
                            }
                        }
                        ADy(r10);
                        parcel3.writeNoException();
                        i3 = 602813050;
                        break;
                    case 27:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        Aii(parcel4.readString());
                        parcel3.writeNoException();
                        i3 = 1892857333;
                        break;
                    case 28:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        if (parcel4.readInt() != 0) {
                            r10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        A8T(r10);
                        parcel3.writeNoException();
                        i3 = -1841641417;
                        break;
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        if (parcel4.readInt() != 0) {
                            r10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        Bs4(r10);
                        parcel3.writeNoException();
                        i3 = 1868002158;
                        break;
                    case 30:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        BjE(parcel4.readString());
                        parcel3.writeNoException();
                        i3 = -1870627949;
                        break;
                    case 31:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        if (parcel4.readInt() != 0) {
                            r10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        AqG(r10);
                        parcel3.writeNoException();
                        i3 = 1238381958;
                        break;
                    case 32:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        if (parcel4.readInt() != 0) {
                            r10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        BTn(r10, parcel4.readString());
                        parcel3.writeNoException();
                        i3 = -1279049327;
                        break;
                    case 33:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        B4w();
                        parcel3.writeNoException();
                        i3 = 1477169871;
                        break;
                    case 34:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        boolean AbP = AbP(parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeInt(AbP);
                        i3 = 1761801692;
                        break;
                    case 35:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        Amz(parcel4.readHashMap(getClass().getClassLoader()));
                        parcel3.writeNoException();
                        i3 = 1481754254;
                        break;
                    case 36:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        AbB(parcel4.readString());
                        parcel3.writeNoException();
                        i3 = 2025442125;
                        break;
                    case 37:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        AjU(parcel4.readString(), parcel4.readHashMap(getClass().getClassLoader()));
                        parcel3.writeNoException();
                        i3 = -166881445;
                        break;
                    case 38:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String readString11 = parcel4.readString();
                        HashMap readHashMap4 = parcel4.readHashMap(getClass().getClassLoader());
                        if (parcel4.readInt() != 0) {
                            r10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        A6u(readString11, readHashMap4, r10);
                        parcel3.writeNoException();
                        i3 = 1498733394;
                        break;
                    case 39:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        BMU();
                        parcel3.writeNoException();
                        i3 = 862389459;
                        break;
                    case 40:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        B3J(parcel4.readString());
                        parcel3.writeNoException();
                        i3 = -84760263;
                        break;
                    case 41:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String readString12 = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            r10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        BWd(readString12, r10);
                        parcel3.writeNoException();
                        i3 = -891039642;
                        break;
                    case 42:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        BWi();
                        parcel3.writeNoException();
                        i3 = 450163369;
                        break;
                    case 43:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        BWX(parcel4.readString());
                        parcel3.writeNoException();
                        i3 = 1517738089;
                        break;
                    default:
                        boolean onTransact = super.onTransact(i4, parcel4, parcel3, i2);
                        AnonymousClass0Z0.A0A(225376151, A03);
                        return onTransact;
                }
            } else {
                parcel3.writeString("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                i3 = -1800119072;
            }
            AnonymousClass0Z0.A0A(i3, A03);
            return true;
        }
    }

    void A6u(String str, Map map, Bundle bundle);

    void A8T(Bundle bundle);

    void ADy(AutofillScriptCallback autofillScriptCallback);

    PrefetchCacheEntry ASV(String str);

    List ASW();

    void AbB(String str);

    int AbN(String str);

    boolean AbP(String str);

    boolean AbS(String str, String str2, String str3, String str4, String str5);

    boolean AbT(String str);

    void AbV(String str, String str2);

    boolean AbY(String str, String str2);

    void Aii(String str);

    void AjU(String str, Map map);

    void Alz(String str, long j, long j2, long j3, long j4, long j5, int i, boolean z, boolean z2, boolean z3, Map map, boolean z4, String str2, Map map2);

    void Amz(Map map);

    String Aos(String str);

    void AqG(Bundle bundle);

    void Asq(String str, AutofillOptOutCallback autofillOptOutCallback);

    void AyW(String str, Bundle bundle);

    void B33(String str, String str2, Map map, Bundle bundle);

    void B3J(String str);

    void B4w();

    void B6p(String str, List list);

    void B6s(IABEvent iABEvent, Bundle bundle);

    void B8Y(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback);

    void BDZ(String str, int i);

    void BDc(String str, Bundle bundle, int i, long j);

    void BDl(String str, String str2, Bundle bundle);

    void BE2(String str, boolean z);

    void BGx(Map map);

    void BJz(String str, Bundle bundle);

    void BLU(String str);

    void BMU();

    void BTn(Bundle bundle, String str);

    void BTq(Map map, Bundle bundle);

    void BWX(String str);

    void BWd(String str, Bundle bundle);

    void BWi();

    void Bcm(long[] jArr);

    void BjE(String str);

    void Br9();

    void Bs4(Bundle bundle);
}
