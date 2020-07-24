package p000X;

import com.facebook.common.dextricks.DexStore;
import java.lang.ref.WeakReference;

/* renamed from: X.1nc  reason: invalid class name and case insensitive filesystem */
public final class C39821nc {
    public int A00;
    public int A01;
    public WeakReference A02;
    public boolean A03;
    public final C37671k2 A04;
    public final String A05;

    public final C39681nJ A00() {
        WeakReference weakReference = this.A02;
        if (weakReference == null) {
            return null;
        }
        return (C39681nJ) weakReference.get();
    }

    public C39821nc(C37671k2 r2) {
        this.A04 = r2;
        this.A05 = null;
        this.A01 = DexStore.LOAD_RESULT_WITH_VDEX_ODEX;
    }

    public C39821nc(C37671k2 r2, String str) {
        this.A04 = r2;
        this.A05 = str;
        this.A01 = DexStore.LOAD_RESULT_WITH_VDEX_ODEX;
    }
}
