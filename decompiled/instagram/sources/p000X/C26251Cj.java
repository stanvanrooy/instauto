package p000X;

import com.facebook.proxygen.RequestStats;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Cj  reason: invalid class name and case insensitive filesystem */
public final class C26251Cj {
    public String A00 = null;
    public final C15920nk A01;
    public final List A02;

    public final void A00(RequestStats requestStats) {
        for (C15000mA BJN : this.A02) {
            BJN.BJN(this.A01, requestStats, this.A00);
        }
    }

    public C26251Cj(C15920nk r2, C26261Ck r3, C14980m8 r4) {
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        this.A01 = r2;
        arrayList.add(r3);
        if (r4 != null) {
            this.A02.add(r4);
        }
    }
}
