package p000X;

import android.os.Handler;
import java.util.TreeSet;

/* renamed from: X.14j  reason: invalid class name and case insensitive filesystem */
public final class C243814j implements C243614h {
    public final long A00;
    public final C243914k A01;
    public final TreeSet A02 = new TreeSet();
    public final Handler A03;
    public final Runnable A04 = new C244014l(this);

    public final void Bhr(AnonymousClass0C1 r1, boolean z) {
    }

    public C243814j(Handler handler, C243914k r3, long j) {
        this.A03 = handler;
        this.A01 = r3;
        this.A00 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        if (r9 != false) goto L_0x006f;
     */
    public final void Bed(AnonymousClass0C1 r12, AnonymousClass4YE r13) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        while (!this.A02.isEmpty()) {
            long longValue = ((Long) this.A02.first()).longValue();
            if (longValue >= currentTimeMillis) {
                break;
            }
            this.A02.remove(Long.valueOf(longValue));
        }
        long j = r13.A00;
        long j2 = j - currentTimeMillis;
        if (j2 > 0) {
            TreeSet treeSet = this.A02;
            Long valueOf = Long.valueOf(j);
            Long l = (Long) treeSet.ceiling(valueOf);
            Long l2 = (Long) this.A02.floor(valueOf);
            boolean z2 = false;
            if (l != null && Math.abs(l.longValue() - j) < this.A00) {
                z2 = true;
            }
            if (!z2) {
                boolean z3 = false;
                if (l2 != null && Math.abs(l2.longValue() - j) < this.A00) {
                    z3 = true;
                }
                z = true;
            }
            z = false;
            if (z) {
                this.A02.add(Long.valueOf(j));
                AnonymousClass0ZA.A09(this.A03, this.A04, j2, 935546076);
            }
        }
    }
}
