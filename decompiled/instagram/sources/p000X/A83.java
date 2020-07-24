package p000X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;

/* renamed from: X.A83 */
public final class A83 {
    public PopupMenu A00;
    public HashMap A01;
    public boolean A02;
    public final RectF A03 = new RectF();
    public final SparseArray A04;
    public final SparseArray A05;
    public final SparseBooleanArray A06;
    public final A8t A07 = new A8t();
    public final RootViewManager A08;
    public final C23125A8d A09;
    public final A0Z A0A = new A0Z();

    public final synchronized View A02(int i) {
        View view;
        view = (View) this.A05.get(i);
        if (view == null) {
            throw new A0i(AnonymousClass000.A06("Trying to resolve view with tag ", i, " which doesn't exist"));
        }
        return view;
    }

    public final synchronized ViewManager A03(int i) {
        ViewManager viewManager;
        viewManager = (ViewManager) this.A04.get(i);
        if (viewManager == null) {
            throw new A0i(AnonymousClass000.A06("ViewManager for tag ", i, " could not be found.\n"));
        }
        return viewManager;
    }

    public final synchronized void A04(int i, int i2, A1e a1e) {
        C228039ra.A00();
        View view = (View) this.A05.get(i);
        if (view != null) {
            A03(i).receiveCommand(view, i2, a1e);
        } else {
            throw new A9K(AnonymousClass000.A07("Trying to send command to a non-existing view with tag [", i, "] and command ", i2));
        }
    }

    public final synchronized void A05(int i, C230099zE r5) {
        C228039ra.A00();
        try {
            ViewManager A032 = A03(i);
            View A022 = A02(i);
            if (r5 != null) {
                A032.updateProperties(A022, r5);
            }
        } catch (A0i e) {
            AnonymousClass0CH.A09("NativeViewHierarchyManager", AnonymousClass000.A05("Unable to update properties for view tag ", i), e);
        }
        return;
    }

    public final synchronized void A06(int i, String str, A1e a1e) {
        C228039ra.A00();
        View view = (View) this.A05.get(i);
        if (view != null) {
            A03(i).receiveCommand(view, str, a1e);
        } else {
            throw new A9K(AnonymousClass000.A0A("Trying to send command to a non-existing view with tag [", i, "] and command ", str));
        }
    }

    public final synchronized void A07(int i, int[] iArr) {
        A9P a9p;
        C228039ra.A00();
        View view = (View) this.A05.get(i);
        if (view != null) {
            View view2 = (View) A6A.A00(view);
            if (view2 != null) {
                A01(view2, iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                A01(view, iArr);
                iArr[0] = iArr[0] - i2;
                iArr[1] = iArr[1] - i3;
            } else {
                a9p = new A9P(AnonymousClass000.A06("Native view ", i, " is no longer on screen"));
            }
        } else {
            a9p = new A9P(AnonymousClass000.A06("No native view for ", i, " currently exists"));
        }
        throw a9p;
    }

    public final synchronized void A08(View view) {
        C228039ra.A00();
        if (!(view == null || this.A04.get(view.getId()) == null)) {
            if (!this.A06.get(view.getId())) {
                A03(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = (ViewManager) this.A04.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                    if (childAt == null) {
                        AnonymousClass0CH.A06("NativeViewHierarchyManager", "Unable to drop null child view");
                    } else if (this.A05.get(childAt.getId()) != null) {
                        A08(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.A05.remove(view.getId());
            this.A04.remove(view.getId());
        }
    }

    public A83(C23125A8d a8d) {
        RootViewManager rootViewManager = new RootViewManager();
        this.A09 = a8d;
        this.A05 = new SparseArray();
        this.A04 = new SparseArray();
        this.A06 = new SparseBooleanArray();
        this.A08 = rootViewManager;
    }

    public static String A00(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, A8r[] a8rArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            sb.append(AnonymousClass000.A06("  children(", viewGroupManager.getChildCount(viewGroup), "): [\n"));
            for (int i = 0; viewGroupManager.getChildAt(viewGroup, i) != null; i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (viewGroupManager.getChildAt(viewGroup, i3) == null || i2 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(AnonymousClass000.A00(viewGroupManager.getChildAt(viewGroup, i3).getId(), ","));
                        i2++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            int length = iArr.length;
            sb.append(AnonymousClass000.A06("  indicesToRemove(", length, "): [\n"));
            for (int i4 = 0; i4 < length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 >= length || i5 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(AnonymousClass000.A00(iArr[i6], ","));
                        i5++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (a8rArr != null) {
            int length2 = a8rArr.length;
            sb.append(AnonymousClass000.A06("  viewsToAdd(", length2, "): [\n"));
            for (int i7 = 0; i7 < length2; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 >= length2 || i8 >= 16) {
                        sb.append("\n");
                    } else {
                        A8r a8r = a8rArr[i9];
                        sb.append(AnonymousClass000.A08("[", a8r.A00, ",", a8r.A01, "],"));
                        i8++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            int length3 = iArr2.length;
            sb.append(AnonymousClass000.A06("  tagsToDelete(", length3, "): [\n"));
            for (int i10 = 0; i10 < length3; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 >= length3 || i11 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(AnonymousClass000.A00(iArr2[i12], ","));
                        i11++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    private void A01(View view, int[] iArr) {
        this.A03.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) view.getWidth(), (float) view.getHeight());
        RectF rectF = this.A03;
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset((float) view.getLeft(), (float) view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset((float) view2.getLeft(), (float) view2.getTop());
            parent = view2.getParent();
        }
        RectF rectF2 = this.A03;
        float f = rectF2.left;
        iArr[0] = Math.round(f);
        float f2 = rectF2.top;
        iArr[1] = Math.round(f2);
        iArr[2] = Math.round(rectF2.right - f);
        iArr[3] = Math.round(rectF2.bottom - f2);
    }
}
