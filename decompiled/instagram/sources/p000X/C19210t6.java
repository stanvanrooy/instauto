package p000X;

import com.instagram.realtimeclient.PresenceSubscriptionIDStore;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;

/* renamed from: X.0t6  reason: invalid class name and case insensitive filesystem */
public final class C19210t6 implements RealtimeEventHandlerProvider {
    public final /* synthetic */ C19100sv A00;

    public C19210t6(C19100sv r1) {
        this.A00 = r1;
    }

    public final RealtimeEventHandler get(AnonymousClass0C1 r4) {
        return new C62352nV((C62482nn) r4.AVA(C62482nn.class, new C62492no(r4)), PresenceSubscriptionIDStore.getInstance(r4));
    }
}
