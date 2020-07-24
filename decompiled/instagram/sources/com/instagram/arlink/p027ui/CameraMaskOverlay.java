package com.instagram.arlink.p027ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;
import p000X.C06220Of;
import p000X.C60702kK;

/* renamed from: com.instagram.arlink.ui.CameraMaskOverlay */
public class CameraMaskOverlay extends ImageView {
    public View A00;
    public boolean A01;
    public final Paint A02 = new Paint();
    public final Path A03 = new Path();

    public final void onDraw(Canvas canvas) {
        if (!this.A03.isEmpty()) {
            if (this.A01) {
                canvas.drawPath(this.A03, this.A02);
            }
            canvas.clipPath(this.A03, Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    public void setImageAlpha(int i) {
        boolean z = false;
        if (i < 255) {
            z = true;
        }
        this.A01 = z;
        this.A02.setColor(C60702kK.A03(-16777216, i));
        super.setImageAlpha(i);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0Z0.A06(-1657312850);
        super.onSizeChanged(i, i2, i3, i4);
        View view = this.A00;
        if (view != null) {
            RectF A0A = C06220Of.A0A(view);
            if (A0A.width() > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && A0A.height() > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                this.A03.reset();
                this.A03.addOval(A0A, Path.Direction.CW);
            }
            this.A02.setColor(-16777216);
        }
        AnonymousClass0Z0.A0D(1157724998, A06);
    }

    public void setCameraView(View view) {
        this.A00 = view;
    }

    public CameraMaskOverlay(Context context) {
        super(context);
    }

    public CameraMaskOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraMaskOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
