package p000X;

import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Wu  reason: invalid class name and case insensitive filesystem */
public final class C08380Wu implements RealtimeClientManager.RawSkywalkerSubscriptionsProvider {
    public final /* synthetic */ AnonymousClass05F A00;

    public C08380Wu(AnonymousClass05F r1) {
        this.A00 = r1;
    }

    public final List get(AnonymousClass0C1 r4) {
        ArrayList arrayList = new ArrayList();
        String A04 = r4.A04();
        arrayList.add(AnonymousClass000.A0E("ig/u/v1/", A04));
        arrayList.add(AnonymousClass000.A0E("ig/live_notification_subscribe/", A04));
        return arrayList;
    }
}
