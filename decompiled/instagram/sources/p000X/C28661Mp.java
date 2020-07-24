package p000X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1Mp  reason: invalid class name and case insensitive filesystem */
public final class C28661Mp extends C28681Mr {
    public long A00;
    public B3G A01;
    public C43411uN A02;
    public C32091aX A03;
    public C32061aU A04;
    public AnonymousClass2FD A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public List A0B;

    public final List A01() {
        List list = this.A0A;
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public final /* bridge */ /* synthetic */ C28681Mr A00() {
        A02();
        return this;
    }

    public final void A02() {
        super.A00();
        List<AnonymousClass1NG> list = this.A0A;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            long currentTimeMillis = System.currentTimeMillis();
            for (AnonymousClass1NG r2 : list) {
                C29261Pf r1 = r2.A0H;
                if (r1 != C29261Pf.UNKNOWN) {
                    if (r1 == C29261Pf.MEDIA) {
                        AnonymousClass1NJ A042 = r2.A04();
                        A042.A2D = this.A08;
                        A042.A1Z = Long.valueOf(currentTimeMillis);
                    }
                    arrayList.add(r2);
                }
            }
            this.A0A = arrayList;
        } else {
            List<AnonymousClass1NJ> list2 = this.A06;
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (AnonymousClass1NJ A012 : list2) {
                    arrayList2.add(AnonymousClass1NG.A01(A012));
                }
                this.A0A = arrayList2;
            }
        }
        List list3 = this.A0B;
        if (list3 != null && !list3.isEmpty()) {
            this.A03 = new C32091aX(((Integer) ((C32041aR) this.A0B.get(0)).A00.get(0)).intValue(), ((Integer) ((C32041aR) this.A0B.get(1)).A00.get(1)).intValue(), ((Integer) ((C32041aR) this.A0B.get(0)).A00.get(1)).intValue());
        }
    }

    public final boolean isOk() {
        if (super.isOk() || this.mStatusCode == 204) {
            return true;
        }
        return false;
    }
}
