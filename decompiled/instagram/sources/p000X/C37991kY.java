package p000X;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import java.util.UUID;

/* renamed from: X.1kY  reason: invalid class name and case insensitive filesystem */
public final class C37991kY implements C06570Po {
    public long A00 = 0;
    public C38801ls A01;
    public boolean A02 = false;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final AnonymousClass0C1 A04;
    public final long A05;

    public final void onUserSessionWillEnd(boolean z) {
        this.A01 = null;
        this.A00 = 0;
    }

    public static C37991kY A01(AnonymousClass0C1 r2) {
        return (C37991kY) r2.AVA(C37991kY.class, new C38001kZ(r2));
    }

    public static void A02(C37991kY r1, C38011ka r2, boolean z) {
        C12810hQ.A02(A00(r1, r1.A04, r2, z));
    }

    public final boolean A03() {
        if (this.A01 == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A00;
        if (currentTimeMillis < j || currentTimeMillis - j < this.A05) {
            return true;
        }
        return false;
    }

    public C37991kY(AnonymousClass0C1 r5) {
        this.A04 = r5;
        this.A05 = ((long) ((Integer) AnonymousClass0L6.A02(r5, AnonymousClass0L7.EXPLORE_STARTUP_PREFETCH_OPTIMIZATION, "expire_threshold_in_seconds_for_in_memory", 3, (AnonymousClass04H) null)).intValue()) * 1000;
    }

    public static C17850qu A00(C37991kY r17, AnonymousClass0C1 r18, C38011ka r19, boolean z) {
        Integer num;
        long j;
        String uuid = UUID.randomUUID().toString();
        boolean z2 = false;
        boolean z3 = false;
        long j2 = -1;
        C38011ka r4 = r19;
        boolean z4 = false;
        if (r4.A02 != null) {
            z4 = true;
        }
        AnonymousClass0C1 r5 = r18;
        if (!z4) {
            z2 = true;
            z3 = z;
            if (C38141kn.A00(r5).booleanValue()) {
                j = (long) ((Integer) AnonymousClass0L6.A02(r5, AnonymousClass0L7.EXPLORE_STARTUP_PREFETCH_OPTIMIZATION, "expire_threshold_in_seconds_for_disk", -1, (AnonymousClass04H) null)).intValue();
                if (j != -1) {
                    j *= 1000;
                }
            } else {
                j = -1;
            }
            j2 = j;
        }
        String A002 = C38201kt.A00("discover/topical_explore/", (String) null, (String) null, (String) null, (C52992Rb[]) null);
        C15890nh r6 = new C15890nh(r5);
        r6.A09 = Constants.A0N;
        r6.A0C = "discover/topical_explore/";
        r6.A06(C38211ku.class, false);
        r6.A09("session_id", uuid);
        r6.A09("is_prefetch", "true");
        r6.A09("timezone_offset", Long.toString(C15960no.A00().longValue()));
        r6.A0C("use_sectional_payload", true);
        r6.A0C("include_fixed_destinations", true);
        r6.A0C("omit_cover_media", true);
        r6.A0A("module", (String) null);
        r6.A0A("cluster_id", (String) null);
        r6.A0A("grid_pagination_token", (String) null);
        r6.A0A = Constants.ONE;
        if ("discover/topical_explore/".equals("discover/topical_explore/") && C932441n.A00(r5).booleanValue() && C932541o.A00(r5).booleanValue()) {
            r6.A03 = C15920nk.CriticalAPI;
        }
        C16160o8.A04(r6, (String) null);
        Location lastLocation = C16230oG.A00.getLastLocation(r5, 10800000, 50000.0f);
        if (lastLocation != null) {
            r6.A09("lat", String.valueOf(lastLocation.getLatitude()));
            r6.A09("lng", String.valueOf(lastLocation.getLongitude()));
        }
        if (C932641p.A00(r5).booleanValue()) {
            r6.A07 = Constants.ONE;
        }
        if (z2) {
            num = Constants.ONE;
        } else {
            num = Constants.ZERO;
        }
        r6.A0A = num;
        if (!z2) {
            r6.A0B = A002;
            r6.A08 = Constants.ONE;
        } else if (z3) {
            r6.A0B = A002;
            r6.A08 = Constants.ONE;
            r6.A01 = j2;
        }
        C17850qu A032 = r6.A03();
        A032.A00 = new C44131ve(r17, r4, r5);
        return A032;
    }
}
