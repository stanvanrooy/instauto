package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BEZ */
public final class BEZ implements C25323BEd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;

    public BEZ(Integer num, int i, int i2, Long l, Long l2, List list, List list2) {
        this.A02 = num;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = l;
        this.A04 = l2;
        this.A05 = list;
        this.A06 = list2;
    }

    public final C25325BEf A24(C25325BEf bEf) {
        if (bEf == null) {
            bEf = C25325BEf.A00(0, 0, 0, 0, 0, new ArrayList(), new ArrayList());
        }
        Integer num = this.A02;
        int intValue = num != null ? num.intValue() : bEf.A03();
        int i = this.A00;
        int i2 = this.A01;
        Long l = this.A03;
        long longValue = l != null ? l.longValue() : bEf.A05();
        Long l2 = this.A04;
        long A062 = l2 == null ? bEf.A06() : l2.longValue();
        List list = this.A05;
        if (list == null) {
            list = bEf.A0B();
        }
        List list2 = this.A06;
        if (list2 == null) {
            List A09 = bEf.A09();
            list2 = A09 != null ? new ArrayList(A09) : new ArrayList();
        }
        return C25325BEf.A00(intValue, i, i2, longValue, A062, list, list2);
    }
}
