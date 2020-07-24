package com.google.android.gms.auth.api.signin.internal;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a2;
import p000X.BIG;
import p000X.BIL;
import p000X.BIW;
import p000X.BJU;
import p000X.BKw;
import p000X.C04450Ea;
import p000X.C229369xj;
import p000X.C229389xl;
import p000X.C25376BGp;
import p000X.C25387BHd;
import p000X.C25399BHx;
import p000X.C25418BIw;
import p000X.C25426BJh;
import p000X.C42011rM;
import p000X.C42031rO;
import p000X.C42101rV;

public final class zzw extends zzr {
    public final Context A00;

    public zzw(Context context) {
        int A03 = AnonymousClass0Z0.A03(-1896486523);
        this.A00 = context;
        AnonymousClass0Z0.A0A(1803770175, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if ("user".equals(android.os.Build.TYPE) == false) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ac  */
    private final void A00() {
        boolean z;
        boolean z2;
        boolean z3;
        int A03 = AnonymousClass0Z0.A03(740533190);
        Context context = this.A00;
        try {
            ((AppOpsManager) C42031rO.A00(context).A00.getSystemService("appops")).checkPackage(Binder.getCallingUid(), "com.google.android.gms");
            z = true;
        } catch (SecurityException unused) {
            z = false;
        }
        if (z) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C42101rV A002 = C42101rV.A00(context);
                if (packageInfo != null) {
                    if (!C42101rV.A01(packageInfo, false)) {
                        if (C42101rV.A01(packageInfo, true)) {
                            Context context2 = A002.A00;
                            if (!C42011rM.A01) {
                                try {
                                    PackageInfo packageInfo2 = C42031rO.A00(context2).A00.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                    C42101rV.A00(context2);
                                    if (packageInfo2 == null || C42101rV.A01(packageInfo2, false) || !C42101rV.A01(packageInfo2, true)) {
                                        C42011rM.A00 = false;
                                    } else {
                                        C42011rM.A00 = true;
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                                } catch (Throwable th) {
                                    C42011rM.A01 = true;
                                    throw th;
                                }
                                C42011rM.A01 = true;
                            }
                            if (!C42011rM.A00) {
                                z3 = false;
                            }
                            z3 = true;
                            if (!z3) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    z2 = true;
                    if (!z2) {
                        AnonymousClass0Z0.A0A(-803918009, A03);
                        return;
                    }
                    int callingUid = Binder.getCallingUid();
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Calling UID ");
                    sb.append(callingUid);
                    sb.append(" is not Google Play services.");
                    SecurityException securityException = new SecurityException(sb.toString());
                    AnonymousClass0Z0.A0A(762882890, A03);
                    throw securityException;
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.isLoggable("UidVerifier", 3);
            }
        }
        z2 = false;
        if (!z2) {
        }
    }

    public final void Bvk() {
        int A03 = AnonymousClass0Z0.A03(1253323554);
        A00();
        C229369xj A002 = C229369xj.A00(this.A00);
        GoogleSignInAccount A05 = A002.A05();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.A0C;
        if (A05 != null) {
            googleSignInOptions = A002.A06();
        }
        Context context = this.A00;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        C04450Ea r8 = new C04450Ea();
        C04450Ea r3 = new C04450Ea();
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        C25426BJh bJh = BJU.A00;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context.getMainLooper();
        String packageName = context.getPackageName();
        String name = context.getClass().getName();
        C25399BHx bHx = BIL.A06;
        AnonymousClass0a2.A03(bHx, "Api must not be null");
        AnonymousClass0a2.A03(googleSignInOptions, "Null options are not permitted for this Api");
        r3.put(bHx, googleSignInOptions);
        List A003 = bHx.A00.A00(googleSignInOptions);
        hashSet2.addAll(A003);
        hashSet.addAll(A003);
        AnonymousClass0a2.A08(!r3.isEmpty(), "must call addApi() to add at least one API");
        BKw bKw = BKw.A00;
        if (r3.containsKey(BJU.A01)) {
            bKw = (BKw) r3.get(BJU.A01);
        }
        C25387BHd bHd = new C25387BHd(hashSet, r8, packageName, name, bKw);
        C25399BHx bHx2 = null;
        Map map = bHd.A04;
        C04450Ea r12 = new C04450Ea();
        C04450Ea r11 = new C04450Ea();
        ArrayList arrayList3 = new ArrayList();
        for (C25399BHx bHx3 : r3.keySet()) {
            Object obj = r3.get(bHx3);
            boolean z = false;
            if (map.get(bHx3) != null) {
                z = true;
            }
            r12.put(bHx3, Boolean.valueOf(z));
            C25418BIw bIw = new C25418BIw(bHx3, z);
            arrayList3.add(bIw);
            C25376BGp A01 = bHx3.A00().A01(context, mainLooper, bHd, obj, bIw, bIw);
            r11.put(bHx3.A01(), A01);
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
        Context context2 = context;
        BIW biw = new BIW(context2, new ReentrantLock(), mainLooper, bHd, googleApiAvailability, bJh, r12, arrayList, arrayList2, r11, -1, BIW.A00(r11.values(), true), arrayList3);
        Set set = BIG.A00;
        synchronized (set) {
            set.add(biw);
        }
        try {
            if (biw.A05().A02()) {
                if (A05 != null) {
                    BIL.A02.Be8(biw);
                } else {
                    biw.A07();
                }
            }
        } finally {
            biw.A0B();
            AnonymousClass0Z0.A0A(-1229109883, A03);
        }
    }

    public final void Bvl() {
        int A03 = AnonymousClass0Z0.A03(-2127198465);
        A00();
        C229389xl.A00(this.A00).A01();
        AnonymousClass0Z0.A0A(1875450998, A03);
    }
}
