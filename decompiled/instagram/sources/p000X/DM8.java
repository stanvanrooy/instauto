package p000X;

/* renamed from: X.DM8 */
public final class DM8 implements BTG {
    public final void Bcj(BTN btn, AnonymousClass0JZ r5) {
        DM9 dm9 = (DM9) btn;
        BTL.A00(r5, "total_bytes_freed", dm9.A05);
        BTL.A00(r5, "total_alloc_count_bytes", dm9.A04);
        BTL.A00(r5, "gc_count", dm9.A02);
        BTL.A00(r5, "gc_time", dm9.A03);
        BTL.A00(r5, "blocking_gc_count", dm9.A00);
        BTL.A00(r5, "blocking_gc_time", dm9.A01);
        String str = dm9.A07;
        if (str != null) {
            r5.A00.A0G("gc_count_rate_histogram", str);
        }
        String str2 = dm9.A06;
        if (str2 != null) {
            r5.A00.A0G("gc_blocking_gc_count_rate_histogram", str2);
        }
    }
}
