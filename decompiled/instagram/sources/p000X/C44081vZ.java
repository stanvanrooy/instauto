package p000X;

import android.content.Context;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1vZ  reason: invalid class name and case insensitive filesystem */
public final class C44081vZ {
    public static final String[] A03 = {"gps", "network"};
    public final Context A00;
    public final LocationManager A01;
    public final boolean A02 = true;

    public C44081vZ(Context context, LocationManager locationManager) {
        this.A00 = context;
        this.A01 = locationManager;
    }

    public static Integer A00(C44081vZ r8, Integer num, Set set, Set set2) {
        Integer num2;
        LocationProvider locationProvider;
        Integer num3 = null;
        for (String str : A03) {
            try {
                AnonymousClass0a4.A06(str);
                LocationManager locationManager = r8.A01;
                AnonymousClass0a4.A06(locationManager);
                try {
                    locationProvider = locationManager.getProvider(str);
                } catch (IllegalArgumentException | IllegalStateException | NullPointerException unused) {
                    locationProvider = null;
                }
                if (locationProvider == null) {
                    num2 = Constants.ONE;
                } else if (locationProvider.getPowerRequirement() == 3 && num != Constants.A0C) {
                    num2 = Constants.ONE;
                } else if (locationProvider.hasMonetaryCost() && !r8.A02) {
                    num2 = Constants.ONE;
                } else if (!r8.A01.isProviderEnabled(str)) {
                    num2 = Constants.A0C;
                } else {
                    num2 = Constants.A0N;
                }
            } catch (SecurityException unused2) {
                num2 = Constants.ZERO;
            }
            if (num2 == Constants.A0N) {
                if (set != null) {
                    set.add(str);
                }
            } else if (num2 == Constants.A0C && set2 != null) {
                set2.add(str);
            }
            if (num3 == null || (num2 != null && num3.compareTo(num2) < 0)) {
                num3 = num2;
            }
        }
        return num3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r1 != false) goto L_0x001d;
     */
    public final C471122h A01(Integer num) {
        boolean z;
        boolean z2;
        Integer num2;
        boolean z3 = false;
        try {
            if (this.A00.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                z3 = true;
            }
        } catch (Throwable unused) {
        }
        if (!z3) {
            boolean z4 = false;
            try {
                if (this.A00.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                    z4 = true;
                }
            } catch (Throwable unused2) {
            }
            z = false;
        }
        z = true;
        if (!z) {
            Integer num3 = Constants.ZERO;
            return new C471122h(num3, num3, new HashSet(), new HashSet());
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Integer A002 = A00(this, num, hashSet, hashSet2);
        if (A002 != Constants.A0N) {
            num2 = Constants.ZERO;
        } else {
            boolean z5 = false;
            if (Build.VERSION.SDK_INT >= 29) {
                z5 = true;
            }
            if (!z5) {
                num2 = Constants.ONE;
            } else {
                if (z5) {
                    z2 = false;
                    try {
                        if (this.A00.checkCallingOrSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                            z2 = true;
                        }
                    } catch (Throwable unused3) {
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    num2 = Constants.A0N;
                } else {
                    num2 = Constants.A0C;
                }
            }
        }
        return new C471122h(A002, num2, hashSet, hashSet2);
    }
}
