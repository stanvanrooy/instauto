package p000X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.guides.intf.GuideFragmentConfig;
import com.instagram.guides.intf.model.MinimalGuide;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.0sT  reason: invalid class name and case insensitive filesystem */
public final class C18820sT extends C18830sU {
    public C159656rd A00;

    public final void A02(FragmentActivity fragmentActivity, AnonymousClass0C1 r9, MinimalGuide minimalGuide, AnonymousClass6VD r11) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (AnonymousClass1H4.A01(fragmentActivity.A05())) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg_guide_config", new GuideFragmentConfig(minimalGuide, r11));
            C59032gv r1 = new C59032gv(r9, TransparentModalActivity.class, "guide", bundle, fragmentActivity2);
            r1.A0A = ModalActivity.A03;
            r1.A06(fragmentActivity);
        }
    }

    public final C159656rd A00() {
        if (this.A00 == null) {
            this.A00 = new C159656rd();
        }
        return this.A00;
    }

    public final AnonymousClass395 A01(Context context, AnonymousClass0C1 r3, C13300iJ r4) {
        return new C159716rk(context, r3, r4);
    }
}
