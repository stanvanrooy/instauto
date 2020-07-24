package com.instagram.common.p004ui.blur;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass3RY;

/* renamed from: com.instagram.common.ui.blur.BlurRecyclerView */
public class BlurRecyclerView extends RecyclerView {
    public AnonymousClass3RY A00;

    public final void draw(Canvas canvas) {
        int A03 = AnonymousClass0Z0.A03(-1353349744);
        super.draw(canvas);
        AnonymousClass3RY r0 = this.A00;
        if (r0 != null) {
            r0.A00(canvas);
        }
        AnonymousClass0Z0.A0A(479034109, A03);
    }

    public AnonymousClass3RY getBlurController() {
        return this.A00;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        AnonymousClass3RY r0 = this.A00;
        if (r0 != null) {
            r0.A00(canvas);
        }
    }

    public void setBlurController(AnonymousClass3RY r1) {
        this.A00 = r1;
    }

    public BlurRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public BlurRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BlurRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = null;
    }
}
