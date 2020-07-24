package p000X;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.BIG */
public abstract class BIG {
    public static final Set A00 = Collections.newSetFromMap(new WeakHashMap());

    public ConnectionResult A05() {
        if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException(((C25384BGz) this).A00);
        }
        BIW biw = (BIW) this;
        boolean z = true;
        boolean z2 = false;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z2 = true;
        }
        AnonymousClass0a2.A09(z2, "blockingConnect must not be called on the UI thread");
        biw.A0E.lock();
        try {
            if (biw.A05 >= 0) {
                if (biw.A01 == null) {
                    z = false;
                }
                AnonymousClass0a2.A09(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = biw.A01;
                if (num == null) {
                    biw.A01 = Integer.valueOf(BIW.A00(biw.A0C.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            BIW.A02(biw, biw.A01.intValue());
            biw.A0B.A08 = true;
            return biw.A00.A6p();
        } finally {
            biw.A0E.unlock();
        }
    }

    public BHH A07() {
        if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException(((C25384BGz) this).A00);
        }
        BIW biw = (BIW) this;
        AnonymousClass0a2.A09(biw.A0I(), "GoogleApiClient is not connected yet.");
        boolean z = false;
        if (biw.A01.intValue() != 2) {
            z = true;
        }
        AnonymousClass0a2.A09(z, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        BK9 bk9 = new BK9(biw);
        if (biw.A0C.containsKey(C25422BJd.A00)) {
            C25422BJd.A02.Buj(biw).A04(new BIN(biw, bk9, false, biw));
            return bk9;
        }
        AtomicReference atomicReference = new AtomicReference();
        BIt bIt = new BIt(biw, atomicReference, bk9);
        BJY bjy = new BJY(bk9);
        Context context = biw.A06;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        C04450Ea r10 = new C04450Ea();
        C04450Ea r5 = new C04450Ea();
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        C25426BJh bJh = BJU.A00;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Context context2 = context;
        context.getMainLooper();
        String packageName = context.getPackageName();
        String name = context.getClass().getName();
        C25399BHx bHx = C25422BJd.A01;
        AnonymousClass0a2.A03(bHx, "Api must not be null");
        r5.put(bHx, (Object) null);
        List A002 = bHx.A00.A00((Object) null);
        hashSet2.addAll(A002);
        hashSet.addAll(A002);
        AnonymousClass0a2.A03(bIt, "Listener must not be null");
        arrayList.add(bIt);
        AnonymousClass0a2.A03(bjy, "Listener must not be null");
        arrayList2.add(bjy);
        BIY biy = biw.A09;
        AnonymousClass0a2.A03(biy, "Handler must not be null");
        Looper looper = biy.getLooper();
        AnonymousClass0a2.A08(!r5.isEmpty(), "must call addApi() to add at least one API");
        BKw bKw = BKw.A00;
        if (r5.containsKey(BJU.A01)) {
            bKw = (BKw) r5.get(BJU.A01);
        }
        C25387BHd bHd = new C25387BHd(hashSet, r10, packageName, name, bKw);
        C25399BHx bHx2 = null;
        Map map = bHd.A04;
        C04450Ea r13 = new C04450Ea();
        C04450Ea r12 = new C04450Ea();
        ArrayList arrayList3 = new ArrayList();
        for (C25399BHx bHx3 : r5.keySet()) {
            Object obj = r5.get(bHx3);
            boolean z2 = false;
            if (map.get(bHx3) != null) {
                z2 = true;
            }
            r13.put(bHx3, Boolean.valueOf(z2));
            C25418BIw bIw = new C25418BIw(bHx3, z2);
            arrayList3.add(bIw);
            C25376BGp A01 = bHx3.A00().A01(context2, looper, bHd, obj, bIw, bIw);
            r12.put(bHx3.A01(), A01);
            if (A01.BYX()) {
                if (bHx2 == null) {
                    bHx2 = bHx3;
                } else {
                    String str = bHx3.A01;
                    String str2 = bHx2.A01;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
                    sb.append(str);
                    sb.append(" cannot be used with ");
                    sb.append(str2);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        if (bHx2 != null) {
            AnonymousClass0a2.A0A(true, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", bHx2.A01);
            AnonymousClass0a2.A0A(hashSet.equals(hashSet2), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", bHx2.A01);
        }
        C25387BHd bHd2 = bHd;
        BIW biw2 = new BIW(context2, new ReentrantLock(), looper, bHd2, googleApiAvailability, bJh, r13, arrayList, arrayList2, r12, -1, BIW.A00(r12.values(), true), arrayList3);
        Set set = A00;
        synchronized (set) {
            set.add(biw2);
        }
        atomicReference.set(biw2);
        biw2.A0A();
        return bk9;
    }

    public void A0A() {
        if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException(((C25384BGz) this).A00);
        }
        BIW biw = (BIW) this;
        biw.A0E.lock();
        try {
            boolean z = false;
            if (biw.A05 >= 0) {
                if (biw.A01 != null) {
                    z = true;
                }
                AnonymousClass0a2.A09(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = biw.A01;
                if (num == null) {
                    biw.A01 = Integer.valueOf(BIW.A00(biw.A0C.values(), false));
                } else if (num.intValue() == 2) {
                    th = new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    throw th;
                }
            }
            int intValue = biw.A01.intValue();
            biw.A0E.lock();
            boolean z2 = true;
            if (!(intValue == 3 || intValue == 1 || intValue == 2)) {
                z2 = false;
            }
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(intValue);
            AnonymousClass0a2.A08(z2, sb.toString());
            BIW.A02(biw, intValue);
            biw.A0B.A08 = true;
            biw.A00.connect();
        } catch (Throwable th) {
            th = th;
        } finally {
            biw.A0E.unlock();
        }
    }

    public void A0B() {
        boolean A0B;
        if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException(((C25384BGz) this).A00);
        }
        BIW biw = (BIW) this;
        biw.A0E.lock();
        try {
            C25389BHh bHh = biw.A0A;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) bHh.A01.toArray(C25389BHh.A04)) {
                basePendingResult.A0B.set((Object) null);
                synchronized (basePendingResult.A07) {
                    if (((BIG) basePendingResult.A08.get()) == null || !basePendingResult.A03) {
                        basePendingResult.A07();
                    }
                    A0B = basePendingResult.A0B();
                }
                if (A0B) {
                    bHh.A01.remove(basePendingResult);
                }
            }
            C25417BIv bIv = biw.A00;
            if (bIv != null) {
                bIv.AC7();
            }
            C25432BJo bJo = biw.A08;
            Iterator it = bJo.A00.iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
            bJo.A00.clear();
            for (C25390BHi bHi : biw.A0D) {
                bHi.A0B.set((Object) null);
                bHi.A07();
            }
            biw.A0D.clear();
            if (biw.A00 != null) {
                biw.A0K();
                BIX bix = biw.A0B;
                bix.A08 = false;
                bix.A07.incrementAndGet();
            }
            biw.A0E.unlock();
        } catch (Throwable th) {
            biw.A0E.unlock();
            throw th;
        }
    }

    public void A0D(C25437BKa bKa) {
        if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException(((C25384BGz) this).A00);
        }
        ((BIW) this).A0B.A00(bKa);
    }

    public void A0E(C25437BKa bKa) {
        if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException(((C25384BGz) this).A00);
        }
        BIX bix = ((BIW) this).A0B;
        AnonymousClass0a2.A02(bKa);
        synchronized (bix.A03) {
            if (!bix.A04.remove(bKa)) {
                String valueOf = String.valueOf(bKa);
                StringBuilder sb = new StringBuilder(valueOf.length() + 52);
                sb.append("unregisterConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            } else if (bix.A00) {
                bix.A05.add(bKa);
            }
        }
    }

    public void A0F(BEH beh) {
        if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException(((C25384BGz) this).A00);
        }
        ((BIW) this).A0B.A01(beh);
    }

    public void A0G(BEH beh) {
        if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException(((C25384BGz) this).A00);
        }
        BIX bix = ((BIW) this).A0B;
        AnonymousClass0a2.A02(beh);
        synchronized (bix.A03) {
            if (!bix.A06.remove(beh)) {
                String valueOf = String.valueOf(beh);
                StringBuilder sb = new StringBuilder(valueOf.length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    public void A0H(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException(((C25384BGz) this).A00);
        }
        BIW biw = (BIW) this;
        printWriter.append(str).append("mContext=").println(biw.A06);
        printWriter.append(str).append("mResuming=").print(biw.A0L);
        printWriter.append(" mWorkQueue.size()=").print(biw.A0D.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(biw.A0A.A01.size());
        C25417BIv bIv = biw.A00;
        if (bIv != null) {
            bIv.ACj(str, fileDescriptor, printWriter, strArr);
        }
    }

    public boolean A0I() {
        if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException(((C25384BGz) this).A00);
        }
        C25417BIv bIv = ((BIW) this).A00;
        return bIv != null && bIv.isConnected();
    }

    public Context A03() {
        if (this instanceof C25383BGy) {
            return ((C25383BGy) this).A00.A01;
        }
        if (this instanceof BIW) {
            return ((BIW) this).A06;
        }
        throw new UnsupportedOperationException();
    }

    public Looper A04() {
        if (this instanceof C25383BGy) {
            return ((C25383BGy) this).A00.A02;
        }
        if (this instanceof BIW) {
            return ((BIW) this).A07;
        }
        throw new UnsupportedOperationException();
    }

    public C25376BGp A06(BKp bKp) {
        if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException();
        }
        C25376BGp bGp = (C25376BGp) ((BIW) this).A0C.get(bKp);
        AnonymousClass0a2.A03(bGp, "Appropriate Api was not requested.");
        return bGp;
    }

    public C25390BHi A08(C25390BHi bHi) {
        String str;
        if (this instanceof C25383BGy) {
            C25371BGk.A00(((C25383BGy) this).A00, bHi);
            return bHi;
        } else if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException();
        } else {
            BIW biw = (BIW) this;
            boolean z = false;
            if (bHi.A00 != null) {
                z = true;
            }
            AnonymousClass0a2.A08(z, "This task can not be enqueued (it's probably a Batch or malformed)");
            boolean containsKey = biw.A0C.containsKey(bHi.A00);
            C25399BHx bHx = bHi.A01;
            if (bHx != null) {
                str = bHx.A01;
            } else {
                str = "the API";
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
            sb.append("GoogleApiClient is not configured to use ");
            sb.append(str);
            sb.append(" required for this call.");
            AnonymousClass0a2.A08(containsKey, sb.toString());
            biw.A0E.lock();
            try {
                C25417BIv bIv = biw.A00;
                if (bIv == null) {
                    biw.A0D.add(bHi);
                } else {
                    bIv.ADI(bHi);
                }
                return bHi;
            } finally {
                biw.A0E.unlock();
            }
        }
    }

    public C25390BHi A09(C25390BHi bHi) {
        String str;
        if (this instanceof C25383BGy) {
            C25371BGk.A00(((C25383BGy) this).A00, bHi);
            return bHi;
        } else if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException();
        } else {
            BIW biw = (BIW) this;
            boolean z = false;
            if (bHi.A00 != null) {
                z = true;
            }
            AnonymousClass0a2.A08(z, "This task can not be executed (it's probably a Batch or malformed)");
            boolean containsKey = biw.A0C.containsKey(bHi.A00);
            C25399BHx bHx = bHi.A01;
            if (bHx != null) {
                str = bHx.A01;
            } else {
                str = "the API";
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
            sb.append("GoogleApiClient is not configured to use ");
            sb.append(str);
            sb.append(" required for this call.");
            AnonymousClass0a2.A08(containsKey, sb.toString());
            biw.A0E.lock();
            try {
                if (biw.A00 != null) {
                    if (biw.A0L) {
                        biw.A0D.add(bHi);
                        while (!biw.A0D.isEmpty()) {
                            C25390BHi bHi2 = (C25390BHi) biw.A0D.remove();
                            C25389BHh bHh = biw.A0A;
                            bHh.A01.add(bHi2);
                            bHi2.A0B.set(bHh.A00);
                            bHi2.A0F(Status.A06);
                        }
                    } else {
                        bHi = biw.A00.ADW(bHi);
                    }
                    return bHi;
                }
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } finally {
                biw.A0E.unlock();
            }
        }
    }

    public void A0C() {
        if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException();
        }
        C25417BIv bIv = ((BIW) this).A00;
        if (bIv != null) {
            bIv.Aoy();
        }
    }

    public boolean A0J(C25447BKq bKq) {
        if (!(this instanceof BIW)) {
            throw new UnsupportedOperationException();
        }
        C25417BIv bIv = ((BIW) this).A00;
        if (bIv == null || !bIv.Aox(bKq)) {
            return false;
        }
        return true;
    }
}
