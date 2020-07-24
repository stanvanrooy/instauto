package p000X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1gi  reason: invalid class name and case insensitive filesystem */
public final class C35651gi {
    public static final AnonymousClass1EA A0D = AnonymousClass1EA.A00(10.0d, 20.0d);
    public double A00 = 0.01d;
    public double A01 = 0.01d;
    public boolean A02 = true;
    public float A03 = 0.9f;
    public AnonymousClass1EA A04 = A0D;
    public C34861fQ A05;
    public boolean A06 = true;
    public boolean A07;
    public boolean A08 = true;
    public boolean A09;
    public boolean A0A;
    public final View A0B;
    public final List A0C = new ArrayList();

    public final C35691gm A00() {
        AnonymousClass0a4.A0C(!this.A0C.isEmpty(), "Bouncy object(s) should be defined");
        return new C35691gm(this);
    }

    public final void A01(View view) {
        this.A0C.clear();
        this.A0C.add(new C35661gj(view));
    }

    public final void A02(View... viewArr) {
        this.A0C.clear();
        for (View r2 : viewArr) {
            this.A0C.add(new C35661gj(r2));
        }
    }

    public C35651gi(View view) {
        this.A0B = view;
        A01(view);
    }
}
