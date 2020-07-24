package com.instagram.creation.base.p029ui.degreelabel;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EB;
import p000X.AnonymousClass1EG;
import p000X.C019000b;
import p000X.C175427eT;
import p000X.C175437eU;
import p000X.C175447eV;
import p000X.C1884082p;
import p000X.C26771Ff;

/* renamed from: com.instagram.creation.base.ui.degreelabel.PillDegreeLabelManager */
public class PillDegreeLabelManager extends View implements C1884082p {
    public float A00 = Float.NaN;
    public boolean A01 = true;
    public boolean A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public Drawable A0C;
    public DrawableContainer A0D;
    public AnonymousClass1EG A0E;
    public AnonymousClass1EG A0F;
    public AnonymousClass1EG A0G;
    public AnonymousClass1EG A0H;
    public AnonymousClass1EG A0I;
    public AnonymousClass1EG A0J;
    public AnonymousClass1EG A0K;
    public AnonymousClass1EG A0L;
    public AnonymousClass1EB A0M;
    public String A0N = "";
    public boolean A0O;
    public final Paint A0P = new Paint();
    public final ShapeDrawable A0Q = new ShapeDrawable();
    public final Handler A0R = new C175437eU(this);

    private AnonymousClass1EG A00(AnonymousClass1EA r5) {
        AnonymousClass1EG A002 = this.A0M.A00();
        A002.A06(r5);
        A002.A05(-1000.0d, true);
        A002.A00 = 1.0d;
        A002.A02 = 60.0d;
        A002.A06 = true;
        return A002;
    }

    public static void A04(PillDegreeLabelManager pillDegreeLabelManager) {
        if (pillDegreeLabelManager.A02) {
            float width = ((float) pillDegreeLabelManager.getWidth()) / 2.0f;
            double d = 0.0d;
            if (!pillDegreeLabelManager.A01) {
                float f = pillDegreeLabelManager.A09;
                float f2 = pillDegreeLabelManager.A06;
                A02(pillDegreeLabelManager.A0L, (double) f2);
                float f3 = pillDegreeLabelManager.A07;
                float f4 = f + f3 + f2;
                if (pillDegreeLabelManager.A0O) {
                    f4 += f3 + ((float) pillDegreeLabelManager.A0C.getIntrinsicWidth());
                }
                float f5 = f4 + pillDegreeLabelManager.A04 + pillDegreeLabelManager.A05;
                A02(pillDegreeLabelManager.A0G, (double) f5);
                A02(pillDegreeLabelManager.A0E, 255.0d);
                float f6 = width - (f5 / 2.0f);
                A02(pillDegreeLabelManager.A0F, (double) f6);
                float f7 = f6 + pillDegreeLabelManager.A04;
                A02(pillDegreeLabelManager.A0K, (double) f7);
                float f8 = f7 + f2 + pillDegreeLabelManager.A07;
                A02(pillDegreeLabelManager.A0J, (double) ((pillDegreeLabelManager.A09 / 2.0f) + f8));
                A02(pillDegreeLabelManager.A0I, (double) (f8 + pillDegreeLabelManager.A09 + pillDegreeLabelManager.A07));
                AnonymousClass1EG r1 = pillDegreeLabelManager.A0H;
                if (pillDegreeLabelManager.A0O) {
                    d = 255.0d;
                }
                A02(r1, d);
            } else {
                float intrinsicWidth = (float) pillDegreeLabelManager.A0D.getIntrinsicWidth();
                double d2 = (double) intrinsicWidth;
                A02(pillDegreeLabelManager.A0L, d2);
                double d3 = (double) (width - (intrinsicWidth / 2.0f));
                A02(pillDegreeLabelManager.A0K, d3);
                A02(pillDegreeLabelManager.A0J, (double) width);
                A02(pillDegreeLabelManager.A0I, -1000.0d);
                A02(pillDegreeLabelManager.A0H, 0.0d);
                A02(pillDegreeLabelManager.A0G, d2);
                A02(pillDegreeLabelManager.A0E, 0.0d);
                A02(pillDegreeLabelManager.A0F, d3);
            }
            A03(pillDegreeLabelManager);
        }
    }

