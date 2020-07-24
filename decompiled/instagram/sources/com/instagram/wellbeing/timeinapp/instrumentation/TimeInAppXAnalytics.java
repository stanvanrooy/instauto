package com.instagram.wellbeing.timeinapp.instrumentation;

import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.xanalytics.XAnalyticsAdapter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0WN;

public final class TimeInAppXAnalytics implements XAnalyticsAdapter {
    public static final HashSet A02 = new HashSet(Arrays.asList(new String[]{"wellbeing_timeinapp_perf", "wellbeing_timeinapp_intervals"}));
    public final AnonymousClass0C1 A00;
    public final String A01;

    public final void cleanup() {
    }

    public final void flush() {
    }

    public final String getStructureSamplingConfig(String str) {
        return "";
    }

    public final void logCounter(String str, double d) {
    }

    public final boolean shouldLog(String str) {
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:30|31|32|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0084 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0070=Splitter:B:23:0x0070, B:33:0x007d=Splitter:B:33:0x007d} */
    public final void logEvent(String str, String str2, String str3, boolean z, double d) {
        ByteArrayInputStream byteArrayInputStream;
        if (A02.contains(str)) {
            AnonymousClass0P4 A012 = AnonymousClass0P4.A01(str, "com.instagram.wellbeing.timeinapp.instrumentation.TimeInAppXAnalytics");
            try {
                byteArrayInputStream = new ByteArrayInputStream(str2.getBytes(Charset.forName("UTF8")));
                JsonReader jsonReader = new JsonReader(new InputStreamReader(byteArrayInputStream));
                if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        JsonToken peek = jsonReader.peek();
                        if (peek == JsonToken.NUMBER) {
                            A012.A0F(nextName, Long.valueOf(jsonReader.nextLong()));
                        } else if (peek == JsonToken.STRING) {
                            A012.A0G(nextName, jsonReader.nextString());
                        } else if (peek == JsonToken.BOOLEAN) {
                            A012.A0A(nextName, Boolean.valueOf(jsonReader.nextBoolean()));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.close();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            } catch (Throwable ) {
                throw th;
            }
            A012.A0G("timeinapp_session_id", this.A01);
            AnonymousClass0WN.A01(this.A00).BcG(A012);
            return;
        }
        return;
        try {
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public final void logEventBypassSampling(String str, String str2) {
        logEvent(str, str2, "", false, -1.0d);
    }

    public TimeInAppXAnalytics(AnonymousClass0C1 r2) {
        this.A00 = r2;
        this.A01 = r2.A04();
    }
}
