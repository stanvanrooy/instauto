package p000X;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1z6  reason: invalid class name and case insensitive filesystem */
public final class C46081z6 implements C27121Go {
    public int A00;
    public int A01 = 2;
    public float A02;
    public Boolean A03;
    public final int A04;
    public final Activity A05;
    public final View A06;
    public final Window A07;

    public final void BE0() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (p000X.C17440qF.A00(r6.A05) != false) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005e  */
    private void A00() {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4 = this.A01;
        boolean z3 = true;
        if (i4 == 1) {
            C33251cc.A01().A07();
        } else if (i4 == 0 || i4 == 2) {
            C33251cc.A01().A08();
        }
        if (this.A01 == 0) {
            this.A07.addFlags(1024);
            z = true;
        } else {
            Boolean bool = this.A03;
            if (bool == null || bool.booleanValue()) {
                this.A07.clearFlags(1024);
                z = false;
            }
            i = this.A01;
            if (i != 2 || (i == 1 && this.A00 == 2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                boolean z4 = false;
                if (Build.VERSION.SDK_INT >= 26) {
                    z4 = true;
                }
                if (z4) {
                    i2 = 1808;
                }
            }
            i2 = 1792;
            i3 = this.A01;
            if (i3 == 2) {
                i2 |= 8192;
            }
            if (i3 == 0 || i3 == 1) {
                i2 |= 4;
            }
            this.A07.getDecorView().setSystemUiVisibility(i2);
            if (AnonymousClass0PB.A06()) {
                Activity activity = this.A05;
                if (this.A02 >= 0.8f) {
                    z3 = false;
                }
                AnonymousClass1X4.A03(activity, z3);
            }
            this.A00 = this.A01;
        }
        this.A03 = z;
        i = this.A01;
        if (i != 2) {
        }
        z2 = true;
        if (z2) {
        }
        i2 = 1792;
        i3 = this.A01;
        if (i3 == 2) {
        }
        i2 |= 4;
        this.A07.getDecorView().setSystemUiVisibility(i2);
        if (AnonymousClass0PB.A06()) {
        }
        this.A00 = this.A01;
    }

    private void A01(boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (this.A07.getStatusBarColor() != 0) {
                this.A07.setStatusBarColor(0);
            }
            AnonymousClass1X4.A03(this.A05, !z);
        }
    }

    public static boolean A02() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public final void BK0(boolean z) {
        if (this.A00 != this.A01) {
            A00();
        }
        A01(z);
    }

    public C46081z6(View view, Activity activity, int i) {
        this.A06 = view;
        this.A05 = activity;
        Window window = activity.getWindow();
        AnonymousClass11J.A00(window);
        this.A07 = window;
        this.A04 = i;
        C27141Gq.A01(this.A05, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            C06220Of.A0b(this.A06, new C46091z7(this));
        }
    }

    public final void BDE(C26391Dc r9) {
        int A032 = AnonymousClass0Z0.A03(1593736988);
        AnonymousClass1DI r0 = r9.A05;
        float f = r9.A01;
        this.A02 = r0.A0A(f);
        boolean z = true;
        if (AnonymousClass0PB.A06()) {
            this.A01 = 2;
            boolean z2 = false;
            if (f - ((float) ((int) f)) == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                z2 = true;
            }
            if (z2) {
                A00();
            }
            if (f != r9.A05.A05()) {
                z = false;
            }
            if (z) {
                boolean z3 = false;
                if (Build.VERSION.SDK_INT >= 26) {
                    z3 = true;
                }
                if (z3) {
                    this.A07.getDecorView().setSystemUiVisibility(this.A07.getDecorView().getSystemUiVisibility() & -17);
                }
            }
            A01(z);
        } else {
            float f2 = this.A02;
            if (f2 == 1.0f) {
                this.A01 = 0;
            } else if (f2 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                this.A01 = 2;
            } else {
                this.A01 = 1;
            }
        }
        if (this.A00 != this.A01) {
            A00();
        }
        AnonymousClass0Z0.A0A(1561135136, A032);
    }
}
