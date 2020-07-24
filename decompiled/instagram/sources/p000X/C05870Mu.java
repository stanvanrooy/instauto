package p000X;

import android.app.Activity;
import android.app.Application;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import java.util.Iterator;

/* renamed from: X.0Mu  reason: invalid class name and case insensitive filesystem */
public final class C05870Mu extends AnonymousClass0Q7 implements AnonymousClass0QB {
    public long A00;
    public Boolean A01;
    public Boolean A02;
    public boolean A03 = true;
    public AnonymousClass0QT A04;
    public boolean A05 = false;
    public final Runnable A06 = new AnonymousClass0Q1(this);
    public final Runnable A07 = new AnonymousClass0Q2(this);

    public final long A05() {
        return ArLinkScanControllerImpl.ERROR_DELAY_MS;
    }

    public final void A0E(C06590Pq r6) {
        if (r6 != null) {
            this.A04 = AnonymousClass0QT.A00(r6, C05880Mv.A00);
            return;
        }
        AnonymousClass0MP r3 = C06550Pm.A00().A00;
        AnonymousClass0QV r2 = AnonymousClass0QV.A03;
        AnonymousClass0a4.A0C(true, "must set one of mModuleName or mAnalyticsModule");
        this.A04 = new AnonymousClass0QT(r3, (AnonymousClass0RN) null, r2);
    }

    public final void Aqy(Activity activity) {
    }

    public final void Aqz(Activity activity) {
    }

    public final void Ar1(Activity activity) {
    }

    private void A01() {
        C12670hC.A02();
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("notifyAppForegrounded", -1394136077);
        }
        try {
            AnonymousClass0ZA.A08(this.A01, this.A07);
            this.A03 = false;
            A02(this, "foreground");
            AnonymousClass0ZA.A08(this.A01, this.A06);
            if (A0J()) {
                this.A02 = false;
            }
            if (A0H()) {
                this.A01 = false;
                this.A05 = true;
                Iterator it = this.A04.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass0Q6) it.next()).onAppForegrounded();
                }
            }
        } finally {
            A02(this, "postforeground");
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(635212341);
            }
        }
    }

    public static void A02(C05870Mu r2, String str) {
        AnonymousClass0QT r1;
        if (r2.A00 && (r1 = r2.A04) != null) {
            C33281cf r22 = new C33281cf(r1.A02("ig_app_background_detection"));
            r22.A08("new_app_state", str);
            r22.A08("detector", "delayed");
            r22.A01();
        }
    }

    public final long A06() {
        return this.A00;
    }

    public final long A07() {
        return AwakeTimeSinceBootClock.INSTANCE.now() - ArLinkScanControllerImpl.ERROR_DELAY_MS;
    }

    public final String A08() {
        Boolean bool = this.A01;
        if (bool == null) {
            return "unset";
        }
        if (bool.booleanValue()) {
            return "true";
        }
        return "false";
    }

    public final void A0A(Application application) {
        A0E(AnonymousClass0Q7.A07);
    }

    public final void A0F(boolean z) {
        if (!z) {
            A00();
        }
    }

    public final boolean A0G() {
        return this.A03;
    }

    public final boolean A0H() {
        Boolean bool = this.A01;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A0I() {
        if (this.A01 != null) {
            return true;
        }
        return false;
    }

    public final boolean A0J() {
        Boolean bool = this.A02;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A0K() {
        return this.A05;
    }

    public C05870Mu() {
        AnonymousClass0QA.A00.A00(this);
    }

    private void A00() {
        C12670hC.A02();
        this.A03 = true;
        AnonymousClass0ZA.A08(this.A01, this.A07);
        AnonymousClass0ZA.A09(this.A01, this.A07, ArLinkScanControllerImpl.ERROR_DELAY_MS, -1871340224);
    }

    public final void A09() {
        A01();
    }

    public final void Ar2(Activity activity) {
        C12670hC.A02();
        this.A03 = true;
        AnonymousClass0ZA.A09(this.A01, this.A06, 500, 2008737861);
        A00();
    }

    public final void Ar6(Activity activity) {
        A01();
    }
}
