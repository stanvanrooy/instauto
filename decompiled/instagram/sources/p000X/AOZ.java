package p000X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.AOZ */
public final class AOZ {
    public static AOZ A01;
    public static final APY A02 = new APY();
    public AnonymousClass1HQ A00 = new AnonymousClass1HQ(new AOV((String) null, (String) null, (String) null, false, (String) null, (String) null, (HashMap) null, (String) null, (List) null, (String) null, 1023, (AnonymousClass7BR) null));

    public final ImmutableList A00() {
        List<APS> list;
        AOV aov = (AOV) this.A00.A02();
        if (aov == null || (list = aov.A08) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (APS A002 : list) {
            arrayList.add(A002.A00());
        }
        return ImmutableList.A09(arrayList);
    }

    public final void A01(boolean z) {
        Object A022 = this.A00.A02();
        if (A022 == null) {
            C13150hy.A00();
        }
        AOV aov = (AOV) A022;
        aov.A09 = z;
        this.A00.A09(aov);
    }
}
