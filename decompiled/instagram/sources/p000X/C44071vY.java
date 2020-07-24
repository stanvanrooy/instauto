package p000X;

import android.app.ActivityManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Set;

/* renamed from: X.1vY  reason: invalid class name and case insensitive filesystem */
public final class C44071vY {
    public static final String[] A06 = {"gps", "network"};
    public C44121vd A00 = null;
    public final C43881vE A01;
    public final AnonymousClass26W A02;
    public final LocationManager A03;
    public final C44081vZ A04;
    public final C44091va A05;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r2 == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r3 == false) goto L_0x0090;
     */
    private C44121vd A00(long j, float f, boolean z, String str, boolean z2) {
        Location location;
        C44121vd r3;
        Long valueOf;
        long now;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (j > 0) {
            z5 = true;
        }
        AnonymousClass0a4.A09(z5);
        boolean z6 = false;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            z6 = true;
        }
        AnonymousClass0a4.A09(z6);
        Long l = null;
        if (C44081vZ.A00(this.A04, Constants.A0C, (Set) null, (Set) null) == Constants.A0N) {
            C43881vE r2 = this.A01;
            String str2 = str;
            if (r2 == null || (!r2.AiJ() && (str == null || !r2.Ah7(str2)))) {
                C44121vd r1 = this.A00;
                if (z) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i = runningAppProcessInfo.importance;
                    boolean z7 = false;
                    if (i == 100) {
                        z7 = true;
                    }
                    if (!z7) {
                        C43881vE r0 = this.A01;
                        if (r0 != null) {
                            boolean Ah6 = r0.Ah6(str2);
                            z4 = true;
                        }
                        z4 = false;
                        if (z4) {
                            return null;
                        }
                        return r1;
                    }
                }
                if (r1 == null || this.A05.A00(r1) > j || r1.A01() == null || r1.A01().floatValue() > f) {
                    location = null;
                } else {
                    if (A04()) {
                        C43881vE r22 = this.A01;
                        if (r22 != null) {
                            boolean Aeb = r22.Aeb(str2);
                            z3 = true;
                        }
                        z3 = false;
                        if (!z3) {
                            Boolean valueOf2 = Boolean.valueOf(!z2);
                            Long valueOf3 = Long.valueOf(this.A05.A00(r1));
                            AnonymousClass26W r11 = this.A02;
                            if (r11 != null) {
                                r11.A00("FBLocationCache", "internalGetLastLocation", str2, "Cache", "FacebookLocationProvider", valueOf2, valueOf3);
                            }
                            return r1;
                        }
                    }
                    location = new Location(r1.A00);
                }
                for (String A002 : A06) {
                    try {
                        Location A003 = AnonymousClass0ZD.A00(this.A03, A002);
                        if (C44111vc.A00(A003)) {
                            C44091va r32 = this.A05;
                            AnonymousClass0a4.A0A(true);
                            long elapsedRealtimeNanos = A003.getElapsedRealtimeNanos();
                            if (elapsedRealtimeNanos == 0) {
                                valueOf = null;
                            } else {
                                valueOf = Long.valueOf(elapsedRealtimeNanos);
                            }
                            if (valueOf != null) {
                                now = (((r32.A01.now() * 1000000) - valueOf.longValue()) + 500000) / 1000000;
                            } else {
                                now = r32.A00.now() - A003.getTime();
                            }
                            if (now <= j && A003.getAccuracy() <= f && (location == null || location.getTime() < A003.getTime())) {
                                location = A003;
                            }
                        }
                    } catch (IllegalArgumentException | SecurityException unused) {
                    }
                }
                if (location == null) {
                    r3 = null;
                } else {
                    AnonymousClass0a4.A06(location);
                    r3 = new C44121vd(new Location(location), (Boolean) null);
                }
                A03(r3);
                Boolean valueOf4 = Boolean.valueOf(!z2);
                if (r3 != null) {
                    l = Long.valueOf(this.A05.A00(r3));
                }
                AnonymousClass26W r112 = this.A02;
                if (r112 != null) {
                    r112.A00("FBLocationCache", "internalGetLastLocation", str2, "Cache", "AndroidPlatformLocationProvider", valueOf4, l);
                }
                return r3;
            }
        }
        return null;
    }

    public final C44121vd A01(long j, float f, String str) {
        boolean z;
        float f2 = f;
        String str2 = str;
        long j2 = j;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        } else {
            z = false;
        }
        return A00(j2, f2, z, str2, false);
    }

    public final C44121vd A02(long j, String str) {
        boolean z;
        long j2 = j;
        String str2 = str;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        } else {
            z = false;
        }
        return A00(j2, Float.MAX_VALUE, z, str2, true);
    }

    public final void A03(C44121vd r6) {
        if (r6 != null) {
            C44121vd r1 = this.A00;
            if (r1 == null || r1.A02() == null || (r6.A02() != null && r6.A02().longValue() > r1.A02().longValue())) {
                this.A00 = r6;
            }
        }
    }

    public final boolean A04() {
        C43881vE r0 = this.A01;
        if (r0 == null || !r0.AgX()) {
            return false;
        }
        return true;
    }

    public C44071vY(C44081vZ r2, LocationManager locationManager, C44091va r4, C43881vE r5, AnonymousClass26W r6) {
        this.A04 = r2;
        this.A03 = locationManager;
        this.A05 = r4;
        this.A01 = r5;
        this.A02 = r6;
    }
}
