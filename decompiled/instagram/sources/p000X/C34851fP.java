package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1fP  reason: invalid class name and case insensitive filesystem */
public final class C34851fP implements C34861fQ, C34871fR {
    public AnonymousClass1NJ A00;
    public C39941no A01;
    public C65022sQ A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public ImageView A06;
    public LinearLayout A07;
    public TextView A08;
    public C35691gm A09;
    public C35691gm A0A;
    public C34151eA A0B;
    public C64982sM A0C;
    public final ViewStub A0D;

    public final void Ata(C35691gm r1) {
    }

    public final void Atb(C35691gm r1) {
    }

    public final void BA5(View view) {
    }

    public final void BJa(C35691gm r1) {
    }

    public final C35691gm A00(View view) {
        C35651gi r2 = new C35651gi(view);
        r2.A0C.clear();
        r2.A0C.add(this);
        r2.A0A = true;
        r2.A07 = true;
        r2.A08 = false;
        r2.A03 = 0.85f;
        r2.A04 = C65402t2.A00;
        r2.A05 = this;
        return r2.A00();
    }

    public final void A01(AnonymousClass0C1 r4, Runnable runnable) {
        int[] A022 = C60572k7.A02(r4, this.A0B.A06());
        AnonymousClass7QM r0 = (AnonymousClass7QM) this.A06.getDrawable();
        r0.A09(A022);
        r0.A0F = runnable;
        r0.A0j.A03(1.0d);
    }

    public final void Atc(C35691gm r5) {
        float A002 = (float) r5.A07.A00();
        AnonymousClass7QM r2 = (AnonymousClass7QM) this.A06.getDrawable();
        if (r5.A06 == this.A03) {
            r2.A00 = A002;
            r2.invalidateSelf();
            return;
        }
        r2.A01 = A002;
        r2.invalidateSelf();
    }

    public final boolean BR2(View view) {
        int i;
        float f;
        this.A09.A04(false);
        this.A0A.A04(false);
        AnonymousClass7QM r1 = (AnonymousClass7QM) this.A06.getDrawable();
        if (view == this.A03) {
            i = 0;
        } else {
            i = 1;
        }
        r1.A0E = i;
        r1.invalidateSelf();
        C64982sM r12 = this.A0C;
        if (r12 != null) {
            f = (r12.A06 / 1000.0f) * r12.A07;
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        C65022sQ r3 = this.A02;
        C34261eN A062 = this.A0B.A06();
        AnonymousClass1NJ r6 = this.A00;
        int i2 = 1;
        if (view == this.A03) {
            i2 = 0;
        }
        r3.BEd(this, A062, r6, i2, this.A01, f);
        return true;
    }

    public C34851fP(ViewStub viewStub) {
        this.A0D = viewStub;
    }
}
