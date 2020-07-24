package com.instagram.p009ui.widget.drawing;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass7HY;
import p000X.AnonymousClass7HZ;
import p000X.C06400Ox;
import p000X.C81283gY;
import p000X.C81303ga;
import p000X.C81313gb;
import p000X.C84543ls;

/* renamed from: com.instagram.ui.widget.drawing.ColourPalette */
public class ColourPalette extends View {
    public static final int A0I = Color.rgb(230, 230, 230);
    public static final int A0J = Color.rgb(51, 51, 51);
    public static final int[] A0K = new int[2];
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public C81283gY A04;
    public C81303ga A05;
    public boolean A06;
    public final float A07;
    public final Paint A08;
    public final Paint A09;
    public final AnonymousClass1EG A0A;
    public final ArrayList A0B;
    public final float A0C;
    public final float A0D;
    public final GestureDetector A0E;
    public final C84543ls A0F;
    public final ArrayList A0G;
    public final boolean A0H;

    public static void setMode(ColourPalette colourPalette, C81303ga r4) {
        if (colourPalette.A05 != r4) {
            colourPalette.A05 = r4;
            if (r4 == C81303ga.SINGLE_COLOUR) {
                C81283gY r1 = colourPalette.A04;
                if (r1 != null) {
                    r1.B61(false, colourPalette.A03);
                }
                colourPalette.A0A.A03(0.0d);
                return;
            }
            C81283gY r12 = colourPalette.A04;
            if (r12 != null) {
                r12.B61(true, colourPalette.A03);
            }
            colourPalette.A0A.A03(1.0d);
        }
    }

