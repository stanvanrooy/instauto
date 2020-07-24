package p000X;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.00w  reason: invalid class name and case insensitive filesystem */
public final class C020700w extends C035307i {
    public HashMap A00 = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C020700w r5 = (C020700w) obj;
        HashMap hashMap = this.A00;
        if (hashMap != null) {
            return hashMap.equals(r5.A00);
        }
        return r5.A00 == null;
    }

    public final /* bridge */ /* synthetic */ C035307i A01(C035307i r2) {
        this.A00 = ((C020700w) r2).A00;
        return this;
    }

    public final /* bridge */ /* synthetic */ C035307i A02(C035307i r8, C035307i r9) {
        C020700w r82 = (C020700w) r8;
        C020700w r92 = (C020700w) r9;
        if (r92 == null) {
            r92 = new C020700w();
        }
        if (r82 == null) {
            r92.A00 = this.A00;
        } else {
            r92.A00.keySet().retainAll(this.A00.keySet());
            for (Map.Entry entry : this.A00.entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                String str = (String) ((Pair) entry.getValue()).first;
                AnonymousClass01Y r3 = (AnonymousClass01Y) ((Pair) entry.getValue()).second;
                HashMap hashMap = r92.A00;
                Integer valueOf = Integer.valueOf(intValue);
                if (!hashMap.containsKey(valueOf)) {
                    r92.A00.put(valueOf, new Pair(str, new AnonymousClass01Y()));
                }
                AnonymousClass01Y r1 = (AnonymousClass01Y) ((Pair) r92.A00.get(valueOf)).second;
                if (r82.A00.containsKey(valueOf)) {
                    r3.A02((AnonymousClass01Y) ((Pair) r82.A00.get(valueOf)).second, r1);
                } else {
                    r1.A06(r3);
                }
            }
        }
        return r92;
    }

    public final /* bridge */ /* synthetic */ C035307i A03(C035307i r6, C035307i r7) {
        C020700w r62 = (C020700w) r6;
        C020700w r72 = (C020700w) r7;
        r72.A00.keySet().retainAll(this.A00.keySet());
        for (Map.Entry entry : this.A00.entrySet()) {
            if (r72.A00.containsKey(entry.getKey())) {
                ((AnonymousClass01Y) ((Pair) r72.A00.get(Integer.valueOf(((Integer) entry.getKey()).intValue()))).second).A06((AnonymousClass01Y) ((Pair) entry.getValue()).second);
            } else {
                r72.A00.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : r62.A00.entrySet()) {
            int intValue = ((Integer) entry2.getKey()).intValue();
            HashMap hashMap = r72.A00;
            Integer valueOf = Integer.valueOf(intValue);
            if (hashMap.containsKey(valueOf)) {
                AnonymousClass01Y r1 = (AnonymousClass01Y) ((Pair) r72.A00.get(valueOf)).second;
                r1.A03((AnonymousClass01Y) ((Pair) entry2.getValue()).second, r1);
            } else {
                r72.A00.put(entry2.getKey(), entry2.getValue());
            }
        }
        return r72;
    }

    public final int hashCode() {
        HashMap hashMap = this.A00;
        if (hashMap != null) {
            return hashMap.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AnonymousClass000.A0J("ThreadCpuMetrics{ ", this.A00.toString(), " }");
    }
}
