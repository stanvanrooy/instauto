package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.0o5  reason: invalid class name and case insensitive filesystem */
public final class C16130o5 extends C16140o6 {
    public Context A00 = StoredPreferences.A00;
    public Handler A01;
    public boolean A02;

    public final synchronized boolean A00(C06590Pq r13, String str, String str2, String str3, String str4, String str5, String str6) {
        boolean z;
        if (this.A02 || !r13.AgN()) {
            z = false;
        } else {
            z = true;
            this.A02 = true;
            AnonymousClass0C1 A022 = C05210Iq.A02(r13);
            Handler handler = this.A01;
            if (handler == null || handler.getLooper() == null) {
                this.A01 = new Handler(Looper.getMainLooper());
            }
            C05700Lp.A00().ADc(new C125795aM(this, str, str4, str5, A022, str2, str3, str6));
        }
        return z;
    }
}
