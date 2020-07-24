package p000X;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseArray;

/* renamed from: X.1Ff  reason: invalid class name and case insensitive filesystem */
public final class C26771Ff {
    public static final SparseArray A00 = new SparseArray();

    public static ColorFilter A00(int i) {
        ColorFilter colorFilter = (ColorFilter) A00.get(i);
        if (colorFilter != null) {
            return colorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        A00.put(i, porterDuffColorFilter);
        return porterDuffColorFilter;
    }
}
