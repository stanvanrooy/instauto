package p000X;

import android.text.TextUtils;
import com.instagram.p009ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.1lp  reason: invalid class name and case insensitive filesystem */
public final class C38781lp {
    public static void A00(C32221an r6, AnonymousClass1NJ r7, C36841ih r8) {
        Integer num;
        if (r6.A00() != null) {
            r6.A00().A01();
        }
        if (r7.AiO()) {
            SlideInAndOutIconView A00 = r6.A00();
            AnonymousClass27S r0 = r8.A0G;
            if (r0 != null) {
                num = r0.A06;
            } else {
                num = Constants.ZERO;
            }
            int i = r8.A06;
            String str = r8.A0Q;
            if (num != Constants.ZERO) {
                A00.setVisibility(0);
                A00.setText(str);
                A00.setIcon(C019000b.A03(A00.getContext(), i));
                A00.setBackgroundAlpha(1.0f);
            }
            if (num == Constants.ONE && !TextUtils.isEmpty(str)) {
                A00.A0B.setVisibility(0);
            } else if (num == Constants.A0C) {
                A00.A0B.setVisibility(8);
            }
            r8.A0G(r6.A00());
        }
    }
}
