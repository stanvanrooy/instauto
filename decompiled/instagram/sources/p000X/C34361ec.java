package p000X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.1ec  reason: invalid class name and case insensitive filesystem */
public final class C34361ec extends ContextWrapper {
    public static ArrayList A01;
    public static final Object A02 = new Object();
    public final Resources A00;

    public static Context A00(Context context) {
        C34361ec r1;
        boolean z = false;
        if (!(context instanceof C34361ec) && !(context.getResources() instanceof C34371ed)) {
            context.getResources();
            if (Build.VERSION.SDK_INT < 21) {
                z = true;
            }
        }
        if (!z) {
            return context;
        }
        synchronized (A02) {
            ArrayList arrayList = A01;
            if (arrayList == null) {
                A01 = new ArrayList();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) A01.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        A01.remove(size);
                    }
                }
                for (int size2 = A01.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) A01.get(size2);
                    if (weakReference2 != null) {
                        r1 = (C34361ec) weakReference2.get();
                    } else {
                        r1 = null;
                    }
                    if (r1 != null && r1.getBaseContext() == context) {
                        return r1;
                    }
                }
            }
            C34361ec r2 = new C34361ec(context);
            A01.add(new WeakReference(r2));
            return r2;
        }
    }

    public final AssetManager getAssets() {
        return this.A00.getAssets();
    }

    public final Resources getResources() {
        return this.A00;
    }

    public C34361ec(Context context) {
        super(context);
        this.A00 = new C34371ed(this, context.getResources());
    }

    public final Resources.Theme getTheme() {
        return super.getTheme();
    }

    public final void setTheme(int i) {
        super.setTheme(i);
    }
}
