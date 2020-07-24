package p000X;

import android.util.SparseArray;

/* renamed from: X.1nS  reason: invalid class name and case insensitive filesystem */
public enum C39751nS {
    DEBUG_STATS(-1),
    PREFETCH_COMPLETE(0),
    MANIFEST_FETCH_END(1),
    MANIFEST_MISALIGNED(2),
    HTTP_TRANSFER_END(3),
    QUALITY_SUMMARY(7),
    PLAYER_WARNING(9),
    PREFETCH_CANCELED(15),
    ABR_DECISION(16),
    SEGMENT_DOWNLOADED(17),
    FRAME_DISPLAYED(18),
    FRAME_DOWNLOADED(21),
    CUSTOM_LIVE_TRACE(23),
    CACHE_INSTRUMENTATION(26),
    PREFETCH_TASK_QUEUE_START(27),
    PREFETCH_TASK_QUEUE_EXIT(28),
    PREFETCH_TASK_QUEUE_COMPLETE(29);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new SparseArray();
        for (C39751nS r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C39751nS(int i) {
        this.A00 = i;
    }
}
