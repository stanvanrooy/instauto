package p000X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.1hz  reason: invalid class name and case insensitive filesystem */
public final class C36401hz implements AnonymousClass1RO {
    public C480726n A00;
    public AnonymousClass1NJ A01;
    public C36841ih A02;
    public final View A03;
    public final View A04;
    public final ViewGroup A05;
    public final TextView A06;
    public final TextView A07;
    public final ColorFilterAlphaImageView A08;
    public final AnonymousClass0C1 A09;

    public final void BB7(C36841ih r7, int i) {
        if (i == 5) {
            AnonymousClass1VW.A02(this, r7.A0a, !r7.A0g);
        } else if (i == 4) {
            String A022 = C17050pb.A02(this.A06.getContext(), this.A01, r7.A01);
            this.A06.setText(A022);
            C36841ih r2 = this.A02;
            r2.A0M = A022;
            Context context = this.A05.getContext();
            String A032 = C17050pb.A03(context, this.A09, this.A01, r7, C37201jH.A00(this.A01, r2.A01, context));
            if (A032 != null) {
                this.A07.setText(A032);
                this.A07.setVisibility(0);
                return;
            }
            this.A07.setVisibility(8);
        } else if (i == 14) {
            C36841ih r1 = this.A02;
            if (r1.A0a) {
                int i2 = r1.A07;
                int i3 = r1.A03;
                this.A05.setBackgroundColor(((Integer) AnonymousClass1VW.A08.evaluate(r1.A00, Integer.valueOf(AnonymousClass1VW.A00(this.A00, this.A01, i2)), Integer.valueOf(AnonymousClass1VW.A00(this.A00, this.A01, i3)))).intValue());
            }
        }
    }

    public C36401hz(AnonymousClass0C1 r3, View view, ViewGroup viewGroup, View view2, TextView textView, TextView textView2, ColorFilterAlphaImageView colorFilterAlphaImageView) {
        this.A09 = r3;
        this.A04 = view;
        this.A05 = viewGroup;
        this.A03 = view2;
        this.A06 = textView;
        this.A07 = textView2;
        textView.getPaint().setFakeBoldText(true);
        this.A08 = colorFilterAlphaImageView;
    }
}
