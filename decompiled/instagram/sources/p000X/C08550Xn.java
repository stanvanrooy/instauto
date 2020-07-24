package p000X;

import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;
import java.util.List;

/* renamed from: X.0Xn  reason: invalid class name and case insensitive filesystem */
public abstract class C08550Xn extends C09790c1 {
    public abstract RealtimeClientManager.GraphQLSubscriptionsProvider A08();

    public abstract RealtimeClientManager.RawSkywalkerSubscriptionsProvider A09();

    public abstract List A0A();

    public abstract List A0B();

    public final void A07() {
        int A03 = AnonymousClass0Z0.A03(-491607645);
        for (RealtimeClientManager.RealtimeDelegateProvider addRealtimeDelegateProvider : A0A()) {
            RealtimeClientManager.addRealtimeDelegateProvider(addRealtimeDelegateProvider);
        }
        for (RealtimeEventHandlerProvider addOtherRealtimeEventHandlerProvider : A0B()) {
            RealtimeClientManager.addOtherRealtimeEventHandlerProvider(addOtherRealtimeEventHandlerProvider);
        }
        RealtimeClientManager.setRawSkywalkerSubscriptionsProvider(A09());
        RealtimeClientManager.setGraphQLSubscriptionsProvider(A08());
        AnonymousClass0Z0.A0A(1043824667, A03);
    }
}
