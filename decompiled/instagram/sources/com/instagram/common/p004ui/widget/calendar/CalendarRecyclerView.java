package com.instagram.common.p004ui.widget.calendar;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000X.AnonymousClass1PH;
import p000X.AnonymousClass6W4;
import p000X.AnonymousClass6W8;
import p000X.C31521Yp;

/* renamed from: com.instagram.common.ui.widget.calendar.CalendarRecyclerView */
public class CalendarRecyclerView extends RecyclerView {
    public final GridLayoutManager A00;

    public void setAdapter(AnonymousClass1PH r3) {
        if (r3 instanceof AnonymousClass6W4) {
            AnonymousClass6W4 r32 = (AnonymousClass6W4) r3;
            this.A00.A23(new AnonymousClass6W8(r32));
            super.setAdapter(r32);
            return;
        }
        throw new IllegalArgumentException("adapter must be an instance of CalendarAdapter");
    }

    public CalendarRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CalendarRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CalendarRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(AnonymousClass6W4.A05);
        this.A00 = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
        C31521Yp recycledViewPool = getRecycledViewPool();
        recycledViewPool.A02(2, 21);
        recycledViewPool.A02(0, 90);
        recycledViewPool.A02(1, 28);
    }
}
