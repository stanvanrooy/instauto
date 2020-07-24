package p000X;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.BH8 */
public final class BH8 {
    public C42001rL A00;
    public final SparseIntArray A01;

    public final int A00(Context context, C25376BGp bGp) {
        AnonymousClass0a2.A02(context);
        AnonymousClass0a2.A02(bGp);
        if (!bGp.BdV()) {
            return 0;
        }
        int AQI = bGp.AQI();
        int i = this.A01.get(AQI, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 < this.A01.size()) {
                int keyAt = this.A01.keyAt(i2);
                if (keyAt > AQI && this.A01.get(keyAt) == 0) {
                    i = 0;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (i == -1) {
            i = this.A00.A03(context, AQI);
        }
        this.A01.put(AQI, i);
        return i;
    }

    public BH8() {
        this(GoogleApiAvailability.A00);
    }

    public BH8(C42001rL r2) {
        this.A01 = new SparseIntArray();
        AnonymousClass0a2.A02(r2);
        this.A00 = r2;
    }
}
