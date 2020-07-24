package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.C4F */
public final class C4F {
    public static CV0 A00(Context context, C4A c4a, boolean z) {
        Integer num;
        String str;
        C13300iJ r1 = c4a.A01;
        switch (c4a.A03.intValue()) {
            case 1:
                num = Constants.ZERO;
                break;
            case 2:
            case 3:
                num = Constants.ONE;
                break;
            default:
                num = Constants.A0C;
                break;
        }
        if (z) {
            str = context.getString(C0003R.string.interactivity_ama_card_question_story_subtitle);
        } else {
            str = "";
        }
        return new CV0(c4a.A00, c4a.A05, r1.ASv(), r1.AZn(), str, num);
    }
}
