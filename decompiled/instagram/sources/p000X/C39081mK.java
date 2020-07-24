package p000X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.1mK  reason: invalid class name and case insensitive filesystem */
public final class C39081mK {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r9.equals(r8.A0c(r6)) == false) goto L_0x000f;
     */
    public static void A00(AnonymousClass0C1 r6, C32281at r7, AnonymousClass1NJ r8, C13300iJ r9, C30441Tv r10) {
        boolean z;
        if (r8.A3X) {
            z = true;
        }
        z = false;
        if (z) {
            if (r7.A00 == null) {
                View inflate = r7.A01.inflate();
                r7.A00 = inflate;
                r7.A02 = (TextView) inflate.findViewById(C0003R.C0005id.violation_banner_text);
                r7.A03 = r7.A00.getResources().getString(C0003R.string.learn_more);
                r7.A02.setHighlightColor(C019000b.A00(r7.A00.getContext(), C0003R.color.transparent));
            }
            View view = r7.A00;
            Resources resources = view.getResources();
            boolean z2 = r8.A3U;
            int i = C0003R.string.branded_content_violation_post_banner_learn_more;
            if (z2) {
                i = C0003R.string.branded_content_violation_story_banner_learn_more;
            }
            String string = resources.getString(i, new Object[]{r7.A03});
            String str = r7.A03;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            AnonymousClass4XV.A02(str, spannableStringBuilder, new AnonymousClass4H5(C019000b.A00(view.getContext(), C0003R.color.white), r10));
            r7.A02.setMovementMethod(LinkMovementMethod.getInstance());
            r7.A02.setText(spannableStringBuilder);
            r7.A00.setVisibility(0);
            return;
        }
        C06220Of.A0F(r7.A00);
    }
}
