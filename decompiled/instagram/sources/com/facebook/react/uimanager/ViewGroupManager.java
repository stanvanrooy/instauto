package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.WeakHashMap;
import p000X.A9Z;
import p000X.C228039ra;

public abstract class ViewGroupManager extends BaseViewManager implements A9Z {
    public static WeakHashMap mZIndexHash = new WeakHashMap();

    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public boolean shouldPromoteGrandchildren() {
        return false;
    }

    public void updateExtraData(ViewGroup viewGroup, Object obj) {
    }

    public static Integer getViewZIndex(View view) {
        return (Integer) mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i) {
        mZIndexHash.put(view, Integer.valueOf(i));
    }

    public void addViews(ViewGroup viewGroup, List list) {
        C228039ra.A00();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            addView(viewGroup, (View) list.get(i), i);
        }
    }

    public View getChildAt(ViewGroup viewGroup, int i) {
        return viewGroup.getChildAt(i);
    }

    public int getChildCount(ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public Class getShadowNodeClass() {
        return LayoutShadowNode.class;
    }

    public void removeAllViews(ViewGroup viewGroup) {
        C228039ra.A00();
        for (int childCount = getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
            removeViewAt(viewGroup, childCount);
        }
    }

    public void removeView(ViewGroup viewGroup, View view) {
        C228039ra.A00();
        for (int i = 0; i < getChildCount(viewGroup); i++) {
            if (getChildAt(viewGroup, i) == view) {
                removeViewAt(viewGroup, i);
                return;
            }
        }
    }

    public void removeViewAt(ViewGroup viewGroup, int i) {
        C228039ra.A00();
        viewGroup.removeViewAt(i);
    }

    public void addView(ViewGroup viewGroup, View view, int i) {
        viewGroup.addView(view, i);
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }

    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
    }
}
