package p000X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1a1  reason: invalid class name and case insensitive filesystem */
public final class C31821a1 extends TouchDelegate {
    public static final Rect A01 = new Rect();
    public final List A00 = new ArrayList();

    public C31821a1(View view) {
        super(A01, view);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z = false;
        for (int i = 0; i < this.A00.size(); i++) {
            motionEvent.setLocation(x, y);
            if (!((TouchDelegate) this.A00.get(i)).onTouchEvent(motionEvent)) {
                boolean z2 = z;
                z = false;
                if (!z2) {
                }
            }
            z = true;
        }
        return z;
    }
}
