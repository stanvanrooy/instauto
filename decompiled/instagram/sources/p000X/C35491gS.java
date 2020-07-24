package p000X;

import android.os.Build;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: X.1gS  reason: invalid class name and case insensitive filesystem */
public final class C35491gS {
    public final Object A00;

    public static C35491gS A00(WindowInsets windowInsets) {
        return new C35491gS(windowInsets);
    }

    public final int A01() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.A00).getStableInsetBottom();
        }
        return 0;
    }

    public final int A02() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.A00).getStableInsetTop();
        }
        return 0;
    }

    public final int A03() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public final int A04() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public final int A05() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetRight();
        }
        return 0;
    }

    public final int A06() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetTop();
        }
        return 0;
    }

    public final WindowInsets A07() {
        return (WindowInsets) this.A00;
    }

    public final C35491gS A08() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C35491gS(((WindowInsets) this.A00).consumeSystemWindowInsets());
        }
        return null;
    }

    public final C35491gS A09(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C35491gS(((WindowInsets) this.A00).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public final boolean A0A() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.A00).isConsumed();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35491gS)) {
            return false;
        }
        return Objects.equals(this.A00, ((C35491gS) obj).A00);
    }

    public final int hashCode() {
        Object obj = this.A00;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public C35491gS(Object obj) {
        this.A00 = obj;
    }
}
