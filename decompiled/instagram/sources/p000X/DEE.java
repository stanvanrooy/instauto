package p000X;

import android.graphics.PorterDuff;

/* renamed from: X.DEE */
public final /* synthetic */ class DEE {
    public static final /* synthetic */ int[] A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001b */
    static {
        int[] iArr = new int[PorterDuff.Mode.values().length];
        A00 = iArr;
        iArr[PorterDuff.Mode.DST_IN.ordinal()] = 1;
        iArr[PorterDuff.Mode.DST_OUT.ordinal()] = 2;
        try {
            iArr[PorterDuff.Mode.CLEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
    }
}
