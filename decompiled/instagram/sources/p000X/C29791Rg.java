package p000X;

import android.app.Activity;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.1Rg  reason: invalid class name and case insensitive filesystem */
public final class C29791Rg extends C27291Hg {
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass1NJ A03;
    public boolean A04 = false;
    public final C27371Ho A05;
    public final AnonymousClass0C1 A06;
    public final C29821Rj A07;
    public final DataSetObserver A08 = new C29811Ri(this);
    public final C29801Rh A09 = new C29801Rh(this);

    public static void A00(C29791Rg r3, boolean z) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = r3.A07.A06;
        if (touchInterceptorFrameLayout != null) {
            int systemUiVisibility = touchInterceptorFrameLayout.getSystemUiVisibility();
            int i = systemUiVisibility | 256 | 4;
            if (z) {
                i = systemUiVisibility & -5;
            }
            touchInterceptorFrameLayout.setSystemUiVisibility(i);
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = r3.A07.A06;
        if (touchInterceptorFrameLayout2 != null && !r3.A04) {
            int systemUiVisibility2 = touchInterceptorFrameLayout2.getSystemUiVisibility();
            int i2 = systemUiVisibility2 | 256 | 512 | 2;
            if (z) {
                i2 = systemUiVisibility2 & -513 & -3;
            }
            touchInterceptorFrameLayout2.setSystemUiVisibility(i2);
        }
    }

    public final void Ar3(int i, int i2, Intent intent) {
        this.A07.Ar3(i, i2, intent);
    }

    public final void AyU() {
        this.A07.AyU();
    }

    public final void Ayk(View view) {
        this.A07.Ayk(view);
    }

    public final void Azd() {
        this.A07.Azd();
    }

    public final void Azh() {
        this.A07.Azh();
    }

    public final void BE0() {
        this.A07.BE0();
    }

    public final void BJx() {
        this.A07.BJx();
    }

    public final void BKp(Bundle bundle) {
        this.A07.BKp(bundle);
    }

    public final void BP6() {
        this.A07.BP6();
    }

    public final void BVf(View view, Bundle bundle) {
        this.A07.BVf(view, bundle);
    }

    public final void onStart() {
        this.A07.onStart();
    }

    public C29791Rg(AnonymousClass0C1 r5, Activity activity, Adapter adapter, C27371Ho r8) {
        Activity parent;
        this.A06 = r5;
        if (activity.getParent() == null) {
            parent = activity;
        } else {
            parent = activity.getParent();
        }
        ViewGroup viewGroup = (ViewGroup) parent.getWindow().getDecorView();
        C29821Rj r1 = new C29821Rj(viewGroup);
        this.A07 = r1;
        r1.A07 = this.A09;
        if (AnonymousClass0PB.A05() && parent.getWindow() != null) {
            AnonymousClass0PB.A03(activity.getWindow());
            AnonymousClass1E1.A0J(viewGroup);
        }
        adapter.registerDataSetObserver(this.A08);
        this.A05 = r8;
    }
}
