package p000X;

import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* renamed from: X.AP2 */
public final class AP2 implements C28007CZr {
    public final /* synthetic */ AOZ A00;
    public final /* synthetic */ AOV A01;

    public AP2(AOV aov, AOZ aoz) {
        this.A01 = aov;
        this.A00 = aoz;
    }

    public final void BGk(CZV czv, C28003CZn cZn) {
        AP5 ap5;
        String str;
        C13150hy.A01(czv, "result");
        boolean z = false;
        if (czv.A00 == 0) {
            z = true;
        }
        if (z) {
            HashMap hashMap = this.A01.A07;
            ImmutableList<String> A002 = this.A00.A00();
            if (A002 != null) {
                for (String str2 : A002) {
                    if (!(cZn == null || (ap5 = (AP5) cZn.A01.get(str2)) == null || (str = ap5.A00) == null)) {
                        hashMap.put(str2, str);
                    }
                }
            }
        }
        AOV aov = this.A01;
        aov.A09 = false;
        this.A00.A00.A09(aov);
    }
}
