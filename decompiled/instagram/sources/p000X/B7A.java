package p000X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.C0003R;
import java.util.regex.Pattern;

/* renamed from: X.B7A */
public final class B7A implements B7D {
    public static final Pattern A01 = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
    public final Context A00;

    public B7A(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (A01.matcher(r1).matches() == false) goto L_0x0019;
     */
    public final B7B AWi(B7B b7b, CharSequence charSequence, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(charSequence)) {
            String charSequence2 = charSequence.toString();
            if (charSequence2 != null) {
                z2 = true;
            }
            z2 = false;
            if (!z2) {
                b7b.A01 = "error";
                b7b.A00 = this.A00.getResources().getString(C0003R.string.invalid_email);
            }
        }
        return b7b;
    }
}
