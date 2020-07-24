package com.facebook.smartcapture.components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.C26970BvZ;

public class ContourView extends FrameLayout {
    public float A00;
    public float A01;
    public float A02;
    public ImageView A03 = ((ImageView) C26970BvZ.A00(this, C0003R.C0005id.iv_contour_bottom_left));
    public ImageView A04 = ((ImageView) C26970BvZ.A00(this, C0003R.C0005id.iv_contour_bottom_right));
    public ImageView A05 = ((ImageView) C26970BvZ.A00(this, C0003R.C0005id.iv_contour_top_left));
    public ImageView A06 = ((ImageView) C26970BvZ.A00(this, C0003R.C0005id.iv_contour_top_right));
    public ImageView A07 = ((ImageView) C26970BvZ.A00(this, C0003R.C0005id.iv_id_placeholder));
    public TextView A08 = ((TextView) C26970BvZ.A00(this, C0003R.C0005id.tv_text_tip));
    public DottedAlignmentView A09 = ((DottedAlignmentView) C26970BvZ.A00(this, C0003R.C0005id.dotted_alignment_view));
    public boolean A0A;

    public static void A00(View view, Rect rect, float f) {
        view.setX(((float) rect.left) + f);
        view.setY(((float) rect.top) + f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = ((int) f) << 1;
        layoutParams.width = rect.width() - i;
        layoutParams.height = rect.height() - i;
        view.requestLayout();
    }

    public void setIdPlaceholderVisibility(int i) {
        this.A07.setVisibility(i);
    }

    public void setTextTip(int i) {
        this.A08.setText(i);
    }

    public void setTextTipVisible(boolean z) {
        if (z) {
            this.A08.animate().alpha(1.0f);
        } else {
            this.A08.animate().alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    public ContourView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), C0003R.layout.contour_view, this);
        Resources resources = getResources();
        this.A00 = resources.getDimension(C0003R.dimen.contour_dot_margin);
        this.A01 = resources.getDimension(C0003R.dimen.id_placeholder_margin2);
        this.A02 = resources.getDimension(C0003R.dimen.contour_text_tip_margin);
        setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A0A = true;
    }
}
