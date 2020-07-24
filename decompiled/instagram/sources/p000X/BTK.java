package p000X;

/* renamed from: X.BTK */
public final class BTK implements BTG {
    public final void Bcj(BTN btn, AnonymousClass0JZ r4) {
        BTM btm = (BTM) btn;
        BTL.A00(r4, "java_heap_max_size_kb", Long.valueOf(btm.A01));
        BTL.A00(r4, "java_heap_allocated_size_kb", Long.valueOf(btm.A00));
        BTL.A00(r4, "native_heap_size_kb", Long.valueOf(btm.A03));
        BTL.A00(r4, "native_heap_allocated_size_kb", Long.valueOf(btm.A02));
    }
}
