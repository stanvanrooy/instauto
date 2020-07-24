package p000X;

import android.view.View;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.A8Y */
public final class A8Y {
    public static final A9F A00;

    public static A8Z A02(A9A a9a, AnonymousClass2D9 r10, List list, A9F a9f) {
        A9A a9a2 = a9a;
        AnonymousClass2D9 r7 = r10;
        A8o a8o = (A8o) a9a.A00().A00.get(r10);
        if (a8o == null || !(a8o instanceof A8Z)) {
            AD0 ad0 = new AD0(a9f);
            if (r10 instanceof AnonymousClass2DE) {
                ((AnonymousClass2DE) r7).A5h(ad0);
            }
            AnonymousClass28U r1 = r10.A00;
            if (r1 instanceof AnonymousClass2DE) {
                ((AnonymousClass2DE) r1).A5h(ad0);
            }
            boolean z = true;
            if (r10 instanceof AnonymousClass2D6) {
                z = false;
            }
            if (z) {
                A8Z a8z = new A8Z(a9a2, r7, ad0, new A9S(r10), (C23167AAv) null);
                list.add(a8z);
                ad0.setMeasureFunction(a8z);
                return a8z;
            }
            AnonymousClass2D6 r12 = (AnonymousClass2D6) r7;
            A8Z a8z2 = new A8Z(a9a2, r7, ad0, (A9S) null, r12.A05(a9a2));
            a9a2.A00().A01.put(r7, a8z2);
            List list2 = r12.A00;
            for (int i = 0; i < list2.size(); i++) {
                A8Z A02 = A02(a9a2, (AnonymousClass2D9) list2.get(i), list, a9f);
                if (A02.A09.getDisplay() != A9D.NONE) {
                    ad0.addChildAt(A02.A09, a8z2.A09.getChildCount());
                    a8z2.A0A.add(A02);
                }
            }
            return a8z2;
        }
        A8Z a8z3 = (A8Z) a8o;
        return A03(a8z3, a8z3.A09.cloneWithChildren(), a9a, list);
    }

    static {
        AD2 ad2 = new AD2();
        A00 = ad2;
        ad2.A02(true);
    }

    public static int A00(float f) {
        double d;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            d = ((double) f) + 0.5d;
        } else {
            d = ((double) f) - 0.5d;
        }
        return (int) d;
    }

    public static A8Z A03(A8Z a8z, A8M a8m, A9A a9a, List list) {
        AnonymousClass2D9 r5 = a8z.A05;
        A9A a9a2 = a9a;
        A8Z a8z2 = new A8Z(a9a2, r5, a8m, a8z.A08, a8z.A07);
        if (a8z.A08 == null) {
            a9a.A00().A01.put(r5, a8z2);
        }
        for (int i = 0; i < a8z.AIB(); i++) {
            a8z2.A0A.add(A03((A8Z) a8z.AI3(i), a8m.getChildAt(i), a9a, list));
        }
        if (a8z2.A08 != null) {
            list.add(a8z2);
            a8m.setMeasureFunction(a8z2);
        }
        return a8z2;
    }

    public static int A01(float f, C230049z6 r3) {
        int i;
        int i2;
        switch (r3.ordinal()) {
            case 0:
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            case 1:
                i = A00(f);
                i2 = C25913Bc3.MAX_SIGNED_POWER_OF_TWO;
                break;
            case 2:
                i = A00(f);
                i2 = Process.WAIT_RESULT_TIMEOUT;
                break;
            default:
                throw new IllegalArgumentException("Unexpected YogaMeasureMode: " + r3);
        }
        return View.MeasureSpec.makeMeasureSpec(i, i2);
    }
}
