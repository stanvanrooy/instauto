package p000X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.B4T */
public final class B4T implements C26911Bua {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AnonymousClass0C1 A02;
    public final /* synthetic */ C11520f6 A03;

    public B4T(C11520f6 r1, AnonymousClass0C1 r2, Bundle bundle, FragmentActivity fragmentActivity) {
        this.A03 = r1;
        this.A02 = r2;
        this.A00 = bundle;
        this.A01 = fragmentActivity;
    }

    public final void B3k() {
        C11520f6.A05(this.A03, "fail_buat_fetch");
        C11520f6.A02(this.A03, this.A01);
    }

    public final void BPk(String str) {
        C11520f6.A05(this.A03, "success_buat_fetch");
        C11520f6.A04(this.A03, this.A02, this.A00, this.A01);
    }
}
