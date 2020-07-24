package p000X;

import android.app.Application;
import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.0Mk  reason: invalid class name and case insensitive filesystem */
public final class C05850Mk extends AnonymousClass0Q7 {
    public int A00 = 0;
    public long A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public AnonymousClass0QT A05;
    public final Runnable A06 = new C06670Py(this);
    public final Runnable A07 = new C06660Px(this);

    public final long A05() {
        return 0;
    }

    public final void A09() {
    }

    public final void A0E(C06590Pq r6) {
        if (r6 != null) {
            this.A05 = AnonymousClass0QT.A00(r6, C05880Mv.A00);
            return;
        }
        AnonymousClass0MP r3 = C06550Pm.A00().A00;
        AnonymousClass0QV r2 = AnonymousClass0QV.A03;
        AnonymousClass0a4.A0C(true, "must set one of mModuleName or mAnalyticsModule");
        this.A05 = new AnonymousClass0QT(r3, (AnonymousClass0RN) null, r2);
    }

    public final void A0F(boolean z) {
    }

    public final boolean A0I() {
        return true;
    }

    public static void A00(C05850Mk r2, String str) {
        AnonymousClass0QT r1;
        if (r2.A00 && (r1 = r2.A05) != null) {
            C33281cf r22 = new C33281cf(r1.A02("ig_app_background_detection"));
            r22.A08("new_app_state", str);
            r22.A08("detector", "instant");
            r22.A01();
        }
    }

    public final long A06() {
        return this.A01;
    }

    public final long A07() {
        return AwakeTimeSinceBootClock.INSTANCE.now();
    }

    public final String A08() {
        if (this.A03) {
            return "false";
        }
        return "true";
    }

    public final void A0A(Application application) {
        A0E(AnonymousClass0Q7.A07);
        application.registerActivityLifecycleCallbacks(new C06640Pv(this));
    }

    public final boolean A0G() {
        return !this.A03;
    }

    public final boolean A0H() {
        return !this.A03;
    }

    public final boolean A0J() {
        return !this.A03;
    }

    public final boolean A0K() {
        return this.A04;
    }
}
