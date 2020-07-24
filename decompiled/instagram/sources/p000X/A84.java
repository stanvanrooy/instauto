package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.A84 */
public final class A84 extends A9H {
    public final int[] A00;
    public final int[] A01;
    public final A8r[] A02;
    public final /* synthetic */ A8K A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A84(A8K a8k, int i, int[] iArr, A8r[] a8rArr, int[] iArr2) {
        super(a8k, i);
        this.A03 = a8k;
        this.A00 = iArr;
        this.A02 = a8rArr;
        this.A01 = iArr2;
    }

    public final void execute() {
        A0i a0i;
        A0i a0i2;
        boolean z;
        A83 a83 = this.A03.A0L;
        int i = this.A00;
        int[] iArr = this.A00;
        A8r[] a8rArr = this.A02;
        int[] iArr2 = this.A01;
        synchronized (a83) {
            C228039ra.A00();
            if (a83.A01 == null) {
                a83.A01 = new HashMap();
            }
            HashMap hashMap = a83.A01;
            Integer valueOf = Integer.valueOf(i);
            Integer num = valueOf;
            if (!hashMap.containsKey(num)) {
                a83.A01.put(num, new HashSet());
            }
            Set set = (Set) a83.A01.get(num);
            ViewGroup viewGroup = (ViewGroup) a83.A05.get(i);
            ViewGroupManager viewGroupManager = (ViewGroupManager) a83.A03(i);
            if (viewGroup != null) {
                int childCount = viewGroupManager.getChildCount(viewGroup);
                if (iArr != null) {
                    int length = iArr.length - 1;
                    while (true) {
                        if (length >= 0) {
                            int i2 = iArr[length];
                            if (i2 >= 0) {
                                if (viewGroupManager.getChildAt(viewGroup, i2) != null) {
                                    if (i2 >= childCount) {
                                        a0i2 = new A0i("Trying to remove an out of order view index:" + i2 + " view tag: " + i + "\n detail: " + A83.A00(viewGroup, viewGroupManager, iArr, a8rArr, iArr2));
                                        break;
                                    }
                                    View childAt = viewGroupManager.getChildAt(viewGroup, i2);
                                    if (a83.A02 && a83.A0A.A03(childAt)) {
                                        int id = childAt.getId();
                                        if (iArr2 != null) {
                                            int length2 = iArr2.length;
                                            int i3 = 0;
                                            while (true) {
                                                if (i3 >= length2) {
                                                    break;
                                                } else if (iArr2[i3] == id) {
                                                    z = true;
                                                    break;
                                                } else {
                                                    i3++;
                                                }
                                            }
                                        }
                                        z = false;
                                        if (z) {
                                            length--;
                                            childCount = i2;
                                        }
                                    }
                                    viewGroupManager.removeViewAt(viewGroup, i2);
                                    length--;
                                    childCount = i2;
                                } else if (!a83.A06.get(i) || viewGroupManager.getChildCount(viewGroup) != 0) {
                                    a0i2 = new A0i("Trying to remove a view index above child count " + i2 + " view tag: " + i + "\n detail: " + A83.A00(viewGroup, viewGroupManager, iArr, a8rArr, iArr2));
                                }
                            } else {
                                a0i2 = new A0i("Trying to remove a negative view index:" + i2 + " view tag: " + i + "\n detail: " + A83.A00(viewGroup, viewGroupManager, iArr, a8rArr, iArr2));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    throw a0i2;
                }
                if (iArr2 != null) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= iArr2.length) {
                            break;
                        }
                        int i5 = iArr2[i4];
                        View view = (View) a83.A05.get(i5);
                        if (view == null) {
                            a0i = new A0i(AnonymousClass000.A0A("Trying to destroy unknown view tag: ", i5, "\n detail: ", A83.A00(viewGroup, viewGroupManager, iArr, a8rArr, iArr2)));
                            break;
                        }
                        if (!a83.A02 || !a83.A0A.A03(view)) {
                            a83.A08(view);
                        } else {
                            set.add(Integer.valueOf(i5));
                            A0Z a0z = a83.A0A;
                            A8j a8j = new A8j(a83, viewGroupManager, viewGroup, view, set, i);
                            C228039ra.A00();
                            Animation A012 = a0z.A05.A01(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
                            if (A012 != null) {
                                View view2 = view;
                                view.setClickable(false);
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroup2 = (ViewGroup) view2;
                                    for (int i6 = 0; i6 < viewGroup2.getChildCount(); i6++) {
                                        View childAt2 = viewGroup2.getChildAt(i6);
                                        childAt2.setClickable(false);
                                        if (childAt2 instanceof ViewGroup) {
                                            ViewGroup viewGroup3 = (ViewGroup) childAt2;
                                            for (int i7 = 0; i7 < viewGroup3.getChildCount(); i7++) {
                                                A0Z.A01(a0z, viewGroup3.getChildAt(i7));
                                            }
                                        }
                                    }
                                }
                                A012.setAnimationListener(new A97(a0z, a8j));
                                long duration = A012.getDuration();
                                if (duration > a0z.A00) {
                                    A0Z.A00(a0z, duration);
                                    a0z.A00 = duration;
                                }
                                view.startAnimation(A012);
                            } else {
                                a8j.A00();
                            }
                        }
                        i4++;
                    }
                }
                if (a8rArr != null) {
                    int i8 = 0;
                    while (i8 < a8rArr.length) {
                        A8r a8r = a8rArr[i8];
                        View view3 = (View) a83.A05.get(a8r.A01);
                        if (view3 != null) {
                            int i9 = a8r.A00;
                            if (!set.isEmpty()) {
                                i9 = 0;
                                int i10 = 0;
                                while (i9 < viewGroup.getChildCount() && i10 != a8r.A00) {
                                    if (!set.contains(Integer.valueOf(viewGroup.getChildAt(i9).getId()))) {
                                        i10++;
                                    }
                                    i9++;
                                }
                            }
                            viewGroupManager.addView(viewGroup, view3, i9);
                            i8++;
                        } else {
                            a0i = new A0i(AnonymousClass000.A0A("Trying to add unknown view tag: ", a8r.A01, "\n detail: ", A83.A00(viewGroup, viewGroupManager, iArr, a8rArr, iArr2)));
                        }
                    }
                }
                if (set.isEmpty()) {
                    a83.A01.remove(valueOf);
                }
            } else {
                a0i = new A0i(AnonymousClass000.A0A("Trying to manageChildren view with tag ", i, " which doesn't exist\n detail: ", A83.A00(viewGroup, viewGroupManager, iArr, a8rArr, iArr2)));
            }
            throw a0i;
        }
    }
}
