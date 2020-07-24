package p000X;

import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.p009ui.widget.textureview.ScalingTextureView;

/* renamed from: X.1ym  reason: invalid class name and case insensitive filesystem */
public abstract class C45911ym {
    public C45541y6 A00;
    public final int A01;

    public static C45911ym A00(C31841a5 r6, C45541y6 r7, C45681yK r8, float f, int i) {
        C45911ym r2;
        if (i >= 0) {
            View childAt = ((ViewGroup) r6).getChildAt(i);
            if (childAt instanceof SurfaceView) {
                r2 = new C199278fs(i, (SurfaceView) childAt);
            } else if (childAt instanceof ScalingTextureView) {
                r2 = new C45921yn(i, (ScalingTextureView) childAt);
            } else {
                throw new IllegalArgumentException("Video view needs to be either SurfaceView or ScalingTextureView");
            }
        } else {
            r2 = new C45921yn(0, new ScalingTextureView(r6.getContext()));
        }
        r2.A00 = r7;
        r2.A07(r8);
        r2.A05(f);
        View A03 = r2.A03();
        A03.measure(View.MeasureSpec.makeMeasureSpec(r6.getMeasuredWidth(), C25913Bc3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(r6.getMeasuredHeight(), C25913Bc3.MAX_SIGNED_POWER_OF_TWO));
        A03.layout(0, 0, A03.getMeasuredWidth(), A03.getMeasuredHeight());
        return r2;
    }

    public abstract Bitmap A01(int i);

    public abstract Surface A02();

    public abstract View A03();

    public abstract void A04();

    public abstract void A05(float f);

    public abstract void A06(int i, int i2);

    public abstract void A07(C45681yK r1);

    public abstract void A08(Object obj);

    public abstract boolean A09();

    public C45911ym(int i) {
        this.A01 = i;
    }
}
