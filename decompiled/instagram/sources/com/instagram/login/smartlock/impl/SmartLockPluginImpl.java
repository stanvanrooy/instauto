package com.instagram.login.smartlock.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GoogleApiAvailability;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p000X.AnonymousClass0a2;
import p000X.AnonymousClass1H6;
import p000X.BCA;
import p000X.BCB;
import p000X.BCG;
import p000X.BE7;
import p000X.BE8;
import p000X.BED;
import p000X.BEE;
import p000X.BIG;
import p000X.BIK;
import p000X.BIL;
import p000X.BIM;
import p000X.BIW;
import p000X.BJU;
import p000X.BJV;
import p000X.BKV;
import p000X.BKw;
import p000X.C04450Ea;
import p000X.C06590Pq;
import p000X.C136355rr;
import p000X.C138325v5;
import p000X.C138525vP;
import p000X.C15800nY;
import p000X.C25365BGd;
import p000X.C25376BGp;
import p000X.C25387BHd;
import p000X.C25399BHx;
import p000X.C25410BIl;
import p000X.C25418BIw;
import p000X.C25420BJb;
import p000X.C25426BJh;
import p000X.C60302jg;

public class SmartLockPluginImpl extends C15800nY {
    public boolean A00 = true;
    public final Map A01 = new WeakHashMap();
    public final Map A02 = new WeakHashMap();
    public final Map A03 = new WeakHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01de, code lost:
        if (r7 != null) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x024a, code lost:
        if (r0 != false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0283, code lost:
        if (r7 != null) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0297, code lost:
        if (r0 != false) goto L_0x0299;
     */
    public void getSmartLockBroker(FragmentActivity fragmentActivity, C138525vP r40, C06590Pq r41) {
        BED bed;
        BED bed2;
        BED bed3;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C138525vP r2 = r40;
        if (fragmentActivity == null) {
            r2.Axj((Object) null);
            return;
        }
        if (this.A02.containsKey(fragmentActivity2)) {
            r2.Axj(this.A02.get(fragmentActivity2));
            return;
        }
        Set set = (Set) this.A01.get(fragmentActivity2);
        if (set != null) {
            set.add(r2);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(r2);
        this.A01.put(fragmentActivity2, hashSet);
        BIM bim = new BIM(this, fragmentActivity2);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        if (googleApiAvailability.isGooglePlayServicesAvailable(fragmentActivity2) == 0) {
            C138325v5 r4 = new C138325v5(fragmentActivity2, r41);
            FragmentActivity fragmentActivity3 = r4.A01;
            Context applicationContext = fragmentActivity3.getApplicationContext();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            C04450Ea r32 = new C04450Ea();
            C04450Ea r3 = new C04450Ea();
            C25426BJh bJh = BJU.A00;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Looper mainLooper = applicationContext.getMainLooper();
            String packageName = applicationContext.getPackageName();
            String name = applicationContext.getClass().getName();
            C25399BHx bHx = BIL.A05;
            AnonymousClass0a2.A03(bHx, "Api must not be null");
            r3.put(bHx, (Object) null);
            List A002 = bHx.A00.A00((Object) null);
            hashSet3.addAll(A002);
            hashSet2.addAll(A002);
            BIK bik = new BIK(new BKV(bim, r4));
            int i = bik.A01;
            AnonymousClass0a2.A03(bik, "Listener must not be null");
            arrayList.add(bik);
            BCG bcg = new BCG(fragmentActivity3);
            AnonymousClass0a2.A08(true, "clientId must be non-negative");
            AnonymousClass0a2.A08(!r3.isEmpty(), "must call addApi() to add at least one API");
            BKw bKw = BKw.A00;
            if (r3.containsKey(BJU.A01)) {
                bKw = (BKw) r3.get(BJU.A01);
            }
            C25387BHd bHd = new C25387BHd(hashSet2, r32, packageName, name, bKw);
            C25399BHx bHx2 = null;
            Map map = bHd.A04;
            C04450Ea r15 = new C04450Ea();
            C04450Ea r14 = new C04450Ea();
            ArrayList arrayList3 = new ArrayList();
            for (C25399BHx bHx3 : r3.keySet()) {
                Object obj = r3.get(bHx3);
                boolean z = false;
                if (map.get(bHx3) != null) {
                    z = true;
                }
                r15.put(bHx3, Boolean.valueOf(z));
                C25418BIw bIw = new C25418BIw(bHx3, z);
                arrayList3.add(bIw);
                C25376BGp A012 = bHx3.A00().A01(applicationContext, mainLooper, bHd, obj, bIw, bIw);
                r14.put(bHx3.A01(), A012);
                if (A012.BYX()) {
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
                AnonymousClass0a2.A0A(hashSet2.equals(hashSet3), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", bHx2.A01);
            }
            C25387BHd bHd2 = bHd;
            GoogleApiAvailability googleApiAvailability2 = googleApiAvailability;
            C04450Ea r27 = r15;
            ArrayList arrayList4 = arrayList;
            C04450Ea r30 = r14;
            BIW biw = new BIW(applicationContext, new ReentrantLock(), mainLooper, bHd2, googleApiAvailability2, bJh, r27, arrayList4, arrayList2, r30, i, BIW.A00(r14.values(), true), arrayList3);
            Set set2 = BIG.A00;
            synchronized (set2) {
                set2.add(biw);
            }
            Object obj2 = bcg.A00;
            if (obj2 instanceof FragmentActivity) {
                FragmentActivity fragmentActivity4 = (FragmentActivity) obj2;
                WeakReference weakReference = (WeakReference) BCB.A03.get(fragmentActivity4);
                if (weakReference != null) {
                    BED bed4 = (BCB) weakReference.get();
                    bed2 = bed4;
                }
                try {
                    BCB bcb = (BCB) fragmentActivity4.A05().A0N("SupportLifecycleFragmentImpl");
                    if (bcb != null) {
                        boolean z2 = bcb.mRemoving;
                        bed3 = bcb;
                    }
                    BCB bcb2 = new BCB();
                    AnonymousClass1H6 A0Q = fragmentActivity4.A05().A0Q();
                    A0Q.A06(bcb2, "SupportLifecycleFragmentImpl");
                    A0Q.A0A();
                    bed3 = bcb2;
                    BCB.A03.put(fragmentActivity4, new WeakReference(bed3));
                    bed2 = bed3;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                }
            } else if (obj2 instanceof Activity) {
                Activity activity = (Activity) obj2;
                WeakReference weakReference2 = (WeakReference) BCA.A03.get(activity);
                if (weakReference2 != null) {
                    BED bed5 = (BCA) weakReference2.get();
                    bed2 = bed5;
                }
                try {
                    BCA bca = (BCA) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (bca != null) {
                        boolean isRemoving = bca.isRemoving();
                        bed = bca;
                    }
                    BCA bca2 = new BCA();
                    activity.getFragmentManager().beginTransaction().add(bca2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    bed = bca2;
                    BCA.A03.put(activity, new WeakReference(bed));
                    bed2 = bed;
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
                }
            } else {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            BE7 be7 = (BE7) bed2.AHd("AutoManageHelper", BE7.class);
            if (be7 == null) {
                be7 = new BE7(bed2);
            }
            AnonymousClass0a2.A03(biw, "GoogleApiClient instance cannot be null");
            boolean z3 = false;
            if (be7.A00.indexOfKey(i) < 0) {
                z3 = true;
            }
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append("Already managing a GoogleApiClient with id ");
            sb2.append(i);
            AnonymousClass0a2.A09(z3, sb2.toString());
            BEE bee = (BEE) be7.A02.get();
            String.valueOf(bee);
            be7.A00.put(i, new BE8(be7, i, biw, bik));
            if (be7.A03 && bee == null) {
                String.valueOf(biw);
                biw.A0A();
            }
            bik.A00 = biw;
            r4.A00 = bik;
            return;
        }
        bim.Axj((Object) null);
    }

    public C136355rr listenForSmsResponse(Activity activity, boolean z) {
        C136355rr r3 = (C136355rr) this.A03.get(activity);
        if (!z && r3 != null && (r3.AgD() || r3.BZE())) {
            return r3;
        }
        if (r3 != null && r3.AgD()) {
            r3.BqQ();
        }
        BJV bjv = new BJV(activity);
        C60302jg A022 = new C25365BGd(bjv.A00).A02();
        C25410BIl bIl = new C25410BIl(bjv.A00);
        A022.A02(new C25420BJb(bjv, bIl));
        this.A03.put(activity, bIl);
        return bIl;
    }

    public boolean getShouldShowSmartLockForLogin() {
        return this.A00;
    }

    public void setShouldShowSmartLockForLogin(boolean z) {
        this.A00 = z;
    }
}
