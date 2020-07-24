package p000X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.AOG */
public final class AOG extends AOR {
    public final C57332e1 A00;
    public final Context A01;
    public final Integer A02;

    public final void A00(String str) {
        String string = this.A01.getResources().getString(C0003R.string.live_donations_title_fundraiser);
        String string2 = this.A01.getResources().getString(C0003R.string.live_donations_subtitle_fundraiser, new Object[]{str});
        this.A04.setText(string);
        this.A03.setText(string2);
        switch (this.A02.intValue()) {
            case 0:
                this.A01.setText(C0003R.string.live_donations_action_view);
                break;
            case 1:
                this.A01.setText(C0003R.string.live_donations_action_donate);
                break;
        }
        this.A01.setOnClickListener(new C23526APw(this));
    }

    public final void A01(String str, String str2) {
        TextView textView = this.A02;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(str);
        if (!str2.isEmpty()) {
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.append(str2);
        }
        textView.setText(spannableStringBuilder);
        if (this.A02.getVisibility() != 0) {
            this.A02.setVisibility(0);
        }
        this.A00.B0S(str, str2);
    }

    public AOG(Context context, View view, Integer num, C57332e1 r4) {
        super(view);
        this.A01 = context;
        this.A02 = num;
        this.A00 = r4;
    }
}
