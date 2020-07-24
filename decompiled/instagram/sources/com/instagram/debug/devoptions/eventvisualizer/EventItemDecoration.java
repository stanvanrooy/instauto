package com.instagram.debug.devoptions.eventvisualizer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import p000X.AnonymousClass1Xv;
import p000X.AnonymousClass1YW;
import p000X.AnonymousClass1ZN;
import p000X.C019000b;

public class EventItemDecoration extends AnonymousClass1YW {
    public final int mDividerHeight;
    public final int mLeftOffset;
    public final Paint mPaint;
    public final int mRightOffset;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass1Xv r5) {
        rect.left = this.mLeftOffset;
        rect.right = this.mRightOffset;
    }

    public EventItemDecoration(Context context) {
        this.mDividerHeight = context.getResources().getDimensionPixelSize(C0003R.dimen.event_visualizer_divider_height);
        this.mLeftOffset = context.getResources().getDimensionPixelSize(C0003R.dimen.event_visualizer_left_offset);
        this.mRightOffset = context.getResources().getDimensionPixelSize(C0003R.dimen.event_visualizer_right_offset);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(C019000b.A00(context, C0003R.color.white_60_transparent));
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, AnonymousClass1Xv r15) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((AnonymousClass1ZN) childAt.getLayoutParams()).bottomMargin;
            canvas.drawRect((float) paddingLeft, (float) bottom, (float) width, (float) (this.mDividerHeight + bottom), this.mPaint);
        }
    }
}
