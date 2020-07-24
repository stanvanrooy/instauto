package p000X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: X.BIW */
public final class BIW extends BIG implements BKH {
    public C25417BIv A00 = null;
    public Integer A01 = null;
    public Set A02 = new HashSet();
    public long A03 = 120000;
    public C54222Wj A04;
    public final int A05;
    public final Context A06;
    public final Looper A07;
    public final C25432BJo A08 = new C25432BJo();
    public final BIY A09;
    public final C25389BHh A0A;
    public final BIX A0B;
    public final Map A0C;
    public final Queue A0D = new LinkedList();
    public final Lock A0E;
    public final GoogleApiAvailability A0F;
    public final C25426BJh A0G;
    public final C25387BHd A0H;
    public final C25439BKc A0I;
    public final ArrayList A0J;
    public final Map A0K;
    public volatile boolean A0L;

    public final void But(int i, boolean z) {
        if (i == 1 && !z && !this.A0L) {
            this.A0L = true;
            if (this.A04 == null) {
                this.A04 = this.A0F.A06(this.A06.getApplicationContext(), new C25425BJg(this));
            }
            BIY biy = this.A09;
            AnonymousClass0ZA.A06(biy, biy.obtainMessage(1), this.A03);
            BIY biy2 = this.A09;
            AnonymousClass0ZA.A06(biy2, biy2.obtainMessage(2), ArLinkScanControllerImpl.ERROR_DELAY_MS);
        }
        for (BasePendingResult A0A2 : (BasePendingResult[]) this.A0A.A01.toArray(C25389BHh.A04)) {
            A0A2.A0A(C25389BHh.A03);
        }
        BIX bix = this.A0B;
        boolean z2 = false;
        if (Looper.myLooper() == bix.A01.getLooper()) {
            z2 = true;
        }
        AnonymousClass0a2.A09(z2, "onUnintentionalDisconnection must only be called on the Handler thread");
        AnonymousClass0ZA.A02(bix.A01, 1);
        synchronized (bix.A03) {
            bix.A00 = true;
            ArrayList arrayList = new ArrayList(bix.A04);
            int i2 = bix.A07.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                C25437BKa bKa = (C25437BKa) obj;
                if (!bix.A08 || bix.A07.get() != i2) {
                    break;
                } else if (bix.A04.contains(bKa)) {
                    bKa.Ay8(i);
                }
            }
            bix.A05.clear();
            bix.A00 = false;
        }
        BIX bix2 = this.A0B;
        bix2.A08 = false;
        bix2.A07.incrementAndGet();
        if (i == 2) {
            this.A0B.A08 = true;
            this.A00.connect();
        }
    }

    public static final void A01(BIW biw) {
        biw.A0E.lock();
        try {
            if (biw.A0L) {
                biw.A0B.A08 = true;
                biw.A00.connect();
            }
        } finally {
            biw.A0E.unlock();
        }
    }

    public static final void A02(BIW biw, int i) {
        String str;
        String str2;
        BIW biw2 = biw;
        Integer num = biw2.A01;
        int i2 = i;
        if (num == null) {
            biw2.A01 = Integer.valueOf(i2);
        } else {
            int intValue = num.intValue();
            if (intValue != i2) {
                if (i2 == 1) {
                    str = "SIGN_IN_MODE_REQUIRED";
                } else if (i2 == 2) {
                    str = "SIGN_IN_MODE_OPTIONAL";
                } else if (i2 != 3) {
                    str = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
                } else {
                    str = "SIGN_IN_MODE_NONE";
                }
                if (intValue == 1) {
                    str2 = "SIGN_IN_MODE_REQUIRED";
                } else if (intValue == 2) {
                    str2 = "SIGN_IN_MODE_OPTIONAL";
                } else if (intValue != 3) {
                    str2 = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
                } else {
                    str2 = "SIGN_IN_MODE_NONE";
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str2).length());
                sb.append("Cannot use sign-in mode: ");
                sb.append(str);
                sb.append(". Mode was already set to ");
                sb.append(str2);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (biw2.A00 == null) {
            boolean z = false;
            boolean z2 = false;
            for (C25376BGp bGp : biw2.A0C.values()) {
                if (bGp.BdW()) {
                    z = true;
                }
                if (bGp.BYX()) {
                    z2 = true;
                }
            }
            int intValue2 = biw2.A01.intValue();
            if (intValue2 != 1) {
                if (intValue2 == 2 && z) {
                    Context context = biw2.A06;
                    Lock lock = biw2.A0E;
                    Looper looper = biw2.A07;
                    GoogleApiAvailability googleApiAvailability = biw2.A0F;
                    Map map = biw2.A0C;
                    C25387BHd bHd = biw2.A0H;
                    Map map2 = biw2.A0K;
                    C25426BJh bJh = biw2.A0G;
                    ArrayList arrayList = biw2.A0J;
                    C04450Ea r9 = new C04450Ea();
                    C04450Ea r8 = new C04450Ea();
                    C25376BGp bGp2 = null;
                    for (Map.Entry entry : map.entrySet()) {
                        C25376BGp bGp3 = (C25376BGp) entry.getValue();
                        if (bGp3.BYX()) {
                            bGp2 = bGp3;
                        }
                        if (bGp3.BdW()) {
                            r9.put((BKp) entry.getKey(), bGp3);
                        } else {
                            r8.put((BKp) entry.getKey(), bGp3);
                        }
                    }
                    AnonymousClass0a2.A09(!r9.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                    C04450Ea r7 = new C04450Ea();
                    C04450Ea r6 = new C04450Ea();
                    for (C25399BHx bHx : map2.keySet()) {
                        BKp A012 = bHx.A01();
                        if (r9.containsKey(A012)) {
                            r7.put(bHx, (Boolean) map2.get(bHx));
                        } else if (r8.containsKey(A012)) {
                            r6.put(bHx, (Boolean) map2.get(bHx));
                        } else {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        C25418BIw bIw = (C25418BIw) obj;
                        if (r7.containsKey(bIw.A01)) {
                            arrayList2.add(bIw);
                        } else if (r6.containsKey(bIw.A01)) {
                            arrayList3.add(bIw);
                        } else {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                    }
                    Looper looper2 = looper;
                    GoogleApiAvailability googleApiAvailability2 = googleApiAvailability;
                    C04450Ea r20 = r9;
                    Context context2 = context;
                    BIW biw3 = biw2;
                    biw2.A00 = new C25402BIa(context2, biw3, lock, looper2, googleApiAvailability2, r20, r8, bHd, bJh, bGp2, arrayList2, arrayList3, r7, r6);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            Context context3 = biw2.A06;
            Lock lock2 = biw2.A0E;
            Looper looper3 = biw2.A07;
            GoogleApiAvailability googleApiAvailability3 = biw2.A0F;
            Map map3 = biw2.A0C;
            C25387BHd bHd2 = biw2.A0H;
            Map map4 = biw2.A0K;
            C25426BJh bJh2 = biw2.A0G;
            C25387BHd bHd3 = bHd2;
            Map map5 = map4;
            C25426BJh bJh3 = bJh2;
            Looper looper4 = looper3;
            GoogleApiAvailability googleApiAvailability4 = googleApiAvailability3;
            Map map6 = map3;
            Lock lock3 = lock2;
            biw2.A00 = new C25405BIe(context3, biw2, lock3, looper4, googleApiAvailability4, map6, bHd3, map5, bJh3, biw2.A0J, biw2);
        }
    }

    public final boolean A0K() {
        if (!this.A0L) {
            return false;
        }
        this.A0L = false;
        AnonymousClass0ZA.A02(this.A09, 2);
        AnonymousClass0ZA.A02(this.A09, 1);
        C54222Wj r0 = this.A04;
        if (r0 != null) {
            r0.A00();
            this.A04 = null;
        }
        return true;
    }

    public final void Buu(Bundle bundle) {
        while (!this.A0D.isEmpty()) {
            A09((C25390BHi) this.A0D.remove());
        }
        BIX bix = this.A0B;
        boolean z = true;
        boolean z2 = false;
        if (Looper.myLooper() == bix.A01.getLooper()) {
            z2 = true;
        }
        AnonymousClass0a2.A09(z2, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (bix.A03) {
            boolean z3 = false;
            if (!bix.A00) {
                z3 = true;
            }
            AnonymousClass0a2.A07(z3);
            AnonymousClass0ZA.A02(bix.A01, 1);
            bix.A00 = true;
            if (bix.A05.size() != 0) {
                z = false;
            }
            AnonymousClass0a2.A07(z);
            ArrayList arrayList = new ArrayList(bix.A04);
            int i = bix.A07.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                C25437BKa bKa = (C25437BKa) obj;
                if (!bix.A08 || !bix.A02.isConnected() || bix.A07.get() != i) {
                    break;
                } else if (!bix.A05.contains(bKa)) {
                    bKa.Ay0(bundle);
                }
            }
            bix.A05.clear();
            bix.A00 = false;
        }
    }

    public final void Buw(ConnectionResult connectionResult) {
        boolean z;
        Context context = this.A06;
        int i = connectionResult.A00;
        if (i == 18) {
            z = true;
        } else if (i == 1) {
            z = C42011rM.A00(context);
        } else {
            z = false;
        }
        if (!z) {
            A0K();
        }
        if (!this.A0L) {
            BIX bix = this.A0B;
            int i2 = 0;
            boolean z2 = false;
            if (Looper.myLooper() == bix.A01.getLooper()) {
                z2 = true;
            }
            AnonymousClass0a2.A09(z2, "onConnectionFailure must only be called on the Handler thread");
            AnonymousClass0ZA.A02(bix.A01, 1);
            synchronized (bix.A03) {
                ArrayList arrayList = new ArrayList(bix.A06);
                int i3 = bix.A07.get();
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    BEH beh = (BEH) obj;
                    if (!bix.A08 || bix.A07.get() != i3) {
                        break;
                    } else if (bix.A06.contains(beh)) {
                        beh.Ay4(connectionResult);
                    }
                }
            }
            BIX bix2 = this.A0B;
            bix2.A08 = false;
            bix2.A07.incrementAndGet();
        }
    }

    public static int A00(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            C25376BGp bGp = (C25376BGp) it.next();
            if (bGp.BdW()) {
                z2 = true;
            }
            if (bGp.BYX()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }

    public BIW(Context context, Lock lock, Looper looper, C25387BHd bHd, GoogleApiAvailability googleApiAvailability, C25426BJh bJh, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        BKA bka = new BKA(this);
        this.A0I = bka;
        this.A06 = context;
        this.A0E = lock;
        this.A0B = new BIX(looper, bka);
        this.A07 = looper;
        this.A09 = new BIY(this, looper);
        this.A0F = googleApiAvailability;
        this.A05 = i;
        if (i >= 0) {
            this.A01 = Integer.valueOf(i2);
        }
        this.A0K = map;
        this.A0C = map2;
        this.A0J = arrayList;
        this.A0A = new C25389BHh(map2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0B.A00((C25437BKa) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.A0B.A01((BEH) it2.next());
        }
        this.A0H = bHd;
        this.A0G = bJh;
    }
}
