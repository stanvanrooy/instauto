package p000X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BQQ */
public final class BQQ {
    public static BQQ A01;
    public static Object sReputationTierUpdateProviderLock = new Object();
    public final List A00 = Collections.synchronizedList(new ArrayList());

    public final synchronized void A00(BQK bqk) {
        for (C25581BQn Bt1 : this.A00) {
            Bt1.Bt1(bqk);
        }
    }
}
