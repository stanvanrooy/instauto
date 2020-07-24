package p000X;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1mG  reason: invalid class name and case insensitive filesystem */
public final class C39041mG {
    public static void A00(C32271as r3) {
        int i;
        AnonymousClass0ZA.A08(r3.A0B, r3.A00);
        View view = r3.A03;
        if (view != null) {
            C476524w A0T = C476624x.A07(view).A0T(true);
            Boolean bool = r3.A0A;
            AnonymousClass0a4.A06(bool);
            if (bool.booleanValue()) {
                i = r3.A06.A00;
            } else {
                i = r3.A05.A00;
            }
            A0T.A0K(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i);
            A0T.A09 = new C108894mb(r3);
            A0T.A0O();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r0 == r6) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r0 == r7) goto L_0x0011;
     */
    public static void A01(C32271as r5, AnonymousClass1NJ r6, C36841ih r7, AnonymousClass0C1 r8, C30421Tt r9) {
        boolean z;
        boolean z2;
        AnonymousClass1NJ r0 = r5.A04;
        int i = 0;
        if (r0 != null) {
            z = true;
        }
        z = false;
        C36841ih r02 = r5.A07;
        if (r02 != null) {
            z2 = true;
        }
        z2 = false;
        if (z || z2) {
            View view = r5.A03;
            if (view != null) {
                C476624x.A07(view).A0N();
            }
            Runnable runnable = r5.A00;
            if (runnable != null) {
                AnonymousClass0ZA.A08(r5.A0B, runnable);
            }
            C36841ih r03 = r5.A07;
            if (r03 != null) {
                r03.A0c = false;
            }
        }
        if (z2) {
            r5.A07.A0C(r5, true);
        }
        r5.A08 = r8;
        r5.A04 = r6;
        r5.A07 = r7;
        r7.A0B(r5, true);
        r5.A01 = new C39051mH(r5, r9);
        r5.A02 = new C39061mI(r5, r9);
        r5.A00 = new C39071mJ(r5);
        if (!r7.A0c) {
            i = 8;
        }
        C32271as.A00(r5, i);
    }
}
