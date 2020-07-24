package com.instagram.creation.location;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.instagram.location.intf.LocationSignalPackage;
import java.util.List;
import java.util.UUID;
import p000X.AnonymousClass00Y;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0EY;
import p000X.AnonymousClass0J1;
import p000X.C12810hQ;
import p000X.C161166uC;
import p000X.C161426ud;
import p000X.C161446uf;
import p000X.C161456ug;
import p000X.C17850qu;
import p000X.C23300zv;

public class NearbyVenuesService extends AnonymousClass0EY {
    public static Location A00;
    public static C161456ug A01;
    public static LocationSignalPackage A02;

    public static synchronized C161456ug A00(Location location) {
        Location location2;
        synchronized (NearbyVenuesService.class) {
            if (A01 == null || (location2 = A00) == null || location == null || location.distanceTo(location2) >= 20.0f) {
                return null;
            }
            C161456ug r0 = A01;
            return r0;
        }
    }

    public static void A02(AnonymousClass0C1 r4, C161456ug r5) {
        C161166uC r3;
        if (r5 != null) {
            r3 = new C161166uC(r5.A02, r5.AOJ(), r5.ATX());
        } else {
            r3 = new C161166uC((String) null, (List) null, (String) null);
        }
        C23300zv.A00(r4).BXT(r3);
    }

    public static void A01(Activity activity, AnonymousClass0C1 r5, Location location, LocationSignalPackage locationSignalPackage, Long l) {
        String uuid = UUID.randomUUID().toString();
        Class<NearbyVenuesService> cls = NearbyVenuesService.class;
        Intent intent = new Intent(activity, cls);
        intent.putExtra("location", location);
        intent.putExtra("requestId", uuid);
        intent.putExtra("rankToken", uuid);
        intent.putExtra("signalPackage", locationSignalPackage);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", r5.getToken());
        intent.putExtra("timestamp", l);
        AnonymousClass00Y.enqueueWork((Context) activity, (Class) cls, 1, intent);
    }

    public final void onHandleWork(Intent intent) {
        float f;
        LocationSignalPackage locationSignalPackage;
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(intent.getExtras());
        Location location = (Location) intent.getParcelableExtra("location");
        intent.getStringExtra("requestId");
        String stringExtra = intent.getStringExtra("rankToken");
        Long valueOf = Long.valueOf(intent.getLongExtra("timestamp", -1));
        LocationSignalPackage locationSignalPackage2 = (LocationSignalPackage) intent.getParcelableExtra("signalPackage");
        if (location == null) {
            AnonymousClass0DB.A0D("NearbyVenuesService", "Cannot query venues for null location");
            A02(A06, (C161456ug) null);
            return;
        }
        Location location2 = A00;
        float f2 = Float.MAX_VALUE;
        if (location2 != null) {
            f = location.distanceTo(location2);
        } else {
            f = Float.MAX_VALUE;
        }
        if (!(locationSignalPackage2 == null || locationSignalPackage2.APE() == null || (locationSignalPackage = A02) == null || locationSignalPackage.APE() == null)) {
            f2 = locationSignalPackage2.APE().distanceTo(A02.APE());
        }
        if (A00 == null || f >= 20.0f || (locationSignalPackage2 != null && f2 >= 20.0f)) {
            C17850qu A002 = C161426ud.A00(A06, (String) null, stringExtra, location, locationSignalPackage2, Long.valueOf(valueOf.longValue()));
            A002.A00 = new C161446uf(location, locationSignalPackage2, A06);
            C12810hQ.A01(A002);
            return;
        }
        A02(A06, A01);
    }
}
