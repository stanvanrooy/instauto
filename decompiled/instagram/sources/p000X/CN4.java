package p000X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.CN4 */
public final class CN4 {
    public Context A00;
    public SharedPreferences A01;
    public AnonymousClass0C1 A02;

    public final long A00() {
        String A04 = this.A02.A04();
        if (A04 != null) {
            return this.A01.getLong(AnonymousClass000.A0E(A04, "LAST_UPLOAD_SUCCESS_TS"), 0);
        }
        return 0;
    }

    public final String A01() {
        String A04 = this.A02.A04();
        return A04 != null ? this.A01.getString(AnonymousClass000.A0E(A04, "last_upload_client_root_hash"), "") : "";
    }

    public CN4(Context context, AnonymousClass0C1 r4) {
        this.A00 = context;
        this.A02 = r4;
        this.A01 = C14190ju.A01(r4).A03(Constants.A15);
    }
}
