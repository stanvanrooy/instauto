package p000X;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0Tg  reason: invalid class name and case insensitive filesystem */
public final class C07480Tg {
    public static final AtomicLong A0A = new AtomicLong(0);
    public final Context A00;
    public final AnonymousClass0T1 A01;
    public final AnonymousClass0UA A02;
    public final AnonymousClass0UC A03;
    public final long A04 = A0A.incrementAndGet();
    public final long A05 = ((long) Process.myPid());
    public final long A06 = SystemClock.elapsedRealtime();
    public final C07190Sc A07;
    public final String A08;
    public final String A09;

    public final void A02(long j, int i, String str, C07400Sy r9, long j2, long j3, NetworkInfo networkInfo) {
        Map A002 = C07200Sd.A00("timespan_ms", String.valueOf(j), TraceFieldType.Port, String.valueOf(i), "he_state", str);
        if (r9.A01()) {
            String th = ((Throwable) r9.A00()).toString();
            if (((Throwable) r9.A00()).getCause() != null) {
                th = AnonymousClass000.A0J(th, " Caused by: ", ((Throwable) r9.A00()).getCause().toString());
            }
            A002.put("error_message", th);
        }
        A002.put("mqtt_session_id", Long.toString(j2));
        A01(A002, j3);
        A00(this, A002, networkInfo);
        A06("mqtt_socket_connect", A002);
    }

    public final void A03(String str, int i, int i2, long j, int i3, long j2) {
        A06("mqtt_publish_debug", C07200Sd.A00("result", "success", "operation", str, TraceFieldType.QoS, Integer.toString(i), TraceFieldType.MsgId, Integer.toString(i2), "original_ops_id", Integer.toString(i3), "timespan_ms", Long.toString(j), "retry_cnt", Integer.toString(0), "mqtt_session_id", Long.toString(j2)));
    }

    public final void A04(String str, String str2, int i, int i2, int i3, Throwable th, long j) {
        Map A002 = C07200Sd.A00("result", str, "operation", str2, TraceFieldType.QoS, Integer.toString(i), TraceFieldType.MsgId, Integer.toString(i2), "original_ops_id", Integer.toString(i3), "retry_cnt", Integer.toString(0), "mqtt_session_id", Long.toString(j));
        if (th != null) {
            A002.put("error_message", th.toString());
        }
        A06("mqtt_publish_debug", A002);
    }

    public final void A05(String str, String str2, String str3, C07400Sy r7, C07400Sy r8, boolean z, long j, NetworkInfo networkInfo) {
        Map A002 = C07200Sd.A00("act", str, "running", String.valueOf(z));
        A002.put("process_id", Long.toString(this.A05));
        A002.put("thread_id", Long.toString(Thread.currentThread().getId()));
        if (str2 != null) {
            A002.put("mqtt_persistence_string", str2);
        }
        A01(A002, j);
        A00(this, A002, networkInfo);
        if (!TextUtils.isEmpty(str3)) {
            A002.put("calr", str3);
        }
        if (r7.A01()) {
            A002.put("flg", String.valueOf(r7.A00()));
        }
        if (r8.A01()) {
            A002.put("sta_id", String.valueOf(r8.A00()));
        }
        A06("mqtt_service_state", A002);
    }

    public static void A00(C07480Tg r5, Map map, NetworkInfo networkInfo) {
        if (networkInfo != null) {
            String state = networkInfo.getState().toString();
            String typeName = networkInfo.getTypeName();
            if (typeName == null) {
                typeName = "";
            }
            String subtypeName = networkInfo.getSubtypeName();
            if (subtypeName == null) {
                subtypeName = "";
            }
            String extraInfo = networkInfo.getExtraInfo();
            if (extraInfo == null) {
                extraInfo = "";
            }
            map.put("network_state", state);
            map.put(TraceFieldType.NetworkType, typeName);
            map.put("network_subtype", subtypeName);
            map.put("network_extra_info", extraInfo);
        } else {
            map.put("network_info", "null");
        }
        map.put("is_in_idle_mode", Boolean.toString(r5.A03.A04()));
    }

    public final void A06(String str, Map map) {
        map.put("service_name", this.A09);
        map.put("service_session_id", Long.toString(this.A06));
        map.put("process_id", Long.toString(this.A05));
        map.put("logger_object_id", Long.toString(this.A04));
        if (!map.containsKey("network_session_id")) {
            map.put("network_session_id", Long.toString(this.A03.A05.get()));
        }
        C07180Sb r1 = new C07180Sb(str, this.A08);
        r1.A01(map);
        this.A07.reportEvent(r1);
    }

    public C07480Tg(Context context, String str, AnonymousClass0UC r5, AnonymousClass0UA r6, C07190Sc r7, AnonymousClass0T1 r8) {
        this.A00 = context;
        this.A09 = str;
        this.A03 = r5;
        this.A02 = r6;
        this.A08 = context.getPackageName();
        this.A07 = r7;
        this.A01 = r8;
    }

    public static void A01(Map map, long j) {
        map.put("network_session_id", Long.toString(j));
    }
}
