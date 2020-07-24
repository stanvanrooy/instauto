package com.instagram.wellbeing.timespent.p039ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass40t;
import p000X.AnonymousClass7S8;
import p000X.AnonymousClass95U;
import p000X.C019000b;
import p000X.C174587d5;
import p000X.C200488i7;
import p000X.C56142c0;
import p000X.C56162c2;
import p000X.C56172c3;
import p000X.C56202c6;

/* renamed from: com.instagram.wellbeing.timespent.ui.TimeSpentBarChartView */
public class TimeSpentBarChartView extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public Paint A06;
    public Paint A07;
    public Paint A08;
    public Paint A09;
    public Paint A0A;
    public Paint A0B;
    public Paint A0C;
    public C56202c6 A0D;
    public AnonymousClass0C1 A0E;
    public List A0F;
    public List A0G;
    public List A0H;
    public List A0I;
    public List A0J;
    public float A0K;
    public List A0L;
    public final Resources A0M = getResources();

    private void A00() {
        this.A03 = TypedValue.applyDimension(1, 4.0f, this.A0M.getDisplayMetrics());
        this.A00 = TypedValue.applyDimension(1, 2.0f, this.A0M.getDisplayMetrics());
        this.A01 = TypedValue.applyDimension(1, 30.0f, this.A0M.getDisplayMetrics());
        this.A02 = TypedValue.applyDimension(2, 10.0f, this.A0M.getDisplayMetrics());
        Paint paint = new Paint(1);
        this.A06 = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.A06;
        Context context = getContext();
        paint2.setColor(C019000b.A00(context, C0003R.color.bar_color_0_percent));
        Paint paint3 = new Paint(1);
        this.A08 = paint3;
        paint3.setStyle(Paint.Style.FILL);
        Paint paint4 = this.A08;
        getContext();
        paint4.setColor(C019000b.A00(context, C0003R.color.bar_color_25_percent));
        Paint paint5 = new Paint(1);
        this.A09 = paint5;
        paint5.setStyle(Paint.Style.FILL);
        Paint paint6 = this.A09;
        getContext();
        paint6.setColor(C019000b.A00(context, C0003R.color.bar_color_50_percent));
        Paint paint7 = new Paint(1);
        this.A0A = paint7;
        paint7.setStyle(Paint.Style.FILL);
        Paint paint8 = this.A0A;
        getContext();
        paint8.setColor(C019000b.A00(context, C0003R.color.bar_color_75_percent));
        Paint paint9 = new Paint(1);
        this.A07 = paint9;
        paint9.setStyle(Paint.Style.FILL);
        Paint paint10 = this.A07;
        getContext();
        paint10.setColor(C019000b.A00(context, C0003R.color.bar_color_100_percent));
        Paint paint11 = new Paint(1);
        this.A0B = paint11;
        getContext();
        paint11.setColor(C019000b.A00(context, C0003R.color.grey_5));
        this.A0B.setTextAlign(Paint.Align.CENTER);
        this.A0B.setTypeface(Typeface.SANS_SERIF);
        this.A0B.setTextSize(this.A02);
        Paint paint12 = new Paint(1);
        this.A0C = paint12;
        getContext();
        paint12.setColor(C019000b.A00(context, C0003R.color.black));
        this.A0C.setTextAlign(Paint.Align.CENTER);
        this.A0C.setTypeface(Typeface.create(AnonymousClass40t.$const$string(34), 1));
        this.A0C.setTextSize(this.A02);
        Float valueOf = Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A0F = new ArrayList(Arrays.asList(new Float[]{valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf}));
        this.A0G = new ArrayList(Arrays.asList(new Float[]{valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf}));
        this.A0H = new ArrayList(Arrays.asList(new Float[]{valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf}));
        this.A05 = -1;
    }

    public void setDailyUsageData(List list) {
        this.A0I = list;
        long longValue = ((Long) Collections.max(list)).longValue();
        this.A0J = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (longValue == 0) {
                this.A0J.add(Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
            } else {
                this.A0J.add(Float.valueOf(l.floatValue() / ((float) longValue)));
            }
        }
        invalidate();
    }

    public void setLabels(List list) {
        this.A0L = list;
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        super.onDraw(canvas);
        int i = 0;
        while (true) {
            long j = (long) i;
            if (j < 7) {
                RectF rectF = new RectF(((Float) this.A0F.get(i)).floatValue(), ((Float) this.A0H.get(i)).floatValue(), ((Float) this.A0G.get(i)).floatValue(), ((float) this.A04) - this.A01);
                float f = this.A00;
                float floatValue = ((Float) this.A0J.get(i)).floatValue();
                if (floatValue == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    paint = this.A06;
                } else if (floatValue <= 0.25f) {
                    paint = this.A08;
                } else if (floatValue <= 0.5f) {
                    paint = this.A09;
                } else if (floatValue <= 0.75f) {
                    paint = this.A0A;
                } else {
                    paint = this.A07;
                }
                canvas.drawRoundRect(rectF, f, f, paint);
                float floatValue2 = (((Float) this.A0F.get(i)).floatValue() + ((Float) this.A0G.get(i)).floatValue()) / 2.0f;
                float descent = (((float) this.A04) - (this.A01 / 2.0f)) - ((this.A0B.descent() + this.A0B.ascent()) / 2.0f);
                String string = this.A0M.getString(((C200488i7) this.A0L.get(i)).A00);
                if (j == 6) {
                    paint2 = this.A0C;
                } else {
                    paint2 = this.A0B;
                }
                canvas.drawText(string, floatValue2, descent, paint2);
                i++;
            } else {
                return;
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float floatValue;
        int A062 = AnonymousClass0Z0.A06(-24073034);
        super.onSizeChanged(i, i2, i3, i4);
        this.A04 = i2;
        float f = (((float) i) - (this.A03 * 6.0f)) / 7.0f;
        this.A0K = f;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        float f3 = f + BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        for (int i5 = 0; ((long) i5) < 7; i5++) {
            this.A0F.set(i5, Float.valueOf(f2));
            this.A0G.set(i5, Float.valueOf(f3));
            List list = this.A0H;
            if (((Long) this.A0I.get(i5)).longValue() < 60) {
                floatValue = 0.985f;
            } else {
                floatValue = 1.0f - ((Float) this.A0J.get(i5)).floatValue();
            }
            list.set(i5, Float.valueOf(floatValue * (((float) this.A04) - this.A01)));
            f2 = this.A03 + f3;
            f3 = this.A0K + f2;
        }
        AnonymousClass0Z0.A0D(-363849753, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A052 = AnonymousClass0Z0.A05(-228382756);
        if (motionEvent.getPointerCount() > 1) {
            i = 1993239025;
        } else {
            float x = motionEvent.getX(0);
            int i2 = 0;
            while (true) {
                if (((long) i2) < 7) {
                    if (x >= ((Float) this.A0F.get(i2)).floatValue() && x <= ((Float) this.A0G.get(i2)).floatValue()) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                C56202c6 r0 = this.A0D;
                if (r0 != null) {
                    r0.A06(true);
                }
                this.A05 = i2;
                i = -1716691053;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.A05 = i2;
                        this.A0D.A06(true);
                    } else if (actionMasked == 2 && i2 != this.A05) {
                        C56202c6 r02 = this.A0D;
                        if (r02 != null) {
                            r02.A06(true);
                        }
                    }
                    i = -178915477;
                }
                this.A05 = i2;
                Context context = getContext();
                getContext();
                C56142c0 r6 = new C56142c0((Activity) context, new AnonymousClass95U(AnonymousClass7S8.A00(context, this.A0M, false, ((Long) this.A0I.get(i2)).longValue())));
                int floatValue = (int) ((((Float) this.A0F.get(this.A05)).floatValue() + ((Float) this.A0G.get(this.A05)).floatValue()) / 2.0f);
                int intValue = ((Float) this.A0H.get(this.A05)).intValue();
                getContext();
                r6.A01(floatValue, intValue - context.getResources().getDimensionPixelSize(C0003R.dimen.time_spent_bar_chart_tooltip_anchor_margin), false, this);
                r6.A05 = C56162c2.ABOVE_ANCHOR;
                r6.A07 = C56172c3.A04;
                this.A0D = r6.A00();
                AnonymousClass0C1 r8 = this.A0E;
                long longValue = ((Long) this.A0I.get(this.A05)).longValue();
                int i3 = this.A05;
                AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_ts_day_chart_bar_tap", (AnonymousClass0RN) null);
                A002.A0E(C174587d5.A00(Constants.ONE), Integer.valueOf(i3));
                A002.A0F(C174587d5.A00(Constants.A0j), Long.valueOf(longValue));
                AnonymousClass0WN.A01(r8).BcG(A002);
                this.A0D.A05();
                i = -178915477;
            }
        }
        AnonymousClass0Z0.A0C(i, A052);
        return true;
    }

    public void setUserSession(AnonymousClass0C1 r1) {
        this.A0E = r1;
    }

    public TimeSpentBarChartView(Context context) {
        super(context);
        A00();
    }

    public TimeSpentBarChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public TimeSpentBarChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
