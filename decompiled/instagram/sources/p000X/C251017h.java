package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.17h  reason: invalid class name and case insensitive filesystem */
public final class C251017h implements C250917g {
    public final List AJs() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = C027904b.A02;
        long[] jArr = C027904b.A01;
        AnonymousClass0Cb.A02("/proc/meminfo", strArr, jArr);
        long A00 = jArr[Constants.A0N.intValue()] + C027904b.A00() + jArr[Constants.ONE.intValue()];
        long j = jArr[Constants.ZERO.intValue()];
        arrayList.add(new C181927pj(C181917pi.A0L, j, j - A00));
        arrayList.add(new C181927pj(C181917pi.A0K, -1, C027904b.A01()));
        arrayList.add(new C181927pj(C181917pi.A0M, -1, jArr[Constants.A12.intValue()]));
        arrayList.add(new C181927pj(C181917pi.A0J, j, jArr[Constants.A0u.intValue()]));
        return arrayList;
    }
}
