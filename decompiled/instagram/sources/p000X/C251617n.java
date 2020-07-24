package p000X;

/* renamed from: X.17n  reason: invalid class name and case insensitive filesystem */
public abstract class C251617n implements C251417l {
    public C92743ze A00;

    public abstract long A01();

    public abstract long A02();

    public abstract long A03(long j);

    public abstract long A04(long j);

    public abstract long A05(long j);

    public abstract long A06(long j);

    public abstract boolean A07();

    public abstract boolean A08();

    public static final void A00(C92713zb r2, C92743ze r3) {
        r2.A07("largest_address_space_chunk", Long.valueOf(r3.A03));
        r2.A07("free_java_heap", Long.valueOf(r3.A01));
        r2.A07("free_total_memory", Long.valueOf(r3.A02));
        r2.A07("all_process_resident_anonymous", Long.valueOf(r3.A00));
        r2.A08("asl_endpoint", r3.A08);
        r2.A08("session_id", r3.A0A);
        r2.A08("memory_snapshot_json", r3.A09);
        r2.A08("address_space_state", AnonymousClass416.A00(r3.A05));
        r2.A08("java_heap_state", AnonymousClass416.A00(r3.A06));
        r2.A08("system_memory_state", AnonymousClass416.A00(r3.A07));
    }
}
