package p000X;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: X.12f  reason: invalid class name and case insensitive filesystem */
public final class C238712f {
    public boolean A00 = false;
    public final C14590lB A01;
    public final boolean A02;
    public final C238912i A03;
    public final Executor A04;
    public final boolean A05;

    public C238712f(C14590lB r3, C238912i r4, Executor executor, boolean z) {
        this.A04 = executor;
        this.A03 = r4;
        this.A02 = z;
        this.A01 = r3;
        this.A05 = true;
    }

    private void A00(CountDownLatch countDownLatch, Set set) {
        C2094790j Apm = this.A03.Apm(Constants.A0N);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Apm.A02((String) it.next());
        }
        Apm.A03().A03(this.A04, new C209358zx(this, set, countDownLatch));
    }

    public final void A01() {
        boolean A07;
        if (!this.A02) {
            A07 = false;
        } else {
            A07 = this.A01.A00("AppModules::NeedToFallbackDownload").A07("key::NeedFallback");
        }
        if (A07) {
            this.A00 = false;
            Set<String> A002 = new AnonymousClass90U(this.A01).A00();
            if (AnonymousClass0DB.A0S()) {
                Iterator it = A002.iterator();
                boolean z = true;
                while (it.hasNext()) {
                    it.next();
                    if (z) {
                        z = false;
                    }
                }
            }
            if (A002.isEmpty()) {
                C22450yR A052 = this.A01.A00("AppModules::NeedToFallbackDownload").A05();
                A052.A0B("key::NeedFallback", false);
                A052.A04();
            } else if (this.A05) {
                CountDownLatch countDownLatch = new CountDownLatch(A002.size());
                for (String add : A002) {
                    AnonymousClass003 r0 = new AnonymousClass003();
                    r0.add(add);
                    A00(countDownLatch, r0);
                }
            } else {
                A00(new CountDownLatch(1), A002);
            }
        }
    }
}
