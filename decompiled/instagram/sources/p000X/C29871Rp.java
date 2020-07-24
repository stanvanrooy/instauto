package p000X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.1Rp  reason: invalid class name and case insensitive filesystem */
public final class C29871Rp extends C27291Hg implements C29881Rq {
    public ViewStub A00;
    public IgImageView A01;
    public final int A02;
    public final AnonymousClass1HD A03;
    public final AnonymousClass0C1 A04;
    public final AnonymousClass1D7 A05;
    public final C29901Rs A06 = new C29901Rs();

    public final void Azh() {
        this.A00 = null;
        this.A01 = null;
    }

    private void A00() {
        IgImageView igImageView = (IgImageView) this.A00.inflate();
        this.A01 = igImageView;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(igImageView.getResources().getDimensionPixelSize(C0003R.dimen.save_popout_size), C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
        this.A01.measure(makeMeasureSpec, makeMeasureSpec);
        this.A01.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    private void A01(int i) {
        View view = this.A03.mView;
        if (view != null) {
            if (i >= 5) {
                i = 4;
            }
            int width = view.getWidth();
            int height = this.A03.mView.getHeight();
            int measuredWidth = this.A01.getMeasuredWidth();
            int measuredHeight = this.A01.getMeasuredHeight();
            int i2 = width / 5;
            int i3 = (i * i2) + ((i2 - measuredWidth) >> 1);
            if (C06400Ox.A02(this.A03.getContext())) {
                i3 = -i3;
            }
            this.A01.setX((float) i3);
            this.A01.setY((float) ((height - measuredHeight) - this.A02));
            this.A01.setScaleX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A01.setScaleY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    public final void Art(float f, boolean z) {
        IgImageView igImageView = this.A01;
        if (igImageView == null) {
            return;
        }
        if (z) {
            igImageView.setScaleX(f);
            this.A01.setScaleY(f);
            return;
        }
        float f2 = (f / 2.0f) + 0.5f;
        igImageView.setScaleX(f2);
        this.A01.setScaleY(f2);
        IgImageView igImageView2 = this.A01;
        igImageView2.setY(igImageView2.getY() + ((1.0f - f) * ((float) (this.A02 + this.A01.getWidth()))));
    }

    public final void BE0() {
        if (this.A01 != null) {
            A01(4);
        }
        C29901Rs r2 = this.A06;
        r2.A01 = null;
        AnonymousClass1EG r1 = r2.A03;
        if (!r1.A09()) {
            r2.BOK(r1);
        }
        this.A06.A04.clear();
    }

    public final void BJx() {
        C29901Rs r2 = this.A06;
        r2.A01 = this;
        AnonymousClass1EG r1 = r2.A03;
        if (!r1.A09()) {
            r2.BOK(r1);
        }
        C29901Rs r22 = this.A06;
        r22.A04.add(this.A05);
        AnonymousClass1EG r12 = r22.A03;
        if (!r12.A09()) {
            r22.BOK(r12);
        }
    }

    public final void Bq1(Uri uri, Context context, int i) {
        if (i >= 0 && this.A00 != null) {
            if (this.A01 == null) {
                A00();
            }
            A01(i);
            this.A01.setImageURI(uri);
            C29901Rs r0 = this.A06;
            r0.A00 = i;
            AnonymousClass1EG r3 = r0.A03;
            r3.A06(C29901Rs.A08);
            r3.A06 = false;
            r3.A05(0.0d, true);
            r3.A03(1.0d);
        }
    }

    public final void Bq2(AnonymousClass1NJ r5, Context context, int i) {
        if (i >= 0 && !r5.AhP() && this.A00 != null) {
            if (this.A01 == null) {
                A00();
            }
            A01(i);
            this.A01.setUrl((ImageUrl) r5.A0S(context));
            C29901Rs r0 = this.A06;
            r0.A00 = i;
            AnonymousClass1EG r3 = r0.A03;
            r3.A06(C29901Rs.A08);
            r3.A06 = false;
            r3.A05(0.0d, true);
            r3.A03(1.0d);
        }
    }

    public C29871Rp(AnonymousClass1HD r3, AnonymousClass1D7 r4, AnonymousClass0C1 r5) {
        this.A03 = r3;
        this.A05 = r4;
        this.A04 = r5;
        this.A02 = r3.getResources().getDimensionPixelSize(C0003R.dimen.save_popout_margin_bottom);
    }

    public final void Ayk(View view) {
        this.A00 = (ViewStub) view.findViewById(C0003R.C0005id.save_popout_image_stub);
    }
}
