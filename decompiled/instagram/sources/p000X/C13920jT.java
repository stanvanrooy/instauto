package p000X;

import android.content.SharedPreferences;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.0jT  reason: invalid class name and case insensitive filesystem */
public final class C13920jT extends C13930jU {
    public static final Map A05 = new HashMap();
    public long A00;
    public String A01;
    public final C13950jW A02;
    public final C13940jV A03;
    public final String A04;

    public final synchronized long A03() {
        A07();
        return this.A00;
    }

    public final synchronized String A05() {
        A07();
        return this.A01;
    }

    public final synchronized void A07() {
        if (this.A01 == null) {
            C13940jV r0 = this.A03;
            this.A01 = r0.A00.getString(r0.A01, (String) null);
            C13950jW r02 = this.A02;
            this.A00 = Long.valueOf(r02.A00.getLong(r02.A01, 0)).longValue();
            if (this.A01 == null) {
                String uuid = UUID.randomUUID().toString();
                this.A01 = uuid;
                this.A00 = System.currentTimeMillis();
                this.A03.A00(uuid);
                this.A02.A00(Long.valueOf(this.A00));
            }
        }
    }

    public final synchronized void A08() {
        C13940jV r2 = this.A03;
        r2.A00.edit().remove(r2.A01).apply();
        C13950jW r22 = this.A02;
        r22.A00.edit().remove(r22.A01).apply();
        this.A01 = null;
    }

    public static synchronized C13920jT A00(String str) {
        C13920jT A012;
        synchronized (C13920jT.class) {
            A012 = A01(str, (AnonymousClass0RN) null);
        }
        return A012;
    }

    public static synchronized C13920jT A01(String str, AnonymousClass0RN r4) {
        C13920jT r1;
        String str2;
        synchronized (C13920jT.class) {
            r1 = (C13920jT) A05.get(str);
            if (r1 == null) {
                if (r4 == null) {
                    str2 = AnonymousClass000.A0E("waterfall_", str);
                } else {
                    str2 = r4.getModuleName();
                }
                r1 = new C13920jT(str, str2);
                A05.put(str, r1);
            }
        }
        return r1;
    }

    public final String A06() {
        return this.A04;
    }

    public C13920jT(String str, String str2) {
        String A0E = AnonymousClass000.A0E("waterfall_", str);
        this.A04 = str2;
        SharedPreferences sharedPreferences = StoredPreferences.A00.getSharedPreferences(A0E, 0);
        this.A03 = new C13940jV(sharedPreferences, "id");
        this.A02 = new C13950jW(sharedPreferences, TraceFieldType.StartTime);
    }
}
