package com.instagram.p009ui.widget.nestablescrollingview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p000X.AnonymousClass2ZF;
import p000X.C712939w;

/* renamed from: com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView */
public class NestableRecyclerView extends AnonymousClass2ZF {
    public final C712939w A00;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A00.A00(motionEvent, getParent(), this.A0L.A1b());
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setPassThroughEdge(int i) {
        this.A00.A00 = i;
    }

    public NestableRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NestableRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = new C712939w(this);
    }
}
