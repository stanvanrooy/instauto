package p000X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.instagram.p009ui.mediaactions.LikeActionView;
import java.lang.ref.WeakReference;

/* renamed from: X.AOS */
public final class AOS {
    public View A00;
    public LikeActionView A01;
    public WeakReference A02;
    public View A03;
    public TextView A04;
    public TextView A05;
    public final Context A06;
    public final C57342e2 A07;
    public final Integer A08;

    public AOS(Context context, View view, Integer num, C57342e2 r7) {
        C13150hy.A02(context, "context");
        C13150hy.A02(view, "rootView");
        C13150hy.A02(num, DatePickerDialogModule.ARG_MODE);
        C13150hy.A02(r7, "delegate");
        this.A06 = context;
        this.A08 = num;
        this.A07 = r7;
        View findViewById = view.findViewById(C0003R.C0005id.iglive_user_pay_content);
        if (findViewById == null) {
            View findViewById2 = view.findViewById(C0003R.C0005id.iglive_user_pay_content_stub);
            if (findViewById2 != null) {
                findViewById = ((ViewStub) findViewById2).inflate();
                C13150hy.A01(findViewById, "(rootView.findViewById(R…b) as ViewStub).inflate()");
            } else {
                throw new C183227s6("null cannot be cast to non-null type android.view.ViewStub");
            }
        }
        this.A00 = findViewById;
        View findViewById3 = findViewById.findViewById(C0003R.C0005id.title);
        C13150hy.A01(findViewById3, "findViewById(R.id.title)");
        this.A05 = (TextView) findViewById3;
        View findViewById4 = findViewById.findViewById(C0003R.C0005id.user_pay_button_container);
        C13150hy.A01(findViewById4, "findViewById(R.id.user_pay_button_container)");
        this.A03 = findViewById4;
        View findViewById5 = findViewById.findViewById(C0003R.C0005id.action_button);
        C13150hy.A01(findViewById5, "findViewById(R.id.action_button)");
        this.A04 = (TextView) findViewById5;
    }

    public static final void A00(AOS aos, String str, boolean z) {
        TextView textView;
        Context context;
        int i;
        if (z) {
            aos.A03.setVisibility(8);
            return;
        }
        int i2 = AnonymousClass485.A00[aos.A08.intValue()];
        if (i2 != 1) {
            if (i2 == 2) {
                textView = aos.A04;
                if (str == null) {
                    context = aos.A06;
                    i = C0003R.string.live_user_pay_badges_action_buy;
                }
                textView.setText(str);
            }
            aos.A03.setVisibility(0);
            aos.A03.setOnClickListener(new C23504APa(aos));
        }
        textView = aos.A04;
        if (str == null) {
            context = aos.A06;
            i = C0003R.string.live_user_pay_badges_action_view;
        }
        textView.setText(str);
        aos.A03.setVisibility(0);
        aos.A03.setOnClickListener(new C23504APa(aos));
        str = context.getString(i);
        textView.setText(str);
        aos.A03.setVisibility(0);
        aos.A03.setOnClickListener(new C23504APa(aos));
    }

    public final void A01(C23497AOt aOt) {
        C13150hy.A02(aOt, "summary");
        TextView textView = this.A05;
        Context context = this.A06;
        String str = aOt.A00;
        String str2 = aOt.A01;
        C13150hy.A02(context, "context");
        C13150hy.A02(str, "formattedAmount");
        C13150hy.A02(str2, "supporterCount");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C13150hy.A02(context, "context");
        C13150hy.A02(str, "formattedAmount");
        textView.setText(spannableStringBuilder.append(AnonymousClass000.A03(str, ' ', context.getString(C0003R.string.live_user_pay_estimated_earnings))).append(" • ").append(C23489AOl.A00(context, str2)));
        this.A07.BUC(aOt);
    }

    public final void A02(C212479Ej r4, String str, boolean z) {
        String str2;
        C13150hy.A02(r4, "pinnedRowConfig");
        C13150hy.A02(str, "broadcasterUserName");
        TextView textView = this.A05;
        if (z) {
            str2 = this.A06.getString(C0003R.string.live_user_pay_badges_payment_processing);
        } else {
            str2 = r4.A01;
            if (str2 == null) {
                C13150hy.A03("description");
            }
        }
        textView.setText(str2);
        String str3 = r4.A00;
        if (str3 == null) {
            C13150hy.A03("buttonTitle");
        }
        A00(this, str3, z);
    }
}