    public final void hide() {
        List arrayList;
        if (this.A0R.hasMessages(1)) {
            this.A01 = true;
            AnonymousClass0ZA.A02(this.A0R, 1);
        }
        Collection values = this.A0M.A02.values();
        if (values instanceof List) {
            arrayList = (List) values;
        } else {
            arrayList = new ArrayList(values);
        }
        for (AnonymousClass1EG r2 : Collections.unmodifiableList(arrayList)) {
            r2.A05(r2.A00(), true);
        }
        this.A0M.A04.clear();
    }

    public void setDegree(float f) {
        if (!this.A02) {
            this.A00 = f;
        } else if (f != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || !this.A01) {
            this.A0N = AnonymousClass000.A02(String.valueOf(f), 176);
            AnonymousClass0ZA.A02(this.A0R, 1);
            float measureText = this.A0P.measureText(this.A0N);
            if (this.A01 || Math.abs(this.A09 - measureText) >= 2.0f) {
                this.A01 = false;
                this.A09 = measureText;
                A04(this);
            } else {
                invalidate();
            }
            if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                AnonymousClass0ZA.A03(this.A0R, 1, 750);
            }
        }
    }

    public void setSelected(boolean z) {
        int i;
        this.A0O = z;
        this.A0D.selectDrawable(z ^ true ? 1 : 0);
        if (this.A0O) {
            i = this.A0A;
        } else {
            i = this.A0B;
        }
        this.A0C.setColorFilter(C26771Ff.A00(i));
        this.A0D.setColorFilter(C26771Ff.A00(i));
        this.A0Q.getPaint().setColor(i);
        this.A0P.setColor(i);
        A04(this);
    }

    public final void show() {
        this.A0M.A01(new C175447eV(this));
    }

    private void A01() {
        this.A0M = AnonymousClass0P2.A00();
        AnonymousClass1EA A012 = AnonymousClass1EA.A01(20.0d, 4.0d);
        this.A0K = A00(A012);
        this.A0L = A00(A012);
        this.A0G = A00(A012);
        this.A0F = A00(A012);
        this.A0E = A00(A012);
        this.A0J = A00(A012);
        this.A0I = A00(A012);
        this.A0H = A00(A012);
        Resources resources = getResources();
        Context context = getContext();
        this.A0A = AnonymousClass1BA.A01(context, C0003R.attr.pillSelectedColor);
        getContext();
        this.A0B = AnonymousClass1BA.A01(context, C0003R.attr.pillUnselectedColor);
        float dimension = resources.getDimension(C0003R.dimen.pill_degree_label_border_width);
        Drawable drawable = resources.getDrawable(C0003R.C0004drawable.adjust_reset_off);
        this.A0C = drawable;
        drawable.mutate();
        this.A03 = resources.getDimension(C0003R.dimen.pill_degree_label_height);
        this.A04 = resources.getDimension(C0003R.dimen.pill_degree_label_padding_left);
        this.A05 = resources.getDimension(C0003R.dimen.pill_degree_label_padding_right);
        this.A07 = resources.getDimension(C0003R.dimen.pill_degree_label_text_padding);
        this.A06 = resources.getDimension(C0003R.dimen.pill_degree_label_shrunk_icon_size);
        float f = this.A03 / 2.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        this.A0Q.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        this.A0Q.getPaint().setStyle(Paint.Style.STROKE);
        this.A0Q.getPaint().setStrokeWidth(dimension);
        this.A0P.setTextSize(resources.getDimension(C0003R.dimen.pill_degree_label_text_size));
        this.A0P.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = this.A0P.getFontMetrics();
        this.A08 = (fontMetrics.ascent + fontMetrics.descent) / 2.0f;
        addOnLayoutChangeListener(new C175427eT(this));
    }

    public static void A03(PillDegreeLabelManager pillDegreeLabelManager) {
        float height = ((float) pillDegreeLabelManager.getHeight()) / 2.0f;
        float A002 = (float) pillDegreeLabelManager.A0K.A00();
        float A003 = (float) pillDegreeLabelManager.A0L.A00();
        float A004 = (float) pillDegreeLabelManager.A0F.A00();
        float A005 = (float) pillDegreeLabelManager.A0G.A00();
        int max = Math.max(Math.min((int) Math.round(pillDegreeLabelManager.A0E.A00()), 255), 0);
        AnonymousClass1EG r10 = pillDegreeLabelManager.A0I;
        float A006 = (float) r10.A00();
        int max2 = Math.max(Math.min((int) Math.round(pillDegreeLabelManager.A0H.A00()), 255), 0);
        if (max2 < 255 && r10.A01 != -1000.0d) {
            A006 -= ((float) pillDegreeLabelManager.A0C.getIntrinsicHeight()) * (((float) (255 - max2)) / 255.0f);
        }
        float f = height - (A003 / 2.0f);
        pillDegreeLabelManager.A0D.setBounds((int) A002, (int) f, Math.round(A002 + A003), Math.round(f + A003));
        float f2 = pillDegreeLabelManager.A03;
        float f3 = height - (f2 / 2.0f);
        pillDegreeLabelManager.A0Q.setBounds((int) A004, (int) f3, Math.round(A004 + A005), Math.round(f3 + f2));
        pillDegreeLabelManager.A0Q.setAlpha(max);
        pillDegreeLabelManager.A0P.setAlpha(max);
        int round = Math.round(height) - (pillDegreeLabelManager.A0C.getIntrinsicHeight() >> 1);
        Drawable drawable = pillDegreeLabelManager.A0C;
        drawable.setBounds((int) A006, round, Math.round(A006 + ((float) drawable.getIntrinsicWidth())), pillDegreeLabelManager.A0C.getIntrinsicHeight() + round);
        pillDegreeLabelManager.A0C.setAlpha(max2);
        pillDegreeLabelManager.invalidate();
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(738023877);
        super.onDetachedFromWindow();
        AnonymousClass0ZA.A02(this.A0R, 1);
        AnonymousClass0Z0.A0D(-1439474659, A062);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.A0D.draw(canvas);
        boolean z = false;
        if (this.A0E.A00() >= 1.0d) {
            z = true;
        }
        if (z) {
            canvas.drawText(this.A0N, (float) Math.round(this.A0J.A00() - ((double) (this.A09 / 2.0f))), (float) Math.round((((float) getHeight()) / 2.0f) - this.A08), this.A0P);
        }
        if (this.A0I.A01 != -1000.0d && this.A0H.A00() >= 1.0d) {
            this.A0C.draw(canvas);
        }
        if (z && this.A0G.A00() > 0.0d) {
            this.A0Q.draw(canvas);
        }
    }

    public void setDegreeLabelResource(int i) {
        this.A0D = (DrawableContainer) C019000b.A03(getContext(), i);
    }

    public static void A02(AnonymousClass1EG r5, double d) {
        if (d == -1000.0d || r5.A00() == -1000.0d) {
            r5.A05(d, true);
        } else {
            r5.A03(d);
        }
    }

    public PillDegreeLabelManager(Context context) {
        super(AnonymousClass1BA.A05(context, C0003R.attr.pillLabelStyle));
        A01();
    }

    public PillDegreeLabelManager(Context context, AttributeSet attributeSet) {
        super(AnonymousClass1BA.A05(context, C0003R.attr.pillLabelStyle), attributeSet);
        A01();
    }

    public PillDegreeLabelManager(Context context, AttributeSet attributeSet, int i) {
        super(AnonymousClass1BA.A05(context, C0003R.attr.pillLabelStyle), attributeSet, i);
        A01();
    }
}
