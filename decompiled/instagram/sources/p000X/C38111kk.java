package p000X;

/* renamed from: X.1kk  reason: invalid class name and case insensitive filesystem */
public final class C38111kk implements AnonymousClass0Q6, C06570Po {
    public double A00 = 0.0d;
    public double A01 = Double.MAX_VALUE;
    public long A02 = -1;
    public long A03 = -1;
    public long A04;
    public long A05;
    public AnonymousClass0C1 A06;

    public C38111kk(AnonymousClass0C1 r3) {
        this.A06 = r3;
        AnonymousClass0Q7.A03().A0B(this);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0Z0.A03(279672099);
        String AS1 = AnonymousClass0WN.A01(this.A06).AS1();
        AnonymousClass0C1 r6 = this.A06;
        AnonymousClass0QV r5 = AnonymousClass0QV.A03;
        AnonymousClass0a4.A0C(true, "must set one of mModuleName or mAnalyticsModule");
        C62812oP r3 = new C62812oP(new AnonymousClass0QT(r6, new C06300On("ig_session_bandwidth"), r5).A02("ig_session_bandwidth"));
        r3.A07("ig_user_id", Long.valueOf(Long.parseLong(this.A06.A04())));
        r3.A08("session_id", AS1);
        r3.A07("total_bytes_downloaded", Long.valueOf(this.A04));
        r3.A07("total_download_time_ms", Long.valueOf(this.A05));
        r3.A05("session_bandwidth_kbps", Double.valueOf((((double) this.A04) * 1.0d) / ((double) this.A05)));
        r3.A05("max_bandwidth_kbps", Double.valueOf(this.A00));
        r3.A05("min_bandwidth_kbps", Double.valueOf(this.A01));
        r3.A07("session_start_time", Long.valueOf(this.A03));
        r3.A07("session_end_time", Long.valueOf(this.A02));
        r3.A01();
        AnonymousClass0Z0.A0A(-764140737, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0Z0.A0A(-323635646, AnonymousClass0Z0.A03(1798727470));
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0Q7.A03().A0D(this);
    }
}