    public final void onDraw(Canvas canvas) {
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            AnonymousClass7HY r3 = (AnonymousClass7HY) it.next();
            ColourPalette colourPalette = r3.A0A;
            if ((!colourPalette.A0A.A09()) || colourPalette.A05 == C81303ga.GRADIENT) {
                RectF rectF = r3.A06;
                float f = r3.A00;
                canvas.drawRoundRect(rectF, f, f, r3.A03);
            }
            if (r3.A07) {
                ColourPalette colourPalette2 = r3.A0A;
                if (colourPalette2.A02 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && colourPalette2.A05 == C81303ga.SINGLE_COLOUR && !(!colourPalette2.A0A.A09())) {
                    RectF rectF2 = r3.A06;
                    float f2 = r3.A00;
                    canvas.drawRoundRect(rectF2, f2, f2, colourPalette2.A08);
                }
                RectF rectF3 = r3.A06;
                float f3 = r3.A00;
                canvas.drawRoundRect(rectF3, f3, f3, r3.A02);
                RectF rectF4 = r3.A06;
                float f4 = r3.A00;
                canvas.drawRoundRect(rectF4, f4, f4, r3.A0A.A09);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        if (r1 != 0) goto L_0x0072;
     */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object obj;
        int i5;
        boolean z2;
        this.A0B.clear();
        int size = this.A0G.size();
        float width = ((float) getWidth()) / ((float) size);
        float height = (float) getHeight();
        float f = this.A0D;
        float f2 = f + BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        float f3 = width - f;
        float f4 = height - this.A0C;
        float f5 = f4 - (f3 - f2);
        float f6 = width;
        float f7 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        int i6 = 0;
        while (i6 < size) {
            int i7 = i6;
            if (this.A0H) {
                i7 = (size - 1) - i6;
            }
            int intValue = ((Integer) this.A0G.get(i7)).intValue();
            ArrayList arrayList = this.A0G;
            if (i7 == 0) {
                obj = arrayList.get(i7);
            } else {
                obj = arrayList.get(i7 - 1);
            }
            int intValue2 = ((Integer) obj).intValue();
            int i8 = i7 + 1;
            if (i8 < size) {
                i5 = ((Integer) this.A0G.get(i8)).intValue();
            } else {
                i5 = -1;
            }
            int A002 = AnonymousClass7HZ.A00(0.5f, intValue2, intValue);
            int A003 = AnonymousClass7HZ.A00(0.5f, intValue, i5);
            if (!this.A06) {
                z2 = false;
            }
            z2 = true;
            boolean z3 = this.A0H;
            int i9 = A002;
            if (z3) {
                i9 = A003;
            }
            if (z3) {
                A003 = A002;
            }
            this.A0B.add(new AnonymousClass7HY(this, z2, f7, f6, height, f2, f5, f3, f4, intValue, i9, A003));
            float f8 = f6 + width;
            float f9 = this.A0D;
            f2 = f6 + f9;
            f3 = f8 - f9;
            i6++;
            f7 = f6;
            f6 = f8;
        }
        this.A01 = f5;
        this.A00 = f4;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A052 = AnonymousClass0Z0.A05(-109795200);
        boolean onTouchEvent = this.A0E.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0 || action == 2) {
            if (this.A05 == C81303ga.GRADIENT) {
                float x = motionEvent.getX();
                float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min((float) getHeight(), motionEvent.getY()));
                Iterator it = this.A0B.iterator();
                while (it.hasNext()) {
                    AnonymousClass7HY r1 = (AnonymousClass7HY) it.next();
                    if (r1.A01(x, max)) {
                        int A002 = r1.A00(x, max);
                        this.A03 = A002;
                        if (this.A04 != null) {
                            getLocationInWindow(A0K);
                            C81283gY r2 = this.A04;
                            int[] iArr = A0K;
                            r2.AxA(A002, x + ((float) iArr[0]), max + ((float) iArr[1]));
                        }
                        i = 1499912005;
                    }
                }
            }
            AnonymousClass0Z0.A0C(917253589, A052);
            return onTouchEvent;
        }
        if (action == 1 || action == 3) {
            this.A0F.A00 = false;
            if (this.A05 == C81303ga.GRADIENT) {
                setMode(this, C81303ga.SINGLE_COLOUR);
                int i2 = this.A03;
                this.A03 = i2;
                C81283gY r0 = this.A04;
                if (r0 != null) {
                    r0.Ax9(i2, 2);
                }
                i = 1072767541;
            }
        }
        AnonymousClass0Z0.A0C(917253589, A052);
        return onTouchEvent;
        AnonymousClass0Z0.A0C(i, A052);
        return true;
    }

    public void setColourStops(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            this.A0G.clear();
            this.A0G.addAll(arrayList);
            this.A03 = ((Integer) arrayList.get(0)).intValue();
            forceLayout();
        }
    }

    public void setDrawAllColourStops(boolean z) {
        this.A06 = z;
    }

    public void setInteractionListener(C81283gY r1) {
        this.A04 = r1;
    }

    public ColourPalette(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColourPalette(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00b8  */
    public ColourPalette(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.A05 = C81303ga.SINGLE_COLOUR;
        this.A0G = new ArrayList();
        this.A0B = new ArrayList();
        this.A0H = C06400Ox.A02(context);
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0q);
            try {
                this.A07 = typedArray.getDimension(2, 5.0f);
                this.A0D = typedArray.getDimension(1, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A0C = typedArray.getDimension(0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A02 = typedArray.getDimension(4, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                int color = typedArray.getColor(3, -16777216);
                typedArray.recycle();
                Paint paint = new Paint(1);
                this.A09 = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.A09.setStrokeWidth(this.A07);
                this.A09.setColor(-1);
                Paint paint2 = new Paint(1);
                this.A08 = paint2;
                paint2.setShadowLayer(this.A02, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, color);
                C84543ls r3 = new C84543ls(this);
                this.A0F = r3;
                this.A0E = new GestureDetector(context, r3, new Handler(Looper.getMainLooper()));
                C81313gb r32 = new C81313gb(this);
                AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
                A002.A03(0.0d);
                A002.A02();
                A002.A06 = true;
                A002.A07(r32);
                this.A0A = A002;
                if (this.A02 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    setLayerType(1, (Paint) null);
                }
            } catch (Throwable th) {
                th = th;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
            if (typedArray != null) {
            }
            throw th;
        }
    }
}
