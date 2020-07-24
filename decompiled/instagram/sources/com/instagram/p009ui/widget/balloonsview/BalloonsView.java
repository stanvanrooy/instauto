package com.instagram.p009ui.widget.balloonsview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import p000X.AnonymousClass12C;
import p000X.AnonymousClass1GH;
import p000X.AnonymousClass5A0;
import p000X.C1185456y;
import p000X.C27181Gu;
import p000X.C699534h;

/* renamed from: com.instagram.ui.widget.balloonsview.BalloonsView */
public class BalloonsView extends View {
    public static final Random A0A = new Random();
    public float A00;
    public long A01;
    public Paint A02;
    public RectF A03 = new RectF();
    public C699534h A04;
    public boolean A05;
    public int A06;
    public int A07;
    public List A08;
    public final List A09 = Collections.synchronizedList(new ArrayList());

    private void A00() {
        this.A02 = new Paint(1);
        Context context = getContext();
        this.A06 = context.getResources().getDimensionPixelSize(C0003R.dimen.balloon_oscillation_width);
        getContext();
        this.A07 = context.getResources().getDimensionPixelSize(C0003R.dimen.balloon_y_start_range);
        A01(this);
    }

    public static void A01(BalloonsView balloonsView) {
        balloonsView.A08 = new ArrayList();
        for (int i = 0; i < 24; i++) {
            balloonsView.A08.add(new AnonymousClass5A0(balloonsView.A06));
        }
    }

    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        if (this.A05) {
            Canvas canvas2 = canvas;
            int height = canvas2.getHeight();
            this.A00 = (float) (getWidth() >> 3);
            boolean z = false;
            for (int i2 = 0; i2 < this.A08.size(); i2++) {
                AnonymousClass5A0 r0 = (AnonymousClass5A0) this.A08.get(i2);
                if (r0.A07 == null) {
                    List list = this.A09;
                    r0.A07 = (Bitmap) list.get(A0A.nextInt(list.size()));
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.A01;
                if (elapsedRealtime >= 0) {
                    float f2 = (float) elapsedRealtime;
                    float f3 = r0.A02;
                    if (f2 < f3) {
                        float f4 = f2 / f3;
                        float height2 = (((float) (height - (r0.A07.getHeight() >> 1))) - ((f4 * ((float) height)) * 0.5f)) + ((float) (r0.A01 * ((double) this.A07)));
                        double d = r0.A00;
                        float f5 = this.A00;
                        float f6 = ((float) (d * ((double) f5))) + (f5 * ((float) (i2 % 8))) + ((float) r0.A06);
                        double d2 = (double) f4;
                        double sin = (double) ((float) ((Math.sin((((double) (r0.A04 * 6.0f)) * 3.141592653589793d) * d2) + 1.0d) / 2.0d));
                        int i3 = r0.A05;
                        float A012 = f6 + ((float) C27181Gu.A01(sin, 0.0d, 1.0d, (double) (-i3), (double) i3));
                        float width = (float) (r0.A07.getWidth() >> 1);
                        if (f4 > 0.9f) {
                            f = (float) (((double) r0.A03) * C27181Gu.A01(d2, 0.8999999761581421d, 1.0d, 1.0d, 1.5d));
                        } else {
                            f = r0.A03;
                        }
                        float f7 = width * f;
                        Bitmap bitmap = r0.A07;
                        if (f4 > 0.9f) {
                            i = (int) C27181Gu.A01(d2, 0.8999999761581421d, 1.0d, 255.0d, 0.0d);
                        } else {
                            i = 255;
                        }
                        RectF rectF = this.A03;
                        rectF.left = A012 - f7;
                        rectF.right = A012 + f7;
                        rectF.top = height2 - f7;
                        rectF.bottom = height2 + f7;
                        this.A02.setAlpha(i);
                        canvas2.drawBitmap(bitmap, (Rect) null, this.A03, this.A02);
                        z = true;
                    }
                }
            }
            if (z) {
                postInvalidateOnAnimation();
                return;
            }
            C699534h r02 = this.A04;
            if (r02 != null) {
                r02.BH4();
            }
            A01(this);
            this.A09.clear();
            this.A05 = false;
        }
    }

    public final void A02(String str) {
        List<String> singletonList = Collections.singletonList(str);
        if (!this.A05) {
            for (String simpleImageUrl : singletonList) {
                AnonymousClass1GH A0C = AnonymousClass12C.A0c.A0C(new SimpleImageUrl(simpleImageUrl));
                A0C.A02(new C1185456y(this, singletonList));
                A0C.A01();
            }
        }
    }

    public void setAnimationListener(C699534h r1) {
        this.A04 = r1;
    }

    public BalloonsView(Context context) {
        super(context);
        A00();
    }

    public BalloonsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public BalloonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
