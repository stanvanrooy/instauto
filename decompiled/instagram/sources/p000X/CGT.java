package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.CGT */
public final class CGT {
    public static String A00(Context context, Integer num) {
        int i;
        switch (num.intValue()) {
            case 1:
            case 3:
                i = C0003R.string.promote_error_title_unsettled_account;
                break;
            case 2:
            case 6:
                i = C0003R.string.promote_error_title_account_restricted;
                break;
            default:
                i = C0003R.string.promote;
                break;
        }
        return context.getString(i);
    }
}
