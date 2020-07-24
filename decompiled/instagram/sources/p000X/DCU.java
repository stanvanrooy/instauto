package p000X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import java.util.Map;

/* renamed from: X.DCU */
public class DCU extends Drawable implements C28930Cp6, ValueAnimator.AnimatorUpdateListener {
    public int A00 = 0;
    public RectF A01;
    public DCV A02;
    public C29818DCc A03;
    public DCT A04;
    public C29819DCd A05;
    public boolean A06 = false;
    public float A07 = 1.0f;
    public float A08 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public boolean A09 = false;

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final C28930Cp6 A3M(Animator.AnimatorListener animatorListener) {
        this.A04.addListener(animatorListener);
        return this;
    }

    public final C28930Cp6 A57(boolean z) {
        this.A02.A01[0] = z;
        return this;
    }

    public final float ASz() {
        return this.A04.getAnimatedFraction();
    }

    public final C28944CpK Acn(String[] strArr, float f, float f2) {
        C28944CpK cpK;
        Map map = this.A02.A05;
        if (map != null) {
            for (String str : strArr) {
                List<C29820DCe> list = (List) map.get(str);
                if (list != null) {
                    for (C29820DCe dCe : list) {
                        RectF[] rectFArr = dCe.A0L.A06;
                        rectFArr[0].set(dCe.A0K);
                        RectF rectF = rectFArr[0];
                        RectF rectF2 = rectFArr[1];
                        dCe.A0I.mapRect(rectF2, rectF);
                        C29820DCe dCe2 = dCe.A0D;
                        if (dCe2 != null) {
                            dCe2.A0I.mapRect(rectF, rectF2);
                            C29820DCe dCe3 = dCe2.A0D;
                            if (dCe3 != null) {
                                rectF = C29820DCe.A02(dCe3, rectF, rectF2);
                            }
                            rectF2 = rectF;
                        }
                        if (rectF2.contains(f, f2)) {
                            cpK = new C28944CpK();
                            cpK.A00 = rectF2;
                            continue;
                        } else {
                            cpK = null;
                            continue;
                        }
                        if (cpK != null) {
                            cpK.A01 = str;
                            return cpK;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public final void BXF() {
        this.A04.start();
        this.A05.A02();
        this.A00 = 0;
        this.A06 = false;
    }

    public final void Bai() {
        this.A04.removeAllListeners();
    }

    public final C28930Cp6 Bbp(int i) {
        this.A04.setRepeatCount(i);
        return this;
    }

    public final C28930Cp6 Bez(float f) {
        float max;
        DCT dct = this.A04;
        float f2 = dct.A00;
        float f3 = dct.A05;
        boolean z = false;
        if (f2 < f3) {
            z = true;
        }
        if (z) {
            max = Math.min(f3, Math.max(f2, f));
        } else {
            max = Math.max(f3, Math.min(f2, f));
        }
        dct.setCurrentFraction(max);
        C29818DCc dCc = this.A03;
        if (dCc != null) {
            dCc.A05(dct.getAnimatedFraction(), 255.0f, this.A01);
            this.A08 = this.A04.getAnimatedFraction();
            invalidateSelf();
        }
        return this;
    }

    public final C28930Cp6 BuL(float f, float f2) {
        float max;
        DCT dct = this.A04;
        dct.A05 = f;
        dct.A00 = f2;
        boolean z = false;
        if (f2 < f) {
            z = true;
        }
        if (z) {
            max = Math.min(f, Math.max(f2, dct.A01));
        } else {
            max = Math.max(f, Math.min(f2, dct.A01));
        }
        dct.setCurrentFraction(max);
        Bez(dct.getAnimatedFraction());
        return this;
    }

    public final void draw(Canvas canvas) {
        if (this.A06) {
            BXF();
        } else {
            this.A00 = 0;
        }
        C29818DCc dCc = this.A03;
        if (dCc != null) {
            dCc.A09(canvas, this.A08);
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C29818DCc dCc = this.A03;
        if (dCc != null && this.A09) {
            int i = this.A00;
            if (i >= 5) {
                this.A04.pause();
                this.A05.A01();
                this.A06 = true;
                return;
            }
            this.A00 = i + 1;
            dCc.A05(this.A04.getAnimatedFraction(), 255.0f, this.A01);
            this.A08 = this.A04.getAnimatedFraction();
            invalidateSelf();
        }
    }

    public final void pause() {
        this.A04.pause();
        this.A05.A01();
        this.A00 = 0;
        this.A06 = false;
    }

    public final void stop() {
        this.A04.end();
        this.A00 = 0;
        this.A06 = false;
    }

    public DCU(C29819DCd dCd) {
        this.A05 = dCd;
        C29824DCi.A04(dCd);
        dCd.A00();
        DCV dcv = new DCV(dCd, (Map) null, (DEW) null, new boolean[1]);
        this.A02 = dcv;
        C29821DCf dCf = dcv.A03.A03;
        if (dCf != null) {
            this.A03 = new C29818DCc(dcv, dCf);
            DCS dcs = new DCS(this.A05.A00);
            this.A04 = dcs;
            dcs.addUpdateListener(this);
            this.A04.A09 = true;
            DDN ddn = dCd.A04;
            this.A01 = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, ddn.A01, ddn.A00);
            Bez(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            return;
        }
        throw new IllegalArgumentException("Cannot initialize layer tree with null root layer");
    }

    public final C28930Cp6 Bbq() {
        Bbp(Integer.MAX_VALUE);
        return this;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A01.set((float) i, (float) i2, (float) i3, (float) i4);
        if (this.A03 != null) {
            float min = Math.min(((float) getBounds().width()) / this.A05.A04.A01, ((float) getBounds().height()) / this.A05.A04.A00);
            this.A09 = true;
            if (this.A07 != min) {
                this.A07 = min;
                this.A03.A07(min, min);
                Bez(this.A04.getAnimatedFraction());
            }
        }
    }
}
