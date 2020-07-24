package p000X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import java.util.Map;

/* renamed from: X.DCY */
public final class DCY extends Drawable implements C28930Cp6, ValueAnimator.AnimatorUpdateListener {
    public int A00 = 0;
    public C29835DCw A01;
    public C29840DDb A02;
    public DCX A03;
    public boolean A04 = false;
    public float A05 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public C29826DCk A06;
    public boolean A07 = false;

    public final C28944CpK Acn(String[] strArr, float f, float f2) {
        List<C29841DDc> list;
        C28944CpK cpK;
        for (String str : strArr) {
            Map map = this.A02.A0E;
            if (map == null) {
                list = null;
            } else {
                list = (List) map.get(str);
            }
            if (list != null) {
                for (C29841DDc dDc : list) {
                    if (!dDc.A0A.contains(f, f2)) {
                        cpK = null;
                        continue;
                    } else {
                        cpK = new C28944CpK();
                        cpK.A00 = dDc.A0A;
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
        return null;
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private void A00() {
        float animatedFraction = this.A03.getAnimatedFraction();
        this.A05 = animatedFraction;
        this.A06.A06(animatedFraction, (Matrix) null, 255.0f);
        this.A06.A03();
        invalidateSelf();
    }

    public final C28930Cp6 A3M(Animator.AnimatorListener animatorListener) {
        this.A03.addListener(animatorListener);
        return this;
    }

    public final C28930Cp6 A57(boolean z) {
        this.A02.A05 = z;
        this.A06.A00 = null;
        return this;
    }

    public final float ASz() {
        return this.A03.getAnimatedFraction();
    }

    public final void BXF() {
        this.A03.start();
        this.A00 = 0;
        this.A04 = false;
    }

    public final void Bai() {
        this.A03.removeAllListeners();
    }

    public final C28930Cp6 Bbp(int i) {
        this.A03.setRepeatCount(i);
        return this;
    }

    public final C28930Cp6 Bez(float f) {
        float max;
        DCX dcx = this.A03;
        float f2 = dcx.A00;
        float f3 = dcx.A05;
        boolean z = false;
        if (f2 < f3) {
            z = true;
        }
        if (z) {
            max = Math.min(f3, Math.max(f2, f));
        } else {
            max = Math.max(f3, Math.min(f2, f));
        }
        dcx.setCurrentFraction(max);
        A00();
        return this;
    }

    public final C28930Cp6 BuL(float f, float f2) {
        float max;
        DCX dcx = this.A03;
        dcx.A05 = f;
        dcx.A00 = f2;
        boolean z = false;
        if (f2 < f) {
            z = true;
        }
        if (z) {
            max = Math.min(f, Math.max(f2, dcx.A01));
        } else {
            max = Math.max(f, Math.min(f2, dcx.A01));
        }
        dcx.setCurrentFraction(max);
        Bez(dcx.getAnimatedFraction());
        return this;
    }

    public final void draw(Canvas canvas) {
        if (this.A04) {
            BXF();
        } else {
            this.A00 = 0;
        }
        this.A06.A08(canvas, this.A05);
    }

    public final int getIntrinsicHeight() {
        return (int) this.A02.A0D.A03.A00;
    }

    public final int getIntrinsicWidth() {
        return (int) this.A02.A0D.A03.A01;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A07) {
            int i = this.A00;
            if (i >= 5) {
                this.A03.pause();
                this.A04 = true;
                return;
            }
            this.A00 = i + 1;
            A00();
        }
    }

    public final void pause() {
        this.A03.pause();
        this.A00 = 0;
        this.A04 = false;
    }

    public final void stop() {
        this.A03.end();
        this.A00 = 0;
        this.A04 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r3 > r1.A00) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026 A[LOOP:0: B:1:0x0012->B:11:0x0026, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0058 A[SYNTHETIC] */
    public DCY(C29835DCw dCw) {
        boolean z;
        this.A01 = dCw;
        byte[] bArr = dCw.A03;
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i] & 255;
            if (i >= 0 && b >= 0 && b <= 255) {
                if (b == 0) {
                    z = true;
                } else {
                    if (C29873DEi.A00 == null) {
                        C29873DEi.A00 = new DDR();
                    }
                    switch (i) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case C120125Dh.VIEW_TYPE_BANNER:
                        case C120125Dh.VIEW_TYPE_SPINNER:
                        case C120125Dh.VIEW_TYPE_BADGE:
                        case C120125Dh.VIEW_TYPE_LINK:
                        case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                        case 18:
                        case 19:
                        case 20:
                        case C120125Dh.VIEW_TYPE_BRANDING:
                            C29873DEi.A00.A00(1, 1);
                            break;
                        case 4:
                        case 15:
                            C29873DEi.A00.A00(1, 2);
                            break;
                        default:
                            C29873DEi.A00.A00(0, 0);
                            break;
                    }
                    DDR ddr = C29873DEi.A00;
                    if (b >= ddr.A01) {
                        z = true;
                    }
                }
                if (!z) {
                    i++;
                } else {
                    throw new IllegalArgumentException(AnonymousClass000.A08("capability ", i, " version ", b, " is unsupported"));
                }
            }
            z = false;
            if (!z) {
            }
        }
        C29840DDb dDb = new C29840DDb(dCw);
        this.A02 = dDb;
        DDK ddk = dDb.A0D;
        C29826DCk dCk = new C29826DCk(dDb, ddk.A02);
        C29867DEc dEc = ddk.A03;
        dCk.A00 = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, dEc.A01, dEc.A00);
        this.A06 = dCk;
        C29816DCa dCa = new C29816DCa(this.A02);
        this.A03 = dCa;
        dCa.addUpdateListener(this);
        this.A03.A09 = true;
        Bez(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final C28930Cp6 Bbq() {
        Bbp(Integer.MAX_VALUE);
        return this;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A02.A0B.set((float) i, (float) i2, (float) i3, (float) i4);
        C29840DDb dDb = this.A02;
        float min = Math.min(((float) getBounds().width()) / this.A02.A0D.A03.A01, ((float) getBounds().height()) / dDb.A0D.A03.A00);
        this.A07 = true;
        if (dDb.A00 != min) {
            dDb.A00 = min;
            this.A06.A04();
            Bez(this.A03.getAnimatedFraction());
        }
    }
}
