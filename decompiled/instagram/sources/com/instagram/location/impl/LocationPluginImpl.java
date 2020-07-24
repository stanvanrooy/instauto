package com.instagram.location.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0Q6;
import p000X.AnonymousClass0Q7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass22R;
import p000X.AnonymousClass22U;
import p000X.AnonymousClass22V;
import p000X.AnonymousClass22W;
import p000X.AnonymousClass2IT;
import p000X.AnonymousClass2MU;
import p000X.C05700Lp;
import p000X.C107994l3;
import p000X.C12000g1;
import p000X.C16230oG;
import p000X.C16250oI;
import p000X.C192668Lr;
import p000X.C200218hd;
import p000X.C200228he;
import p000X.C200238hf;
import p000X.C200248hg;
import p000X.C25680BUu;
import p000X.C35251g3;
import p000X.C43831v9;
import p000X.C43851vB;
import p000X.C43931vJ;
import p000X.C43971vO;
import p000X.C44111vc;
import p000X.C44121vd;
import p000X.C470422a;
import p000X.C470722d;
import p000X.C470822e;
import p000X.C470922f;
import p000X.C471522l;
import p000X.C50862Id;
import p000X.C50872Ie;
import p000X.C50882If;
import p000X.C50892Ig;
import p000X.C50902Ih;
import p000X.C50912Ii;
import p000X.C50922Ij;

public class LocationPluginImpl extends C16230oG implements AnonymousClass0Q6 {
    public static final String[] A05 = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"};
    public static final Integer A06 = Constants.A0C;
    public final Context A00;
    public final Object A01 = new Object();
    public final Map A02 = Collections.synchronizedMap(new HashMap());
    public final Map A03 = Collections.synchronizedMap(new HashMap());
    public final C16250oI A04;

