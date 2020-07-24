package p000X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.1Aa  reason: invalid class name and case insensitive filesystem */
public abstract class C25731Aa {
    public static int A00 = -100;
    public static final AnonymousClass003 A01 = new AnonymousClass003();
    public static final Object A02 = new Object();

    public static void A08(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && A00 != i) {
            A00 = i;
            synchronized (A02) {
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    C25731Aa r0 = (C25731Aa) ((WeakReference) it.next()).get();
                    if (r0 != null) {
                        r0.A0W();
                    }
                }
            }
        }
    }

    public int A0A() {
        return -100;
    }

    public abstract MenuInflater A0B();

    public abstract View A0C(int i);

    public abstract C54062Vp A0D();

    public abstract void A0E();

    public abstract void A0F();

    public abstract void A0G();

    public abstract void A0H();

    public abstract void A0I();

    public abstract void A0J();

    public void A0K(int i) {
    }

    public abstract void A0L(int i);

    public void A0M(Context context) {
    }

    public abstract void A0N(Configuration configuration);

    public abstract void A0O(Bundle bundle);

    public abstract void A0P(Bundle bundle);

    public abstract void A0Q(Bundle bundle);

    public abstract void A0R(View view);

    public abstract void A0S(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0T(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0U(Toolbar toolbar);

    public abstract void A0V(CharSequence charSequence);

    public abstract boolean A0W();

    public abstract boolean A0X(int i);

    public static void A09(C25731Aa r3) {
        synchronized (A02) {
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                C25731Aa r0 = (C25731Aa) ((WeakReference) it.next()).get();
                if (r0 == r3 || r0 == null) {
                    it.remove();
                }
            }
        }
    }
}
