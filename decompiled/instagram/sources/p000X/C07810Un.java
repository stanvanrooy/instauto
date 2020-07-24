package p000X;

import android.os.SystemClock;
import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0Un  reason: invalid class name and case insensitive filesystem */
public final class C07810Un implements Runnable {
    public final /* synthetic */ C10630dc A00;
    public final /* synthetic */ AnonymousClass0VN A01;

    public C07810Un(C10630dc r1, AnonymousClass0VN r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        boolean z;
        C10630dc r1;
        Throwable th;
        C10630dc r5 = this.A00;
        if (null == r5.A00) {
            AnonymousClass0DB.A0E("FbnsConnectionManager", "Preemptive connection succeeded, switch to new connection");
            C07890Uv r4 = r5.A01;
            r4.A0E(r4.A0l, C07450Td.PREEMPTIVE_RECONNECT_SUCCESS, C07880Uu.PREEMPTIVE_RECONNECT_SUCCESS);
            C07890Uv.A00(r5.A01);
        }
        C07990Vf r3 = this.A00.A01.A0l;
        C10630dc r12 = this.A00;
        if (r3 == r12.A00) {
            C07400Sy r32 = this.A01.A02;
            if (r32.A01()) {
                z = r12.A01.A0E.BsM((AnonymousClass0UT) r32.A00()) | false;
            } else {
                z = false;
            }
            C07890Uv r13 = this.A00.A01;
            if (!AnonymousClass0UP.A01(r13.A0Q)) {
                C07400Sy r33 = this.A01.A03;
                if (r33.A01()) {
                    z |= r13.A0K.BsN((AnonymousClass0UV) r33.A00());
                }
            }
            if (z) {
                this.A00.A01.A0I.Ayr();
            }
            C07890Uv r6 = this.A00.A01;
            synchronized (r6.A0R) {
                Pair A05 = r6.A05();
                if (A05 != null) {
                    AnonymousClass0Z9.A03(r6.A0S, new C07760Ui(r6, A05), -720075784);
                }
            }
            this.A00.A01.A08();
            C07890Uv r0 = this.A00.A01;
            C07540Tm r7 = r0.A0A;
            long elapsedRealtime = SystemClock.elapsedRealtime() - r0.A0h.get();
            Class<AnonymousClass064> cls = AnonymousClass064.class;
            AnonymousClass064 r34 = (AnonymousClass064) r7.A07(cls);
            ((AtomicLong) r34.A00(C10890e2.CountSuccessfulConnection)).incrementAndGet();
            ((AtomicLong) r34.A00(C10890e2.ConnectingMs)).set(elapsedRealtime);
            r7.A00.A01.set(SystemClock.elapsedRealtime());
            C07890Uv r52 = this.A00.A01;
            if (r52.A0W) {
                C07540Tm r72 = r52.A0A;
                C07890Uv.A02(r52, new C07510Tj(C07540Tm.A00(r72), (AnonymousClass060) null, (AnonymousClass064) r72.A07(cls), (AnonymousClass061) null, r72.A00.A00(true), (AnonymousClass063) r72.A07(AnonymousClass063.class), (C031905y) r72.A07(C031905y.class), (C032005z) null, false, false), false);
            }
            ((AnonymousClass064) this.A00.A01.A0A.A07(cls)).A02(C10890e2.LastConnectFailureReason, (Object) null);
            this.A00.A01.A0I.Ay3();
            C07890Uv r53 = this.A00.A01;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            C08220Wc r35 = r53.A0P;
            C07480Tg r54 = r53.A09;
            Map A002 = C07200Sd.A00(TraceFieldType.RetryCount, String.valueOf(r35.A00), "retry_duration_ms", String.valueOf(elapsedRealtime2 - r35.A01));
            r54.A06("mqtt_connection_retries", A002);
            AnonymousClass0T1 r02 = r54.A01;
            if (r02 != null) {
                r02.Aj4("mqtt_connection_retries", A002);
            }
            C10630dc r14 = this.A00;
            r14.A01.A0X = false;
            C07990Vf r42 = r14.A00;
            synchronized (r42) {
                List list = r42.A01;
                if (r42.A0K.incrementAndGet() > 1) {
                    r1 = r42.A0W;
                    th = new Throwable();
                } else {
                    if (list == null) {
                        r1 = r42.A0W;
                        th = new Throwable();
                    }
                    r42.A01 = null;
                }
                r1.A01(th);
                r42.A01 = null;
            }
            this.A00.A01.A0c = SystemClock.elapsedRealtime();
        }
    }
}
