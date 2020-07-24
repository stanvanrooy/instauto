package p000X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.0nv  reason: invalid class name and case insensitive filesystem */
public abstract class C16030nv extends C15980nq {
    public static C16030nv A00;

    public abstract void A0E(Bundle bundle);

    public abstract void A0F(FragmentActivity fragmentActivity, C06590Pq r2);

    public abstract void A0G(FragmentActivity fragmentActivity, C06590Pq r2, Bundle bundle);

    public static synchronized C16030nv A01() {
        C16030nv r0;
        synchronized (C16030nv.class) {
            r0 = A00;
        }
        return r0;
    }

    public static boolean A02(RegFlowExtras regFlowExtras) {
        if (regFlowExtras == null || regFlowExtras.A09 == null || !((Boolean) C05640Lj.A00(AnonymousClass0L7.REG_MODULARIZATION, "enable_reg_modularization", false)).booleanValue()) {
            return false;
        }
        return true;
    }
}
