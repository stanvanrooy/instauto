package p000X;

import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;

/* renamed from: X.0Xp  reason: invalid class name and case insensitive filesystem */
public final class C08570Xp implements RealtimeEventHandlerProvider {
    public final /* synthetic */ AnonymousClass05F A00;

    public C08570Xp(AnonymousClass05F r1) {
        this.A00 = r1;
    }

    public final RealtimeEventHandler get(AnonymousClass0C1 r6) {
        if (((Boolean) AnonymousClass0L6.A03(r6, AnonymousClass0L7.LIVE_QA_VIEWER_V1, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() || ((Boolean) AnonymousClass0L6.A03(r6, AnonymousClass0L7.LIVE_QA_BROADCASTER_V1, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return new C62252nK(r6);
        }
        return null;
    }
}
