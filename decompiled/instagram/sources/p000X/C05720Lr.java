package p000X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0Lr  reason: invalid class name and case insensitive filesystem */
public final class C05720Lr {
    public long A00 = 0;
    public final String A01;
    public final String A02;
    public final Map A03 = new HashMap();
    public final Set A04;
    public final AtomicLong A05 = new AtomicLong(-7200000);

    public final Map A00() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.A03.entrySet()) {
            hashMap.put(entry.getKey(), ((AnonymousClass0LL) entry.getValue()).A01);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public C05720Lr(String str, String str2, HashMap hashMap, List list) {
        this.A01 = str;
        this.A02 = str2;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.A03.put((String) entry.getKey(), (AnonymousClass0LL) entry.getValue());
        }
        HashSet hashSet = new HashSet(this.A03.keySet());
        this.A04 = hashSet;
        hashSet.addAll(list);
    }
}
