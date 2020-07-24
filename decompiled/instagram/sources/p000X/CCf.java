package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.CCf */
public enum CCf {
    VIEW_INSTAGRAM_PROFILE("VIEW_INSTAGRAM_PROFILE"),
    INSTAGRAM_MESSAGE("INSTAGRAM_MESSAGE");
    
    public final String A00;

    /* access modifiers changed from: public */
    CCf(String str) {
        this.A00 = str;
    }

    public static CCN A00(CCf cCf) {
        switch (cCf.ordinal()) {
            case 0:
                return CCN.PROFILE_VISITS;
            case 1:
                return CCN.A02;
            default:
                return CCN.WEBSITE_CLICK;
        }
    }

    public static String A01(Context context, CCf cCf) {
        int i;
        switch (cCf.ordinal()) {
            case 0:
                i = C0003R.string.promote_profile_visit_cta;
                break;
            case 1:
                i = C0003R.string.promote_direct_message_cta;
                break;
            case 2:
                i = C0003R.string.promote_learn_more_cta;
                break;
            case 3:
                i = C0003R.string.promote_shop_now_cta;
                break;
            case 4:
                i = C0003R.string.promote_watch_more_cta;
                break;
            case 5:
                i = C0003R.string.promote_contact_us_cta;
                break;
            case 6:
                i = C0003R.string.promote_book_now_cta;
                break;
            case 7:
                i = C0003R.string.promote_sign_up_cta;
                break;
            default:
                throw new UnsupportedOperationException(AnonymousClass40t.$const$string(171));
        }
        return context.getString(i);
    }

    public final String toString() {
        return this.A00;
    }
}
