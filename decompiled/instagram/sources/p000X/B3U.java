package p000X;

import android.view.View;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.facebook.forker.Process;
import com.instagram.business.insights.p014ui.InsightsEducationView;

/* renamed from: X.B3U */
public final class B3U implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ InsightsEducationView A01;

    public B3U(InsightsEducationView insightsEducationView, View view) {
        this.A01 = insightsEducationView;
        this.A00 = view;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(226505939);
        InsightsEducationView insightsEducationView = this.A01;
        if (insightsEducationView.A04) {
            insightsEducationView.A04 = false;
            insightsEducationView.A03.setVisibility(8);
            this.A01.A02.setCompoundDrawablesWithIntrinsicBounds(0, 0, C0003R.C0004drawable.caret, 0);
        } else {
            insightsEducationView.A04 = true;
            insightsEducationView.A03.setVisibility(0);
            this.A01.A02.setCompoundDrawablesWithIntrinsicBounds(0, 0, C0003R.C0004drawable.caret_flip, 0);
        }
        InsightsEducationView insightsEducationView2 = this.A01;
        int measuredHeight = this.A00.getMeasuredHeight() >> 1;
        if (insightsEducationView2.A04 && insightsEducationView2.A01.getMeasuredHeight() == 0) {
            insightsEducationView2.A00.measure(View.MeasureSpec.makeMeasureSpec(insightsEducationView2.getContext().getResources().getDisplayMetrics().widthPixels, Process.WAIT_RESULT_TIMEOUT), Process.WAIT_RESULT_TIMEOUT);
        }
        int measuredHeight2 = insightsEducationView2.A01.getMeasuredHeight();
        int bottom = insightsEducationView2.A02.getBottom() - insightsEducationView2.A00.getPaddingTop();
        if (measuredHeight2 + bottom >= measuredHeight || measuredHeight2 <= 0) {
            measuredHeight2 = measuredHeight - bottom;
        }
        insightsEducationView2.A03.setLayoutParams(new LinearLayout.LayoutParams(-2, measuredHeight2));
        insightsEducationView2.A03.setOnTouchListener(new B3W(insightsEducationView2));
        AnonymousClass0Z0.A0C(1531034244, A05);
    }
}
