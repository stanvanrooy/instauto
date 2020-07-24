package com.instagram.reels.viewer.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.instagram.feed.widget.IgProgressImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1e7;
import p000X.AnonymousClass2OF;
import p000X.C05770Lw;
import p000X.C34111e4;
import p000X.C34121e5;
import p000X.C34131e6;
import p000X.C34151eA;
import p000X.C65112sZ;
import p000X.C66582vi;

public class ReelViewGroup extends FrameLayout {
    public float A00;
    public int A01;
    public GestureDetector A02;
    public GestureDetector A03;
    public IgProgressImageView A04;
    public AnonymousClass2OF A05;
    public AnonymousClass0C1 A06;
    public final GestureDetector.OnGestureListener A07;
    public final GestureDetector.SimpleOnGestureListener A08;
    public final List A09;
    public final Paint A0A;
    public final Rect A0B;

    public static boolean A00(ReelViewGroup reelViewGroup, C34151eA r9) {
        C34151eA r4 = r9;
        float[] A042 = C66582vi.A04(r9, reelViewGroup.A0B, reelViewGroup.A00, reelViewGroup.getWidth(), reelViewGroup.A04.getHeight());
        AnonymousClass2OF r3 = reelViewGroup.A05;
        if (r3 == null || reelViewGroup.A06 == null) {
            return false;
        }
        return r3.BHU(r4, (int) A042[0], (int) A042[1], reelViewGroup.A0B.height(), reelViewGroup, reelViewGroup.A04);
    }

    public final void A01(float f, List list, AnonymousClass0C1 r6) {
        this.A00 = f;
        this.A06 = r6;
        this.A09.clear();
        if (list != null) {
            this.A09.addAll(list);
        }
        Collections.sort(this.A09, new C65112sZ(this));
        if (C05770Lw.A01(getContext()).A00.getBoolean("show_reel_mention_boundaries", false)) {
            invalidate();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A02.onTouchEvent(motionEvent);
    }

    public void setListener(AnonymousClass2OF r1, AnonymousClass0C1 r2) {
        this.A05 = r1;
        this.A06 = r2;
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (C05770Lw.A01(getContext()).A00.getBoolean("show_reel_mention_boundaries", false)) {
            for (C34151eA r4 : this.A09) {
                C66582vi.A02(r4, getWidth(), this.A04.getHeight(), this.A00, this.A0B);
                canvas.save();
                canvas.rotate(r4.AUj() * 360.0f, (float) this.A0B.centerX(), (float) this.A0B.centerY());
                canvas.drawRect(this.A0B, this.A0A);
                canvas.restore();
            }
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(620364852);
        super.onAttachedToWindow();
        Context context = getContext();
        this.A02 = new GestureDetector(context, this.A08);
        getContext();
        this.A03 = new GestureDetector(context, this.A07);
        AnonymousClass0Z0.A0D(558126969, A062);
    }

    public final void onFinishInflate() {
        int A062 = AnonymousClass0Z0.A06(-1786698181);
        super.onFinishInflate();
        this.A04 = (IgProgressImageView) findViewById(C0003R.C0005id.reel_viewer_image_view);
        AnonymousClass0Z0.A0D(797628635, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r5.A03.onTouchEvent(r6) != false) goto L_0x0019;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int A052 = AnonymousClass0Z0.A05(-758948095);
        if (!this.A02.onTouchEvent(motionEvent)) {
            z = false;
        }
        z = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.A05.BTS(z);
        }
        AnonymousClass0Z0.A0C(1255483052, A052);
        return z;
    }

    public ReelViewGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    public ReelViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReelViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = new C34111e4(this);
        this.A09 = new ArrayList();
        this.A0A = new Paint();
        this.A0B = new Rect();
        this.A0A.setStyle(Paint.Style.FILL);
        this.A0A.setColor(Color.argb(150, 0, 0, 0));
        C34121e5 r2 = new C34121e5(context);
        this.A08 = new AnonymousClass1e7(this, new C34131e6(r2), r2);
        this.A01 = context.getResources().getDimensionPixelOffset(C0003R.dimen.reel_viewer_gutter_width);
    }
}
