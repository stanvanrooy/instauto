package p000X;

import android.graphics.PointF;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.drawing.common.Point2;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: X.DME */
public final class DME {
    public static final PointF A09 = new Point2();
    public float A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A01 = 1.0f;
    public float A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A03 = 1.0f;
    public DMF A04;
    public float A05 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A06;
    public DMF A07;
    public final NavigableMap A08 = new TreeMap();

    public final void A00(int i, float[] fArr) {
        float f = ((float) i) * this.A03;
        if (f < this.A01 || f > this.A00) {
            Map.Entry floorEntry = this.A08.floorEntry(Float.valueOf(f));
            if (floorEntry == null) {
                this.A04 = null;
                this.A01 = 1.0f;
                this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                this.A04 = (DMF) floorEntry.getValue();
                float floatValue = ((Number) floorEntry.getKey()).floatValue();
                this.A01 = floatValue;
                this.A00 = floatValue + this.A04.A00();
            }
        }
        DMF dmf = this.A04;
        if (dmf != null) {
            dmf.A01((f - this.A01) / dmf.A00(), fArr);
        } else {
            this.A07.A01(1.0f, fArr);
        }
    }

    public final void A01(PointF pointF, PointF pointF2, float f) {
        DMF dmf = this.A07;
        if (dmf == null) {
            PointF pointF3 = A09;
            float f2 = pointF3.x;
            float[] fArr = {f2, f2, pointF2.x, pointF.x};
            float f3 = pointF3.y;
            this.A07 = new DMF(fArr, new float[]{f3, f3, pointF2.y, pointF.y});
            this.A06 = f;
            return;
        }
        float[] fArr2 = dmf.A02;
        float[] fArr3 = {fArr2[3], fArr2[2], pointF2.x, pointF.x};
        float[] fArr4 = dmf.A03;
        DMF dmf2 = new DMF(fArr3, new float[]{fArr4[3], fArr4[2], pointF2.y, pointF.y});
        this.A07 = dmf2;
        this.A08.put(Float.valueOf(this.A02), dmf2);
        this.A02 += this.A07.A00();
        this.A05 = f - this.A06;
    }
}
