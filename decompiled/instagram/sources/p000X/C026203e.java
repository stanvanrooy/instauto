package p000X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.03e  reason: invalid class name and case insensitive filesystem */
public final class C026203e implements AnonymousClass081 {
    public boolean A00 = true;

    public final /* bridge */ /* synthetic */ void Bci(C035307i r6, AnonymousClass080 r7) {
        AnonymousClass01c r62 = (AnonymousClass01c) r6;
        long j = r62.A01;
        if (j != 0) {
            r7.A2V("wakelock_held_time_ms", j);
        }
        long j2 = r62.A00;
        if (j2 != 0) {
            r7.A2V("wakelock_acquired_count", j2);
        }
        if (this.A00) {
            try {
                JSONObject A04 = r62.A04();
                if (A04 != null) {
                    r7.A2W("wakelock_tag_time_ms", A04.toString());
                }
            } catch (JSONException e) {
                C035607l.A00("WakeLockMetricsReporter", "Failed to serialize wakelock attribution data", e);
            }
        }
    }
}
