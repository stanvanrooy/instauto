package p000X;

import android.content.Context;
import android.util.LruCache;
import com.google.common.collect.ImmutableSet;
import java.util.Random;
import java.util.Set;

/* renamed from: X.1tc  reason: invalid class name and case insensitive filesystem */
public final class C43011tc implements C06570Po {
    public static final Set A05 = ImmutableSet.A01("video_paused", "video_started_playing", "video_buffering_started", "video_buffering_finished", "video_exited", "video_should_start", "video_playing_update");
    public final int A00;
    public final int A01;
    public final Context A02;
    public final LruCache A03;
    public final AnonymousClass0C1 A04;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C43011tc(Context context, AnonymousClass0C1 r7) {
        this.A02 = context;
        this.A04 = r7;
        AnonymousClass0L7 r4 = AnonymousClass0L7.VIDEO_REPORT_NI_DATA;
        int intValue = ((Integer) AnonymousClass0L6.A02(r7, r4, "sample_weight", 0, (AnonymousClass04H) null)).intValue();
        this.A01 = intValue;
        if (intValue == 0) {
            this.A00 = -1;
        } else {
            this.A00 = new Random().nextInt(intValue);
        }
        this.A03 = new LruCache(((Integer) AnonymousClass0L6.A02(r7, r4, "session_id_map_size", 50, (AnonymousClass04H) null)).intValue());
    }
}
