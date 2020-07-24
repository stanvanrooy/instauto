package p000X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.A7C */
public final class A7C {
    public float A00 = 1.0f;
    public float A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A02;
    public float A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A04 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A05;
    public float A06;
    public float A07;
    public float A08 = 5.0f;
    public int A09 = 255;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public Path A0E;
    public boolean A0F;
    public int[] A0G;
    public final Paint A0H = new Paint();
    public final Paint A0I = new Paint();
    public final Paint A0J = new Paint();
    public final RectF A0K = new RectF();

    public final void A00(int i) {
        this.A0C = i;
        this.A0D = this.A0G[i];
    }

    public A7C() {
        this.A0J.setStrokeCap(Paint.Cap.SQUARE);
        this.A0J.setAntiAlias(true);
        this.A0J.setStyle(Paint.Style.STROKE);
        this.A0H.setStyle(Paint.Style.FILL);
        this.A0H.setAntiAlias(true);
        this.A0I.setColor(0);
    }
}
