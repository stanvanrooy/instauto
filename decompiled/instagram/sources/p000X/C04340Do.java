package p000X;

/* renamed from: X.0Do  reason: invalid class name and case insensitive filesystem */
public final class C04340Do {
    public static final C04340Do A02 = new C04340Do("anr_report_file", true);
    public static final C04340Do A03 = new C04340Do("fury_traces_file", false);
    public static final C04340Do A04 = new C04340Do("logcat_file", false);
    public static final C04340Do A05 = new C04340Do("minidump_file", true);
    public static final C04340Do A06 = new C04340Do("properties_file", false);
    public static final C04340Do A07 = new C04340Do("report_source_file", false);
    public final String A00;
    public final boolean A01;

    public final String toString() {
        return this.A00;
    }

    public C04340Do(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