    public static void A02(LocationPluginImpl locationPluginImpl, AnonymousClass0C1 r8, C107994l3 r9, String str) {
        boolean z = false;
        if (r9 != null) {
            z = true;
        }
        AnonymousClass0a4.A09(z);
        AnonymousClass2IT A062 = C43851vB.A00(locationPluginImpl.A00, r8).A06();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 23) {
            z2 = true;
        }
        C50892Ig r4 = new C50892Ig();
        r4.A05 = z2;
        r4.A00 = new C50922Ij(15);
        r4.A08 = z2;
        r4.A03 = new C50882If(10000, 300000);
        r4.A02 = new C50912Ii();
        r4.A07 = true;
        C50862Id r3 = new C50862Id(A06);
        r3.A07 = 300000L;
        r3.A02 = ArLinkScanControllerImpl.ERROR_DELAY_MS;
        r3.A00 = 100.0f;
        r3.A05 = 7000;
        r4.A01 = new C50872Ie(r3);
        r4.A06 = false;
        A062.A04(new C50902Ih(r4), str);
        AnonymousClass2MU.A03(A062, new C200248hg(locationPluginImpl, r9), C43851vB.A00(locationPluginImpl.A00, r8).A0A());
        locationPluginImpl.A03.put(r9, A062);
        C43851vB.A00(locationPluginImpl.A00, r8).A0A().schedule(new C25680BUu(locationPluginImpl, A062), 100, TimeUnit.MILLISECONDS);
    }

    public static void A00(LocationPluginImpl locationPluginImpl) {
        synchronized (locationPluginImpl.A01) {
            locationPluginImpl.A02.size();
            Iterator it = locationPluginImpl.A02.keySet().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public static void A01(LocationPluginImpl locationPluginImpl, AnonymousClass0C1 r7, AnonymousClass22V r8, String str, boolean z) {
        Integer num;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = true;
        }
        if (!z2 || !AnonymousClass0Q7.A03().A0J()) {
            if (C43851vB.A00(locationPluginImpl.A00, r7).A03().A04()) {
                if (z) {
                    Location lastLocation = locationPluginImpl.getLastLocation(r7, 300000);
                    if (lastLocation != null) {
                        r8.onLocationChanged(lastLocation);
                        return;
                    }
                } else {
                    Location lastLocation2 = locationPluginImpl.getLastLocation(r7);
                    if (lastLocation2 != null) {
                        r8.onLocationChanged(lastLocation2);
                        return;
                    }
                    return;
                }
            }
            C470422a A022 = C43851vB.A00(locationPluginImpl.A00, r7).A02();
            if (C43851vB.A00(locationPluginImpl.A00, r7).A03().A04()) {
                num = Constants.ONE;
            } else {
                num = Constants.A0C;
            }
            C470722d r3 = new C470722d(num);
            r3.A07 = 7000L;
            r3.A06 = 300000L;
            r3.A09 = true;
            C470822e r2 = new C470822e(r3);
            synchronized (locationPluginImpl.A01) {
                locationPluginImpl.A02.put(r8, A022);
                A00(locationPluginImpl);
            }
            A022.A06(r2, new C470922f(locationPluginImpl, r8, A022), str);
            C43851vB.A00(locationPluginImpl.A00, r7).A0A().schedule(new C471522l(locationPluginImpl, new WeakReference(r8), A022), 100, TimeUnit.MILLISECONDS);
        }
    }

    public void cancelSignalPackageRequest(AnonymousClass0C1 r2, C107994l3 r3) {
        this.A03.remove(r3);
    }

    public C16250oI getFragmentFactory() {
        C16250oI r0 = this.A04;
        AnonymousClass0a4.A06(r0);
        return r0;
    }

    public Future prefetchLocation(AnonymousClass0C1 r6, String str) {
        AnonymousClass22R r4 = new AnonymousClass22R();
        AnonymousClass22U r3 = new AnonymousClass22U(this, r4, r6);
        r4.A3T(new AnonymousClass22W(this, r4, r6, r3), C43851vB.A00(this.A00, r6).A0A());
        if (C35251g3.A07(this.A00, "android.permission.ACCESS_FINE_LOCATION")) {
            A01(this, r6, r3, str, true);
        }
        return r4;
    }

    public void removeLocationUpdates(AnonymousClass0C1 r3, AnonymousClass22V r4) {
        synchronized (this.A01) {
            C470422a r0 = (C470422a) this.A02.get(r4);
            if (r0 != null) {
                r0.A04();
                this.A02.remove(r4);
                A00(this);
            }
        }
    }

    public void setupForegroundCollection(AnonymousClass0C1 r5) {
        Context context = this.A00;
        Class<C43931vJ> cls = C43931vJ.class;
        if (((C43931vJ) r5.AV9(cls)) == null) {
            C43931vJ r2 = new C43931vJ(context, r5);
            AnonymousClass0Q7.A03().A0B(r2);
            r5.BYi(cls, r2);
            C12000g1.A01.A00(new C43971vO(r2));
        }
    }

    public void setupPlaceSignatureCollection(AnonymousClass0C1 r2) {
        C43831v9.A00(this.A00, r2);
    }

    public LocationPluginImpl(Context context, C16250oI r5) {
        this.A00 = context;
        this.A04 = r5;
        if (Build.VERSION.SDK_INT >= 29) {
            AnonymousClass0Q7.A03().A0C(this);
        }
    }

    public boolean isLocationValid(Location location) {
        return C44111vc.A00(location);
    }

    public void onAppBackgrounded() {
        int A032 = AnonymousClass0Z0.A03(-1073561654);
        C05700Lp.A00().ADc(new C192668Lr(this));
        AnonymousClass0Z0.A0A(-585562079, A032);
    }

    public void onAppForegrounded() {
        AnonymousClass0Z0.A0A(-273343559, AnonymousClass0Z0.A03(1291792111));
    }

    public Location getLastLocation(AnonymousClass0C1 r7) {
        return getLastLocation(r7, Long.MAX_VALUE, Float.MAX_VALUE, false);
    }

    public Location getLastLocation(AnonymousClass0C1 r7, long j) {
        return getLastLocation(r7, j, Float.MAX_VALUE, false);
    }

    public Location getLastLocation(AnonymousClass0C1 r7, long j, float f) {
        return getLastLocation(r7, j, f, false);
    }

    public Location getLastLocation(AnonymousClass0C1 r3, long j, float f, boolean z) {
        C44121vd A012 = C43851vB.A00(this.A00, r3).A03().A01(j, f, (String) null);
        if (A012 == null) {
            return null;
        }
        Location location = new Location(A012.A00);
        return z ? C16230oG.performIntegrityChecks(location) : location;
    }

    public boolean isAccurateEnough(Location location) {
        long j;
        float f;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        if (z) {
            j = 900000;
            f = 500.0f;
        } else {
            j = 300000;
            f = 100.0f;
        }
        if (location == null || !location.hasAccuracy() || location.getAccuracy() > f || System.currentTimeMillis() - location.getTime() >= j) {
            return false;
        }
        return true;
    }

    public boolean isAccurateEnough(Location location, long j, float f) {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        if (z) {
            if (j < 900000) {
                j = 900000;
            }
            if (f < 500.0f) {
                f = 500.0f;
            }
        }
        if (location == null || !location.hasAccuracy() || location.getAccuracy() > f || System.currentTimeMillis() - location.getTime() >= j) {
            return false;
        }
        return true;
    }

    public void requestLocationSignalPackage(AnonymousClass0C1 r5, C107994l3 r6, String str) {
        if (C35251g3.A09(this.A00, Build.VERSION.SDK_INT >= 23 ? A05 : new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
            A02(this, r5, r6, str);
        }
    }

    public void requestLocationSignalPackage(AnonymousClass0C1 r8, Activity activity, C107994l3 r10, C200238hf r11, String str) {
        String[] strArr = Build.VERSION.SDK_INT >= 23 ? A05 : new String[]{"android.permission.ACCESS_FINE_LOCATION"};
        C107994l3 r5 = r10;
        AnonymousClass0C1 r4 = r8;
        String str2 = str;
        if (C35251g3.A09(this.A00, strArr)) {
            A02(this, r8, r10, str);
            return;
        }
        C200238hf r3 = r11;
        if (r11.BnC()) {
            C35251g3.A02(activity, new C200218hd(this, strArr, r3, r4, r5, str2), strArr);
        }
    }

    public void requestLocationUpdates(AnonymousClass0C1 r4, AnonymousClass22V r5, String str) {
        if (C35251g3.A07(this.A00, "android.permission.ACCESS_FINE_LOCATION")) {
            A01(this, r4, r5, str, false);
        }
    }

    public void requestLocationUpdates(AnonymousClass0C1 r10, Activity activity, AnonymousClass22V r12, C200238hf r13, String str) {
        AnonymousClass22V r7 = r12;
        AnonymousClass0C1 r6 = r10;
        String str2 = str;
        if (C35251g3.A07(this.A00, "android.permission.ACCESS_FINE_LOCATION")) {
            A01(this, r10, r12, str, false);
            return;
        }
        C200238hf r5 = r13;
        if (r13.BnC()) {
            C35251g3.A02(activity, new C200228he(this, r5, r6, r7, str2), "android.permission.ACCESS_FINE_LOCATION");
        }
    }
}
