package p000X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1t4  reason: invalid class name and case insensitive filesystem */
public final class C42681t4 implements C27121Go {
    public int A00;
    public int A01 = 2;
    public Drawable A02;
    public float A03;
    public Drawable A04;
    public Boolean A05;
    public boolean A06;
    public final int A07;
    public final Activity A08;
    public final View A09;
    public final Window A0A;
    public final Runnable A0B = new C42691t5(this);

    private void A00() {
        if (this.A04 == null && this.A09.isLaidOut()) {
            this.A04 = new C46321zY(this.A07, this.A09.getRootWindowInsets().getStableInsetTop());
        }
        if (this.A09.getBackground() != this.A04) {
            this.A02 = this.A09.getBackground();
            this.A09.setBackground(this.A04);
        }
        AnonymousClass1X4.A02(this.A08, 0);
    }

    private void A01() {
        long j;
        int i = this.A01;
        this.A00 = i;
        boolean z = true;
        if (i == 1) {
            C33251cc.A01().A07();
        } else if (i == 0 || i == 2) {
            C33251cc.A01().A08();
        }
        int i2 = 1284;
        if (this.A01 != 0) {
            Boolean bool = this.A05;
            if (bool == null || bool.booleanValue()) {
                this.A05 = false;
                this.A0A.clearFlags(1024);
            }
            if (this.A01 != 1 || Build.VERSION.SDK_INT < 23) {
                i2 = 1280;
            }
        } else {
            this.A0A.addFlags(1024);
            this.A05 = true;
        }
        this.A0A.getDecorView().setSystemUiVisibility(i2);
        if (this.A01 != 0) {
            this.A09.removeCallbacks(this.A0B);
            this.A0A.clearFlags(67108864);
        } else {
            View view = this.A09;
            Runnable runnable = this.A0B;
            if (Build.VERSION.SDK_INT >= 23) {
                j = 1000;
            } else {
                j = 0;
            }
            view.postDelayed(runnable, j);
        }
        if (AnonymousClass0PB.A06()) {
            if (Build.VERSION.SDK_INT >= 23) {
                A00();
            }
            Activity activity = this.A08;
            if (this.A03 >= 0.8f) {
                z = false;
            }
            AnonymousClass1X4.A03(activity, z);
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            if (this.A06) {
                A00();
                return;
            }
            this.A09.setBackground(this.A02);
            AnonymousClass1X4.A02(this.A08, this.A07);
        }
    }

    public final void BE0() {
        this.A09.removeCallbacks(this.A0B);
    }

    public final void BK0(boolean z) {
        if (this.A00 != this.A01) {
            A01();
        }
    }

    public C42681t4(View view, Activity activity, int i) {
        this.A09 = view;
        this.A08 = activity;
        this.A0A = activity.getWindow();
        this.A07 = i;
        C36431i2.A09(this.A08, ((Boolean) C05640Lj.A00(AnonymousClass0L7.COORDINATORLAYOUT_ROOT_LAYOUT, "is_enabled", false)).booleanValue() ? C0003R.C0005id.layout_container_center_right_coordinator_layout : C0003R.C0005id.layout_container_center_right_frame_layout).setFitsSystemWindows(true);
    }

    public final void BDE(C26391Dc r8) {
        int A032 = AnonymousClass0Z0.A03(-2078344042);
        AnonymousClass1DI r0 = r8.A05;
        float f = r8.A01;
        this.A03 = r0.A0A(f);
        boolean z = true;
        if (AnonymousClass0PB.A06()) {
            this.A01 = 2;
            boolean z2 = false;
            if (f == r8.A05.A05()) {
                z2 = true;
            }
            if (z2) {
                A01();
            }
        } else {
            float f2 = this.A03;
            if (f2 == 1.0f) {
                this.A01 = 0;
            } else if (f2 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                this.A01 = 2;
            } else {
                this.A01 = 1;
            }
        }
        if (Math.abs(f - ((float) Math.round(f))) <= 0.001f) {
            z = false;
        }
        this.A06 = z;
        if (this.A00 != this.A01) {
            A01();
        }
        AnonymousClass0Z0.A0A(-1333610604, A032);
    }
}
