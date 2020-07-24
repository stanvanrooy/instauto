package p000X;

import com.google.android.gms.common.api.Status;

/* renamed from: X.BH9 */
public final class BH9 implements C25362BGa {
    public final Exception ALM(Status status) {
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
