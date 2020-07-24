package p000X;

import android.content.res.Resources;
import java.util.Random;

/* renamed from: X.0md  reason: invalid class name and case insensitive filesystem */
public final class C15280md implements AnonymousClass0RN {
    public static C15280md A05;
    public int A00 = 0;
    public AnonymousClass0QT A01;
    public AnonymousClass0IT A02;
    public boolean A03 = false;
    public final Random A04;

    public final String getModuleName() {
        return "IgDrawableUsageLogger";
    }

    public static C15280md A00() {
        if (A05 == null) {
            synchronized (C15280md.class) {
                if (A05 == null) {
                    C15280md r5 = new C15280md(new Random());
                    AnonymousClass0MP r4 = C06550Pm.A00().A00;
                    AnonymousClass0QV r3 = AnonymousClass0QV.A03;
                    C15280md r2 = A05;
                    AnonymousClass0a4.A0C(true, "must set one of mModuleName or mAnalyticsModule");
                    r5.A01 = new AnonymousClass0QT(r4, r2, r3);
                    A05 = r5;
                }
            }
        }
        return A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r3.A04.nextInt(r1) != 0) goto L_0x000d;
     */
    public final void A01(Resources resources, int i) {
        boolean z;
        boolean booleanValue;
        int i2 = this.A00;
        if (i2 != 0) {
            z = true;
        }
        z = false;
        if (z) {
            C92213yn r2 = new C92213yn(this.A01.A02("ig_assets_usage"));
            r2.A08("asset_name", resources.getResourceEntryName(i));
            AnonymousClass0IT r0 = this.A02;
            if (r0 == null) {
                booleanValue = true;
            } else {
                booleanValue = ((Boolean) r0.get()).booleanValue();
            }
            r2.A04("connected_to_network", Boolean.valueOf(booleanValue));
            r2.A04("cold_start_complete", Boolean.valueOf(this.A03));
            r2.A01();
        }
    }

    public C15280md(Random random) {
        this.A04 = random;
    }
}
