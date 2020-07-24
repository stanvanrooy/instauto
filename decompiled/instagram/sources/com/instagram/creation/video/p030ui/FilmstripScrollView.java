package com.instagram.creation.video.p030ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass815;
import p000X.C16180oA;
import p000X.C1881681r;

/* renamed from: com.instagram.creation.video.ui.FilmstripScrollView */
public class FilmstripScrollView extends HorizontalScrollView {
    public C1881681r A00;
    public boolean A01;

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        Integer num;
        C1881681r r4 = this.A00;
        if (r4 != null) {
            int i5 = i - i3;
            AnonymousClass815 r1 = r4.A00;
            if (r1.A0I != null) {
                if (i5 >= 0) {
                    num = Constants.ONE;
                } else {
                    num = Constants.ZERO;
                }
                AnonymousClass815.A09(r1, num);
            }
            if (!C16180oA.A00(r4.A00.A03).A00.getBoolean("import_scroll_education", false)) {
                C16180oA.A00(r4.A00.A03).A00.edit().putBoolean("import_scroll_education", true).apply();
            }
            AnonymousClass815 r0 = r4.A00;
            r0.A0H.A09 = r0.A0F.getScrollX();
            AnonymousClass815 r02 = r4.A00;
            r02.A0H.A08 = (int) AnonymousClass815.A02(r02);
            AnonymousClass815 r03 = r4.A00;
            r03.A0H.A06 = (int) AnonymousClass815.A01(r03);
            AnonymousClass815 r2 = r4.A00;
            r2.A0H.A0I = true;
            r2.A0G.A06();
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r1 != 3) goto L_0x0016;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1881681r r0;
        C1881681r r1;
        int A05 = AnonymousClass0Z0.A05(-1028381742);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.A01 && (r1 = this.A00) != null) {
                        r1.A00.A0G.A0F(true);
                        AnonymousClass815 r2 = r1.A00;
                        r2.A09.setVisibility(0);
                        r2.A09.clearAnimation();
                        r2.A09.startAnimation(r2.A0C);
                        this.A01 = true;
                    }
                }
            }
            if (this.A01 && (r0 = this.A00) != null) {
                AnonymousClass815 r22 = r0.A00;
                r22.A09.clearAnimation();
                r22.A09.startAnimation(r22.A0D);
            }
        } else {
            this.A01 = false;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0Z0.A0C(-512609737, A05);
        return onTouchEvent;
    }

    public FilmstripScrollView(Context context) {
        super(context);
    }

    public FilmstripScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilmstripScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
