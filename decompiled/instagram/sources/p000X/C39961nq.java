package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.io.Serializable;

/* renamed from: X.1nq  reason: invalid class name and case insensitive filesystem */
public final class C39961nq implements Serializable {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public final String toString() {
        return "WifiMinLowWaterMarkMs=" + this.A07 + ",WifiMaxLowWaterMarkMs=" + this.A06 + ",WifiLowWaterMarkMultiplier=" + this.A01 + ",WifiHighWaterMarkDeltaMs=" + this.A05 + ",CellMinLowWaterMarkMs=" + this.A04 + ",CellMaxLowWaterMarkMs=" + this.A03 + ",CellLowWaterMarkMultiplier=" + this.A00 + ",CellHighWaterMarkDeltaMs=" + this.A02 + ",WaterMarkLowMultipler=" + BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER + ",WaterMarkHighMultipler=" + BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER + ",WatermarkShortAdsMultiplier=" + BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER + ",WatermarkLongAdsMultiplier=" + BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public C39961nq(int i, int i2, float f, int i3, int i4, int i5, float f2, int i6) {
        this.A07 = i;
        this.A06 = i2;
        this.A01 = f;
        this.A05 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A00 = f2;
        this.A02 = i6;
    }
}
