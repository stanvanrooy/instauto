package p000X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.A5x */
public final class A5x {
    public static int A00 = 250;
    public static boolean A01;

    public static void A01(ViewGroup viewGroup, Integer num, float f, float f2) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            Integer num2 = num;
            A3W.A02((A3N) viewGroup.getContext(), viewGroup.getId()).ACG(C230189zW.A00(viewGroup.getId(), num2, viewGroup.getScrollX(), viewGroup.getScrollY(), f, f2, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
        }
    }

    public static int A00(String str) {
        if (str == null || str.equals("auto")) {
            return 1;
        }
        if (str.equals("always")) {
            return 0;
        }
        if (str.equals("never")) {
            return 2;
        }
        throw new A0k(AnonymousClass000.A0E("wrong overScrollMode: ", str));
    }
}
