package p000X;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.AOL */
public final class AOL implements C11200ea {
    public final /* synthetic */ C23470ANr A00;

    public AOL(C23470ANr aNr) {
        this.A00 = aNr;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0Z0.A03(1423578256);
        AIZ aiz = (AIZ) obj;
        int A032 = AnonymousClass0Z0.A03(-1258423547);
        AKU aku = this.A00.A0e;
        if (aku.A06(Collections.unmodifiableSet(aiz.A01).size())) {
            aku.A03(new HashSet(Collections.unmodifiableSet(aiz.A01)), aiz.A00);
            C23467ANo aNo = this.A00.A06;
            if (aNo != null) {
                aNo.A09.A00();
            }
        }
        AnonymousClass0Z0.A0A(-567141311, A032);
        AnonymousClass0Z0.A0A(-1502857268, A03);
    }
}
