package p000X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.22r  reason: invalid class name and case insensitive filesystem */
public final class C472122r extends AnonymousClass0O9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C472022q A01;
    public final /* synthetic */ AnonymousClass22L A02;
    public final /* synthetic */ C28371Ll A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C472122r(C28371Ll r2, List list, AnonymousClass22L r4, boolean z, C472022q r6, int i) {
        super(351);
        this.A03 = r2;
        this.A04 = list;
        this.A02 = r4;
        this.A05 = z;
        this.A01 = r6;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        if (r13 >= (r16 - java.util.concurrent.TimeUnit.MINUTES.toMillis((long) r4.A01))) goto L_0x008c;
     */
    public final void run() {
        AnonymousClass1NJ A042;
        Long l;
        boolean z;
        HashSet hashSet = new HashSet();
        ArrayList<AnonymousClass1NG> arrayList = new ArrayList<>();
        synchronized (this.A03.A03) {
            for (String str : this.A04) {
                this.A03.A04.remove(str);
                hashSet.add(str);
            }
            arrayList.addAll(this.A03.A04.values());
        }
        C28371Ll r7 = this.A03;
        AnonymousClass22L r6 = this.A02;
        boolean z2 = this.A05;
        C472022q r4 = this.A01;
        int i = this.A00;
        ArrayList arrayList2 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        for (AnonymousClass1NG r9 : arrayList) {
            if (!(r9 == null || (A042 = r9.A04()) == null || (l = A042.A1Z) == null)) {
                long longValue = l.longValue();
                if (longValue > currentTimeMillis - TimeUnit.MINUTES.toMillis((long) r4.A00)) {
                    z = true;
                }
                z = false;
                if (z && !hashSet.contains(A042.getId())) {
                    boolean z3 = true;
                    if (!C36781ib.A00(A042, r7.A01, true)) {
                        continue;
                    } else {
                        if (!A042.A3V && !r7.A02.AhY(A042.getId())) {
                            z3 = false;
                        }
                        if (z3 == z2) {
                            arrayList2.add(r9);
                            if (arrayList2.size() == i) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        C12670hC.A04(new C472222s(r7, r6, arrayList2));
    }
}
