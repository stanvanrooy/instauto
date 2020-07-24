package p000X;

import com.google.android.gms.common.api.Status;

/* renamed from: X.BHA */
public final class BHA implements BHM {
    public final C229239x9 Buz(Status status) {
        boolean z = false;
        if (status.A01 != null) {
            z = true;
        }
        if (z) {
            return new BHK(status);
        }
        return new C229239x9(status);
    }
}
