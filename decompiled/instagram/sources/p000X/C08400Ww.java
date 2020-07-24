package p000X;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.0Ww  reason: invalid class name and case insensitive filesystem */
public enum C08400Ww {
    BLOCKED_COUNTRIES_HOSTNAME("host_name_ipv6", r8),
    BLOCKED_COUNTRIES_ANALYTICS_ENDPOINT("analytics_endpoint", r8),
    BLOCKED_COUNTRIES_HN_TIMESTAMP("bc_host_name_timestamp", r22),
    ANALYTIC_FB_UID("fb_uid", r8),
    ANALYTIC_UID(MemoryDumpUploadJob.EXTRA_USER_ID, r8),
    ANALYTIC_IS_EMPLOYEE("is_employee", r2),
    ANALYTIC_YEAR_CLASS("year_class", r15),
    LOGGING_HEALTH_STATS_SAMPLE_RATE("logging_health_stats_sample_rate", r15),
    LOG_ANALYTICS_EVENTS("log_analytic_events", r2),
    LOGGING_ANALYTICS_EVENTS_SAMPLE_RATE("logging_analytic_events_sample_rate", r15);
    
    public final C08390Wv A00;
    public final String A01;

    public final Object A00(SharedPreferences sharedPreferences, Object obj) {
        if (obj == null || this.A00.A00().isInstance(obj)) {
            return this.A00.A01(sharedPreferences, this.A01, obj);
        }
        throw new ClassCastException("Cannot cast" + obj.getClass());
    }

    public final void A01(SharedPreferences.Editor editor, Object obj) {
        if (obj == null || this.A00.A00().isInstance(obj)) {
            this.A00.A03(editor, name(), obj);
            return;
        }
        throw new ClassCastException("Cannot cast" + obj.getClass());
    }

    public final void A02(Bundle bundle, Object obj) {
        if (obj == null || this.A00.A00().isInstance(obj)) {
            this.A00.A04(bundle, name(), obj);
            return;
        }
        throw new ClassCastException("Cannot cast" + obj.getClass());
    }

    /* access modifiers changed from: public */
    C08400Ww(String str, C08390Wv r4) {
        this.A01 = str;
        this.A00 = r4;
    }
}
