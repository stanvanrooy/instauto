package com.instagram.video.player.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Timer;
import p000X.AnonymousClass0Z0;
import p000X.C23279AGc;

public class LiveVideoDebugStatsView extends View {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public Timer A07;
    public C23279AGc[] A08;
    public float A09;
    public Paint A0A;

    private void A00() {
        setWillNotDraw(false);
        this.A08 = new C23279AGc[100];
        this.A01 = 0;
        this.A00 = 0;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Paint paint = new Paint();
        this.A0A = paint;
        paint.setColor(-65536);
        this.A0A.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, displayMetrics));
        this.A0A.setStrokeCap(Paint.Cap.ROUND);
        this.A0A.setStrokeJoin(Paint.Join.ROUND);
        this.A09 = TypedValue.applyDimension(1, 16.0f, displayMetrics);
    }

    public long getPreferredTimePeriod() {
        return 100;
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int A032 = AnonymousClass0Z0.A03(1593692228);
        Canvas canvas2 = canvas;
        super.draw(canvas2);
        synchronized (this) {
            try {
                i = this.A00;
                i2 = this.A01;
                if (i2 < i) {
                    i2 += this.A08.length;
                }
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(896263821, A032);
                    throw th;
                }
            }
        }
        float width = ((float) getWidth()) - (this.A09 * 2.0f);
        long j = -1;
        int i5 = i;
        while (true) {
            i3 = i2 - 1;
            if (i5 >= i3) {
                break;
            }
            C23279AGc[] aGcArr = this.A08;
            C23279AGc aGc = aGcArr[i5 % aGcArr.length];
            if (aGc == null) {
                break;
            }
            long j2 = aGc.A03 - aGc.A02;
            if (j2 > j) {
                j = j2;
            }
            i5++;
        }
        if (j <= 0) {
            i4 = 1902306666;
        } else {
            C23279AGc[] aGcArr2 = this.A08;
            long j3 = aGcArr2[i3 % aGcArr2.length].A01 - aGcArr2[this.A00].A01;
            if (j3 <= 0) {
                j3 = 1;
            }
            for (int i6 = i; i6 < i2 - 2; i6++) {
                C23279AGc[] aGcArr3 = this.A08;
                int length = aGcArr3.length;
                int i7 = i6 % length;
                float f = this.A09;
                float f2 = (float) length;
                float f3 = f + ((((float) i7) * width) / f2);
                int i8 = (i7 + 1) % length;
                float f4 = f + ((((float) i8) * width) / f2);
                if (f4 > f3) {
                    C23279AGc aGc2 = aGcArr3[i];
                    C23279AGc aGc3 = aGcArr3[i7];
                    C23279AGc aGc4 = aGcArr3[i8];
                    int min = ((i6 - i) * 255) / Math.min(i2 - i, length);
                    if (i6 != i && aGc3.A04 > aGcArr3[((length + i6) - 1) % length].A04) {
                        A01(canvas2, f3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f3, (float) getHeight(), min, -3355444);
                    }
                    long j4 = aGc3.A01;
                    long j5 = aGc2.A01;
                    float f5 = (float) j3;
                    float f6 = f4;
                    int i9 = min;
                    A01(canvas2, f3, ((float) (j4 - j5)) / f5, f6, ((float) (aGc4.A01 - j5)) / f5, i9, -256);
                    float f7 = (float) j;
                    C23279AGc aGc5 = aGc4;
                    A01(canvas2, f3, ((float) (aGc3.A00 - aGc3.A02)) / f7, f6, ((float) (aGc5.A00 - aGc5.A02)) / f7, i9, -65536);
                    C23279AGc aGc6 = aGc4;
                    A01(canvas2, f3, ((float) (aGc3.A03 - aGc3.A00)) / f7, f6, ((float) (aGc6.A03 - aGc6.A00)) / f7, i9, Color.rgb(128, 0, 0));
                }
            }
            i4 = 1896146459;
        }
        AnonymousClass0Z0.A0A(i4, A032);
    }

    private void A01(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2) {
        float height = ((float) getHeight()) - (this.A09 * 2.0f);
        this.A0A.setColor(i2);
        this.A0A.setAlpha(i);
        Canvas canvas2 = canvas;
        canvas2.drawLine(f, (((float) getHeight()) - this.A09) - (f2 * height), f3, (((float) getHeight()) - this.A09) - (height * f4), this.A0A);
    }

    public LiveVideoDebugStatsView(Context context) {
        super(context);
        A00();
    }

    public LiveVideoDebugStatsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public LiveVideoDebugStatsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
