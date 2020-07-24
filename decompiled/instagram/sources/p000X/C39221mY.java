package p000X;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.1mY  reason: invalid class name and case insensitive filesystem */
public final class C39221mY implements View.OnTouchListener {
    public boolean A00;
    public final int A01;
    public final AnonymousClass1U1 A02;
    public final AnonymousClass1NJ A03;
    public final C36841ih A04;
    public final C32351b1 A05;

    public C39221mY(C32351b1 r1, AnonymousClass1NJ r2, C36841ih r3, int i, AnonymousClass1U1 r5) {
        this.A05 = r1;
        this.A03 = r2;
        this.A04 = r3;
        this.A01 = i;
        this.A02 = r5;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.A00 = false;
                return true;
            }
        } else if ((motionEvent.getX() >= ((float) this.A05.A07.getLeft()) && motionEvent.getX() <= ((float) this.A05.A07.getLeft())) || motionEvent.getX() >= ((float) this.A05.A07.getRight())) {
            this.A00 = true;
            AnonymousClass0ZA.A09(new Handler(), new AnonymousClass6XQ(this), 280, 1502032119);
            return true;
        }
        return true;
    }
}
