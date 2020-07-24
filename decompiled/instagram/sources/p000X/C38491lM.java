package p000X;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.1lM  reason: invalid class name and case insensitive filesystem */
public final class C38491lM extends C38501lN implements C29831Rk {
    public boolean A00;
    public AccessibilityManager A01;
    public boolean A02;
    public final /* synthetic */ C38471lK A03;

    public final boolean BKu(C38511lO r2) {
        return true;
    }

    public C38491lM(C38471lK r1) {
        this.A03 = r1;
    }

    public final void A00(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.A03.A01.getSystemService("accessibility");
        this.A01 = accessibilityManager;
        this.A02 = accessibilityManager.isEnabled();
        boolean isTouchExplorationEnabled = this.A01.isTouchExplorationEnabled();
        this.A00 = isTouchExplorationEnabled;
        if (!this.A02 || !isTouchExplorationEnabled) {
            C38471lK r0 = this.A03;
            r0.A03.BNe(r0.A02, r0.A05, r0.A00, r0.A04);
            return;
        }
        C38471lK r02 = this.A03;
        r02.A03.B0e(r02.A02, r02.A05, r02.A00, r02.A04);
    }

    public final void A01(MotionEvent motionEvent) {
        C38471lK r0 = this.A03;
        r0.A03.BNe(r0.A02, r0.A05, r0.A00, r0.A04);
    }

    public final boolean A02() {
        if (!this.A02 || !this.A00) {
            return false;
        }
        return true;
    }

    public final boolean BKx(C38511lO r9) {
        this.A03.A05.A0M(true);
        C38471lK r0 = this.A03;
        r0.A03.BKw(r9, r0.A02, r0.A05, r0.A00, r0.A04.A07);
        return true;
    }

    public final void BL0(C38511lO r3) {
        this.A03.A05.A0M(false);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C38471lK r0 = this.A03;
        r0.A03.B0e(r0.A02, r0.A05, r0.A00, r0.A04);
        return true;
    }
}
