package p000X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Lq  reason: invalid class name and case insensitive filesystem */
public final class C05710Lq extends C44281vt {
    public final /* synthetic */ C05690Lo A00;
    public final /* synthetic */ AnonymousClass0LQ A01;

    public final int getRunnableId() {
        return 310;
    }

    public C05710Lq(C05690Lo r1, AnonymousClass0LQ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.A00.A05) {
            try {
                hashMap = new HashMap(this.A00.A05);
                this.A00.A05.clear();
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        synchronized (this.A00.A04) {
            try {
                hashMap2 = new HashMap(this.A00.A04);
                this.A00.A04.clear();
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                    break;
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.A00.A00.A00((String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            this.A00.A00.A00((String) entry2.getKey(), (String) entry2.getValue());
        }
        this.A01.A0I(this.A00.A01, hashMap.keySet(), hashMap2.keySet());
        try {
            C16180oA A002 = C16180oA.A00(this.A00.A01);
            AnonymousClass0L4 r1 = this.A00.A00;
            StringWriter stringWriter = new StringWriter();
            C13460iZ A05 = C12890hY.A00.A05(stringWriter);
            A05.A0T();
            if (r1.A01 != null) {
                A05.A0d("feature_to_last_publish_id");
                A05.A0T();
                for (Map.Entry entry3 : r1.A01.entrySet()) {
                    A05.A0d((String) entry3.getKey());
                    if (entry3.getValue() == null) {
                        A05.A0R();
                    } else {
                        A05.A0g((String) entry3.getValue());
                    }
                }
                A05.A0Q();
            }
            A05.A0Q();
            A05.close();
            A002.A00.edit().putString("client_config_realtime_update_settings", stringWriter.toString()).apply();
            return null;
        } catch (IOException e) {
            AnonymousClass0QD.A05("ClientConfigUpdateRealtimeEventHandler", "Error while serializing ClientConfigRealtimeUpdateSettings", e);
            return null;
        }
        throw th;
    }
}
