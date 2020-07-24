package p000X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.1Ad  reason: invalid class name and case insensitive filesystem */
public final class C25751Ad {
    public static C25751Ad A01;
    public static final PorterDuff.Mode A02 = PorterDuff.Mode.SRC_IN;
    public C25761Ae A00;

    public final synchronized ColorStateList A03(Context context, int i) {
        return this.A00.A06(context, i);
    }

    public final synchronized Drawable A04(Context context, int i) {
        return this.A00.A07(context, i);
    }

    public static synchronized PorterDuffColorFilter A00(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter A002;
        synchronized (C25751Ad.class) {
            A002 = C25761Ae.A00(i, mode);
        }
        return A002;
    }

    public static synchronized C25751Ad A01() {
        C25751Ad r0;
        synchronized (C25751Ad.class) {
            if (A01 == null) {
                A02();
            }
            r0 = A01;
        }
        return r0;
    }

    public static synchronized void A02() {
        synchronized (C25751Ad.class) {
            if (A01 == null) {
                C25751Ad r1 = new C25751Ad();
                A01 = r1;
                r1.A00 = C25761Ae.A02();
                C25761Ae r12 = A01.A00;
                C25781Ag r0 = new C25781Ag();
                synchronized (r12) {
                    r12.A01 = r0;
                }
            }
        }
    }
}
