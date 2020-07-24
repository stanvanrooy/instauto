package p000X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.1e1  reason: invalid class name and case insensitive filesystem */
public final class C34091e1 implements ComponentCallbacks2 {
    public static C34091e1 A04;
    public boolean A00;
    public final AnonymousClass0PR A01;
    public final Queue A02 = new LinkedList();
    public final Queue A03 = new LinkedList();

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void A00() {
        this.A03.clear();
        this.A02.clear();
        this.A00 = false;
    }

    public final void onTrimMemory(int i) {
        if (i >= 20) {
            A00();
        }
    }

    public C34091e1(Context context, AnonymousClass0C1 r7) {
        this.A01 = new AnonymousClass0PR(context, ((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.ADAPTER_LEAK_LAUNCHER, "fix_async_layout_inflater_leak", false, (AnonymousClass04H) null)).booleanValue());
    }

    public final void onLowMemory() {
        A00();
    }
}
