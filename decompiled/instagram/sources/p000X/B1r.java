package p000X;

import android.text.TextUtils;

/* renamed from: X.B1r */
public final class B1r implements Runnable {
    public final /* synthetic */ AV6 A00;
    public final /* synthetic */ C25119B1s A01;
    public final /* synthetic */ String A02;

    public B1r(C25119B1s b1s, AV6 av6, String str) {
        this.A01 = b1s;
        this.A00 = av6;
        this.A02 = str;
    }

    public final void run() {
        synchronized (this.A01.A04) {
            for (B2T b2t : this.A01.A04) {
                String str = this.A02;
                if (!TextUtils.isEmpty(str)) {
                    C25116B1m.A01(b2t.A01).A05(b2t.A00.A01, Constants.A0O, new C25123B1x(b2t, str));
                }
            }
        }
    }
}
