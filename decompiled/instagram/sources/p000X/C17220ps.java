package p000X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0ps  reason: invalid class name and case insensitive filesystem */
public final class C17220ps {
    public static final long A04;
    public static final long A05;
    public static final long A06;
    public static final C05110Id A07 = new AnonymousClass09F(6);
    public static final C05110Id A08 = new AnonymousClass09F(2000L);
    public static final C05110Id A09 = new AnonymousClass09F(10);
    public final C17120pi A00;
    public final C05110Id A01;
    public final String A02;
    public final Map A03;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A04 = timeUnit.toMillis(1);
        A05 = timeUnit.toMillis(2);
        A06 = timeUnit.toMillis(1);
    }

    public final long A00(String str) {
        if (this.A03.containsKey(str)) {
            return ((Long) this.A03.get(str)).longValue();
        }
        AnonymousClass0QD.A04("DirectMutationDefinition_getMutationTtlMs", AnonymousClass000.A0E("Unsupported lifecycle state: ", str), 1);
        return A04;
    }

    public C17220ps(C17060pc r6) {
        long j;
        this.A02 = r6.A0A;
        this.A00 = r6.A07;
        this.A01 = new C17230pt(r6);
        HashMap hashMap = new HashMap();
        hashMap.put("queued", Long.valueOf(A04));
        hashMap.put("executing", Long.valueOf(A04));
        long j2 = 0;
        if (r6.A05) {
            j = A05;
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(j);
        hashMap.put("upload_failed_transient", valueOf);
        hashMap.put("upload_failed_permanent", valueOf);
        hashMap.put("uploaded", Long.valueOf(r6.A06 ? A06 : j2));
        this.A03 = Collections.unmodifiableMap(hashMap);
    }
}
