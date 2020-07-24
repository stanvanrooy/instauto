package p000X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.0jU  reason: invalid class name and case insensitive filesystem */
public abstract class C13930jU {
    public static synchronized void A02(C13930jU r5, AnonymousClass0P4 r6) {
        synchronized (r5) {
            r5.A07();
            long currentTimeMillis = System.currentTimeMillis();
            r6.A0G("waterfall_id", r5.A05());
            r6.A0F(TraceFieldType.StartTime, Long.valueOf(r5.A03()));
            r6.A0F("current_time", Long.valueOf(currentTimeMillis));
            r6.A0F("elapsed_time", Long.valueOf(currentTimeMillis - r5.A03()));
        }
    }

    public abstract long A03();

    public abstract String A05();

    public abstract String A06();

    public abstract void A07();

    public final AnonymousClass0P4 A04(String str) {
        AnonymousClass0P4 A01 = AnonymousClass0P4.A01(str, A06());
        A02(this, A01);
        return A01;
    }
}
