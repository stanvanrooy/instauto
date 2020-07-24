package p000X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.1fY  reason: invalid class name and case insensitive filesystem */
public final class C34941fY implements View.OnTouchListener {
    public View A00;
    public View A01;
    public ImageView A02;
    public TouchInterceptorFrameLayout A03;
    public C171717Vr A04;
    public C66672vr A05;
    public final Context A06;
    public final ViewStub A07;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A03.isEnabled() && motionEvent.getActionMasked() == 0) {
            this.A03.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public C34941fY(ViewStub viewStub) {
        this.A06 = viewStub.getContext();
        this.A07 = viewStub;
    }
}
