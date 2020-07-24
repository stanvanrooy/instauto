package com.instagram.p009ui.widget.filmstriptimeline;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.io.IOException;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass817;
import p000X.AnonymousClass81A;
import p000X.C019000b;
import p000X.C12670hC;
import p000X.C1880481d;
import p000X.C1881281n;
import p000X.C1882181w;
import p000X.C25913Bc3;
import p000X.C81013g6;
import p000X.C81043g9;
import p000X.C81053gA;
import p000X.C81063gB;
import p000X.C81073gC;
import p000X.C86423p0;
import p000X.C87583r0;
import p000X.C87593r1;
import p000X.C87603r2;
import p000X.C87613r3;

/* renamed from: com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView */
public class FilmstripTimelineView extends FrameLayout {
    public C81013g6 A00;
    public Context A01;
    public final int A02;
    public final int A03;
    public final C87583r0 A04;
    public final C87603r2 A05;
    public final int A06;
    public final int A07;
    public final C81073gC A08;
    public final C87593r1 A09;
    public final C81053gA A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final void A01(C1880481d r11, int i, int i2, boolean z) {
        setSeekPosition(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        C87583r0 r3 = this.A04;
        C1882181w r0 = r3.A04;
        if (r0 != null) {
            r0.reset();
        }
        if (r3.A02 == null) {
            r3.A02 = new AnonymousClass81A(r3.getContext(), r3);
        }
        AnonymousClass81A r1 = r3.A02;
        r3.A04 = r1;
        int i3 = i;
        r3.A01 = i;
        int i4 = i2;
        r3.A00 = i2;
        AnonymousClass817 r02 = r1.A01;
        if (r02 != null) {
            r02.A01();
        }
        C1880481d r5 = r11;
        r1.A00 = r11;
        r1.A02 = null;
        try {
            AnonymousClass817 r4 = new AnonymousClass817(r5, i3, i4, r1.A05, z);
            r1.A01 = r4;
            r4.A01 = r1;
            C12670hC.A05(new C1881281n(r1));
        } catch (IOException e) {
            AnonymousClass0QD.A05("BitmapTimeline", "Video frame generator setup failed", e);
        }
        r3.invalidate();
    }

    public final void A00(float f, float f2) {
        this.A05.A05(f, f2);
    }

    public float getLeftTrimmerPosition() {
        return this.A05.getLeftTrimmerValue();
    }

    public float getRightTrimmerPosition() {
        return this.A05.A05.A01;
    }

    public float getSeekPosition() {
        return this.A09.A00;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.A04.A00 + (this.A06 << 1), C25913Bc3.MAX_SIGNED_POWER_OF_TWO));
    }

    public void setAllowSeekbarTouch(boolean z) {
        this.A09.A02 = z;
    }

    public void setSeekPosition(float f) {
        this.A09.setSeekbarValue(f);
    }

    public void setShowSeekbar(boolean z) {
        C87593r1 r1 = this.A09;
        int i = 8;
        if (z) {
            i = 0;
        }
        r1.setVisibility(i);
    }

    public void setShowTrimmer(boolean z) {
        C87603r2 r1 = this.A05;
        int i = 8;
        if (z) {
            i = 0;
        }
        r1.setVisibility(i);
    }

    public void setTrimmerMaximumRange(float f) {
        this.A05.A00 = f;
    }

    public void setTrimmerMinimumRange(float f) {
        this.A05.setMinimumRange(f);
    }

    public void setTrimmerSnapValues(float[] fArr) {
        this.A05.setSnapValues(fArr);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0Z0.A05(-2017157762);
        if (motionEvent.getAction() == 0) {
            requestDisallowInterceptTouchEvent(true);
        }
        AnonymousClass0Z0.A0C(1034476186, A052);
        return true;
    }

    public void setListener(C81013g6 r1) {
        this.A00 = r1;
    }

    public FilmstripTimelineView(Context context) {
        this(context, (AttributeSet) null);
    }

    public FilmstripTimelineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public FilmstripTimelineView(Context context, AttributeSet attributeSet, int i) {
        super(r15, r2, i);
        int i2;
        int i3;
        int i4;
        int i5;
        Drawable drawable = null;
        int i6 = 0;
        Drawable drawable2 = null;
        int i7 = 0;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.A0A = new C81043g9(this);
        this.A08 = new C81063gB(this);
        this.A01 = context2;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet2, AnonymousClass1EM.A1i);
        this.A0B = obtainStyledAttributes.getBoolean(0, true);
        this.A0C = obtainStyledAttributes.getBoolean(1, true);
        int i8 = obtainStyledAttributes.getInt(2, 0);
        obtainStyledAttributes.recycle();
        Resources resources = context2.getResources();
        setContentDescription(resources.getString(C0003R.string.trimmer_content_description));
        this.A02 = resources.getDimensionPixelSize(C0003R.dimen.default_trimmer_handle_width);
        this.A03 = resources.getDimensionPixelSize(C0003R.dimen.default_trimmer_stroke);
        Drawable A032 = C019000b.A03(context2, C0003R.C0004drawable.filmstrip_timeline_trimmer_handle);
        int i9 = this.A03;
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.default_trimmer_corner_radius);
        if (this.A0B) {
            i6 = this.A02;
            drawable = A032;
        }
        if (this.A0C) {
            i7 = this.A02;
            drawable2 = A032;
        }
        this.A06 = resources.getDimensionPixelSize(C0003R.dimen.seeker_thumb_radius);
        this.A07 = resources.getDimensionPixelSize(C0003R.dimen.seeker_thumb_width);
        this.A04 = new C87583r0(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.A0B) {
            i2 = this.A03 + this.A02;
        } else {
            i2 = this.A03;
        }
        int i10 = this.A06;
        if (this.A0C) {
            i3 = this.A03 + this.A02;
        } else {
            i3 = this.A03;
        }
        layoutParams.setMargins(i2, i10, i3, i10);
        addView(this.A04, layoutParams);
        C87593r1 r1 = new C87593r1(context2);
        this.A09 = r1;
        r1.A01 = this.A08;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        if (this.A0B) {
            i4 = this.A03 + this.A02;
        } else {
            i4 = this.A03;
        }
        int i11 = this.A07 >> 1;
        int i12 = i4 - i11;
        if (this.A0C) {
            i5 = this.A03 + this.A02;
        } else {
            i5 = this.A03;
        }
        layoutParams2.setMargins(i12, 0, i5 - i11, 0);
        addView(this.A09, layoutParams2);
        C87603r2 r12 = new C87603r2(context2);
        this.A05 = r12;
        C87613r3 r2 = new C87613r3(-1, dimensionPixelSize, i9);
        if (i6 > 0) {
            C86423p0 r7 = new C86423p0(i6, -1);
            r7.A00(drawable, (-i9) >> 1);
            r2.A02 = r7;
            r2.A07(r2.A06.getShader());
        }
        if (i7 > 0) {
            C86423p0 r3 = new C86423p0(i7, -1);
            r3.A00(drawable2, i9 >> 1);
            r2.A08(r3);
        }
        r2.A06(i8);
        r12.A05 = r2;
        r12.invalidate();
        this.A05.A03 = resources.getDimensionPixelSize(C0003R.dimen.trimmer_touch_padding);
        this.A05.setListener(this.A0A);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        int i13 = this.A06;
        layoutParams3.setMargins(0, i13, 0, i13);
        addView(this.A05, layoutParams3);
    }
}
