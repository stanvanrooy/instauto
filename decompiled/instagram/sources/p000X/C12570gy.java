package p000X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0gy  reason: invalid class name and case insensitive filesystem */
public final class C12570gy implements C06040Nn {
    public String A00;
    public final HashMap A01 = new HashMap();
    public final Set A02 = new HashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        if (r1 == false) goto L_0x002b;
     */
    public final synchronized int AV2(int i) {
        int i2;
        boolean z;
        int size;
        C06740Qf A002 = C06740Qf.A00();
        if (A002 != null) {
            String str = this.A00;
            C06730Qe A022 = C06740Qf.A02(A002);
            if (A022 != null) {
                C14610lD A023 = A022.A02(str);
                C14610lD.A01(A023);
                synchronized (A023.A02) {
                    size = A023.A04.size();
                }
                boolean z2 = false;
                if (size > 0) {
                    z2 = true;
                }
                z = true;
            }
            z = false;
            if (z && !this.A02.contains(Integer.valueOf(i))) {
                C06740Qf A003 = C06740Qf.A00();
                String valueOf = String.valueOf((short) (i >> 16));
                String valueOf2 = String.valueOf((short) (i & 65535));
                String str2 = this.A00;
                C06730Qe A024 = C06740Qf.A02(A003);
                AnonymousClass0a4.A06(A024);
                i2 = A024.A01("perf", valueOf, valueOf2, str2);
            }
        }
        if (C06610Ps.A02()) {
            i2 = 10;
        } else {
            HashMap hashMap = this.A01;
            Integer valueOf3 = Integer.valueOf(i);
            if (hashMap.containsKey(valueOf3)) {
                i2 = ((Integer) this.A01.get(valueOf3)).intValue();
            } else {
                i2 = 1000;
            }
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (((java.lang.Integer) r2.A01.get(r1)).intValue() != r4) goto L_0x001c;
     */
    public final synchronized boolean Ac4(int i, int i2) {
        boolean z;
        HashMap hashMap = this.A01;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            z = true;
        }
        z = false;
        return z;
    }

    public final synchronized void Bjk(int i, int i2) {
        this.A01.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void Blb(String str) {
        this.A00 = str;
    }
}
