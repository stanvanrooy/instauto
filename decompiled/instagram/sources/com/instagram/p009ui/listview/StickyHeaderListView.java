package com.instagram.p009ui.listview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;
import p000X.C27301Hh;

/* renamed from: com.instagram.ui.listview.StickyHeaderListView */
public class StickyHeaderListView extends FrameLayout {
    public C27301Hh A00;
    public final Rect A01;
    public final Rect A02;

    private float getContentPosition() {
        C27301Hh r0 = this.A00;
        if (r0 == null) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return r0.A00 - r0.A01;
    }

    public Rect getTopChromeArea() {
        if (this.A01.height() == 0) {
            getGlobalVisibleRect(this.A01);
        }
        Rect rect = this.A02;
        Rect rect2 = this.A01;
        rect.top = rect2.top;
        rect.bottom = rect2.top + Math.round(getContentPosition());
        rect.left = rect2.left;
        rect.right = rect2.left + getWidth();
        return this.A02;
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0Z0.A06(599425621);
        super.onAttachedToWindow();
        this.A00 = C27301Hh.A00(getContext());
        AnonymousClass0Z0.A0D(580546913, A06);
    }

    public final void onFinishInflate() {
        int A06 = AnonymousClass0Z0.A06(-1974584638);
        super.onFinishInflate();
        this.A00 = C27301Hh.A00(getContext());
        AnonymousClass0Z0.A0D(47742888, A06);
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new Rect();
        this.A01 = new Rect();
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet, C27301Hh r3) {
        this(context, attributeSet);
        this.A00 = r3;
    }
}
