package p000X;

import android.text.TextUtils;

/* renamed from: X.1Ma  reason: invalid class name and case insensitive filesystem */
public final class C28511Ma {
    public final String A00;
    public final String A01;

    public static C28511Ma A00(AnonymousClass0RN r2) {
        return new C28511Ma(AnonymousClass000.A0E("preview_", r2.getModuleName()));
    }

    public final String A01() {
        String A0J;
        if (TextUtils.isEmpty(this.A01)) {
            A0J = this.A00;
        } else {
            A0J = AnonymousClass000.A0J(this.A01, "_", this.A00);
        }
        return AnonymousClass000.A0E("igtv_", A0J);
    }

    public C28511Ma(Integer num) {
        this.A00 = AnonymousClass6VC.A00(num);
        this.A01 = "";
    }

    public C28511Ma(Integer num, String str) {
        this.A00 = str;
        this.A01 = AnonymousClass6VC.A00(num);
    }

    public C28511Ma(String str) {
        this.A00 = str;
        this.A01 = "";
    }
}
