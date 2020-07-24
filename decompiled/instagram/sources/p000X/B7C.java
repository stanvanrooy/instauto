package p000X;

import android.text.TextUtils;
import com.facebook.C0003R;

/* renamed from: X.B7C */
public final class B7C implements B7D {
    public final /* synthetic */ C27040Bws A00;

    public B7C(C27040Bws bws) {
        this.A00 = bws;
    }

    public final B7B AWi(B7B b7b, CharSequence charSequence, boolean z) {
        if (TextUtils.isEmpty(charSequence)) {
            b7b.A01 = "error";
            b7b.A00 = this.A00.getContext().getString(C0003R.string.gender_custom_incomplete_error);
        }
        return b7b;
    }
}
