package p000X;

import android.location.Location;

/* renamed from: X.1vd  reason: invalid class name and case insensitive filesystem */
public class C44121vd {
    public final Location A00;
    public final Boolean A01;

    public final Boolean A00() {
        boolean isFromMockProvider;
        Boolean bool = this.A01;
        if (bool != null) {
            isFromMockProvider = bool.booleanValue();
        } else {
            isFromMockProvider = this.A00.isFromMockProvider();
        }
        return Boolean.valueOf(isFromMockProvider);
    }

    public final Float A01() {
        if (this.A00.hasAccuracy()) {
            return Float.valueOf(this.A00.getAccuracy());
        }
        return null;
    }

    public final Long A02() {
        long time = this.A00.getTime();
        if (time == 0) {
            return null;
        }
        return Long.valueOf(time);
    }

    public final String toString() {
        return this.A00.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r6.getLongitude() != 0.0d) goto L_0x0016;
     */
    public C44121vd(Location location, Boolean bool) {
        boolean z = location.getLatitude() == 0.0d ? false : z;
        z = true;
        AnonymousClass0a4.A0B(z, "location must have latitude/longitude");
        this.A00 = location;
        this.A01 = bool;
    }
}
