package p000X;

import java.util.HashSet;
import java.util.UUID;

/* renamed from: X.0bL  reason: invalid class name and case insensitive filesystem */
public final class C09400bL implements C06560Pn {
    public final /* synthetic */ C09380bJ A00;

    public final void As0(C06590Pq r1) {
    }

    public C09400bL(C09380bJ r1) {
        this.A00 = r1;
    }

    public final void Arz(C06590Pq r10) {
        AnonymousClass0RU A01 = AnonymousClass0WN.A01(r10);
        if (C05700Lp.A00() instanceof C05700Lp) {
            C05700Lp r5 = (C05700Lp) C05700Lp.A00();
            if (r5.A08.nextInt(100) == 0) {
                String uuid = UUID.randomUUID().toString();
                HashSet<String> hashSet = new HashSet<>();
                synchronized (r5.A01) {
                    try {
                        hashSet.addAll(r5.A04.keySet());
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
                for (String str : hashSet) {
                    synchronized (r5.A01) {
                        try {
                            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_executor_task", (AnonymousClass0RN) null);
                            A002.A0G("name", str);
                            A002.A0E("total_count", (Integer) r5.A04.get(str));
                            A002.A0F("total_time", (Long) r5.A07.get(str));
                            A002.A0G("session_id", uuid);
                            A01.BcG(A002);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            }
            synchronized (r5.A01) {
                try {
                    r5.A04.clear();
                    r5.A07.clear();
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        }
    }
}
