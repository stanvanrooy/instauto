package p000X;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.23j  reason: invalid class name and case insensitive filesystem */
public final class C473123j {
    public static final C473123j A04 = new C473123j(64, (CharSequence) null);
    public static final C473123j A05 = new C473123j(128, (CharSequence) null);
    public static final C473123j A06 = new C473123j(2, (CharSequence) null);
    public static final C473123j A07 = new C473123j(8, (CharSequence) null);
    public static final C473123j A08 = new C473123j(16, (CharSequence) null);
    public static final C473123j A09 = new C473123j((int) DexStore.LOAD_RESULT_WITH_VDEX_ODEX, (CharSequence) null);
    public static final C473123j A0A;
    public static final C473123j A0B = new C473123j((int) DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET, (CharSequence) null);
    public static final C473123j A0C = new C473123j((int) DexStore.LOAD_RESULT_PGO_ATTEMPTED, (CharSequence) null);
    public static final C473123j A0D = new C473123j(1048576, (CharSequence) null);
    public static final C473123j A0E = new C473123j((int) DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, (CharSequence) null);
    public static final C473123j A0F = new C473123j(1, (CharSequence) null);
    public static final C473123j A0G;
    public static final C473123j A0H = new C473123j(32, (CharSequence) null);
    public static final C473123j A0I;
    public static final C473123j A0J;
    public static final C473123j A0K;
    public static final C473123j A0L;
    public static final C473123j A0M;
    public static final C473123j A0N;
    public static final C473123j A0O;
    public static final C473123j A0P = new C473123j((int) DexStore.LOAD_RESULT_PGO, (CharSequence) null);
    public static final C473123j A0Q;
    public static final C473123j A0R;
    public static final C473123j A0S = new C473123j(8192, (CharSequence) null);
    public static final C473123j A0T;
    public static final C473123j A0U = new C473123j(4096, (CharSequence) null);
    public static final C473123j A0V;
    public static final C473123j A0W;
    public static final C473123j A0X;
    public static final C473123j A0Y;
    public static final C473123j A0Z = new C473123j(4, (CharSequence) null);
    public static final C473123j A0a;
    public static final C473123j A0b = new C473123j((int) DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP, C30616DgB.class);
    public static final C473123j A0c = new C473123j(2097152, C30617DgC.class);
    public static final C473123j A0d;
    public static final C473123j A0e;
    public final Object A00;
    public final int A01;
    public final C473523n A02;
    public final Class A03;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C473123j)) {
            C473123j r4 = (C473123j) obj;
            Object obj2 = this.A00;
            return obj2 == null ? r4.A00 == null : obj2.equals(r4.A00);
        }
    }

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14 = null;
        Class<Dg6> cls = Dg6.class;
        A0J = new C473123j(256, (Class) cls);
        A0Q = new C473123j(512, (Class) cls);
        Class<Dg7> cls2 = Dg7.class;
        A0K = new C473123j(1024, (Class) cls2);
        A0R = new C473123j(2048, (Class) cls2);
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15 = null;
        A0d = new C473123j(accessibilityAction, 16908342, (CharSequence) null, (C473523n) null, (Class) null);
        if (i >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction2 = null;
        }
        A0X = new C473123j(accessibilityAction2, 16908343, (CharSequence) null, (C473523n) null, Dg9.class);
        if (i >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction3 = null;
        }
        A0Y = new C473123j(accessibilityAction3, 16908344, (CharSequence) null, (C473523n) null, (Class) null);
        if (i >= 23) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction4 = null;
        }
        A0V = new C473123j(accessibilityAction4, 16908345, (CharSequence) null, (C473523n) null, (Class) null);
        if (i >= 23) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction5 = null;
        }
        A0T = new C473123j(accessibilityAction5, 16908346, (CharSequence) null, (C473523n) null, (Class) null);
        if (i >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        A0W = new C473123j(accessibilityAction6, 16908347, (CharSequence) null, (C473523n) null, (Class) null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction7 = null;
        }
        A0O = new C473123j(accessibilityAction7, 16908358, (CharSequence) null, (C473523n) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction8 = null;
        }
        A0L = new C473123j(accessibilityAction8, 16908359, (CharSequence) null, (C473523n) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction9 = null;
        }
        A0M = new C473123j(accessibilityAction9, 16908360, (CharSequence) null, (C473523n) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction10 = null;
        }
        A0N = new C473123j(accessibilityAction10, 16908361, (CharSequence) null, (C473523n) null, (Class) null);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction11 = null;
        }
        A0A = new C473123j(accessibilityAction11, 16908348, (CharSequence) null, (C473523n) null, (Class) null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction12 = null;
        }
        A0a = new C473123j(accessibilityAction12, 16908349, (CharSequence) null, (C473523n) null, C30615DgA.class);
        if (i3 >= 26) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction13 = null;
        }
        A0I = new C473123j(accessibilityAction13, 16908354, (CharSequence) null, (C473523n) null, Dg8.class);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        }
        A0e = new C473123j(accessibilityAction15, 16908356, (CharSequence) null, (C473523n) null, (Class) null);
        if (i4 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        }
        A0G = new C473123j(accessibilityAction14, 16908357, (CharSequence) null, (C473523n) null, (Class) null);
    }

    public final int A00() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.A00).getId();
        }
        return 0;
    }

    public final CharSequence A01() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.A00).getLabel();
        }
        return null;
    }

    public final int hashCode() {
        Object obj = this.A00;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public C473123j(int i, CharSequence charSequence) {
        this((Object) null, i, charSequence, (C473523n) null, (Class) null);
    }

    public C473123j(int i, Class cls) {
        this((Object) null, i, (CharSequence) null, (C473523n) null, cls);
    }

    public C473123j(Object obj, int i, CharSequence charSequence, C473523n r6, Class cls) {
        this.A01 = i;
        this.A02 = r6;
        if (Build.VERSION.SDK_INT < 21 || obj != null) {
            this.A00 = obj;
        } else {
            this.A00 = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        }
        this.A03 = cls;
    }
}
