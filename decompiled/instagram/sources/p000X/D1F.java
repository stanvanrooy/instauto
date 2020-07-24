package p000X;

import java.util.List;
import java.util.Map;

/* renamed from: X.D1F */
public abstract class D1F implements C29606D1l, D14 {
    public int A00;
    public int A01;
    public D17 A02;
    public String A03;
    public byte[] A04;

    public final void A01(D19 d19) {
        Map AUX;
        D17 d17 = this.A02;
        if (d17 != null && d19 != null && (AUX = d17.AUX()) != null) {
            List list = (List) AUX.get("x-fb-origin-hit");
            if (list != null && !list.isEmpty()) {
                d19.BSU("x-fb-origin-hit", list.get(0));
            }
            List list2 = (List) AUX.get("x-fb-edge-hit");
            if (list2 != null && !list2.isEmpty()) {
                d19.BSU("x-fb-edge-hit", list2.get(0));
            }
            List list3 = (List) AUX.get("X-FB-Connection-Quality");
            if (list3 != null && !list3.isEmpty()) {
                d19.BSU("X-FB-Connection-Quality", list3.get(0));
            }
            List list4 = (List) AUX.get("x-fb-response-time-ms");
            if (list4 != null && !list4.isEmpty()) {
                d19.BSU("x-fb-response-time-ms", list4.get(0));
            }
        }
    }

    public boolean A02() {
        int i = this.A01;
        if (i < 0 || i != this.A00) {
            return false;
        }
        return true;
    }

    public final void Bsq(int i) {
    }
}
