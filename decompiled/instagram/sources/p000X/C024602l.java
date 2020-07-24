package p000X;

import android.content.Context;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.02l  reason: invalid class name and case insensitive filesystem */
public final class C024602l extends AnonymousClass0CU {
    public final boolean A00;

    public final C022401p A00(int i, C021801j r3, int i2) {
        if (i == 6) {
            return MultiSignalANRDetector.A00(r3);
        }
        return super.A00(i, r3, i2);
    }

    public final boolean A02() {
        return false;
    }

    public final AnonymousClass08S A01() {
        return new AnonymousClass08S(this);
    }

    public final boolean A03(String str) {
        if (!this.A00 || !str.equals("DATA_FILE_LS_LR")) {
            return super.A03(str);
        }
        return false;
    }

    public C024602l(Context context, String str, boolean z, boolean z2) {
        super(context, str, z);
        this.A00 = z2;
    }
}
