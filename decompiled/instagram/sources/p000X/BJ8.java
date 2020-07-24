package p000X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: X.BJ8 */
public final class BJ8 extends BJ9 {
    public final Bundle A00 = new Bundle();

    public final int AQI() {
        return 12451000;
    }

    public BJ8(Context context, Looper looper, C25387BHd bHd, C25437BKa bKa, BEH beh) {
        super(context, looper, 16, bHd, bKa, beh);
    }

    public final boolean BdW() {
        C25387BHd bHd = this.A01;
        if (TextUtils.isEmpty((CharSequence) null)) {
            return false;
        }
        bHd.A04.get(C25429BJl.A01);
        if (!bHd.A05.isEmpty()) {
            return true;
        }
        return false;
    }
}
