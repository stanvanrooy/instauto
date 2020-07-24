package p000X;

import java.util.HashMap;

/* renamed from: X.DKE */
public final class DKE implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C88443sQ A01;
    public final /* synthetic */ String A02;

    public DKE(int i, C88443sQ r2, String str) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void run() {
        int i = this.A00;
        if (C88453sR.A03(i)) {
            this.A01.onSuccess();
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("fba_error_code", String.valueOf(i));
        this.A01.B2h(new DKI(this.A02), hashMap);
    }
}
