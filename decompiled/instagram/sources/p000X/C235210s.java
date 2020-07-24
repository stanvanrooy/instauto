package p000X;

import com.instagram.notifications.badging.impl.InMemoryBadgingRepository$refreshBadgeData$1;
import java.util.HashMap;

/* renamed from: X.10s  reason: invalid class name and case insensitive filesystem */
public final class C235210s extends C23320zx {
    public final C234610m A00;
    public final AnonymousClass101 A01;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public final AnonymousClass103 A01() {
        Object obj = AnonymousClass100.A00.get(AnonymousClass103.class);
        if (obj != null) {
            return (AnonymousClass103) obj;
        }
        throw new C183227s6("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgingAnalyticsLogger");
    }

    public final AnonymousClass106 A02() {
        Object obj = AnonymousClass100.A00.get(AnonymousClass106.class);
        if (obj != null) {
            return (AnonymousClass106) obj;
        }
        throw new C183227s6("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgingConfigurationProvider");
    }

    public final void A04() {
        C234610m r0 = this.A00;
        AnonymousClass2GA.A00(r0.A05, (AnonymousClass2GC) null, new InMemoryBadgingRepository$refreshBadgeData$1(r0, (C233910f) null), 3);
    }

    public final void A05() {
        this.A00.A00 = false;
    }

    public C235210s() {
        HashMap hashMap = AnonymousClass100.A00;
        Object obj = hashMap.get(AnonymousClass101.class);
        if (obj != null) {
            this.A01 = (AnonymousClass101) obj;
            Object obj2 = hashMap.get(C234610m.class);
            if (obj2 != null) {
                this.A00 = (C234610m) obj2;
                return;
            }
            throw new C183227s6("null cannot be cast to non-null type com.instagram.notifications.badging.repository.BadgingRepository");
        }
        throw new C183227s6("null cannot be cast to non-null type kotlinx.coroutines.CoroutineScope");
    }

    public final C52552Pg A03(AnonymousClass108 r4) {
        C13150hy.A02(r4, "useCase");
        return new C52552Pg(this.A00, r4, this.A01);
    }

    public final void A06(AnonymousClass108 r3) {
        C13150hy.A02(r3, "useCase");
        C234610m r0 = this.A00;
        C13150hy.A02(r3, "useCase");
        AnonymousClass107 r02 = r0.A02;
        C13150hy.A02(r3, "useCase");
        AnonymousClass109 r03 = (AnonymousClass109) r02.A00.get(r3);
        if (r03 != null) {
            r03.A00();
        }
    }

    public final void onUserSessionStart(boolean z) {
        AnonymousClass0Z0.A0A(2046662944, AnonymousClass0Z0.A03(-815451105));
    }
}
