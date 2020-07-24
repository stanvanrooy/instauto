package p000X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.business.insights.p014ui.InsightsEducationView;

/* renamed from: X.B3W */
public final class B3W implements View.OnTouchListener {
    public final /* synthetic */ InsightsEducationView A00;

    public B3W(InsightsEducationView insightsEducationView) {
        this.A00 = insightsEducationView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
