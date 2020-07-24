package p000X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Ha  reason: invalid class name and case insensitive filesystem */
public abstract class C27241Ha {
    public abstract Object A04(Object obj);

    public abstract Object A05(Object obj);

    public abstract Object A06(Object obj, Object obj2, Object obj3);

    public abstract Object A07(Object obj, Object obj2, Object obj3);

    public abstract void A08(ViewGroup viewGroup, Object obj);

    public abstract void A0A(Object obj, Rect rect);

    public abstract void A0B(Object obj, View view);

    public abstract void A0C(Object obj, View view);

    public abstract void A0D(Object obj, View view);

    public abstract void A0E(Object obj, View view, ArrayList arrayList);

    public abstract void A0F(Object obj, View view, ArrayList arrayList);

    public abstract void A0G(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void A0H(Object obj, ArrayList arrayList);

    public abstract void A0I(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract void A0J(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract boolean A0M(Object obj);

    public static boolean A03(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final void A01(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static void A02(List list, View view) {
        boolean z;
        boolean z2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (list.get(i) == view) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            list.add(view);
            for (int i2 = size; i2 < list.size(); i2++) {
                View view2 = (View) list.get(i2);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                z2 = false;
                                break;
                            } else if (list.get(i4) == childAt) {
                                z2 = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (!z2) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public final void A0K(ArrayList arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (AnonymousClass4GL.A00(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                A0K(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    public final void A0L(Map map, View view) {
        if (view.getVisibility() == 0) {
            String A0D = AnonymousClass1E1.A0D(view);
            if (A0D != null) {
                map.put(A0D, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    A0L(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public void A09(AnonymousClass1HD r1, Object obj, AnonymousClass30Z r3, Runnable runnable) {
        runnable.run();
    }
}
