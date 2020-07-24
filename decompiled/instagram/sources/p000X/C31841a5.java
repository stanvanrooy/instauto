package p000X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1a5  reason: invalid class name and case insensitive filesystem */
public interface C31841a5 {
    void addView(View view, int i);

    void addView(View view, int i, ViewGroup.LayoutParams layoutParams);

    void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams);

    void detachViewFromParent(View view);

    Context getContext();

    int getMeasuredHeight();

    int getMeasuredWidth();
}
