package com.facebook.smartcapture.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.smartcapture.p011ui.ResourcesTextView;
import com.facebook.smartcapture.p011ui.SCImageView;
import p000X.AnonymousClass0Z0;
import p000X.C213009Go;
import p000X.C26970BvZ;
import p000X.C27231C3v;
import p000X.C27254C5g;
import p000X.C3w;

public class HelpButton extends LinearLayout {
    public boolean A00;
    public ResourcesTextView A01;
    public final Paint A02 = new Paint(1);
    public final RectF A03 = new RectF();
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final Runnable A05 = new C27231C3v(this);

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x002e  */
    private void A00(Context context) {
        boolean z;
        C27254C5g AKW;
        setOrientation(0);
        setWillNotDraw(false);
        this.A02.setColor(C213009Go.A00(context, C0003R.attr.sc_always_white));
        LayoutInflater.from(context).inflate(C0003R.layout.help_button, this, true);
        Context context2 = context;
        if (context != null) {
            while (true) {
                z = context2 instanceof C3w;
                if (!z && (context2 instanceof ContextWrapper)) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                } else if (z) {
                    AKW = ((C3w) context2).AKW();
                    SCImageView sCImageView = (SCImageView) C26970BvZ.A00(this, C0003R.C0005id.iv_icon);
                    if (AKW != null) {
                        sCImageView.setImageDrawable((Drawable) null);
                    }
                    sCImageView.setColorFilter(C213009Go.A00(context, C0003R.attr.sc_accent));
                    ResourcesTextView resourcesTextView = (ResourcesTextView) C26970BvZ.A00(this, C0003R.C0005id.tv_title);
                    this.A01 = resourcesTextView;
                    resourcesTextView.setTypeface(C213009Go.A02());
                    this.A01.setTextColor(C213009Go.A00(context, C0003R.attr.sc_always_black));
                    setExpanded(false);
                }
            }
            if (z) {
            }
        }
        AKW = null;
        SCImageView sCImageView2 = (SCImageView) C26970BvZ.A00(this, C0003R.C0005id.iv_icon);
        if (AKW != null) {
        }
        sCImageView2.setColorFilter(C213009Go.A00(context, C0003R.attr.sc_accent));
        ResourcesTextView resourcesTextView2 = (ResourcesTextView) C26970BvZ.A00(this, C0003R.C0005id.tv_title);
        this.A01 = resourcesTextView2;
        resourcesTextView2.setTypeface(C213009Go.A02());
        this.A01.setTextColor(C213009Go.A00(context, C0003R.attr.sc_always_black));
        setExpanded(false);
    }

    public void setBackgroundColor(int i) {
        this.A02.setColor(i);
        invalidate();
    }

    public void setExpanded(boolean z) {
        this.A00 = z;
        ResourcesTextView resourcesTextView = this.A01;
        int i = 8;
        if (z) {
            i = 0;
        }
        resourcesTextView.setVisibility(i);
        TransitionManager.beginDelayedTransition(this);
    }

    public final void onDraw(Canvas canvas) {
        float min = ((float) Math.min(getMeasuredWidth(), getMeasuredHeight())) / 2.0f;
        canvas.drawRoundRect(this.A03, min, min, this.A02);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0Z0.A06(1800556241);
        this.A03.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i, (float) i2);
        AnonymousClass0Z0.A0D(677007966, A06);
    }

    public HelpButton(Context context) {
        super(context);
        A00(context);
    }

    public HelpButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public HelpButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    public HelpButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context);
    }
}
