package p000X;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.views.slider.ReactSliderManager;

/* renamed from: X.A11 */
public final class A11 extends AnonymousClass1YC {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r5 == p000X.C473123j.A0a.A00()) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r5 == p000X.C473123j.A0a.A00()) goto L_0x0019;
     */
    public final boolean A06(View view, int i, Bundle bundle) {
        boolean z;
        boolean z2;
        if (!(i == C473123j.A0U.A00() || i == C473123j.A0S.A00())) {
            z = false;
        }
        z = true;
        if (z) {
            ReactSliderManager.ON_CHANGE_LISTENER.onStartTrackingTouch((SeekBar) view);
        }
        boolean A06 = super.A06(view, i, bundle);
        if (!(i == C473123j.A0U.A00() || i == C473123j.A0S.A00())) {
            z2 = false;
        }
        z2 = true;
        if (z2) {
            ReactSliderManager.ON_CHANGE_LISTENER.onStopTrackingTouch((SeekBar) view);
        }
        return A06;
    }
}
