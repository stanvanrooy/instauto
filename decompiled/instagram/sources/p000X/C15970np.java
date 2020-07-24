package p000X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.0np  reason: invalid class name and case insensitive filesystem */
public abstract class C15970np extends C15980nq {
    public static C15970np A00;

    public abstract void A0E(Bundle bundle);

    public abstract void A0F(FragmentActivity fragmentActivity, AnonymousClass0C1 r2);

    public abstract void A0G(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, Bundle bundle);

    public static synchronized C15970np A04() {
        C15970np r0;
        synchronized (C15970np.class) {
            r0 = A00;
        }
        return r0;
    }

    public static int A03(C13300iJ r2) {
        int i = 0;
        if (r2.A0Z()) {
            i = 1;
        }
        if (TextUtils.isEmpty(r2.AMN())) {
            i++;
        }
        if (TextUtils.isEmpty(r2.A0A())) {
            return i + 1;
        }
        return i;
    }
}
