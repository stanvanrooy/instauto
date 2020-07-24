package p000X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.ViewGroup;
import com.instagram.common.p004ui.base.IgTextView;

/* renamed from: X.1fd  reason: invalid class name and case insensitive filesystem */
public final class C34991fd implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C34421ei A01;

    public C34991fd(C34421ei r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        IgTextView igTextView = this.A01.A01;
        if (igTextView != null) {
            C34421ei r0 = this.A01;
            r0.A01.getHitRect(r0.A0C);
            int max = Math.max(this.A00 - this.A01.A0C.height(), 0);
            C34421ei r3 = this.A01;
            Rect rect = r3.A0C;
            int i = max >> 1;
            rect.top -= i;
            rect.bottom += i;
            ((ViewGroup) igTextView.getParent()).setTouchDelegate(new TouchDelegate(rect, r3.A01));
        }
    }
}
