package p000X;

import android.content.Context;

/* renamed from: X.0jz  reason: invalid class name and case insensitive filesystem */
public final class C14240jz implements C11590fD {
    public final /* synthetic */ C14230jy A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C06590Pq A02;

    public C14240jz(C14230jy r1, Context context, C06590Pq r3) {
        this.A00 = r1;
        this.A01 = context;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        C14270kA r3 = new C14270kA(this.A01.getApplicationContext());
        r3.A0G = ((Boolean) AnonymousClass0L6.A00(this.A02, AnonymousClass0L7.QUIC, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        C06590Pq r6 = this.A02;
        AnonymousClass0L7 r2 = AnonymousClass0L7.QUIC;
        r3.A0J = ((Boolean) AnonymousClass0L6.A00(r6, r2, "attempt_early_data_preconnect", false, (AnonymousClass04H) null)).booleanValue();
        r3.A0N = ((Boolean) AnonymousClass0L6.A00(this.A02, r2, "enable_quic_video", false, (AnonymousClass04H) null)).booleanValue();
        r3.A0M = ((Boolean) AnonymousClass0L6.A00(this.A02, r2, "enable_socket_err_callback", false, (AnonymousClass04H) null)).booleanValue();
        C06590Pq r7 = this.A02;
        AnonymousClass0L7 r62 = AnonymousClass0L7.QUIC;
        r3.A0A = (String) AnonymousClass0L6.A00(r7, r62, "host_names", " ", (AnonymousClass04H) null);
        r3.A03 = ((Integer) AnonymousClass0L6.A00(this.A02, r62, "max_rtos", 11, (AnonymousClass04H) null)).intValue();
        r3.A0O = ((Boolean) AnonymousClass0L6.A00(this.A02, AnonymousClass0L7.QUIC, "send_early_data", false, (AnonymousClass04H) null)).booleanValue();
        C06590Pq r72 = this.A02;
        AnonymousClass0L7 r63 = AnonymousClass0L7.QUIC;
        r3.A06 = ((Integer) AnonymousClass0L6.A00(r72, r63, "tcp_quic_race_delay_ms", 200, (AnonymousClass04H) null)).intValue();
        r3.A01 = ((Integer) AnonymousClass0L6.A00(this.A02, r63, "conn_flow_control", 6291456, (AnonymousClass04H) null)).intValue();
        r3.A05 = ((Integer) AnonymousClass0L6.A00(this.A02, r63, "stream_flow_control", 163840, (AnonymousClass04H) null)).intValue();
        r3.A02 = ((Integer) AnonymousClass0L6.A00(this.A02, r63, "quic_idle_timeout_secs", 60, (AnonymousClass04H) null)).intValue();
        C06590Pq r64 = this.A02;
        AnonymousClass0L7 r22 = AnonymousClass0L7.QUIC;
        r3.A0L = ((Boolean) AnonymousClass0L6.A00(r64, r22, "receive_batch_recvmmsg", false, (AnonymousClass04H) null)).booleanValue();
        r3.A0K = ((Boolean) AnonymousClass0L6.A00(this.A02, r22, "should_recv_batch", false, (AnonymousClass04H) null)).booleanValue();
        r3.A04 = ((Integer) AnonymousClass0L6.A00(this.A02, AnonymousClass0L7.QUIC, "receive_batch_size", 1, (AnonymousClass04H) null)).intValue();
        r3.A0C = ((Boolean) AnonymousClass0L6.A00(this.A02, AnonymousClass0L7.LAUNCHER_LIGER_RETRY_HEADER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        r3.A0H = ((Boolean) AnonymousClass0L6.A00(this.A02, AnonymousClass0L7.LAUNCHER_LIGER_ENABLE_ZSTD_COMPRESSION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        return r3;
    }
}
