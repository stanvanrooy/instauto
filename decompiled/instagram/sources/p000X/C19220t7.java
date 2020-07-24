package p000X;

import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;

/* renamed from: X.0t7  reason: invalid class name and case insensitive filesystem */
public final class C19220t7 implements RealtimeEventHandlerProvider {
    public final /* synthetic */ C19100sv A00;

    public C19220t7(C19100sv r1) {
        this.A00 = r1;
    }

    public final RealtimeEventHandler get(AnonymousClass0C1 r5) {
        if (C06080Nr.A09(this.A00.A00) || ((Boolean) AnonymousClass0L6.A02(r5, AnonymousClass0L7.DIRECT_SHOW_THREADS_STATUS_IN_DIRECT, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return new C62522nr(C27671It.A01(r5));
        }
        return null;
    }
}
