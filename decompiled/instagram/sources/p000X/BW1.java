package p000X;

import android.content.Context;

/* renamed from: X.BW1 */
public final class BW1 extends C28735Clq {
    public String A00;
    public final int A01;

    public BW1(Context context, int i) {
        super(context, i);
        int i2 = context.getResources().getDisplayMetrics().densityDpi;
        int i3 = 320;
        if (i2 <= 320) {
            i3 = 250;
            if (i2 <= 250) {
                this.A01 = 72;
                return;
            }
        }
        this.A01 = i3;
    }
}
