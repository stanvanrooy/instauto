package p000X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0c1  reason: invalid class name and case insensitive filesystem */
public abstract class C09790c1 implements Runnable, Comparable {
    public Set A00;
    public CountDownLatch A01 = new CountDownLatch(1);
    public boolean A02;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();

    public boolean A05() {
        return false;
    }

    public void A06() {
    }

    public abstract void A07();

    public final void A03() {
        if (this.A00 == null) {
            this.A00 = new HashSet(this.A03);
            for (C09790c1 r0 : this.A03) {
                r0.A03();
                this.A00.addAll(r0.A00);
            }
        }
    }

    public final void A04() {
        if (!this.A02) {
            for (C09790c1 r1 : this.A03) {
                if (!r1.A02) {
                    throw new RuntimeException(AnonymousClass000.A0J(r1.getClass().getSimpleName(), "needs to be initialized before ", getClass().getSimpleName()));
                }
            }
            A07();
            this.A02 = true;
        }
    }

    public final int compareTo(Object obj) {
        return this.A00.size() - ((C09790c1) obj).A00.size();
    }

    public final void run() {
        for (C09790c1 r0 : this.A03) {
            try {
                r0.A01.await();
            } catch (InterruptedException e) {
                throw new RuntimeException("Cold Start Job is interrupted", e);
            }
        }
        A04();
        this.A01.countDown();
    }
}
