package p000X;

import com.instagram.realtimeclient.MainRealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.0Wb  reason: invalid class name and case insensitive filesystem */
public final class C08210Wb implements RealtimeClientManager.RealtimeDelegateProvider {
    public final /* synthetic */ AnonymousClass05F A00;

    public C08210Wb(AnonymousClass05F r1) {
        this.A00 = r1;
    }

    public final MainRealtimeEventHandler.Delegate get(AnonymousClass0C1 r2) {
        return new C60812ka(r2);
    }
}
