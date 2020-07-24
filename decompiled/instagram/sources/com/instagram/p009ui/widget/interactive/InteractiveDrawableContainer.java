package com.instagram.p009ui.widget.interactive;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass7OZ;
import p000X.AnonymousClass7RZ;
import p000X.AnonymousClass7TQ;
import p000X.AnonymousClass7TR;
import p000X.AnonymousClass7TT;
import p000X.AnonymousClass7TZ;
import p000X.C170007Or;
import p000X.C170017Os;
import p000X.C172117Xf;
import p000X.C173147aY;
import p000X.C22550yc;
import p000X.C26571Ea;
import p000X.C28261La;
import p000X.C79743dy;
import p000X.C80543fL;
import p000X.C83183jc;
import p000X.C84383lZ;
import p000X.C84393la;
import p000X.C86053oO;
import p000X.C86063oP;
import p000X.C87173qI;
import p000X.C87273qS;

/* renamed from: com.instagram.ui.widget.interactive.InteractiveDrawableContainer */
public class InteractiveDrawableContainer extends FrameLayout implements C79743dy, GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener {
    public static final AnonymousClass1EA A0n = AnonymousClass1EA.A01(80.0d, 9.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public C83183jc A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public float A0F;
    public float A0G;
    public long A0H;
    public long A0I;
    public PointF A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final Matrix A0R;
    public final Matrix A0S;
    public final Rect A0T;
    public final Rect A0U;
    public final View A0V;
    public final View A0W;
    public final View A0X;
    public final C84393la A0Y;
    public final C86053oO A0Z;
    public final List A0a;
    public final List A0b;
    public final Set A0c;
    public final Path A0d;
    public final PointF A0e;
    public final PointF A0f;
    public final RectF A0g;
    public final GestureDetector A0h;
    public final GestureDetector A0i;
    public final ScaleGestureDetector A0j;
    public final AnonymousClass1EG A0k;
    public final AnonymousClass1E8 A0l;
    public final C87273qS A0m;

    public static AnonymousClass7TQ getActiveDrawable(InteractiveDrawableContainer interactiveDrawableContainer) {
        AnonymousClass7TQ r3 = null;
        int i = 0;
        for (int i2 = 0; i2 < interactiveDrawableContainer.A0a.size(); i2++) {
            AnonymousClass7TQ r1 = (AnonymousClass7TQ) interactiveDrawableContainer.A0a.get(i2);
            int i3 = r1.A08;
            if (i3 >= i) {
                r3 = r1;
                i = i3;
            }
        }
        return r3;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.A0M = true;
        this.A0A = false;
        this.A07 = false;
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public void setFrameTimeInMs(int i) {
        for (int i2 = 0; i2 < this.A0a.size(); i2++) {
            Drawable drawable = ((AnonymousClass7TQ) this.A0a.get(i2)).A0V;
            if (drawable instanceof C173147aY) {
                ((C173147aY) drawable).Bhd(i);
            }
        }
        invalidate();
    }

    public static AnonymousClass7TQ A00(InteractiveDrawableContainer interactiveDrawableContainer, int i) {
        for (AnonymousClass7TQ r1 : interactiveDrawableContainer.A0a) {
            if (r1.A0Q == i) {
                return r1;
            }
        }
        return null;
    }

    public static AnonymousClass7TQ A01(InteractiveDrawableContainer interactiveDrawableContainer, Drawable drawable) {
        for (AnonymousClass7TQ r1 : interactiveDrawableContainer.A0a) {
            if (r1.A0V == drawable) {
                return r1;
            }
        }
        return null;
    }

    public static void A03(AnonymousClass7TQ r1, AnonymousClass7TR r2) {
        if (r1 != null) {
            r1.A09(r2.A06);
            r1.A06(r2.A01);
            r1.A07(r2.A02);
            r1.A08(r2.A05);
        }
    }

    public static void A04(InteractiveDrawableContainer interactiveDrawableContainer) {
        interactiveDrawableContainer.A0W.setScaleX(1.0f);
        interactiveDrawableContainer.A0W.setScaleY(1.0f);
        interactiveDrawableContainer.A0V.setVisibility(8);
        if (interactiveDrawableContainer.A0k.A00() > 0.0d) {
            AnonymousClass7TQ activeDrawable = getActiveDrawable(interactiveDrawableContainer);
            interactiveDrawableContainer.A0a.remove(activeDrawable);
            interactiveDrawableContainer.invalidate();
            if (activeDrawable != null) {
                for (C80543fL BID : interactiveDrawableContainer.A0c) {
                    BID.BID(activeDrawable.A0Q, activeDrawable.A0V, true);
                }
            }
            AnonymousClass1EG r3 = interactiveDrawableContainer.A0k;
            r3.A08(interactiveDrawableContainer.A0l);
            r3.A05(0.0d, true);
        }
        for (C80543fL BS7 : interactiveDrawableContainer.A0c) {
            BS7.BS7();
        }
    }

    public static void A05(InteractiveDrawableContainer interactiveDrawableContainer, AnonymousClass7TQ r3) {
        r3.A0B = interactiveDrawableContainer.A0Z;
        if (!interactiveDrawableContainer.A08 || !interactiveDrawableContainer.A0Y.A0D) {
            interactiveDrawableContainer.A08 = true;
            C172117Xf r1 = new C172117Xf(interactiveDrawableContainer);
            if (interactiveDrawableContainer.isLaidOut()) {
                r1.run();
            } else {
                interactiveDrawableContainer.A0b.add(r1);
            }
        }
        r3.A0C(false);
        interactiveDrawableContainer.A0a.add(r3);
    }

    public static void A06(InteractiveDrawableContainer interactiveDrawableContainer, AnonymousClass7TQ r6) {
        if (r6 != null) {
            if (r6 == getActiveDrawable(interactiveDrawableContainer)) {
                if (interactiveDrawableContainer.A0K) {
                    interactiveDrawableContainer.A0N = true;
                    return;
                } else if (interactiveDrawableContainer.A0k.A01 == 1.0d) {
                    return;
                }
            }
            interactiveDrawableContainer.A0a.remove(r6);
            interactiveDrawableContainer.invalidate();
            for (C80543fL BID : interactiveDrawableContainer.A0c) {
                BID.BID(r6.A0Q, r6.A0V, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e2, code lost:
        if (r2.contains(r8, r3) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r4.A0F == false) goto L_0x0024;
     */
    private boolean A07(float f, float f2) {
        boolean z;
        char c;
        AnonymousClass7TQ r5 = null;
        for (int size = this.A0a.size() - 1; size >= 0; size--) {
            AnonymousClass7TQ r4 = (AnonymousClass7TQ) this.A0a.get(size);
            if (r4.A0V.isVisible()) {
                if (r4.A0G) {
                    z = true;
                }
                z = false;
                if (z) {
                    r4.A0S.reset();
                    Matrix matrix = r4.A0S;
                    float f3 = r4.A06 * r4.A00;
                    matrix.preScale(f3, f3, r4.A03(), r4.A04());
                    r4.A0S.preTranslate(r4.A03, r4.A04);
                    r4.A0U.set(r4.A0V.getBounds());
                    Matrix matrix2 = r4.A0S;
                    RectF rectF = r4.A0U;
                    matrix2.mapRect(rectF, rectF);
                    float[] fArr = r4.A0X;
                    fArr[0] = f;
                    fArr[1] = f2;
                    r4.A0S.reset();
                    r4.A0S.preRotate(-r4.A05, r4.A03(), r4.A04());
                    r4.A0S.mapPoints(r4.A0X);
                    float[] fArr2 = r4.A0X;
                    float f4 = fArr2[0];
                    float f5 = fArr2[1];
                    if (r4.A0U.contains(f4, f5)) {
                        c = 0;
                    } else {
                        r4.A0U.inset(-Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (((float) r4.A0P) - r4.A0U.width()) / 2.0f), -Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (((float) r4.A0P) - r4.A0U.height()) / 2.0f));
                        if (!r4.A0U.contains(f4, f5)) {
                            Drawable drawable = r4.A0V;
                            if (drawable instanceof AnonymousClass7OZ) {
                                RectF rectF2 = r4.A0U;
                                AnonymousClass7OZ r1 = (AnonymousClass7OZ) drawable;
                                int max = Math.max(0, r1.AXl());
                                switch (r1.AXm().intValue()) {
                                    case 0:
                                        break;
                                    case 1:
                                        rectF2.bottom += (float) max;
                                        break;
                                }
                                rectF2.top -= (float) max;
                            }
                            c = 65535;
                        }
                        c = 1;
                    }
                    if (c == 0) {
                        setActiveDrawable(r4);
                        return true;
                    } else if (c == 1 && r5 == null) {
                        r5 = r4;
                    }
                } else {
                    continue;
                }
            }
        }
        if (r5 == null) {
            return false;
        }
        setActiveDrawable(r5);
        return true;
    }

    private boolean A08(MotionEvent motionEvent) {
        if (!this.A0c.isEmpty()) {
            AnonymousClass7TQ activeDrawable = getActiveDrawable(this);
            AnonymousClass0a4.A06(activeDrawable);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            activeDrawable.A0A(this.A0S);
            this.A0S.invert(this.A0R);
            float[] fArr = {x, y};
            this.A0R.mapPoints(fArr);
            for (C80543fL r4 : this.A0c) {
                if (this.A0L) {
                    r4.BNf(activeDrawable.A0Q, activeDrawable.A0V, fArr[0], fArr[1]);
                } else {
                    r4.BNg(activeDrawable.A0Q, activeDrawable.A0V, fArr[0], fArr[1]);
                }
            }
        }
        return true;
    }

    public final int A09(Drawable drawable, C87173qI r13) {
        AnonymousClass7TQ r3 = new AnonymousClass7TQ(drawable, getContext(), getMaxZ() + 1);
        C86053oO r0 = this.A0Z;
        if (r0 != null) {
            r3.A0B = r0;
        }
        if (r13 != null) {
            AnonymousClass0a4.A06(r13);
            A02(r3, r13);
            if (r13.A0A) {
                AnonymousClass1EG r5 = r3.A0W;
                r5.A05(0.949999988079071d, true);
                r5.A03(1.0d);
            }
            if (r13.A0H) {
                Drawable drawable2 = r3.A0V;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(drawable2, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("alpha", new int[]{0, 255})});
                ofPropertyValuesHolder.setTarget(drawable2);
                ofPropertyValuesHolder.setDuration((long) 150);
                ofPropertyValuesHolder.start();
            }
            AnonymousClass7TT r1 = r13.A06;
            if (r1 != null) {
                r3.A0A = r1;
                r1.B7R(r3.A0Q);
            }
            C170017Os r2 = r13.A05;
            if (r2 == null) {
                r2 = new C170007Or(17);
            }
            AnonymousClass7RZ r12 = new AnonymousClass7RZ(this, r2, drawable, r3);
            if (isLaidOut()) {
                r12.run();
            } else {
                this.A0b.add(r12);
            }
        }
        A05(this, r3);
        Collections.sort(this.A0a);
        invalidate();
        return r3.A0Q;
    }

    public final List A0D(C28261La r5) {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass7TQ r0 : this.A0a) {
            Drawable drawable = r0.A0V;
            if (r5.apply(drawable)) {
                arrayList.add(drawable);
            }
        }
        return arrayList;
    }

    public final List A0E(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass7TQ r0 : this.A0a) {
            Drawable drawable = r0.A0V;
            if (cls.isInstance(drawable)) {
                arrayList.add(cls.cast(drawable));
            }
        }
        return arrayList;
    }

    public final Map A0F(Class cls) {
        HashMap hashMap = new HashMap();
        for (AnonymousClass7TQ r2 : this.A0a) {
            Drawable drawable = r2.A0V;
            if (cls.isInstance(drawable)) {
                hashMap.put(cls.cast(drawable), new AnonymousClass7TR(r2));
            }
        }
        return hashMap;
    }

    public final void A0J(Drawable drawable) {
        AnonymousClass7TQ r1;
        Iterator it = this.A0a.iterator();
        while (true) {
            if (!it.hasNext()) {
                r1 = null;
                break;
            }
            r1 = (AnonymousClass7TQ) it.next();
            if (r1.A0V == drawable) {
                break;
            }
        }
        A06(this, r1);
    }

    public final void A0N(Drawable drawable, boolean z) {
        for (AnonymousClass7TQ r1 : this.A0a) {
            if (r1.A0V == drawable) {
                A0H(r1.A0Q, z);
                return;
            }
        }
    }

    public final void A0O(C22550yc r3) {
        for (AnonymousClass7TQ r0 : this.A0a) {
            r3.apply(Integer.valueOf(r0.A0Q));
        }
    }

    public final boolean BKN(C87273qS r18) {
        if (!this.A0K) {
            return true;
        }
        AnonymousClass7TQ activeDrawable = getActiveDrawable(this);
        C87273qS r2 = r18;
        float f = -((float) Math.toDegrees(Math.atan2((double) r2.A03, (double) r2.A02) - Math.atan2((double) r2.A01, (double) r2.A00)));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        float f2 = activeDrawable.A05;
        activeDrawable.A0B(this.A0d, this.A0g);
        activeDrawable.A08(this.A0Y.A00(this.A0g.centerX(), this.A0g.centerY(), f / ((float) (elapsedRealtime - this.A0H)), f2, f));
        this.A0H = elapsedRealtime;
        return true;
    }

    public int getDrawableCount() {
        return this.A0a.size();
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (!this.A0c.isEmpty()) {
            AnonymousClass7TQ activeDrawable = getActiveDrawable(this);
            if (this.A0K && activeDrawable != null) {
                for (C80543fL BA4 : this.A0c) {
                    BA4.BA4(activeDrawable.A0Q, activeDrawable.A0V);
                }
            }
        }
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0K) {
            PointF pointF = this.A0e;
            PointF pointF2 = this.A0f;
            pointF.x = pointF2.x;
            pointF.y = pointF2.y;
            pointF2.x = scaleGestureDetector.getFocusX();
            this.A0f.y = scaleGestureDetector.getFocusY();
            AnonymousClass7TQ activeDrawable = getActiveDrawable(this);
            activeDrawable.A09(activeDrawable.A06 * scaleGestureDetector.getScaleFactor());
            Iterator it = this.A0c.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0227, code lost:
        if (r0.A0K != false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0267, code lost:
        if (r0.A0E != false) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011f, code lost:
        if (r2 != false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        if (r0.A0F != false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a7, code lost:
        if (r0.A0H != false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e7, code lost:
        if (r0.A0I != false) goto L_0x01e9;
     */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        double d;
        boolean z2;
        double d2;
        boolean z3;
        double d3;
        boolean z4;
        double d4;
        boolean z5;
        double d5;
        boolean z6;
        double d6;
        float f3 = f;
        float f4 = f2;
        if (this.A0M) {
            this.A0M = false;
            return true;
        } else if (!this.A0K) {
            return true;
        } else {
            AnonymousClass7TQ activeDrawable = getActiveDrawable(this);
            AnonymousClass0a4.A06(activeDrawable);
            if (this.A0j.isInProgress()) {
                PointF pointF = this.A0e;
                float f5 = pointF.x;
                PointF pointF2 = this.A0f;
                f3 = f5 - pointF2.x;
                f4 = pointF.y - pointF2.y;
            }
            if (this.A0k.A00() > 0.0d) {
                this.A02 -= f3;
                this.A03 -= f4;
            } else {
                float eventTime = (float) (motionEvent2.getEventTime() - this.A0I);
                float x = motionEvent2.getX();
                float y = motionEvent2.getY();
                float f6 = (x - this.A0F) / eventTime;
                float f7 = (y - this.A0G) / eventTime;
                activeDrawable.A0B(this.A0d, this.A0g);
                PointF pointF3 = this.A0J;
                boolean z7 = activeDrawable.A0I;
                float f8 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f9 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (z7) {
                    f9 = -f3;
                }
                pointF3.x = f9;
                if (activeDrawable.A0K) {
                    f8 = -f4;
                }
                pointF3.y = f8;
                C84393la r0 = this.A0Y;
                RectF rectF = this.A0g;
                boolean A052 = r0.A05();
                float f10 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f11 = f9;
                if (A052) {
                    f11 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                }
                pointF3.x = f11;
                float f12 = f8;
                if (r0.A04()) {
                    f12 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                }
                pointF3.y = f12;
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                boolean z8 = r0.A0G;
                float f13 = f9;
                if (z8) {
                    f13 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                }
                float f14 = f13 + centerX;
                if (!r0.A0F) {
                    f10 = f8;
                }
                float f15 = f10 + centerY;
                float f16 = rectF.left;
                float f17 = rectF.right;
                float f18 = f17;
                float f19 = f16 + f9;
                float f20 = f17 + f9;
                float f21 = rectF.top;
                float f22 = f21;
                float f23 = rectF.bottom;
                float f24 = f21 + f8;
                float f25 = f23 + f8;
                boolean A053 = r0.A05();
                boolean A042 = r0.A04();
                float f26 = r0.A01;
                if (r0.A05()) {
                    z = false;
                }
                z = true;
                boolean z9 = false;
                if (Math.abs(r0.A04 - x) < 75.0f) {
                    z9 = true;
                }
                float abs = Math.abs(f6);
                boolean z10 = false;
                if (abs < 0.5f) {
                    z10 = true;
                }
                boolean A002 = AnonymousClass7TZ.A00(f26, centerX, f14, z, z8, z9, z10);
                r0.A0G = A002;
                AnonymousClass1EG r6 = r0.A0P;
                if (A002) {
                    d = 1.0d;
                } else {
                    d = 0.0d;
                }
                r6.A03(d);
                float f27 = r0.A02;
                if (r0.A04()) {
                    z2 = false;
                }
                z2 = true;
                boolean z11 = r0.A0F;
                boolean z12 = false;
                if (Math.abs(r0.A05 - y) < 75.0f) {
                    z12 = true;
                }
                float abs2 = Math.abs(f7);
                boolean z13 = false;
                if (abs2 < 0.5f) {
                    z13 = true;
                }
                boolean A003 = AnonymousClass7TZ.A00(f27, centerY, f15, z2, z11, z12, z13);
                r0.A0F = A003;
                AnonymousClass1EG r62 = r0.A0O;
                if (A003) {
                    d2 = 1.0d;
                } else {
                    d2 = 0.0d;
                }
                r62.A03(d2);
                float f28 = r0.A03;
                if (r0.A05()) {
                    z3 = false;
                }
                z3 = true;
                boolean z14 = r0.A0H;
                boolean z15 = false;
                if (Math.abs(r0.A04 - x) < 75.0f) {
                    z15 = true;
                }
                boolean z16 = false;
                if (abs < 0.5f) {
                    z16 = true;
                }
                boolean A004 = AnonymousClass7TZ.A00(f28, f16, f19, z3, z14, z15, z16);
                r0.A0H = A004;
                AnonymousClass1EG r63 = r0.A0Q;
                if (A004) {
                    d3 = 1.0d;
                } else {
                    d3 = 0.0d;
                }
                r63.A03(d3);
                float f29 = r0.A06;
                if (r0.A05()) {
                    z4 = false;
                }
                z4 = true;
                boolean z17 = r0.A0I;
                boolean z18 = false;
                if (Math.abs(r0.A04 - x) < 75.0f) {
                    z18 = true;
                }
                boolean z19 = false;
                if (abs < 0.5f) {
                    z19 = true;
                }
                boolean A005 = AnonymousClass7TZ.A00(f29, f18, f20, z4, z17, z18, z19);
                r0.A0I = A005;
                AnonymousClass1EG r64 = r0.A0R;
                if (A005) {
                    d4 = 1.0d;
                } else {
                    d4 = 0.0d;
                }
                r64.A03(d4);
                float f30 = r0.A07;
                if (r0.A04()) {
                    z5 = false;
                }
                z5 = true;
                boolean z20 = r0.A0K;
                boolean z21 = false;
                if (Math.abs(r0.A05 - y) < 75.0f) {
                    z21 = true;
                }
                boolean z22 = false;
                if (abs2 < 0.5f) {
                    z22 = true;
                }
                boolean A006 = AnonymousClass7TZ.A00(f30, f22, f24, z5, z20, z21, z22);
                r0.A0K = A006;
                AnonymousClass1EG r65 = r0.A0T;
                if (A006) {
                    d5 = 1.0d;
                } else {
                    d5 = 0.0d;
                }
                r65.A03(d5);
                float f31 = r0.A00;
                if (r0.A04()) {
                    z6 = false;
                }
                z6 = true;
                boolean z23 = r0.A0E;
                boolean z24 = false;
                if (Math.abs(r0.A05 - y) < 75.0f) {
                    z24 = true;
                }
                boolean z25 = false;
                if (abs2 < 0.5f) {
                    z25 = true;
                }
                boolean A007 = AnonymousClass7TZ.A00(f31, f23, f25, z6, z23, z24, z25);
                r0.A0E = A007;
                AnonymousClass1EG r66 = r0.A0N;
                if (A007) {
                    d6 = 1.0d;
                } else {
                    d6 = 0.0d;
                }
                r66.A03(d6);
                AnonymousClass1EG r15 = r0.A0A;
                if (r15 != null) {
                    double d7 = 1.0d;
                    if (f22 > r0.A07 && r0.A0T.A01 != 1.0d) {
                        d7 = 0.0d;
                    }
                    r15.A03(d7);
                }
                AnonymousClass1EG r152 = r0.A09;
                if (r152 != null) {
                    double d8 = 1.0d;
                    if (f23 < r0.A00 && r0.A0N.A01 != 1.0d) {
                        d8 = 0.0d;
                    }
                    r152.A03(d8);
                }
                if (r0.A0G) {
                    pointF3.x = r0.A01 - centerX;
                } else if (r0.A0H) {
                    pointF3.x = r0.A03 - f16;
                } else if (r0.A0I) {
                    pointF3.x = r0.A06 - f18;
                }
                if (r0.A0F) {
                    pointF3.y = r0.A02 - centerY;
                } else if (r0.A0K) {
                    pointF3.y = r0.A07 - f22;
                } else if (r0.A0E) {
                    pointF3.y = r0.A00 - f23;
                }
                if (!A053 && r0.A05()) {
                    r0.A04 = x;
                } else if (A053 && !r0.A05()) {
                    pointF3.x = f9;
                }
                if (!A042 && r0.A04()) {
                    r0.A05 = y;
                } else if (A042 && !r0.A04()) {
                    pointF3.y = f8;
                }
                C84393la r9 = this.A0Y;
                float centerX2 = this.A0g.centerX();
                float centerY2 = this.A0g.centerY();
                if (r9.A0S.A01 > 0.0d) {
                    PointF pointF4 = r9.A0a.A07;
                    pointF4.x = centerX2;
                    pointF4.y = centerY2;
                }
                activeDrawable.A06(activeDrawable.A03 + this.A0J.x);
                activeDrawable.A07(activeDrawable.A04 + this.A0J.y);
            }
            if (this.A0C) {
                if (motionEvent2.getPointerCount() > 1) {
                    this.A0V.setVisibility(8);
                } else if (activeDrawable.A0M) {
                    int i = 0;
                    this.A0V.setVisibility(0);
                    View view = this.A0X;
                    if (!this.A0D) {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
            }
            activeDrawable.A05();
            for (C80543fL BLE : this.A0c) {
                BLE.BLE(activeDrawable.A0V, f3, f4);
            }
            this.A0F = motionEvent2.getX();
            this.A0G = motionEvent2.getY();
            this.A0I = motionEvent2.getEventTime();
            this.A0A = true;
            return true;
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A0E) {
            return A08(motionEvent);
        }
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.A0L = this.A0K;
        if (!this.A0E) {
            return A08(motionEvent);
        }
        return false;
    }

    public void setAlignmentGuideHeader(C26571Ea r6) {
        View view;
        C84393la r4 = this.A0Y;
        C26571Ea r1 = r4.A0C;
        if (r1 != null) {
            if (r1.A04()) {
                view = r1.A01();
            } else {
                view = r1.A00;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        r4.A0C = r6;
        AnonymousClass1EG A002 = r4.A0U.A00();
        A002.A07(r4);
        A002.A06 = true;
        A002.A06(C84393la.A0c);
        A002.A05(0.0d, true);
        r4.A0A = A002;
        r4.A0D = false;
        r4.A0M.setEmpty();
        addView(r6.A00);
    }

    public void setLongPressEnabled(boolean z) {
        this.A0i.setIsLongpressEnabled(z);
    }

    public static void A02(AnonymousClass7TQ r3, C87173qI r4) {
        AnonymousClass0a4.A06(r3);
        AnonymousClass0a4.A06(r4);
        r3.A0D = r4;
        r3.A0C = r4.A07;
        r3.A0M = r4.A0J;
        r3.A0L = r4.A0I;
        r3.A0E = r4.A0B;
        r3.A0G = r4.A0K;
        r3.A0J = r4.A0E;
        r3.A0I = r4.A0D;
        r3.A0K = r4.A0G;
        r3.A0H = r4.A0C;
        float f = r4.A01;
        if (f != -1.0f) {
            r3.A02 = f;
            r3.A09(r3.A06 * 1.0f);
        }
        float f2 = r4.A00;
        if (f2 != -1.0f) {
            r3.A01 = f2;
            r3.A09(r3.A06 * 1.0f);
        }
        List list = r4.A09;
        if (list != null) {
            r3.A06(((Float) list.get(0)).floatValue());
            r3.A07(((Float) r4.A09.get(1)).floatValue());
        }
        float f3 = r4.A03;
        if (f3 != -1.0f) {
            r3.A09(f3);
        }
        float f4 = r4.A02;
        if (f4 != -1.0f) {
            r3.A08(f4);
        }
        int i = r4.A04;
        if (i != r3.A07) {
            r3.A07 = i;
        }
    }

    private int getNextAvailableZ() {
        return getMaxZ() + 1;
    }

    private void setActiveDrawable(AnonymousClass7TQ r5) {
        r5.A08 = getMaxZ() + 1;
        Collections.sort(this.A0a);
        for (C80543fL B1V : this.A0c) {
            B1V.B1V(r5.A0Q, r5.A0V);
        }
    }

    public final Drawable A0A(int i) {
        AnonymousClass7TQ A002 = A00(this, i);
        if (A002 == null) {
            return null;
        }
        return A002.A0V;
    }

    public final AnonymousClass7TR A0B(int i) {
        AnonymousClass7TQ A002 = A00(this, i);
        if (A002 == null) {
            return null;
        }
        return new AnonymousClass7TR(A002);
    }

    public final AnonymousClass7TR A0C(Drawable drawable) {
        AnonymousClass7TQ A012 = A01(this, drawable);
        if (A012 == null) {
            return null;
        }
        return new AnonymousClass7TR(A012);
    }

    public final void A0G(int i, float f, float f2) {
        AnonymousClass7TQ A002 = A00(this, i);
        if (A002 != null) {
            Rect bounds = A002.A0V.getBounds();
            A002.A06(f - bounds.exactCenterX());
            A002.A07(f2 - bounds.exactCenterY());
        }
    }

    public final void A0H(int i, boolean z) {
        AnonymousClass7TQ A002 = A00(this, i);
        if (A002 != null) {
            A002.A0F = z;
        }
    }

    public final void A0I(int i, boolean z) {
        A00(this, i).A0V.setVisible(z, false);
    }

    public final void A0K(Drawable drawable) {
        if (A01(this, drawable) != null) {
            AnonymousClass7TQ.A00(drawable);
        }
    }

    public final void A0L(Drawable drawable, float f) {
        AnonymousClass7TQ A012 = A01(this, drawable);
        if (A012 != null) {
            A012.A08(f);
        }
    }

    public final void A0M(Drawable drawable, float f) {
        AnonymousClass7TQ A012 = A01(this, drawable);
        if (A012 != null) {
            A012.A09(f);
        }
    }

    public final boolean BKO(C87273qS r3) {
        AnonymousClass7TQ activeDrawable = getActiveDrawable(this);
        if (activeDrawable == null || !activeDrawable.A0J) {
            return false;
        }
        return true;
    }

    public int getActiveDrawableId() {
        if (getActiveDrawable(this) == null) {
            return -1;
        }
        return getActiveDrawable(this).A0Q;
    }

    public int getMaxZ() {
        AnonymousClass7TQ activeDrawable = getActiveDrawable(this);
        if (activeDrawable != null) {
            return activeDrawable.A08;
        }
        return 0;
    }

    public boolean getTouchEnabled() {
        return this.A0B;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        AnonymousClass7TQ activeDrawable = getActiveDrawable(this);
        for (int i = 0; i < this.A0a.size(); i++) {
            AnonymousClass7TQ r5 = (AnonymousClass7TQ) this.A0a.get(i);
            if (r5.A0V.isVisible()) {
                if (r5.equals(activeDrawable)) {
                    C84393la r6 = this.A0Y;
                    if (r6.A0P.A00() > 0.0d) {
                        r6.A0X.draw(canvas);
                    }
                    if (r6.A0O.A00() > 0.0d) {
                        r6.A0W.draw(canvas);
                    }
                    if (r6.A0Q.A00() > 0.0d) {
                        r6.A0Y.draw(canvas);
                    }
                    if (r6.A0R.A00() > 0.0d) {
                        r6.A0Z.draw(canvas);
                    }
                    if (r6.A0T.A00() > 0.0d) {
                        r6.A0b.draw(canvas);
                    }
                    if (r6.A0N.A00() > 0.0d) {
                        r6.A0V.draw(canvas);
                    }
                    if (r6.A0S.A00() > 0.0d) {
                        r6.A0a.draw(canvas);
                    }
                }
                canvas.save();
                float f = r5.A05;
                if (f != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    canvas.rotate(f, r5.A03(), r5.A04());
                }
                float f2 = r5.A06 * r5.A00;
                float f3 = f2;
                if (f2 != 1.0f) {
                    canvas.scale(f3, f3, r5.A03(), r5.A04());
                }
                canvas.translate(r5.A03, r5.A04);
                r5.A0V.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.A0T.set(i, i2, i3, i4);
            if (this.A08) {
                this.A0Y.A03(this.A0T);
            }
        }
        if (!this.A0b.isEmpty()) {
            for (Runnable run : this.A0b) {
                run.run();
            }
            this.A0b.clear();
        }
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        AnonymousClass7TQ activeDrawable = getActiveDrawable(this);
        if (activeDrawable == null || !activeDrawable.A0J) {
            return false;
        }
        this.A0e.x = scaleGestureDetector.getFocusX();
        this.A0e.y = scaleGestureDetector.getFocusY();
        this.A0f.x = scaleGestureDetector.getFocusX();
        this.A0f.y = scaleGestureDetector.getFocusY();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0126  */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean A072;
        boolean z;
        int A052 = AnonymousClass0Z0.A05(605984351);
        boolean z2 = false;
        if (this.A0B) {
            if (this.A0a.isEmpty()) {
                boolean onTouchEvent = this.A0h.onTouchEvent(motionEvent);
                AnonymousClass0Z0.A0C(-1739037479, A052);
                return onTouchEvent;
            }
            if (motionEvent.getPointerCount() == 1) {
                C84393la r0 = this.A0Y;
                r0.A0J = false;
                r0.A0S.A03(0.0d);
            }
            if (!this.A07 || this.A0k.A09()) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0 && A07(motionEvent.getX(), motionEvent.getY())) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.A0K = true;
                    AnonymousClass7TQ activeDrawable = getActiveDrawable(this);
                    if (activeDrawable.A0H) {
                        activeDrawable.A0N = false;
                        AnonymousClass1EG r6 = activeDrawable.A0W;
                        r6.A06 = true;
                        r6.A03(0.949999988079071d);
                    }
                } else if (actionMasked == 5) {
                    if (this.A0A) {
                        A072 = false;
                    } else {
                        int pointerCount = motionEvent.getPointerCount();
                        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        for (int i = 0; i < pointerCount; i++) {
                            f += motionEvent.getX(i);
                            f2 += motionEvent.getY(i);
                        }
                        float f3 = (float) pointerCount;
                        A072 = A07(f / f3, f2 / f3);
                    }
                    if (A072) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.A0K = true;
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (this.A0V.getVisibility() == 0) {
                    if (this.A0U.isEmpty()) {
                        this.A0W.getHitRect(this.A0U);
                        this.A0U.offset((int) this.A0V.getX(), (int) this.A0V.getY());
                        if (!this.A0U.isEmpty()) {
                            Rect rect = this.A0U;
                            int i2 = -this.A0Q;
                            rect.inset(i2, i2);
                        }
                    }
                    z = this.A0U.contains((int) x, (int) y);
                } else {
                    z = false;
                }
                if (z) {
                    AnonymousClass1EG r62 = this.A0k;
                    r62.A07(this.A0l);
                    r62.A06 = false;
                    r62.A03(1.0d);
                } else if (this.A0k.A00() > 0.0d) {
                    this.A0i.onTouchEvent(motionEvent);
                    AnonymousClass1EG r63 = this.A0k;
                    r63.A06 = true;
                    r63.A03(0.0d);
                } else {
                    this.A0j.onTouchEvent(motionEvent);
                    this.A0m.A00(motionEvent);
                    this.A0i.onTouchEvent(motionEvent);
                    if (actionMasked == 1 || actionMasked == 3) {
                        this.A07 = true;
                        this.A0K = false;
                        this.A0Y.A02();
                        invalidate();
                        if (!this.A0N) {
                            this.A0N = false;
                            A06(this, getActiveDrawable(this));
                        } else {
                            getActiveDrawable(this).A05();
                        }
                        if (this.A0V.getVisibility() == 0) {
                            for (C80543fL BS7 : this.A0c) {
                                BS7.BS7();
                            }
                        } else if (this.A0k.A09()) {
                            A04(this);
                        }
                    }
                }
                this.A0Y.A02();
                this.A07 = true;
                this.A0K = false;
                this.A0Y.A02();
                invalidate();
                if (!this.A0N) {
                }
                if (this.A0V.getVisibility() == 0) {
                }
            } else {
                AnonymousClass0Z0.A0C(-881066568, A052);
                return true;
            }
        }
        if (this.A0B && (!this.A09 || this.A0K)) {
            z2 = true;
        }
        AnonymousClass0Z0.A0C(-1403659898, A052);
        return z2;
    }

    public void setDrawableUpdateListener(C83183jc r1) {
        this.A06 = r1;
    }

    public void setOnlyHandleTouchesOnActiveDrawables(boolean z) {
        this.A09 = z;
    }

    public void setTouchEnabled(boolean z) {
        this.A0B = z;
    }

    public void setTrashCanEnabled(boolean z) {
        this.A0C = z;
    }

    public void setTrashCanLabelEnabled(boolean z) {
        this.A0D = z;
    }

    public void setWaitForSingleTapConfirmed(boolean z) {
        this.A0E = z;
    }

    public InteractiveDrawableContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public InteractiveDrawableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InteractiveDrawableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0Z = new C86053oO(this);
        this.A0U = new Rect();
        this.A0a = new ArrayList();
        this.A0c = new CopyOnWriteArraySet();
        this.A0l = new C84383lZ(this);
        this.A0T = new Rect();
        this.A0g = new RectF();
        this.A0d = new Path();
        this.A0S = new Matrix();
        this.A0R = new Matrix();
        this.A0f = new PointF();
        this.A0e = new PointF();
        this.A0b = new ArrayList();
        this.A0D = true;
        this.A0B = true;
        this.A0E = false;
        this.A0J = new PointF();
        setWillNotDraw(false);
        this.A0Y = new C84393la(context);
        Handler handler = new Handler(Looper.getMainLooper());
        this.A0h = new GestureDetector(context, new C86063oP(this), handler);
        this.A0i = new GestureDetector(context, this, handler);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this, handler);
        this.A0j = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.A0m = new C87273qS(context, this);
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06(A0n);
        this.A0k = A002;
        this.A0Q = context.getResources().getDimensionPixelSize(C0003R.dimen.trash_can_touch_padding);
        this.A0O = context.getResources().getDimensionPixelSize(C0003R.dimen.interactive_drawable_fully_visible_on_screen_horizontal_padding);
        this.A0P = context.getResources().getDimensionPixelSize(C0003R.dimen.interactive_drawable_fully_visible_on_screen_vertical_padding);
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.trash_can, this, false);
        this.A0V = inflate;
        this.A0X = inflate.findViewById(C0003R.C0005id.trash_can_label);
        this.A0W = this.A0V.findViewById(C0003R.C0005id.trash_can_circle);
        addView(this.A0V);
    }
}
