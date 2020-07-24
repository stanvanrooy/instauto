package p000X;

import android.text.SpannableString;
import com.fbpay.common.LinkableText$1;
import java.util.List;

/* renamed from: X.BVM */
public final class BVM {
    public final CharSequence A00;
    public final List A01;

    public final CharSequence A00(C25468BMc bMc) {
        SpannableString spannableString = new SpannableString(this.A00);
        for (BVN bvn : this.A01) {
            LinkableText$1 linkableText$1 = new LinkableText$1(this, bvn.A02, bMc, bvn);
            int i = bvn.A01;
            spannableString.setSpan(linkableText$1, i, i + bvn.A00, 33);
        }
        return spannableString;
    }

    public BVM(CharSequence charSequence, List list) {
        this.A00 = charSequence;
        this.A01 = list;
    }
}
