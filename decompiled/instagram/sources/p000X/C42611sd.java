package p000X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;

/* renamed from: X.1sd  reason: invalid class name and case insensitive filesystem */
public final class C42611sd implements Runnable {
    public final /* synthetic */ C17870qw A00;
    public final /* synthetic */ AnonymousClass0C1 A01;
    public final /* synthetic */ String A02;

    public C42611sd(AnonymousClass0C1 r1, C17870qw r2, String str) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = str;
    }

    public final void run() {
        int ordinal;
        int ordinal2;
        PendingMediaStore A012 = PendingMediaStore.A01(this.A01);
        if (!A012.A06(Constants.A03).isEmpty()) {
            AnonymousClass0ZA.A09(new Handler(Looper.getMainLooper()), new C43501uW(this), 500, -323379719);
        }
        for (String A04 : new ArrayList(A012.A02.keySet())) {
            PendingMedia A042 = A012.A04(A04);
            if (A042 != null) {
                C42361sE r2 = A042.A3K;
                if (r2 == null) {
                    ordinal = 0;
                } else {
                    ordinal = A042.A0w.ordinal() - r2.ordinal();
                }
                if (ordinal > 0) {
                    C42531sV r6 = this.A00.A09;
                    AnonymousClass0P4 A013 = C42531sV.A01(r6, "pending_media_info", (AnonymousClass0RN) null, A042);
                    A013.A0G("step", "pending_media_migrated");
                    C42361sE r22 = A042.A3K;
                    if (r22 == null) {
                        ordinal2 = 0;
                    } else {
                        ordinal2 = A042.A0w.ordinal() - r22.ordinal();
                    }
                    A013.A0E("render_duration_forecast", Integer.valueOf(ordinal2));
                    C42531sV.A0I(r6, A013, A042.A3F);
                }
            }
        }
    }
}
