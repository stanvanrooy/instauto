package p000X;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: X.BP7 */
public final class BP7 extends BOA {
    public final PowerManager A00;

    public static boolean A00(BP7 bp7) {
        if (Build.VERSION.SDK_INT >= 20) {
            bp7.A00.isInteractive();
        }
        return bp7.A00.isScreenOn();
    }

    public final C25584BQq A0A() {
        return new BP8(this);
    }

    public BP7(Context context, BQH bqh) {
        super(context, bqh);
        this.A00 = (PowerManager) context.getSystemService("power");
    }
}
