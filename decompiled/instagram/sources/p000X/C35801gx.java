package p000X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;

/* renamed from: X.1gx  reason: invalid class name and case insensitive filesystem */
public final class C35801gx {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (r13 != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (r13 != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ba, code lost:
        if (android.text.TextUtils.isEmpty(r1.A00) != false) goto L_0x00bc;
     */
    public static void A00(AnonymousClass0C1 r10, C35631gg r11, C31581Yw r12, boolean z) {
        C13300iJ AZf;
        boolean z2;
        int i;
        boolean z3;
        int A00;
        boolean z4;
        int i2;
        Reel reel = r12.A04;
        String str = reel.A0a;
        if (str != null) {
            AnonymousClass172 r1 = reel.A0I;
            if (r1 == AnonymousClass172.SHOPPING_AUTOHIGHLIGHT || r1 == AnonymousClass172.SUGGESTED_SHOP_HIGHLIGHT) {
                TextView textView = r11.A07;
                Context context = textView.getContext();
                AnonymousClass0a4.A06(str);
                textView.setText(new SpannableStringBuilder(C170547Qw.A01(context, C40811pI.A01(context, C0003R.C0004drawable.instagram_shopping_filled_16, C0003R.color.igds_primary_text), 0, context.getResources().getDimensionPixelOffset(C0003R.dimen.reel_item_label_shopping_icon_margin), false, true)).append(str));
            }
            r11.A07.setText(str);
        } else if (reel.A0x) {
            r11.A07.setText(r11.A01);
        } else {
            Context context2 = r11.A07.getContext();
            Integer num = Constants.ONE;
            C249916w r13 = reel.A0M;
            if (!num.equals(r13.AZG()) || (AZf = r13.AZf()) == null) {
                if (reel.A0Z()) {
                    str = C96054Dq.A00(context2, (C51242Jv) r13);
                } else {
                    str = r13.getName();
                }
            } else if (r12.A00().isEmpty() || C14090jk.A05(r10, AZf) || C13390iS.FollowStatusFollowing.equals(AZf.A0M)) {
                str = AZf.AZn();
            } else {
                str = ((C13300iJ) new ArrayList(r12.A00()).get(0)).AZn();
            }
            if (r12.A05.equals(AnonymousClass1OY.EXPLORE)) {
                C249916w r2 = r12.A04.A0M;
                if (r2.AZG() == Constants.ONE && r2.AZf().A0s()) {
                    r11.A07.getViewTreeObserver().addOnPreDrawListener(new C156886mz(r11, str));
                }
            }
            r11.A07.setText(str);
        }
        int i3 = 0;
        if (r12.A04()) {
            r11.A07.getViewTreeObserver().addOnGlobalLayoutListener(new C43141tt(r11));
            TextView textView2 = r11.A05;
            if (!r12.A05(r10) || r12.A04.A0a()) {
                z4 = false;
            }
            z4 = true;
            if (z4) {
                i2 = r11.A02;
            } else {
                i2 = r11.A03;
            }
            textView2.setTextColor(i2);
            r11.A05.setVisibility(0);
        } else {
            r11.A05.setVisibility(8);
        }
        TextView textView3 = r11.A07;
        if (!r12.A05(r10) || r12.A04.A0a()) {
            z2 = false;
        }
        z2 = true;
        if (z2) {
            i = r11.A02;
        } else {
            i = r11.A03;
        }
        textView3.setTextColor(i);
        C26571Ea r5 = r11.A00;
        Reel reel2 = r12.A04;
        if (!reel2.A0e() || z || reel2.A09(r10) != 0) {
            i3 = 8;
        }
        r5.A02(i3);
        C30782Djw djw = r12.A04.A0H;
        if (djw != null) {
            z3 = true;
        }
        z3 = false;
        if (z3) {
            r11.A06.setText(r12.A04.A0H.A00);
            r11.A06.setVisibility(0);
            TextView textView4 = r11.A06;
            if (r12.A05(r10)) {
                A00 = r11.A02;
            } else {
                A00 = C019000b.A00(r11.A06.getContext(), C0003R.color.grey_7);
            }
            textView4.setTextColor(A00);
        } else if (r12.A05 != AnonymousClass1OY.ADS_HISTORY || TextUtils.isEmpty(r12.A04.A0Y)) {
            r11.A06.setText("");
            r11.A06.setVisibility(8);
        } else {
            r11.A06.setText(r12.A04.A0Y);
            r11.A06.setVisibility(0);
            TextView textView5 = r11.A06;
            textView5.setTextColor(C019000b.A00(textView5.getContext(), C0003R.color.grey_5));
            TextView textView6 = r11.A06;
            C06220Of.A0I(textView6, textView6.getContext().getResources().getDimensionPixelSize(C0003R.dimen.ads_history_subtitle_bottom_padding));
        }
    }
}
